package com.example.recyclerview_display_nextpage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Holder extends RecyclerView.ViewHolder implements View.OnClickListener {


    ImageView mImageView1,mImageView2;
    TextView mTitle, mDes;
    ItemListener itemListener;

    Holder(@NonNull View itemView) {
        super(itemView);

        this.mImageView1 = itemView.findViewById(R.id.img1);
        this.mImageView2 = itemView.findViewById(R.id.img2);
        this.mTitle = itemView.findViewById(R.id.textViewTitle);
        this.mDes = itemView.findViewById(R.id.textViewdescription);

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        this.itemListener.onItemListener(v,getLayoutPosition());


    }
    public void setItemListener(ItemListener ic){
        this.itemListener = ic;
    }
}
