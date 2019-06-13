package com.example.landscapevariation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static int counter=0;
    TextView textView;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        textView.setText(Integer.toString(counter));
    }

    public void countup (View view) {
        counter++;
        textView.setText(Integer.toString(counter));
    }

    public void countdown (View view) {
        counter--;
        textView.setText(Integer.toString(counter));
    }
}
