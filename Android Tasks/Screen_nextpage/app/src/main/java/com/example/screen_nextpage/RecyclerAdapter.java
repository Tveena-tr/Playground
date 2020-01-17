package com.example.screen_nextpage;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener,View.OnLongClickListener
{
    public TextView txt_description;
    private ItemClickListener itemClickListener;

    public RecyclerViewHolder(@NonNull View itemView) {
        super(itemView);
        txt_description = (TextView)itemView.findViewById(R.id.textViewTitle);

        itemView.setOnClickListener(this);
        itemView.setOnLongClickListener(this);
    }
    public void setItemClickListener(ItemClickListener itemClickListener)
    {
     this.itemClickListener = itemClickListener;
    }

    @Override
    public void onClick(View v) {
        itemClickListener.onclick(v,getAdapterPosition(),false);

    }

    @Override
    public boolean onLongClick(View v) {
        itemClickListener.onclick(v,getAdapterPosition(),true);
        return true;
    }
}
public class RecyclerAdapter  extends RecyclerView.Adapter<RecyclerViewHolder>{

    private List<String> listData = new ArrayList<>();
    private Context context;

    public RecyclerAdapter(List<String> listData, Context context) {
        this.listData = listData;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemview = inflater.inflate(R.layout.layout_items,parent,false);

        return new RecyclerViewHolder(itemview);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        holder.txt_description.setText(listData.get(position));

        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onclick(View view, int position, boolean isLongClick) {
                if(isLongClick)
                    Toast.makeText(context,"Long Click:"+listData.get(position),Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(context,"name=john\nid=12"+listData.get(position),Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return listData.size();
    }
}
