package com.tocatapp.tocatapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
                final String editTextMail.getText().toString();
                final String editTextPassword.getText().toString();

                if(!validateMail(editTextMail.getText().toString())) {
                    editTextMail.setError("Mail invalido");
                    editTextMail.requestFocus();
                } else if(!validatePassword(editTextPassword.getText().ToString())) {
                    editTextPassword.setError("Contraseña invalida");
                    editTextPassword.requestFocus();
                } else {
                    Toast.makeText(LoginActivity.this, "Validacion correcta", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
    protected boolean validatePassword(String editTextPassword) {
        if(editTextPassword != null && editTextPassword.length() > 6) {
            return true;
        } else {
            return false;
        }
    }

    protected boolean validateMail(String editTextMail) {
        String mailPattern = "^[_A-Z-z0-9-\\+]+(\\.[_A-Z-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(mailPattern);
        Matcher matcher = pattern.matcher(editTextMail);
        return matcher.matches();
    }
}