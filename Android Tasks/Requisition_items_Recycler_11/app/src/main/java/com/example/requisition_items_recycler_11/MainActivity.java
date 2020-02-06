package com.example.requisition_items_recycler_11;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import Adapter.Adapter;
import Model.ListItem;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private ArrayList<String> listItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView)findViewById(R.id.recyclerViewID);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listItem = new ArrayList<>() ;


        listItem.add("IBM ThinkServer TS150 Tower Server With Max. Processor 1 x Intel Xeon E3 (Quad Core) E3-1225 v5(3.3 GHz /Cache 8 MB)/");
        listItem.add("Lenovo ThinkServer TS450 (PN:70M2001VIH) With Max. Processor 1 x Intel Xeon E3 (Quad Core) E3-1225 v5”(3.3 GHz /Cache");
        listItem.add("IBM X3300M4 Server With x3300M4/ Part NO:7382IA4/ Intel Xeon E5 1230v2 1.8 GHz,10 MB,1066MHz/ 1x 8GB RAM/ 1x500");
        listItem.add("Ibm lenovo thinkserver rd450 rack server pn 70q90059ih with 1 x intel xeon e5 2620v4 2 1ghz 8c 20mb 85w");
        listItem.add("daptec 128 MB Raid Controller Pair. Pci-e SAS/SATA");


        adapter = new Adapter(this,listItem);
        recyclerView.setAdapter(adapter);
    }
}
