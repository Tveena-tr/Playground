package com.example.json_file;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class itemAdapter extends RecyclerView.Adapter<itemAdapter.itemViewHolder> {
    private Context mContext;
    private ArrayList<carditem> mItemList;

    public itemAdapter(Context context,ArrayList<carditem>itemList){
        mContext = context;
        mItemList = itemList;
    }

    @NonNull
    @Override
    public itemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View v= LayoutInflater.from(mContext).inflate(R.layout.carditem,parent,false);
       return new itemViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull itemViewHolder holder, int position) {
        carditem currentItem = mItemList.get(position);

        String imageUrl = currentItem.getImageUrl();
        String CreatorName = currentItem.getCreator();
        int likeCount = currentItem.getLikes();

        holder.mTextViewCreator.setText(CreatorName);
        holder.mTextViewLikes.setText("Likes:"+likeCount);
        Picasso.with(mContext).load(imageUrl).fit().centerInside().into(holder.mImageView);


    }

    @Override
    public int getItemCount() {
        return mItemList.size();
    }

    public class itemViewHolder extends RecyclerView.ViewHolder{
        public ImageView mImageView;
        public TextView mTextViewCreator;
        public TextView mTextViewLikes;


        public itemViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.image1);
            mTextViewCreator = itemView.findViewById(R.id.text_name);
            mTextViewLikes = itemView.findViewById(R.id.text_like);
        }
    }
}
