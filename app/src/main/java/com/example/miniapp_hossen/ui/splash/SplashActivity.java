package com.example.miniapp_hossen.ui.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;

import com.example.miniapp_hossen.R;
import com.example.miniapp_hossen.ui.first.ProductActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        CountDownTimer countDownTimer=new CountDownTimer(5000,5000) {
            @Override
            public void onTick(long millisUntilFinished) {
                Log.d("Checked","Ticked");
            }

            @Override
            public void onFinish() {
               Intent intent=new Intent(SplashActivity.this, ProductActivity.class);
               startActivity(intent);
               finish();

            }
        }; countDownTimer.start();
    }
}
