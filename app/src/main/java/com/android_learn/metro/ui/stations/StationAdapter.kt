package com.android_learn.metro.ui.stations

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.android_learn.metro.R
import com.android_learn.metro.ui.StationsActivity
import com.android_learn.metro.models.Stations

class StationAdapter(context: Context , stationsList: List<Stations>) : RecyclerView.Adapter<StationVH>() {

    var list : List<Stations> = stationsList
    var context : Context = context


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StationVH {
        val view : View = LayoutInflater.from(context).inflate(R.layout.stations_row , null)
        return StationVH(view)
    }

    override fun onBindViewHolder(holder: StationVH, position: Int) {
        val stations : Stations = list[position]
        holder.txt_persian.text = stations.Title
        holder.txt_english.text = stations.Title_English

        when(stations.LineId.toInt())
        {
            0 ->
            {
                holder.cons_station.setBackgroundColor(ContextCompat.getColor(context , R.color.teal_200))
            }
            1 ->
            {
                holder.cons_station.setBackgroundColor(ContextCompat.getColor(context , R.color.purple_200))
            }
            2 ->
            {
                holder.cons_station.setBackgroundColor(ContextCompat.getColor(context , R.color.red))
            }
            3 ->
            {
                holder.cons_station.setBackgroundColor(ContextCompat.getColor(context , R.color.green))
            }
            4 ->
            {
                holder.cons_station.setBackgroundColor(ContextCompat.getColor(context ,R.color.blue))
            }
            5 ->
            {
                holder.cons_station.setBackgroundColor(ContextCompat.getColor(context ,R.color.teal1000))
            }
            6 ->
            {
                holder.cons_station.setBackgroundColor(ContextCompat.getColor(context ,R.color.purple_500))
            }
            7 ->
            {
                holder.cons_station.setBackgroundColor(ContextCompat.getColor(context ,R.color.teal_700))
            }
        }

        holder.cons_station.setOnClickListener{
            val intentStation = Intent(context , StationsActivity::class.java)
            intentStation.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            intentStation.putExtra("stations" , stations)
            context.startActivity(intentStation)
        }

    }

    override fun getItemCount(): Int {
        return list.size
    }
}