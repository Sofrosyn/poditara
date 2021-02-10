package com.sofrosyn.podpitara;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;

import java.util.Objects;

public class SignupActvivity extends AppCompatActivity {

    private MaterialButton signIn;
    private MaterialToolbar toolbar;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        initViews();
        initActions();

    }


    private void initViews() {


        toolbar = findViewById(R.id.activity_signup_toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        signIn = findViewById(R.id.activity_signup_login_button);
    }
    private void initActions() {

    signIn.setOnClickListener(v -> startActivity(new Intent(this,LoginActivity.class)));

    }


}
