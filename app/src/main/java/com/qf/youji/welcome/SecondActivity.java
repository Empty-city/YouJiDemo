package com.qf.youji.welcome;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.AlphaAnimation;
import android.widget.RelativeLayout;

import com.qf.youji.R;

public class SecondActivity extends AppCompatActivity {

    private RelativeLayout circle_outer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //音乐播放
       startMusic();
        //界面上控件实例的获取
        circle_outer = (RelativeLayout) findViewById(R.id.circle_outer_id);
        new Thread(){
            @Override
            public void run() {
                //圆圈渐渐淡出
                // 加载资源文件中描述的动画信息，变成一个动画的实例
                AlphaAnimation show=new AlphaAnimation(0,1);
                show.setDuration(2500);
                circle_outer.startAnimation(show);
                AlphaAnimation a=new AlphaAnimation(1,0);
                a.setDuration(3000);
                // 将动画作用于界面上的控件
                circle_outer.startAnimation(a);
                //圆完全显示出来之后，圆隐藏
                SystemClock.sleep(5000);
                startActivity(new Intent(SecondActivity.this,ThirdActivity.class));

            }
        }.start();

    }
//播放音乐
    private void startMusic() {
        //获得MediaPlayer实例
        MediaPlayer mp = MediaPlayer.create(this, R.raw.music);
        //设置要播放的文件：
        mp.start();

    }
}
