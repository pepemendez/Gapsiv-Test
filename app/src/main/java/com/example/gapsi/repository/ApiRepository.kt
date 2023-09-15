package com.example.gapsi.repository;

import android.content.Context
import org.json.JSONObject

fun getDataForQuery(applicationContext: Context, query: String, response: (JSONObject) -> Unit, error: () -> Unit) {
    RequestComponent.getDataForQuery(applicationContext, query,  response, error)
}