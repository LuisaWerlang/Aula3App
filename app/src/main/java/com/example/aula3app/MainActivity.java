package com.example.aula3app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ex1Click(View view) {
        startActivity(new Intent(this,Ex1.class));
    }

    public void ex2Click(View view) {
        startActivity(new Intent(this,Ex2.class));
    }

    public void ex3Click(View view) {
        startActivity(new Intent(this,Ex3.class));
    }

    public void ex4Click(View view) {
        startActivity(new Intent(this,Ex4.class));
    }
}