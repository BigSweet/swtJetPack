package com.freebrio.jetpackpaggingkotlin

import androidx.paging.DataSource


/**
 * introduce：here is introduce
 * author：sunwentao
 * email：wentao.sun@freebrio.com
 * data: 1/7/21
 */
class StudentDataSourceFactory : DataSource.Factory<Int, Student>() {
    override fun create(): DataSource<Int, Student> {
        return StudentDataSource()
    }
}