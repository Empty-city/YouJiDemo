package com.qf.youji.fragment;

import android.database.DataSetObserver;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import com.google.gson.Gson;
import com.qf.youji.MyApp;
import com.qf.youji.R;
import com.qf.youji.common.Uris;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Administrator on 2016/7/6.
 */
public class YouJiFragment  extends ListFragment{
    private ListView list;
    private ImageView empty;
    private List<Fragment> data;
    private FragmentActivity activity;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity = getActivity();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view=inflater.inflate(R.layout.fragment_list,null);
        list = (ListView)view.findViewById(android.R.id.list);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        //关于ListView
      aboutListView();
        super.onActivityCreated(savedInstanceState);
    }
    //关于ListView的操作
    private void aboutListView() {
        //数据源
        data = new LinkedList<>();
        //填充数据源(从网络上下载解析数据)
        fillDataSource();
        //适配器

        //绑定适配器
//        ListAdapter adapter=new MyListAdapter();
//        list.setAdapter(adapter);
    }
    //填充数据源(请求网络从网络上下载解析数据)
    private void fillDataSource() {
        //请求
        final StringRequest request = new StringRequest(Uris.BASE_URI,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Gson gson=new Gson();
                        Uris uris = gson.fromJson(response, Uris.class);
                    }
                }, null);
        //添加到请求队列中
        request.setTag("qx");
        MyApp.getApp().getRequestQueue().add(request);

    }
    //销毁

    @Override
    public void onDestroy() {
        super.onDestroy();
        MyApp.getApp().getRequestQueue().cancelAll("qx");
    }
//自定义ListAdapter的实现类
    private class MyListAdapter implements ListAdapter {
    @Override
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override
    public boolean isEnabled(int i) {
        return false;
    }

    @Override
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {

    }

    @Override
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {

    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }

    @Override
    public int getItemViewType(int i) {
        return 0;
    }

    @Override
    public int getViewTypeCount() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
}
