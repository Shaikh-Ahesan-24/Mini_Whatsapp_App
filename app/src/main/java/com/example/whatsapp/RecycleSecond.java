package com.example.whatsapp;

import android.content.Context;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecycleSecond extends RecyclerView.Adapter<RecycleSecond.Song> {
    Context context;
    ArrayList<Second> seconds;

    public RecycleSecond(Context context,ArrayList<Second> seconds){
        this.context = context;
        this.seconds = seconds;
    }
    @NonNull
    @Override
    public Song onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view =  LayoutInflater.from(context).inflate(R.layout.status,parent,false);
        return new Song(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Song holder, int position) {

        holder.imageView.setImageResource(seconds.get(position).image);
        holder.name.setText(seconds.get(position).name);
        holder.message.setText(seconds.get(position).message);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,MainActivity3.class);
                intent.putExtra("profile",seconds.get(holder.getAdapterPosition()).image);
                intent.putExtra("name",seconds.get(holder.getAdapterPosition()).name);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return seconds.size();
    }

    public static class Song extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView name;
        TextView message;
        public Song(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.photo);
            name  = itemView.findViewById(R.id.name);
            message = itemView.findViewById(R.id.m);

        }
    }
}
