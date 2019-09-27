package com.lecslt.basics;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreeenActivity extends AppCompatActivity {

    private final  int SPLASH_SCREEN_TIMEOUT = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screeen);

        //Rediriger vers la page principale apres 1.5 secondes
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //demarer la page
                Intent intent = new Intent(SplashScreeenActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN_TIMEOUT);

    }
}
