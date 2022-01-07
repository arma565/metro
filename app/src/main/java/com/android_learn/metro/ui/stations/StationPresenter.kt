package com.android_learn.metro.ui.stations

import com.android_learn.metro.models.IResponseView
import com.android_learn.metro.models.IView
import com.android_learn.metro.models.Stations

class StationPresenter(iView: IView<List<Stations>>) : IResponseView<List<Stations>> {

    private var interactStations: StationInteract = StationInteract()
    private var iView: IView<List<Stations>> = iView

    fun getStations(id: String) {
        iView.onShowProgressBar()
        interactStations.getStations(id, this)

    }

    override fun onSuccess(data: List<Stations>) {
        iView.onHideProgressBar()
        iView.onSuccess(data)
    }

    override fun onFailure(data: String) {
        iView.onHideProgressBar()
        iView.onFailure(data)
    }


}