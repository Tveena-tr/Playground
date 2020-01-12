package com.example.jsonexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<recycler_view_holder> {

    ArrayList<Artical> articals;
    public Adapter() {

        articals = new ArrayList<>();
    }

    public  void setData(ArrayList<Artical> articals){
        this.articals = articals;
    }

    @NonNull
    @Override
    public recycler_view_holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View articlaView = layoutInflater.inflate(R.layout.cardview,parent,false);
        return new recycler_view_holder(articlaView);
    }

    @Override
    public void onBindViewHolder(@NonNull recycler_view_holder holder, int position) {
        Artical artical = articals.get(position);
        holder.name.setText(artical.name);
        holder.description.setText(artical.description);

    }

    @Override
    public int getItemCount() {
        return articals.size();
    }
}