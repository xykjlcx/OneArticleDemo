package com.ocean.dailyarticlesdemo.repository

import android.app.Application
import android.arch.lifecycle.MutableLiveData
import android.os.Handler
import android.os.Message
import com.ocean.dailyarticlesdemo.other.OceanUtil
import com.ocean.dailyarticlesdemo.model.OneArticleModel
import com.ocean.dailyarticlesdemo.other.OceanConstant

/**
 * Created by ocean on 2018/8/12
 * Author :  ocean
 * Email  :  348686686@qq.com
 */

class MainRepository(application: Application){

    private var liveData = MutableLiveData<OneArticleModel>()

    init {
       getHttpData()
    }

    fun getLiveDta():MutableLiveData<OneArticleModel>{
        return liveData
    }

    fun getHttpData(){
        val params : HashMap<String,Any> = HashMap()
        params["TransCode"] = "030111"
        params["OpenId"] = "123456789"
        OceanUtil.httpRequest(
                OceanConstant.URL,
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