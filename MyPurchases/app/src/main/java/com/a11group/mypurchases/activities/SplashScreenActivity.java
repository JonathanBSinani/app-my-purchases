package com.a11group.mypurchases.activities;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.a11group.mypurchases.R;

public class SplashScreenActivity extends AppCompatActivity {

    private static int TEMPO_SPLASH = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent login = new Intent(getApplicationContext(), HomeScreenActivity.class);
                startActivity(login);
                finish();
            }
        }, TEMPO_SPLASH);
    }
}
