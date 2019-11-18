package com.tjoeun.a20191118_02_getmethodpractice.datas

import org.json.JSONObject

class User {

    var login_id = ""
    var name = ""
    var phone = ""
    var category = Category()

    companion object {
        fun getUserFromJson(json:JSONObject) : User {
            val user = User()
            user.login_id = json.getString("login_id")
            user.name = json.getString("name")
            user.phone = json.getString("phone")
            user.category = Category.getCategoryFromJson(json.getJSONObject("category"))

            return user
        }
    }
}