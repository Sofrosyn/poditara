package com.sofrosyn.podpitara;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);

        runnable(new Intent(this, LoginActivity.class));

    }

    private  void runnable(Intent intent){
        new Handler().postDelayed(() -> {startActivity(intent); finish();}, 3*1000); // wait for 5 seconds
    }

}
