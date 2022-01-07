package com.android_learn.metro.ui.lines

import android.view.View
import androidx.appcompat.widget.AppCompatTextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.android_learn.metro.R

class LinesVH(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val cons = itemView.findViewById<ConstraintLayout>(R.id.cons_lines)
    val txt_lines = itemView.findViewById<AppCompatTextView>(R.id.txt_lines)
    val txt_english_title = itemView.findViewById<AppCompatTextView>(R.id.txt_english_title)
}