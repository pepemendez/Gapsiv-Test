package com.example.gapsi.repository;

import android.content.Context
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import org.json.JSONObject

private const val API = "https://fcm.googleapis.com/fcm/send"
private const val serverKey = "key=" + "AAAAQddNoJc:APA91bE6tqDsjJwJUdUkiZrlAzBpk2bPAWyCznCNAgAv6BMDC-JG_qyL8VZV61NqeqBtIYJCI-5HN0ozxK63QkQxQci4597m16W3E6eq2p1J6SUtuc1UJB0FPR7WXQfyMc8kvzdr4V0j"
interface IRequestComponent {
    fun getDataForQuery(applicationContext: Context, query: String, response: (JSONObject) -> Unit, error: () -> Unit)
}

object RequestComponent: IRequestComponent {

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