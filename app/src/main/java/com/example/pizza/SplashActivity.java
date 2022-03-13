package com.example.pizza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {
        ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        image=(ImageView)findViewById(R.id.imagesp);
        image.animate().rotation(2160f).setDuration(3000);
        Thread t1 = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(2000);

                    Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(intent);

                    SplashActivity.this.finish();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ;
            }
        };
        t1.start();

    }
}
