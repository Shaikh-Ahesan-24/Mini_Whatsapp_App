package com.example.whatsapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class Chat extends Fragment {


    public Chat() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RecyclerView recyclerView;
        ArrayList<First> firsts = new ArrayList<>();
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_chat, container, false);
        recyclerView = view.findViewById(R.id.recyclechat);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        firsts.add(new First(R.drawable.viratd,"Virat Kohli","10:30 AM","Photo"));
        firsts.add(new First(R.drawable.darshan,"Darshan Raval","8:50 AM","Hii"));
        firsts.add(new First(R.drawable.sirajd,"Mohammad Siraj","7:30 AM","Alhamdulillah "));
        firsts.add(new First(R.drawable.shahan,"Dr Shahan","Yesterday","Hello"));
        firsts.add(new First(R.drawable.rashmika,"Rashmika","3/3/25","Watch Pushpa 2"));
        firsts.add(new First(R.drawable.arijitd,"Arijit Singh","3/3/25","Photo"));
        firsts.add(new First(R.drawable.aman,"Aman Khan","2/3/25","Tomorrow is Holiday"));
        firsts.add(new First(R.drawable.katrina,"Katrina Kaif","25/2/25","best of luck vicky"));
        firsts.add(new First(R.drawable.rohitd,"Rohit Sharma","20/2/25","Wait & Watch"));
        firsts.add(new First(R.drawable.kritip,"Kriti Sanon","18/2/25","Photo"));
        firsts.add(new First(R.drawable.salmanp,"Salman Khan","15/2/25","Photo"));
        firsts.add(new First(R.drawable.rashidp,"Rashid Khan","10/2/25","Video"));
        firsts.add(new First(R.drawable.srkp,"Shahrukh Khan","8/2/25","Very Good"));
        firsts.add(new First(R.drawable.ashar,"Ashar Khan","27/1/25","Video Send kr bhai"));
        firsts.add(new First(R.drawable.moeen,"Moeen Ali","20/1/25","Subhan allah"));
        RecycleFirst adapter = new RecycleFirst(getContext(),firsts);
        recyclerView.setAdapter(adapter);
        return view;
    }
}