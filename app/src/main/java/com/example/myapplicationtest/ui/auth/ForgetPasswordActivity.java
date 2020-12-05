package com.example.myapplicationtest.ui.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.myapplicationtest.R;

public class ForgetPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);

        findViewById(R.id.ic_close).setOnClickListener(v -> {
            startActivity(new Intent(ForgetPasswordActivity.this, loginActivity.class));
        });



    }
}