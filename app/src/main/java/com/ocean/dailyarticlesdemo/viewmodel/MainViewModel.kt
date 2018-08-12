package com.ocean.dailyarticlesdemo.viewmodel

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.ocean.dailyarticlesdemo.model.OneArticleModel
import com.ocean.dailyarticlesdemo.repository.MainRepository

/**
 * Created by ocean on 2018/8/12
 * Author :  ocean
 * Email  :  348686686@qq.com
 */
class MainViewModel(application: Application) : AndroidViewModel(application) {

    private var repository : MainRepository? = null
    private var data:MutableLiveData<OneArticleModel>? = null

    init {
        repository = MainRepository(application)
        data = repository?.getLiveDta()
    }

    fun getData(): MutableLiveData<OneArticleModel>? {
        return data
    }

    fun requestData(){
        repository?.getHttpData()
    }

}