package com.example.pdfviewer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button c;
    Button java;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c=findViewById(R.id.c);
        java=findViewById(R.id.java);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "welcome in c language", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,clang.class);
                startActivity(intent);
            }
        });

        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "welcome in java language ", Toast.LENGTH_SHORT).show();
                Intent intent =new Intent(MainActivity.this,jva.class);
                startActivity(intent);
            }
        });
    }
}