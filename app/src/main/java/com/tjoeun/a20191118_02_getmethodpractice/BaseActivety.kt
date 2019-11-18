package com.tjoeun.a20191118_02_getmethodpractice

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivety : AppCompatActivity() {

    var mContext = this

    abstract fun setupEvents()
    abstract fun setValues()
}