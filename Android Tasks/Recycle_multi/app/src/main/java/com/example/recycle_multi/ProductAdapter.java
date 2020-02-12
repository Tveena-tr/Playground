package com.example.recycle_multi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {
    Context context;
    ArrayList<Product>product;

    public ProductAdapter(Context context,ArrayList<Product>product){
        this.product = product;
        this.context = context;
    }


    @NonNull
    @Override
    public ProductAdapter.ProductViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {


        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_products,null);
        ProductViewHolder productViewHolder = new  ProductViewHolder(view);
        return productViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ProductAdapter.ProductViewHolder holder, int i) {


        holder.textViewTitle.setText(product.get(i).getTitle());
        holder.textViewdescription.setText(product.get(i).getDesc());
        holder.imageView1.setImageResource(product.get(i).getImage1());
        holder.imageView2.setImageResource(product.get(i).getImage2());

    }

    @Override
    public int getItemCount() {
        return product.size();
    }


    public class ProductViewHolder extends RecyclerView.ViewHolder {

        TextView textViewTitle, textViewdescription;
        ImageView imageView1,imageView2;

        public ProductViewHolder(View itemView) {
            super(itemView);

            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewdescription = itemView.findViewById(R.id.textViewdescription);

            imageView1 = itemView.findViewById(R.id.imageView1);
            imageView2 = itemView.findViewById(R.id.imageView2);
        }
}
}
