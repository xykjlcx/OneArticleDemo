package com.ocean.dailyarticlesdemo.other

import okhttp3.MediaType


/**
 * Created by ocean on 2018/8/12
 * Author :  ocean
 * Email  :  348686686@qq.com
 */
object AppConstant{

    /**
     * 是否开启Debug模式
     */
    val isDegug = true

    /**
     * 请求URL
     */
    val URL:String = "https://api.hibai.cn/api/index/index"

    /**
     * json格式的media type
     */
    val MEDIA_TYPE_JSON = MediaType.parse("application/json")

}