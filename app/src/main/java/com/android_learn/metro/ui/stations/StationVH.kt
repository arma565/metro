package com.android_learn.metro.ui.stations

import android.view.View
import android.widget.RelativeLayout
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.android_learn.metro.R

class StationVH(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var img_back: AppCompatImageView = itemView.findViewById(R.id.img_back)
    var txt_persian: AppCompatTextView = itemView.findViewById(R.id.txt_persian)
    var txt_english: AppCompatTextView = itemView.findViewById(R.id.txt_english)
    var cons_station: ConstraintLayout = itemView.findViewById(R.id.cons_station)

}