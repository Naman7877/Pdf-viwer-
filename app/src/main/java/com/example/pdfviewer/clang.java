package com.example.pdfviewer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class clang extends AppCompatActivity {

    PDFView cbook;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clang);
        getSupportActionBar().hide();

        cbook=findViewById(R.id.c);
        cbook.fromAsset("c.pdf").load();

    }
}