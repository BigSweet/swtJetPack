package com.freebrio.jectpackroomkotlin

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var student = Student()
        student.name = "Swt"
        student.age = 20
        Thread {
            val dao = Room.databaseBuilder(applicationContext, StudentDataBase::class.java, "test")
                .addMigrations()
                .build()
            dao.studentDao().insert(student)
            Log.d("swt", dao.studentDao().getAll().toString())
        }.start()
    }
}