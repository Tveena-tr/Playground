package com.example.fragment_requisition;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class fragmentOne extends Fragment {

    private Button button;

    public fragmentOne(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       View view = inflater.inflate(R.layout.fragment_fragment_one, container, false);

       button = view.findViewById(R.id.button1);
       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               MainActivity.fragmentManager.beginTransaction().replace(R.id.fragmentContainer,new fragmentTwo(),null).commit();
           }
       });
       return  view;
    }



}
