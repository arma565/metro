package com.android_learn.metro.ui.lines

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.android_learn.metro.R
import com.android_learn.metro.appconfig.AppConfig
import com.android_learn.metro.ui.stations.StationListActivity
import com.android_learn.metro.models.Lines

class LinesAdapter(var context: Context,var linesList : List<Lines>) : RecyclerView.Adapter<LinesVH>() {


    var list : List<Lines> = linesList
    var  appConfig : AppConfig = AppConfig(context)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LinesVH {

        val view : View = LayoutInflater.from(context).inflate(R.layout.lines_row , null)
        return LinesVH(view)
    }

    override fun onBindViewHolder(holder: LinesVH, position: Int) {
        val lines : Lines = list[position]
        holder.txt_lines.text = lines.title
        holder.txt_english_title.text = lines.EnglishTitle
        when(lines.id.toInt())
        {
            0 ->
            {
                holder.cons.setBackgroundColor(ContextCompat.getColor(context , R.color.teal_200))
            }
            1 ->
            {
                holder.cons.setBackgroundColor(ContextCompat.getColor(context , R.color.purple_200))
            }
            2 ->
            {
                holder.cons.setBackgroundColor(ContextCompat.getColor(context , R.color.red))
            }
            3 ->
            {
                holder.cons.setBackgroundColor(ContextCompat.getColor(context , R.color.green))
            }
            4 ->
            {
                holder.cons.setBackgroundColor(ContextCompat.getColor(context ,R.color.blue))
            }
            5 ->
            {
                holder.cons.setBackgroundColor(ContextCompat.getColor(context ,R.color.teal1000))
            }
            6 ->
            {
                holder.cons.setBackgroundColor(ContextCompat.getColor(context ,R.color.purple_500))
            }
            7 ->
            {
                holder.cons.setBackgroundColor(ContextCompat.getColor(context ,R.color.teal_700))
            }
        }
        holder.cons.setOnClickListener{
            val intentStationList = Intent(context , StationListActivity::class.java)
            appConfig.saveData(lines.title , lines.EnglishTitle)
            intentStationList.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            intentStationList.putExtra("lines" , lines)
            context.startActivity(intentStationList)
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }


}