package com.example.recycle_multi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ProductAdapter productAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.RecyclerView1);
        productAdapter = new ProductAdapter(this, getData());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(productAdapter);
    }
    private ArrayList<Product>getData(){
        ArrayList<Product> product = new ArrayList<>();
        Product d=new Product("john","this",R.drawable.minus,R.drawable.plus);
        product.add(d);

        d=new Product("john","this",R.drawable.minus,R.drawable.circle);
        product.add(d);
        return product;
    }




}
