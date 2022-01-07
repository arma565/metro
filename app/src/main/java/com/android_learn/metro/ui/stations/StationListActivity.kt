package com.android_learn.metro.ui.stations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.android_learn.metro.R
import com.android_learn.metro.databinding.ActivityStationListBinding
import com.android_learn.metro.models.IView
import com.android_learn.metro.models.Lines
import com.android_learn.metro.models.Stations
import com.google.android.material.snackbar.Snackbar

class StationListActivity : AppCompatActivity() , IView<List<Stations>> {
    private lateinit var binding: ActivityStationListBinding
    lateinit var stationPresenter: StationPresenter
    lateinit var lines: Lines
    lateinit var bundle: Bundle
    var id : String = "1"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStationListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        stationPresenter = StationPresenter(this)
        binding.imgBack.setOnClickListener{
            finish()
        }
        binding.progressBar.visibility = View.VISIBLE
        bundle = intent.extras!!
        lines = bundle.getParcelable("lines")!!
        binding.txtLineFa.text = lines.title
        binding.txtLineEn.text = lines.EnglishTitle
        id = lines.id
        stationPresenter.getStations(id)


    }

    override fun onSuccess(data: List<Stations>) {
        binding.recStations.adapter = StationAdapter(applicationContext , data)
        binding.recStations.layoutManager = LinearLayoutManager(applicationContext , LinearLayoutManager.VERTICAL , false)
    }

    override fun onFailure(data: String) {
        Snackbar.make(binding.root , getString(R.string.unSuccess) , Snackbar.LENGTH_LONG).show()
    }

    override fun onShowProgressBar() {
        binding.progressBar.visibility = View.VISIBLE
    }

    override fun onHideProgressBar() {
        binding.progressBar.visibility = View.GONE
    }
}