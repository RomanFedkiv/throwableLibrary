package com.example.throwableapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button checkButton = findViewById(R.id.checkButton);
        Button uncheckButton = findViewById(R.id.uncheckButton);

        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { checkThrowableLog(); }});

        uncheckButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { uncheckThrowableLog(); }});
    }

    private void checkThrowableLog() {

    }

    private void uncheckThrowableLog() {

    }
}
