package com.guigest.frgmentonclick;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import java.util.List;

import model.Mymodel;

public class MainActivity extends AppCompatActivity {

    public static FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
fragmentManager = getSupportFragmentManager();
        if (findViewById(R.id.fragmentcontainer) != null) {

            if (savedInstanceState != null) {
                return;
            }
            FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();
            recyclerview recyclerview =new recyclerview();
            fragmentTransaction.add(R.id.fragmentcontainer,recyclerview);
            fragmentTransaction.commit();
        }
    }


}

