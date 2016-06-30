package com.tocatapp.tocatapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Omar on 28-06-2016.
 */
public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText editTextMail = (EditText) findViewById(R.id.mailEditText);
        final EditText editTextPassword = (EditText) findViewById(R.id.passwordEditText);
        final Button buttonLogin = (Button) findViewById(R.id.loginButton);
        final Button buttonRegister = (Button) findViewById(R.id.registerButton);

        buttonRegister.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(LoginActivity.this, RegisterActivity.class);
                LoginActivity.this.startActivity(registerIntent);
            }
        });

        buttonLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void OnClick(View v) {
                String userMail = "Augusto";
                String userPassword = "1234";
                final String editTextMail.getText().toString();
                final String editTextPassword.getText().toString();

                if(editTextMail.equals(userMail) & userPassword.equals(userPassword)) {

                }

            }
        });
    }
}
