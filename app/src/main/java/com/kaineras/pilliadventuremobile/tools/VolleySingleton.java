package com.kaineras.pilliadventuremobile.tools;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.Volley;
import com.kaineras.pilliadventuremobile.MyApplication;


/**
 * Created the first version by kaineras on 10/03/15.
 */
public class VolleySingleton {
    private static VolleySingleton mInstance = null;
    private ImageLoader mImageLoader;
    private RequestQueue mRequestQueue;

    private VolleySingleton(){
        mRequestQueue = Volley.newRequestQueue(MyApplication.getContext());
    }

    public static VolleySingleton getInstance(){
        if(mInstance == null){
            mInstance = new VolleySingleton();
        }
        return mInstance;
    }

    public RequestQueue getRequestQueue() {
        return this.mRequestQueue;
    }


    public ImageLoader getImageLoader(){
        return this.mImageLoader;
    }

}