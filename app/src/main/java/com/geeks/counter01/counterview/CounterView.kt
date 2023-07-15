package com.geeks.counter01.counterview

interface CounterView {

    fun showCount(count: Int)
    fun showToast(congratulation: String)
    fun changeCounterColor(color: Int)

}