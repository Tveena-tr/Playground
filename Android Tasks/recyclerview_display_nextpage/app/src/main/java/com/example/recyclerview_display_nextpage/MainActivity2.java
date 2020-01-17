package com.example.recyclerview_display_nextpage;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView mTitleTv,mDescTv;
    ImageView mImageIv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ActionBar actionBar = getSupportActionBar();

        mTitleTv = findViewById(R.id.textTitle);
        mDescTv = findViewById(R.id.textdescription);
        mImageIv = findViewById(R.id.imageview);

        Intent intent = getIntent();
        String mTitle = intent.getStringExtra("iTitle");
        String mDescription = intent.getStringExtra("iDesc");

        byte[] mbytes = getIntent().getByteArrayExtra("iImage");

        byte[] mBytes = new byte[0];
        Bitmap bitmap = BitmapFactory.decodeByteArray(mBytes,0, mBytes.length);

        actionBar.setTitle(mTitle);

        mTitleTv.setText(mTitle);
        mDescTv.setText(mDescription);
        mImageIv.setImageBitmap(bitmap);
    }
}
