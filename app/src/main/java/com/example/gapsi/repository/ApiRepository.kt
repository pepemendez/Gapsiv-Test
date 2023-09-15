package com.example.gapsi

import android.content.Context
import org.json.JSONObject


interface ApiComponent: IRequestComponent

class ApiRepository: ApiComponent {
    val repository: IRequestComponent = RequestComponent

//    override fun sendLocation(applicationContext: Context, latitude: Double, longitude: Double, response: (JSONObject) -> Unit, error: () -> Unit) {
//        repository.sendLocation(applicationContext, latitude, longitude, response, error)
//    }

    override fun getDataForQuery(applicationContext: Context, query: String, response: (JSONObject) -> Unit, error: () -> Unit) {
        repository.getDataForQuery(applicationContext, query,  response, error)
    }
}
