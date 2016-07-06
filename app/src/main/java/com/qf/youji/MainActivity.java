package com.qf.youji;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ViewPager vp_id;//ViewPager
    private ListView lv_id;
    private ImageButton empty;
    private List<String> videoList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //界面上控件实例的获取
        init();
        //关于ListView的操作
        aboutListView();
        //关于ViewPager的操作
        aboutViewPager();

    }
//关于ListView的操作
    private void aboutListView() {
        if (lv_id==null){
            lv_id.setEmptyView(empty);
        }
            //数据源
        //视屏
        videoList = new LinkedList<>();
        //初始化VideoView
            //适配器
            //绑定适配器

    }

    //2.关于ViewPager的操作(页面滑动，实现刷新)
    private void aboutViewPager() {
        //数据源
        

        //适配器
        //绑定适配器


        //设置监听器
    }

    //1.界面上控件实例的获取
    private void init() {
      vp_id = (ViewPager) findViewById(R.id.vp_id);
        lv_id = (ListView) findViewById(R.id.lv_id);
        empty = (ImageButton) findViewById(R.id.iv_empty_id);
    }
}
