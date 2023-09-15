package com.example.gapsi.repository;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;


public class eCommerceComponent {

    private static String API = "https://00672285.us-south.apigw.appdomain.cloud/demo-gapsi/search?&query=";//[criterio]&page=[numeropagina]";
    private static String serverKey = "adb8204d-d574-4394-8c1a-53226a40876e";
    public static void getData(Context applicationContext, String query, int page, Response.Listener<JSONObject> response, Response.ErrorListener error){
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest
                (Request.Method.GET, API + query +"&page=" + page, null, response, error){
            @Override
            public Map<String, String> getHeaders() {
                Map<String, String> params = new HashMap<String, String>();
                params.put("X-IBM-Client-Id", serverKey);
                return params;
            }
        };
        RequestQueue requestQueue = Volley.newRequestQueue(applicationContext);
        requestQueue.add(jsonObjectRequest);
    }
}