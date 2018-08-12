package com.ocean.dailyarticlesdemo.other

import android.os.Handler
import android.os.Message
import android.util.Log
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.ocean.dailyarticlesdemo.model.OneArticleModel
import okhttp3.*
import org.json.JSONObject
import java.io.IOException
import java.util.*

/**
 * Created by ocean on 2018/8/11
 * Author :  ocean
 * Email  :  348686686@qq.com
 * 
 */

object OceanUtil{

    object Holder{
        val OK_HTTP_CLIENT = OkHttpClient()
        val GSON = Gson()
    }

    private const val TAG:String = "ocean"

    /**
     * 网络请求工具方法demo
     * @param url api接口地址
     * @param handler
     */
    fun httpRequest(url: String,params: HashMap<String,Any>,handler: Handler){
        var jsonObject = JSONObject(params)
        var requestBody = RequestBody.create(OceanConstant.MEDIA_TYPE_JSON,jsonObject.toString())
        val okHttpClient = Holder.OK_HTTP_CLIENT
        val request = Request.Builder()
                .url(url)
                .post(requestBody)
                .build()
        okHttpClient.newCall(request).enqueue(object: Callback{
            override fun onFailure(call: Call?, e: IOException?) {
                logE("请求失败")
            }

            override fun onResponse(call: Call?, response: Response?) {
                logE("请求成功")
                val result:String = response!!.body().string().toString()
                val message = Message()
                message.what = 200
                message.obj = result
                handler.sendMessage(message)
            }

        })
    }

    /**
     * 日志打印
     * @param any
     */
    fun logE(any: Any) {
        if (OceanConstant.isDegug)
            Log.e(TAG,"-> -> -> 日志打印【 $any 】")
    }

    /**
     * 数据转换
     */
    fun convertData(result:String): OneArticleModel {
        return Holder.GSON.fromJson(
                result,
                object : TypeToken<OneArticleModel>(){}.type
        )
    }

}