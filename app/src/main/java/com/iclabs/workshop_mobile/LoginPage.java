package com.iclabs.workshop_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        EditText email = (EditText) findViewById(R.id.et_email);
        TextView wrongEmail = (TextView) findViewById(R.id.tv_wrongEmail);
        EditText pass = (EditText) findViewById(R.id.et_pass);
        TextView wrongPass = (TextView) findViewById(R.id.tv_wrongPass);
        Button signIn = (Button) findViewById(R.id.btn_signIn);
        TextView signUp = (TextView) findViewById(R.id.tv_signUp);

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (email.getText().toString().equals("daniarya@gmail.com") && pass.getText().toString().equals("dani1234")){
                    Intent i = new Intent(LoginPage.this,HomePage.class);
                    startActivity(i);
                    Toast.makeText(LoginPage.this, "Login Succesfully...", Toast.LENGTH_SHORT).show();
                } else {
                    wrongEmail.setText("Your Email Is Wrong");
                    wrongPass.setText("Your Password Is Wrong");
                }
            }
        });

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginPage.this,SignUpPage.class);
                startActivity(i);
            }
        });

    }
}