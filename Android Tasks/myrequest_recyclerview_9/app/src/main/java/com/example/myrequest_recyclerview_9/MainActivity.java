package com.example.myrequest_recyclerview_9;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.RecyclerView1);
        adapter = new Adapter(this,getData());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(adapter);

    }
    private ArrayList<data> getData() {
        ArrayList<data>Data = new ArrayList<>();

        data d=new data(R.drawable.circle,R.drawable.image4,"AWAITING APPROVAL");
        Data.add(d);
        d=new data(R.drawable.circle2,R.drawable.image4,"APPROVED");
        Data.add(d);
        d=new data(R.drawable.circle3,R.drawable.image4,"DRAFT");
        Data.add(d);
        d=new data(R.drawable.circle4,R.drawable.image4,"REJECTED");
        Data.add(d);
        return Data;


    }

}
