package com.geeks.counter01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.geeks.counter01.counterview.CounterView
import com.geeks.counter01.databinding.ActivityMainBinding
import com.geeks.counter01.injector.Injector

class MainActivity : AppCompatActivity(), CounterView {
    lateinit var binding: ActivityMainBinding

    var presenter = Injector.getPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClicker()
    }

    private fun initClicker() {
        with(binding) {
            buttonIncrement.setOnClickListener {
                presenter.increment()
            }
            buttonDecrement.setOnClickListener {
                presenter.decrement()
            }
        }


    }

    override fun showCount(count: Int) {
        binding.textViewCounter.text = count.toString()
    }

    override fun showToast(congratulation: String) {
        Toast.makeText(this,congratulation,Toast.LENGTH_SHORT).show()
    }

    override fun changeCounterColor(color: Int) {
        binding.textViewCounter.setTextColor(color)
    }
}