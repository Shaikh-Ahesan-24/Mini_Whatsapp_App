package com.example.whatsapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class Status extends Fragment {

    public Status() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_status, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.status);
        ArrayList<Second> second = new ArrayList<>();
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        second.add(new Second(R.drawable.shahan,"Dr Shahan","Today"));

        RecycleSecond recycleSecond = new RecycleSecond(getContext(),second);
        recyclerView.setAdapter(recycleSecond);
        return view;
    }
}