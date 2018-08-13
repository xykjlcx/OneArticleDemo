package com.ocean.dailyarticlesdemo.viewmodel

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.MutableLiveData
import com.ocean.dailyarticlesdemo.model.ArticleModel
import com.ocean.dailyarticlesdemo.repository.ArticRepository

/**
 * Created by ocean on 2018/8/12
 * Author :  ocean
 * Email  :  348686686@qq.com
 */
class ArticleViewModel(application: Application) : AndroidViewModel(application) {

    private var repository : ArticRepository? = null
    private var data:MutableLiveData<ArticleModel>? = null

    init {
        repository = ArticRepository(application)
        data = repository?.getLiveDta()
    }

    fun getData(): MutableLiveData<ArticleModel>? {
        return data
    }

    fun requestData(){
        repository?.getHttpData()
    }

}