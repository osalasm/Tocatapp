package com.tocatapp.tocatapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText editTextName = (EditText) findViewById(R.id.nameEditText);
        final EditText editTextMail = (EditText) findViewById(R.id.mailEditText);
        final EditText editTextPassword = (EditText) findViewById(R.id.passwordEditText);
        final EditText editTextAge = (EditText) findViewById(R.id.ageEditText);
        final Button buttonRegister = (Button) findViewById(R.id.registerButton);
    }
}
