package com.example.registrationbase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String EXTRA_MESSAGE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText Email = (EditText) findViewById(R.id.editTextTextEmailAddress);

        EditText Password = findViewById(R.id.editTextTextPassword);
        Button but = findViewById(R.id.button);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity1.class);
                intent.putExtra("email", Email.getText().toString());
                intent.putExtra("password", Password.getText().toString());
                startActivity(intent);
            }
        });
    }


}