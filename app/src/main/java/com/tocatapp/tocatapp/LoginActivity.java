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

        buttonLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void OnClick(View v) {
                final String userEmail = editTextMail.getText().toString();
                final String userPassword = editTextPassword.getText().toString();

                if(UserService.isValid(userEmail, userPassword)) {
                    // Dejar en blanco, yo sigo desde aca
                } else {
                    DialogHelper.showSimpleOkDialog(this, "Usuario/Contraseña incorrecta", "Su nombre de usuario o contraseña es incorrecto"); 
                }

            }
        });
    }
}
