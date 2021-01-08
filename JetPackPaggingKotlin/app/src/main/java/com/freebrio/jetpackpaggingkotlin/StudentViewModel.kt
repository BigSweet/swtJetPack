package com.freebrio.jetpackpaggingkotlin

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList


/**
 * introduce：here is introduce
 * author：sunwentao
 * email：wentao.sun@freebrio.com
 * data: 1/7/21
 */
class StudentViewModel : ViewModel() {

    var liveData: LiveData<PagedList<Student>>

    init {
        val factory = StudentDataSourceFactory()
        liveData = LivePagedListBuilder<Int, Student>(factory, PAGE_SIZE).build()
    }

}