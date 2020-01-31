package com.example.addpeople_recycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class profile extends AppCompatActivity {

    TextView textTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        textTitle = findViewById(R.id.textTitle);
        Intent i = getIntent();

        String title = i.getStringExtra("title");
        textTitle.setText(title);
    }
}
