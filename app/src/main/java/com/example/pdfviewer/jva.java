package com.example.pdfviewer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class jva extends AppCompatActivity {

    PDFView javabook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jva);
        javabook=findViewById(R.id.p);
        javabook.fromAsset("p.pdf").load();
    }
}