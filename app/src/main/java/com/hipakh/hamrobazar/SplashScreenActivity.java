package com.hipakh.hamrobazar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
               
                else {
                    Intent intent = new Intent(SplashScreenActivity.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        },2000);
    }
}
