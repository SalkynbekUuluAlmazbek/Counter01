package com.geeks.counter01.injector

import com.geeks.counter01.counterview.CounterView
import com.geeks.counter01.model.Model
import com.geeks.counter01.presenter.Presenter

class Injector {

    companion object{
        fun getModel() = Model()
        fun getPresenter(view: CounterView) = Presenter(view)
    }
}