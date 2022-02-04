package com.example.studentapp;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class DashboardActivity extends AppCompatActivity {
    AppCompatButton b1, b2, b3,b4,b5;
SharedPreferences mypreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        mypreferences=getSharedPreferences("text",MODE_PRIVATE);
        b1 = (AppCompatButton) findViewById(R.id.course);
        b2 = (AppCompatButton) findViewById(R.id.fact);
        b3 = (AppCompatButton) findViewById(R.id.aexam);
        b4=(AppCompatButton)findViewById(R.id.view);
        b5=(AppCompatButton)findViewById(R.id.log);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Addcourse.class);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(getApplicationContext(),Addfacutlty.class);
                startActivity(x);
            }
        });
       b3.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent y=new Intent(getApplicationContext(),Addexams.class);
               startActivity(y);
           }
       });
       b4.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent z=new Intent(getApplicationContext(),Website.class);
               startActivity(z);
           }
       });
       b5.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               SharedPreferences.Editor myedit=mypreferences.edit();
               myedit.clear();
               myedit.commit();

               Toast.makeText(getApplicationContext(), "successlogout", Toast.LENGTH_SHORT).show();
               Intent i=new Intent(getApplicationContext(),MainActivity.class);
               startActivity(i);


               }



       });
    }

}