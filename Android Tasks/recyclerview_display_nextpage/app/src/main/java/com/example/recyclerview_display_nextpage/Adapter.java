package com.example.recyclerview_display_nextpage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Holder> {

    Context c;
    ArrayList<group> group;

    public Adapter(Context c, ArrayList<com.example.recyclerview_display_nextpage.group> group) {
        this.c = c;
        this.group = group;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.itemlist,null);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final Holder holder, int i) {
        holder.mTitle.setText(group.get(i).getTitle());
        holder.mDes.setText(group.get(i).getDescription());
        holder.mImageView1.setImageResource(group.get(i).getImg1());
        holder.mImageView2.setImageResource(group.get(i).getImg2());

        holder.setItemListener(new ItemListener() {
            @Override
            public void onItemListener(View v, int position) {

                String gTitle = group.get(position).getTitle();
                String gDesc = group.get(position).getDescription();
                BitmapDrawable bitmapDrawable = (BitmapDrawable)holder.mImageView1.getDrawable();

                Bitmap bitmap = bitmapDrawable.getBitmap();

                ByteArrayOutputStream stream = new ByteArrayOutputStream();

                bitmap.compress(Bitmap.CompressFormat.PNG, 100,stream);

                byte[] bytes = stream.toByteArray();

                Intent intent = new Intent(c,MainActivity2.class);
                intent.putExtra("iTitle",gTitle);
                intent.putExtra("iDesc",gTitle);
                intent.putExtra("iImage",bytes);

                c.startActivity(intent);



            }
        });
        holder.setItemListener(new ItemListener() {
            @Override
            public void onItemListener(View v, int position) {
                if(group.get(position).getTitle().equals("John Deo")){

            }
                if(group.get(position).getTitle().equals(" deo")){

                }
                if(group.get(position).getTitle().equals(" mark")){

                }
        }

        });

    }
   @Override
    public int getItemCount() {
        return group.size();
    }
}
