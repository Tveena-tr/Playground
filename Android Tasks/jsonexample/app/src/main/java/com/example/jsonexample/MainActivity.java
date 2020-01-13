package com.example.jsonexample;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    String url = "https://api.myjson.com/bins/ns20q";
    RecyclerView recyclerView;
    Adapter adapter;
    ArrayList<Artical> articals;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.RecyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new Adapter();
        recyclerView.setAdapter(adapter);
        articals = new ArrayList<>();
        getData();
        

    }

    private void getData() {
        final ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Loading...");
        progressDialog.show();

        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(url, new Response.Listener<JSONArray>() {

            @Override
            public void onResponse(JSONArray response) {
                try {
                    for (int i = 0; i < response.length(); i++) {
                        JSONObject jsonObject = response.getJSONObject(i);
                        Artical artical = new Artical();
                        artical.setName(jsonObject.getString("name"));
                        artical.setDescription(jsonObject.getString("description"));
                        articals.add(artical);
                    }
                } catch (JSONException e) {
                    Toast.makeText(MainActivity.this, "JSON is not valid", Toast.LENGTH_SHORT).show();

                }

                adapter.setData(articals);
                adapter.notifyDataSetChanged();
                progressDialog.dismiss();

        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                progressDialog.dismiss();
                Toast.makeText(MainActivity.this,"Error occurred",Toast.LENGTH_SHORT).show();

            }
        });
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(jsonArrayRequest);



    }
}
