package com.android_learn.metro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.android_learn.metro.databinding.ActivityMainBinding
import com.android_learn.metro.models.IView
import com.android_learn.metro.models.Lines
import com.android_learn.metro.ui.lines.LinesAdapter
import com.android_learn.metro.ui.lines.LinesPresenter
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity(), IView<List<Lines>> {
    lateinit var binding: ActivityMainBinding
    lateinit var linesPresenter: LinesPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        linesPresenter = LinesPresenter(this)
        linesPresenter.getLines()

    }
    override fun onSuccess(data: List<Lines>) {
        binding.recMain.adapter = LinesAdapter(this@MainActivity , data)
        binding.recMain.layoutManager = LinearLayoutManager(applicationContext , LinearLayoutManager.VERTICAL , false)
    }

    override fun onFailure(data: String) {
        Snackbar.make(binding.root, getString(R.string.unSuccess), Snackbar.LENGTH_LONG).show()
    }

    override fun onShowProgressBar() {
        binding.progressBar.visibility = View.VISIBLE
    }

    override fun onHideProgressBar() {
        binding.progressBar.visibility = View.GONE
    }
}