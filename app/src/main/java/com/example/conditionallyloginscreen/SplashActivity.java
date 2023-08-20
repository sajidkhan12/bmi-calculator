package com.example.conditionallyloginscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    private  static final String SHARED_PREF_NAME="MyPref";

    private  static final String KEY_NAME="Name";

    private  static final String KEY_NUMBER="Number";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        sharedPreferences=getSharedPreferences(SHARED_PREF_NAME,MODE_PRIVATE);
        String stringname=sharedPreferences.getString(KEY_NAME,null);

        String stringnumber=sharedPreferences.getString(KEY_NUMBER,null);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if(stringname!=null|| stringnumber!=null){
                    Intent intent=new Intent(SplashActivity.this, MainActivity2.class);
                    startActivity(intent);
                }
                else {
                    Intent intent=new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(intent);

                }
                finish();
            }
        },5000);
    }

}
