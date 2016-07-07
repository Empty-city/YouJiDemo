package com.qf.youji;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import android.widget.RadioGroup;

import com.qf.youji.fragment.HuoDongFragment;
import com.qf.youji.fragment.KanShiJieFragment;
import com.qf.youji.fragment.MyFragment;
import com.qf.youji.fragment.YouJiFragment;

public class MainActivity extends AppCompatActivity {

    private RadioGroup rg_id;
    private FrameLayout fl_container_id;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //界面上控件实例的获取
        initViews();
        //获取FragmentManager的实例
        fragmentManager = getSupportFragmentManager();
        //关于RadioGroup的操作
        aboutRadioGroup();
        //第一次启动页面，显示游迹页面
        FragmentTransaction trans=fragmentManager.beginTransaction();
        Fragment fragment=new YouJiFragment();
        Bundle bundle=new Bundle();
        bundle.putString("modelName","游迹");
        fragment.setArguments(bundle);
        trans.replace(R.id.fl_container_id,fragment);
        trans.commit();

    }
//关于RadioGroup的操作
    private void aboutRadioGroup() {
        //给RadioGroup添加监听器
        //在监听器内部相应的方法中，使用相应的eFragment对应的视图，替换界面上占位的容器控件
        rg_id.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                //开启事务
                FragmentTransaction trans=fragmentManager.beginTransaction();
                Fragment fragment=null;
                Bundle bundle=new Bundle();
                switch (i){
                    case R.id.rb_yj_id://游迹
                        fragment=new YouJiFragment();
                        bundle.putString("modelName","游迹");
                        fragment.setArguments(bundle);
                        trans.replace(R.id.fl_container_id,fragment);
                        break;
                    case R.id.rb_ksj_id://看世界
                        fragment=new KanShiJieFragment();
                        bundle.putString("modelName","看世界");
                        fragment.setArguments(bundle);
                        trans.replace(R.id.fl_container_id,fragment);
                        break;
                    case R.id.rb_add_id://添加
                       startActivity(new Intent(MainActivity.this,AddActivity.class));
                        break;
                    case R.id.rb_hd_id://活动
                        fragment=new HuoDongFragment();
                        bundle.putString("modelName","活动");
                        fragment.setArguments(bundle);
                        trans.replace(R.id.fl_container_id,fragment);
                        break;
                    case R.id.rb_md_id://我的
                        fragment=new MyFragment();
                        bundle.putString("modelName","我的");
                        fragment.setArguments(bundle);
                        trans.replace(R.id.fl_container_id,fragment);
                        break;

                }
                //提交事件
                trans.commit();
            }
        });
    }

    //界面上控件实例的获取
    private void initViews(){
        rg_id = (RadioGroup) findViewById(R.id.rg_id);
        fl_container_id = (FrameLayout) findViewById(R.id.fl_container_id);

    }
}
