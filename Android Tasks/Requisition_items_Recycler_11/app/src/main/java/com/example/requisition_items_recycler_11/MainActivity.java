package com.example.requisition_items_recycler_11;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Adapter adapter;
    ArrayList<String>items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        items = new ArrayList<>();
        items.add("IBM ThinkServer TS150 Tower Server With Max. Processor 1 x Intel Xeon E3 (Quad Core) E3-1225 v5(3.3 GHz /Cache 8 MB)/");
        items.add("Lenovo ThinkServer TS450 (PN:70M2001VIH) With Max. Processor 1 x Intel Xeon E3 (Quad Core) E3-1225 v5”(3.3 GHz /Cache");
        items.add("IBM X3300M4 Server With x3300M4/ Part NO:7382IA4/ Intel Xeon E5 1230v2 1.8 GHz,10 MB,1066MHz/ 1x 8GB RAM/ 1x500");
        items.add("Ibm lenovo thinkserver rd450 rack server pn 70q90059ih with 1 x intel xeon e5 2620v4 2 1ghz 8c 20mb 85w");
        items.add("daptec 128 MB Raid Controller Pair. Pci-e SAS/SATA");

        recyclerView = findViewById(R.id.RecyclerView1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Adapter(this,items);
        recyclerView.setAdapter(adapter);
    }
}
