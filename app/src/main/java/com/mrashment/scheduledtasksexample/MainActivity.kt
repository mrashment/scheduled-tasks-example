package com.mrashment.scheduledtasksexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupBtns();
    }

    fun setupBtns() {
        btnDelayedMessage.setOnClickListener(this)
        btnPeriodicMessage.setOnClickListener(this)
    }

    fun sendDelayedMessage() {

    }

    fun sendPeriodicMessage() {
        
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btnDelayedMessage -> sendDelayedMessage()
            R.id.btnPeriodicMessage -> sendPeriodicMessage()
        }
    }
}
