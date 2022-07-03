package com.blacksoftwarestudio.fitlend;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen1 extends AppCompatActivity {

    SharedPreferences sharedPreferences;

    Boolean firstTime;

    private static int SPLASH_SCREEN_TIMEOUT = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash_screen_1);

        sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);

        firstTime = sharedPreferences.getBoolean("firstTime", true);

        if (firstTime) {

            new Handler().postDelayed(new Runnable() {

                @Override
                public void run() {

                    SharedPreferences.Editor editor = sharedPreferences.edit();

                    firstTime = false;

                    editor.putBoolean("firstTime", firstTime);

                    editor.apply();

                    Intent mySuperIntent = new Intent(SplashScreen1.this, AppIntro.class);

                    startActivity(mySuperIntent);

                    finish();
                }

            }, SPLASH_SCREEN_TIMEOUT);

        }

        else {

            Intent mySuperIntent = new Intent(SplashScreen1.this, SplashScreen2.class);
            startActivity(mySuperIntent);
            finish();

        }
    }
}