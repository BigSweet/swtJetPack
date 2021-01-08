package com.freebrio.jetpackpaggingkotlin

import androidx.paging.PositionalDataSource


/**
 * introduce：here is introduce
 * author：sunwentao
 * email：wentao.sun@freebrio.com
 * data: 1/7/21
 */
var PAGE_SIZE = 20
class StudentDataSource : PositionalDataSource<Student>() {
    override fun loadInitial(params: LoadInitialParams, callback: LoadInitialCallback<Student>) {
        callback.onResult(getStudents(0, PAGE_SIZE), 0, 1000)
    }

    override fun loadRange(params: LoadRangeParams, callback: LoadRangeCallback<Student>) {
        callback.onResult(getStudents(params.startPosition, params.loadSize))
    }


    fun getStudents(startPosition: Int, pageSize: Int): List<Student> {
        var list = arrayListOf<Student>()
        for (i in startPosition until pageSize + startPosition) {
            val student = Student()
            student.age = i
            student.name = "robat" + i
            list.add(student)
        }
        return list
    }
}