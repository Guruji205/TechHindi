package com.example.techhindi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();
        imageView=(ImageView)findViewById(R.id.imageView2);
        Timer timer= new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
            startActivity(new Intent(SplashActivity.this,MainActivity.class));
            finish();
            }
        },1500);

    }
}
