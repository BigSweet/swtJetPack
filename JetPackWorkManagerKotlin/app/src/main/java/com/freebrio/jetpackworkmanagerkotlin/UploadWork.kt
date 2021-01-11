package com.freebrio.jetpackworkmanagerkotlin

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters


/**
 * introduce：here is introduce
 * author：sunwentao
 * email：wentao.sun@freebrio.com
 * data: 2021/01/08
 */
class UploadWork(
    context: Context, workerParams: WorkerParameters
) : Worker(context, workerParams) {
    override fun doWork(): Result {
        Thread.sleep(2000)
        Log.i("swt", "doWork: 上传完成啦")
        return Result.success()
    }
}