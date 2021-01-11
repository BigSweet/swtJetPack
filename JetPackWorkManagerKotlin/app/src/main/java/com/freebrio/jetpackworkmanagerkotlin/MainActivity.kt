package com.freebrio.jetpackworkmanagerkotlin

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.work.*

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

        val constraints = Constraints.Builder()
            .setRequiresCharging(true)
            .setRequiredNetworkType(NetworkType.CONNECTED)
            .build()
        val save = OneTimeWorkRequestBuilder<SaveImgWork>().setConstraints(constraints).build()
        WorkManager.getInstance(this).beginUniqueWork(
            "test", ExistingWorkPolicy.REPLACE,
            OneTimeWorkRequest.from(UploadWork::class.java)
        ).then(save).enqueue()

    }

    class SaveImgWork(context: Context, parameters: WorkerParameters) :
        Worker(context, parameters) {
        override fun doWork(): Result {
            Thread.sleep(2000)
            Log.i("swt", "doWork: 保存完成啦")
            return Result.success()
        }


    }
}