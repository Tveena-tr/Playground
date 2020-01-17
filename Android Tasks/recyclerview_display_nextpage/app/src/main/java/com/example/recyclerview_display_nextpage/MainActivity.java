package com.example.recyclerview_display_nextpage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mRecyclerView = findViewById(R.id.RecyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new Adapter(this,getMyList());
        mRecyclerView.setAdapter(adapter);
    }
    private ArrayList<group> getMyList(){

        ArrayList<group> group = new ArrayList<>();

        group m = new group();
        m.setTitle("John Deo");
        m.setDescription("Lorem ipsum doler sit amet.");
        m.setImg1(R.drawable.avatar);
        m.setImg2(R.drawable.plus);
        group.add(m);

        m = new group();
        m.setTitle("deo");
        m.setDescription("Lorem ipsum doler sit amet.");
        m.setImg1(R.drawable.avatar);
        m.setImg2(R.drawable.plus);
        group.add(m);

        m = new group();
        m.setTitle("mark");
        m.setDescription("Lorem ipsum doler sit amet.");
        m.setImg1(R.drawable.avatar);
        m.setImg2(R.drawable.plus);
        group.add(m);

        return group;

    }
}
