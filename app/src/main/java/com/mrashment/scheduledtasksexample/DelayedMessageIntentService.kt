package com.mrashment.scheduledtasksexample

import android.app.IntentService
import android.content.Intent
import android.os.Handler
import android.util.Log
import android.widget.Toast


class DelayedMessageIntentService : IntentService("DelayedMessageIntentService") {

    lateinit var handler: Handler

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        handler = Handler()
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onHandleIntent(intent: Intent?) {
        Log.d("MyService","Started service $this")
        Thread.sleep(5000)
        message()
    }

    fun message() {
        handler.post(object: Runnable {
            override fun run() {
                Toast.makeText(applicationContext,"Wow! You just ran a service!",Toast.LENGTH_LONG).show()
            }
        })

    }
}