package com.mrashment.scheduledtasksexample

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters

class MessageWorker(appContext: Context, workerParams: WorkerParameters):
    Worker(appContext, workerParams) {

    override fun doWork(): Result {
        TODO("Not yet implemented")
    }
}