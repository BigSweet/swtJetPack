package com.freebrio.jectpackroomkotlin

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query


/**
 * introduce：here is introduce
 * author：sunwentao
 * email：wentao.sun@freebrio.com
 * data: 1/6/21
 */
@Dao
interface StudentDao {

    @Insert
    fun insert(vararg student: Student)


    @Delete
    fun delete(student: Student)

    @Query("select * from Student")
    fun getAll():List<Student>
}