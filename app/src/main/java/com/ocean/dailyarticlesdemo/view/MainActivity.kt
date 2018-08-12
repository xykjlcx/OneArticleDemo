package com.ocean.dailyarticlesdemo.view

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.bumptech.glide.Glide
import com.ocean.dailyarticlesdemo.R
import com.ocean.dailyarticlesdemo.model.OneArticleModel
import com.ocean.dailyarticlesdemo.viewmodel.MainViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var vm : MainViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // 获取vm对象
        vm = ViewModelProviders.of(this).get(MainViewModel::class.java)
        initData()
    }

    fun initData(){
        btn_get.setOnClickListener(View.OnClickListener {
            vm?.requestData()
        })
        vm?.getData()?.observe(this, Observer {
            it?.let { it1 -> updateView(it1) }
        })
    }

    fun updateView(model:OneArticleModel){
        tv_title.text = "《 ${model.body.word_from} 》"
        tv_author.text = "—— " +  model.body.img_author
        tv_digest.text = model.body.word
        Glide
                .with(this)
                .load(model.body.img_url)
                .into(img_left)
        Toast.makeText(this,"更新成功",Toast.LENGTH_SHORT).show()
    }

}
