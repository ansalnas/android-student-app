package com.example.studentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Addcourse extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4;
    AppCompatButton b1, b2;
    String getcname,getdes,getdur,getrem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addcourse);
        ed1 = (EditText)findViewById(R.id.cname);
        ed2 = (EditText)findViewById(R.id.desc);
        ed3 = (EditText)findViewById(R.id.dur);
        ed4 = (EditText)findViewById(R.id.rem);
        b1 = (AppCompatButton)findViewById(R.id.submit);
        b2 = (AppCompatButton)findViewById(R.id.back);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Addcourse.class);
                startActivity(i);

            }
        });


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getcname=ed1.getText().toString();
                getdes=ed2.getText().toString();
                getdur=ed3.getText().toString();
                getrem=ed4.getText().toString();
                Toast.makeText(getApplicationContext(),getcname, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getdes,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getdur,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getrem,Toast.LENGTH_SHORT).show();

            }
        });



    }
}