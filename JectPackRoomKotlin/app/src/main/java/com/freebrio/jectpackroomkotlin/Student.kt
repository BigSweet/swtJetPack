package com.freebrio.jectpackroomkotlin

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


/**
 * introduce：here is introduce
 * author：sunwentao
 * email：wentao.sun@freebrio.com
 * data: 1/6/21
 */
@Entity
class Student() {

    @PrimaryKey
    var id: Int = 0


    @ColumnInfo(name = "name")
    var name: String = ""

    @ColumnInfo(name = "age")
    var age: Int = 0

    override fun toString(): String {
        return "Student(id=$id, name='$name', age='$age')"
    }

}