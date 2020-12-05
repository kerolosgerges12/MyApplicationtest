package com.example.myapplicationtest.ui.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplicationtest.R;

public class loginActivity extends AppCompatActivity {


    private EditText edemail, edpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        findViewById(R.id.txt_forgetpass).setOnClickListener(v -> {
            startActivity(new Intent(loginActivity.this, ForgetPasswordActivity.class));
        });


        edemail = findViewById(R.id.email_login);
        edpassword = findViewById(R.id.email_password);

        findViewById(R.id.Login).setOnClickListener(v -> {

            validationData();

        });

    }



    private void validationData() {
        String eEmail = edemail.getText().toString().trim();
        String pPassword = edpassword.getText().toString().trim();

        if (eEmail.isEmpty()) {
            edemail.requestFocus();
            Toast.makeText(this, "Email  Need", Toast.LENGTH_SHORT).show();
            return;

        }

        if (! Patterns.EMAIL_ADDRESS.matcher(eEmail).matches()) {
            edemail.requestFocus();
            Toast.makeText(this, "Email not correct", Toast.LENGTH_SHORT).show();
            return;
        }
        if (pPassword.isEmpty()) {

            edpassword.requestFocus();
            Toast.makeText(this, "PASSWORD Need", Toast.LENGTH_SHORT).show();
            return;

        }


        if (pPassword.length() < 6) {

            edpassword.requestFocus();
            Toast.makeText(this, "PASSWORD not correct", Toast.LENGTH_SHORT).show();
            return;

        }
        Toast.makeText(this, "All Done ", Toast.LENGTH_SHORT).show();


    }
}