package com.example.jsonexample;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class recycler_view_holder extends RecyclerView.ViewHolder {

    TextView name;
    TextView description;
    public recycler_view_holder(@NonNull View itemView) {
        super(itemView);

        name : itemView.findViewById(R.id.textViewTitle);
        description : itemView.findViewById(R.id.textViewdescription);
    }
}
