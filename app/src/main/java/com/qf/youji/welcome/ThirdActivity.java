package com.qf.youji.welcome;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;

import com.qf.youji.R;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        new Thread(){
            @Override
            public void run() {

                SystemClock.sleep(3000);
                startActivity(new Intent(ThirdActivity.this,LastActivity.class));
                finish();
            }
        }.start();
    }
}
