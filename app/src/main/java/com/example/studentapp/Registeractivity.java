package com.example.studentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Registeractivity extends AppCompatActivity {
EditText ed1,ed2,ed3,ed4,ed5,ed6;
Button b1,b2;
String getlname,getroll,getadm,getuname,getusername,getpassword,getconform;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registeractivity);
        ed1=(EditText)findViewById(R.id.lname);
        ed2=(EditText)findViewById(R.id.roll);
        ed3=(EditText)findViewById(R.id.adm);
        ed4=(EditText)findViewById(R.id.uname);
        ed5=(EditText)findViewById(R.id.pwd);
        ed6=(EditText)findViewById(R.id.cong);
        b1=(AppCompatButton)findViewById(R.id.reg);
        b2=(AppCompatButton)findViewById(R.id.greg);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                    getlname = ed1.getText().toString();
                    getroll = ed2.getText().toString();
                    getadm = ed3.getText().toString();
                    getuname = ed4.getText().toString();
                    getusername = ed5.getText().toString();
                    getpassword = ed5.getText().toString();
                    getconform = ed6.getText().toString();
                if (getpassword.equals(getconform)) {
                    Toast.makeText(getApplicationContext(), getlname, Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), getroll, Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), getadm, Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), getusername, Toast.LENGTH_SHORT).show();

                }
else
                    Toast.makeText(getApplicationContext(), "doesnot match", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
