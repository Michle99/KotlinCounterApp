package com.maridev.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.maridev.counterapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var currentCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(
            this,
                R.layout.activity_main
        )

        binding.counterValue.setText("" + currentCount)

        binding.apply {

            plusButton.setOnClickListener {

                counterValue.setText("" + ++currentCount)
            }

            minusButton.setOnClickListener {
                counterValue.setText("" + --currentCount)
            }
        }


    }
}