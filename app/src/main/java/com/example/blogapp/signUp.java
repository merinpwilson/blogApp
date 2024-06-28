package com.example.blogapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class signUp extends AppCompatActivity {
    EditText e1,e2,e3,e4,e5;
    AppCompatButton b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up);
        e1=(EditText) findViewById(R.id.nam);
        e2=(EditText) findViewById(R.id.mno);
        e3=(EditText) findViewById(R.id.uname);
        e4=(EditText) findViewById(R.id.pass);
        e5=(EditText) findViewById(R.id.confirm);
        b1=(AppCompatButton) findViewById(R.id.loginbtn);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getName=e1.getText().toString();
                String getMobileNo=e2.getText().toString();
                String getUsername=e3.getText().toString();
                String getPassword=e4.getText().toString();
                String getConfirmPassword=e5.getText().toString();
                Toast.makeText(getApplicationContext(),getName+" "+getMobileNo+" "+getUsername+" "+getPassword+" "+getConfirmPassword,Toast.LENGTH_LONG).show();
            }
        });

    }
}