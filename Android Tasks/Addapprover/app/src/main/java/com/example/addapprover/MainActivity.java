package com.example.addapprover;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity     implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        TextView cancel = findViewById(R.id.cancel);

        button.setOnClickListener(this);
        cancel.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                Toast.makeText(this,"Done",Toast.LENGTH_SHORT).show();
                break;
            case R.id.cancel:
                Toast.makeText(this,"cancel",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
