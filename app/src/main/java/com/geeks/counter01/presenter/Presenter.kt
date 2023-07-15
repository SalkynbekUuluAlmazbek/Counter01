package com.geeks.counter01.presenter

import android.graphics.Color
import com.geeks.counter01.counterview.CounterView
import com.geeks.counter01.injector.Injector


class Presenter constructor(var view: CounterView) {

    var model = Injector.getModel()


    fun increment() {
        model.increment()
        view.showCount(model.count)
        showToast()
        changeCounterColor()

    }

    fun decrement() {
        model.decrement()
        view.showCount(model.count)
        showToast()
        changeCounterColor()
    }

    fun showToast() {
        if (model.count == 10)
            view.showToast("Поздравляем!")

    }

    fun changeCounterColor() {
        if (model.count == 15)
            view.changeCounterColor(Color.GREEN)
        else
            view.changeCounterColor(Color.BLACK)
    }

}