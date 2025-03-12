package com.example.whatsapp;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class Call extends Fragment {


    public Call() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_call, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recyclecall);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        ArrayList<Third> thirds = new ArrayList<>();
        thirds.add(new Third(R.drawable.ashar,"Ashar","February 18 3:25 PM"));
        thirds.add(new Third(R.drawable.shahan,"Dr Shahan","February 22 2:20 AM"));
        thirds.add(new Third(R.drawable.srkp,"Shahrukh Khan","january 10 10:25 AM"));
        thirds.add(new Third(R.drawable.sirajd,"Mohammad Siraj","January 3  7:25 PM"));
        thirds.add(new Third(R.drawable.moeen,"Moeen Ali","January 1 5:25 PM"));
        thirds.add(new Third(R.drawable.katrina,"Katrina Kaif","December 18 1:10 PM"));
        thirds.add(new Third(R.drawable.arijitd,"Arijit Singh","December 10 12:25 PM"));
        RecycleThird recycleThird = new RecycleThird(getContext(),thirds);
        recyclerView.setAdapter(recycleThird);
        return view;
    }
}