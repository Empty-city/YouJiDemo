package com.qf.youji.welcome;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;

import com.qf.youji.R;

public class InitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_init);
        new Thread(){
            @Override
            public void run() {
                SystemClock.sleep(1000);
                startActivity(new Intent(InitActivity.this,SecondActivity.class));
                finish();
               // supGr.run();
            }
        }.start();
    }
}
