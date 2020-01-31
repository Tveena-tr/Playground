package com.example.addpeople_recycleview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private LayoutInflater layoutInflater;
    private List<String> data;


    Adapter(Context context, List<String> data){
        this.layoutInflater = LayoutInflater.from(context);
        this.data = data;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        boolean attachToRoot;
        View view = layoutInflater.inflate(R.layout.list,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        String title = data.get(i);

        viewHolder.textTitle.setText(title);



    }

    @Override
    public int getItemCount() {


        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        TextView textTitle,textDescription;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent i = new Intent(v.getContext(),profile.class);
                    i.putExtra("title",data.get(getAdapterPosition()));
                    v.getContext().startActivity(i);
                }
            });
            textTitle = itemView.findViewById(R.id.textViewTitle);
            textDescription = itemView.findViewById(R.id.textViewdescription);
        }
    }
}
