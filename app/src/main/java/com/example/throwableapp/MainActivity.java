package com.example.throwableapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.throwablelibrary.ThrowableCheck;

import java.util.EmptyStackException;

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
        try {
            throw new Throwable();
        } catch (Throwable throwable) {
            ThrowableCheck.writeToLog(throwable);
            ThrowableCheck.writeFileOnInternalStorage(this,throwable);
        }
    }

    private void uncheckThrowableLog()  {
        EmptyStackException throwable = new EmptyStackException();
        ThrowableCheck.writeToLog(throwable);
        ThrowableCheck.writeFileOnInternalStorage(this,throwable);
        throw throwable;
    }
}
