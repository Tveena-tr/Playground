package com.example.custompopup;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Dialog epicDialog;
    Button positivePopupBtn;
    TextView text2,text1;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        epicDialog = new Dialog(this);

        positivePopupBtn = (Button) findViewById(R.id.positivePopupBtn);

        positivePopupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowPositivePopup();
            }
        });
    }
    public void ShowPositivePopup(){
        epicDialog.setContentView(R.layout.epic_popup_positve);
        image = (ImageView)epicDialog.findViewById(R.id.image);
        text2 = (TextView) epicDialog.findViewById(R.id.text2);
        text1 = (TextView) epicDialog.findViewById(R.id.text1);

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                epicDialog.dismiss();
            }
        });
        epicDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        epicDialog.show();


    }
}
