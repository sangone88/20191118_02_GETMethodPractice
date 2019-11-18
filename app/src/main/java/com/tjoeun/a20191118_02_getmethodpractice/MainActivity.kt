package com.tjoeun.a20191118_02_getmethodpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.tjoeun.a20191118_02_getmethodpractice.utils.ServerUtil
import org.json.JSONObject

class MainActivity : BaseActivety() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {

        ServerUtil.getRequestMyInfo(mContext, object : ServerUtil.JasonResponseHandler {
            override fun onResponse(json: JSONObject) {
                Log.d("내정보응답", json.toString())
            }

        })

    }


}
