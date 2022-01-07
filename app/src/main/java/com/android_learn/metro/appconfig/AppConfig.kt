package com.android_learn.metro.appconfig

import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences
import android.view.View

class AppConfig {

     var sh : SharedPreferences
     var editor : SharedPreferences.Editor


    @SuppressLint("CommitPrefEdits")
    constructor(context: Context)
    {
        sh = context.getSharedPreferences("setting" , Context.MODE_PRIVATE)
        editor = sh.edit()
    }

    fun saveData(title : String , englishTitle : String)
    {
        editor.putString("title", title)
        editor.putString("englishTitle", englishTitle)
        editor.commit()
    }


    fun getTitle(): String? {
        return sh.getString("title", "")
    }

    fun getEnglishTitle(): String? {
        return sh.getString("englishTitle", "")
    }


}