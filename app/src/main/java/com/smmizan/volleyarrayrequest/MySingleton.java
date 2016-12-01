package com.smmizan.volleyarrayrequest;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by Mamun on 12/1/2016.
 */

public class MySingleton {
    private static MySingleton mInstance;
    private RequestQueue requestQueue;
    private static Context myContext;


    public MySingleton(Context context){
        myContext = context;
        requestQueue = getRequestQueue();
    }


    public RequestQueue getRequestQueue(){
        if(requestQueue==null){
            requestQueue = Volley.newRequestQueue(myContext.getApplicationContext());
        }

        return requestQueue;
    }


    public  static synchronized MySingleton getmInstance(Context context){
        if(mInstance==null){
            mInstance = new MySingleton(context);
        }

        return mInstance;
    }

     public<T> void addToRequestque(Request<T> request){
            requestQueue.add(request);
     }


}
