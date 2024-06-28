package com.example.blogapp;

import android.content.Intent;
import android.content.SharedPreferences;
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

public class login extends AppCompatActivity {
    EditText e1,e2;
    AppCompatButton b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        SharedPreferences preferences=getSharedPreferences("logapp",MODE_PRIVATE);
        String  username=preferences.getString("user",null);
        if(username!=null)
        {
            Intent i=new Intent(getApplicationContext(),signin.class);
            startActivity(i);
        }

        e1=(EditText) findViewById(R.id.uname);
        e2=(EditText) findViewById(R.id.pass);
        b1=(AppCompatButton) findViewById(R.id.login);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getUname = e1.getText().toString();
                String getPass = e2.getText().toString();

                if (getUname.equals("admin") && getPass.equals("1234")) {
                    SharedPreferences preferences = getSharedPreferences("logapp", MODE_PRIVATE);
                    SharedPreferences.Editor editor = preferences.edit();
                    editor.putString("user", "admin");
                    editor.apply();
                    Intent i = new Intent(getApplicationContext(), signin.class);
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"invalid password",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}