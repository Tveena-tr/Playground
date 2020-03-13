package com.guigest.frgmentonclick;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment2 extends Fragment {
    private TextView textView;


    public Fragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment2, container, false);
        textView = view.findViewById(R.id.fragment2);
        textView.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        recyclerview.fragmentManager.beginTransaction().replace(R.id.)

    }
});

    }

}
