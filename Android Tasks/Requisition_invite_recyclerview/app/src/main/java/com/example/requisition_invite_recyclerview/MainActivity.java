package com.example.requisition_invite_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    RecyclerView recyclerView;

    Adapter adapter;
    ArrayList<String> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        TextView savedraft = findViewById(R.id.savedraft);

        button.setOnClickListener(this);
        savedraft.setOnClickListener(this);

        items = new ArrayList<>();
        items.add("Luke Ray");
        items.add("Daisy Lake");
        items.add("Mark Smith");




        recyclerView = findViewById(R.id.RecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Adapter(this,items);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                Toast.makeText(this,"Next",Toast.LENGTH_SHORT).show();
                break;
            case R.id.savedraft:
                Toast.makeText(this,"saved",Toast.LENGTH_SHORT).show();
                break;


        }

    }
}
