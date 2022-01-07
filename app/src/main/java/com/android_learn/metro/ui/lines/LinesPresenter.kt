package com.android_learn.metro.ui.lines

import com.android_learn.metro.models.IResponseView
import com.android_learn.metro.models.IView
import com.android_learn.metro.models.Lines

class LinesPresenter : IResponseView<List<Lines>> {

    lateinit var  linesInteract : LinesInteract
    lateinit var iView : IView<List<Lines>>


    constructor(iView: IView<List<Lines>>)
    {
        this.linesInteract = LinesInteract()
        this.iView = iView
    }

    fun getLines()
    {
        iView.onShowProgressBar()
        linesInteract.getLines(this)
    }

    override fun onSuccess(data: List<Lines>) {
        iView.onHideProgressBar()
        iView.onSuccess(data)
    }

    override fun onFailure(data: String) {
        iView.onHideProgressBar()
        iView.onFailure(data)
    }


}