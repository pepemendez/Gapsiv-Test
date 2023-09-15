package com.example.gapsi

import android.content.Context
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import org.json.JSONObject


private const val API = "https://00672285.us-south.apigw.appdomain.cloud/demo-gapsi/search?&query="//[criterio]&page=[numeropagina]"
private const val serverKey = "adb8204d-d574-4394-8c1a-53226a40876e"
private const val contentType = "application/json"

interface IRequestComponent {
    fun getDataForQuery(applicationContext: Context, query: String, response: (JSONObject) -> Unit, error: () -> Unit)
}

object RequestComponent : ApiComponent {

    override fun getDataForQuery(applicationContext: Context, query: String, f: (JSONObject) -> Unit, error: () -> Unit){
        // Request a string response from the provided URL.
        val jsonObjectRequest = object : JsonObjectRequest(API + query + "&page=1",
            Response.Listener<JSONObject> { response ->
                f(response)
            },
            Response.ErrorListener {
                error()
            }) {
            override fun getHeaders(): Map<String, String> {
                val params = HashMap<String, String>()
                params["X-IBM-Client-Id"] = serverKey
                return params
            }
        }
        // Add the request to the RequestQueue.
        val queue = Volley.newRequestQueue(applicationContext)
        queue.add(jsonObjectRequest)
    }
}