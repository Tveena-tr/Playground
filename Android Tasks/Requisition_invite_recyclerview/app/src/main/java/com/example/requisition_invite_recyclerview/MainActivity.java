package com.example.requisition_invite_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    Adapter adapter;
    ArrayList<String> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        items = new ArrayList<>();
        items.add("Luke Ray");
        items.add("Daisy Lake");
        items.add("Mark Smith");




        recyclerView = findViewById(R.id.RecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Adapter(this,items);
        recyclerView.setAdapter(adapter);

    }

}
