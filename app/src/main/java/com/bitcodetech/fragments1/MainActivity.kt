package com.bitcodetech.fragments1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.FragmentManager

class MainActivity : AppCompatActivity() {

    private lateinit var btnReset : Button

    private lateinit var counterFragment1 : CounterFragment
    private lateinit var counterFragment2 : CounterFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
        setupListeners()
    }

    private fun initViews() {
        btnReset = findViewById(R.id.btnReset)

        counterFragment1 = supportFragmentManager.findFragmentById(R.id.counterFragment1) as CounterFragment
        counterFragment2 = supportFragmentManager.findFragmentById(R.id.counterFragment2) as CounterFragment
    }

    private fun setupListeners() {
        btnReset.setOnClickListener {
            counterFragment1.count = 0
            counterFragment2.count = 0
        }
    }
}



