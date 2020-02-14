package com.example.cardview_multi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import static com.example.cardview_multi.MyModel.One_type;
import static com.example.cardview_multi.MyModel.Two_type;

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    List<MyModel>list;

    public MyAdapter(List<MyModel>list) {
        this.list = list;
    }

    @Override
    public int getItemViewType(int position) {

        MyModel model = list.get(position);
        if(model !=null){
          return model.getType();

        }
        return 0;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

       View view;
       switch (viewType){
           case One_type:
               view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardone,parent,false);
               return new OneViewHolder(view);


           case Two_type:
               view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardtwo,parent,false);
               return new TwoViewHolder(view);
       }
      return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        MyModel model = list.get(position);
        switch (model.getType()){
            case One_type:
                ((OneViewHolder)holder).title.setText(model.getTitle());
                break;
            case Two_type:
                ((TwoViewHolder)holder).title.setText(model.getTitle());
                break;
        }

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class OneViewHolder extends RecyclerView.ViewHolder{
        TextView title;

        public OneViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.text_title);
        }
    }
    class TwoViewHolder extends RecyclerView.ViewHolder{
        TextView title;

        public TwoViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.text_title);
        }
    }
}
