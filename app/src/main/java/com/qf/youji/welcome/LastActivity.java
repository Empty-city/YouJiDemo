package com.qf.youji.welcome;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;

import com.qf.youji.MainActivity;
import com.qf.youji.R;

public class LastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);
        new Thread(){
            @Override
            public void run() {
                SystemClock.sleep(1000);
                startActivity(new Intent(LastActivity.this, MainActivity.class));
                finish();
            }
        }.start();

    }
}
