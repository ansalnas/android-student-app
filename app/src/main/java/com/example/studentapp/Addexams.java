package com.example.studentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Addexams extends AppCompatActivity {
EditText ed1,ed2,ed3,ed4;
AppCompatButton b1,b2;
String getsem,getename,getdate,getrem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_addexams);
            ed1 = (EditText)findViewById(R.id.sname);
            ed2 = (EditText)findViewById(R.id.ename);
            ed3 = (EditText)findViewById(R.id.edate);
            ed4 = (EditText)findViewById(R.id.rem);
            b1 = (AppCompatButton)findViewById(R.id.submit);
            b2 = (AppCompatButton)findViewById(R.id.back);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Addexams.class);
                startActivity(i);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getsem = ed1.getText().toString();
                getename = ed2.getText().toString();
                getdate = ed3.getText().toString();
                getrem = ed4.getText().toString();
                Toast.makeText(getApplicationContext(), getsem, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), getename, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), getdate, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), getrem, Toast.LENGTH_SHORT).show();
            }

        });


                }

    }


