package com.guigest.frgmentonclick;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import Adapter.MyAdapter;
import model.Mymodel;


/**
 * A simple {@link Fragment} subclass.
 */
public class recyclerview extends Fragment  implements RecyclerInterface{

    private List<Mymodel> arrayList;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_recyclerview, container, false);

        dataSet();
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerview);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        MyAdapter adapter = new MyAdapter(arrayList,this);
        recyclerView.setAdapter(adapter);

        return view;


    }


    private void dataSet() {
        arrayList = new ArrayList<>();
        arrayList.add(new Mymodel("title One", Mymodel.One_type));
        arrayList.add(new Mymodel("title Two", Mymodel.Two_type));
        arrayList.add(new Mymodel("title Two", Mymodel.Two_type));
        arrayList.add(new Mymodel("title One", Mymodel.One_type));
        arrayList.add(new Mymodel("title Two", Mymodel.Two_type));
        arrayList.add(new Mymodel("title One", Mymodel.One_type));
        arrayList.add(new Mymodel("title Two", Mymodel.Two_type));
    }



    @Override
    public void onItemClick(int position) {

        MainActivity.fragmentManager.beginTransaction().replace(R.id.fragmentcontainer,new Fragment2(),null).commit();



    }
    @Override
    public void onItemClick1(int position) {
        MainActivity.fragmentManager.beginTransaction().replace(R.id.fragmentcontainer,new Fragment3(),null).commit();


    }
}


