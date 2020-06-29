package com.mrashment.scheduledtasksexample

import android.app.IntentService
import android.content.Intent
import android.util.Log
import android.widget.Toast

class DelayedMessageIntentService : IntentService("DelayedMessageIntentService") {

    override fun onHandleIntent(intent: Intent?) {
        Log.d("MyService","Started service $this")
        Thread.sleep(5000)
        Toast.makeText(applicationContext,"Wow! You just ran a service!",Toast.LENGTH_LONG).show()
    }
}