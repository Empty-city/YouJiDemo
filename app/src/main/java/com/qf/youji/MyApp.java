package com.qf.youji;

import android.app.Application;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by Administrator on 2016/7/6.
 */
//请求队列类(将Volley添加到队列中)
public class MyApp  extends Application{
    private static MyApp app;
    private RequestQueue requestQueue;

    @Override
    public void onCreate() {
        super.onCreate();
        this.app=this;
        //实例化Volley
        initVolley();
    }

    private void initVolley() {
        requestQueue = Volley.newRequestQueue(this);

    }

    public static MyApp getApp() {
        return app;
    }

    public RequestQueue getRequestQueue() {
        return requestQueue;
    }
}
