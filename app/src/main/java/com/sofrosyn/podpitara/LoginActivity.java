package com.sofrosyn.podpitara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.button.MaterialButton;

public class LoginActivity extends AppCompatActivity {


    private MaterialButton signUp;
    private MaterialButton signIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

   initViews();
   initActions();

    }


    private void initViews() {

    signIn = findViewById(R.id.activity_login_button);
    signUp = findViewById(R.id.activity_login_signup_Button);


    }
    private void initActions() {

       signUp.setOnClickListener(v -> startActivity(new Intent(this,SignupActvivity.class)));
       signIn.setOnClickListener(v -> startActivity(new Intent(this,MainActivity.class)));

    }


}