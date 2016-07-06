package com.qf.youji;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageButton;
import android.widget.ListView;

import com.qf.youji.fragment.YouJiFragment;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ViewPager vp_id;//ViewPager
    private ListView lv_id;
    private ImageButton empty;
    private List<Fragment> videoList;
    private FragmentManager fragment;
    private FragmentTransaction trans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragment = getSupportFragmentManager();

        // 思路：
        // 0、使用MyMainFragment来替换占位的容器控件

        fragment = getSupportFragmentManager();
        trans = fragment.beginTransaction();
        trans.replace(R.id.ll_container_id,new YouJiFragment());
        trans.commit();
        //界面上控件实例的获取
        init();

        //关于ViewPager的操作
//        aboutViewPager();

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

    }
}
