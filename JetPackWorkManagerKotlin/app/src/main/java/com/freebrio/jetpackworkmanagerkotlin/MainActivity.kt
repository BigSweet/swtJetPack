package com.freebrio.jetpackworkmanagerkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import androidx.work.WorkRequest

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val uploadWorkRequest: WorkRequest =
                OneTimeWorkRequestBuilder<UploadWork>()
                        .build()
        WorkManager
                .getInstance(this)
                .enqueue(uploadWorkRequest)

    }
}