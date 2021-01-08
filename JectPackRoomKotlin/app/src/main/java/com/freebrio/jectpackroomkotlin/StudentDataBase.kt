package com.freebrio.jectpackroomkotlin

import androidx.room.*


/**
 * introduce：here is introduce
 * author：sunwentao
 * email：wentao.sun@freebrio.com
 * data: 1/6/21
 */
@Database(entities = [Student::class], version = 1)
abstract class StudentDataBase : RoomDatabase() {
    abstract fun studentDao(): StudentDao
}