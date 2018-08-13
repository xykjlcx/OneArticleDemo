package com.ocean.dailyarticlesdemo.repository

import android.app.Application
import android.arch.lifecycle.MutableLiveData
import android.os.Handler
import android.os.Message
import com.ocean.dailyarticlesdemo.other.OceanUtil
import com.ocean.dailyarticlesdemo.model.ArticleModel
import com.ocean.dailyarticlesdemo.other.AppConstant

/**
 * Created by ocean on 2018/8/12
 * Author :  ocean
 * Email  :  348686686@qq.com
 */

class ArticRepository(application: Application){

    private var liveData = MutableLiveData<ArticleModel>()

    init {
//       getHttpData()
    }

    fun getLiveDta():MutableLiveData<ArticleModel>{
        return liveData
    }

    fun getHttpData(){
        val params : HashMap<String,Any> = HashMap()
        params["TransCode"] = "030111"
        params["OpenId"] = "123456789"
        OceanUtil.httpRequest(
                AppConstant.URL,
                params,
                object : Handler(){
                    override fun handleMessage(msg: Message?) {
                        super.handleMessage(msg)
                        val result = msg?.obj as String
                        OceanUtil.logE("打印请求结果：$result")
                        liveData.value = OceanUtil.convertData(result)
                    }
                }
        )
    }

}