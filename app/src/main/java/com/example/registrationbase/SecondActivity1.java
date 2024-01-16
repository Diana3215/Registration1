package com.example.registrationbase;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity1 extends AppCompatActivity {
    TextView email;
    TextView password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second1);

        TextView email = (TextView) findViewById(R.id.email);
        Intent intent = getIntent();

        String Email = intent.getStringExtra("email");
        email.setText(Email);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView password = (TextView) findViewById(R.id.password);

        String Password = intent.getStringExtra("password");
        password.setText(Password);

    }
}