package com.example.recycleexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    ProductAdapter adapter;

    List<product> ProductList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ProductList = new ArrayList<>();
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ProductList = new ArrayList<>();

        ProductList.add(
                new product(
                        "Luke Ray",
                        "Lorem ipsum doler sit amet.",
                        R.drawable.avatar));
        ProductList.add(
                new product(
                        "Daisy Lake",
                        "Lorem ipsum doler sit amet.",
                        R.drawable.avatar));
        ProductList.add(
                new product(
                        "Mark Smith",
                        "Lorem ipsum doler sit amet.",
                        R.drawable.avatar));

        ProductAdapter adapter = new ProductAdapter(this, ProductList);
        recyclerView.setAdapter(adapter);


    }
}
