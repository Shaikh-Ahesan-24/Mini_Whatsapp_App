package com.example.whatsapp;


import android.app.Dialog;
import android.content.Context;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecycleFirst extends RecyclerView.Adapter<RecycleFirst.Chat> {
    Context context;
    ArrayList<First> firsts;
    Dialog dialog;
    public RecycleFirst(Context context,ArrayList<First> firsts){
        this.context = context;
        this.firsts = firsts;
    }
    @NonNull
    @Override
    public Chat onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(context).inflate(R.layout.chat,parent,false);
       dialog = new Dialog(context);
       dialog.setContentView(R.layout.popup);
        return new Chat(view);

    }

    @Override
    public void onBindViewHolder(@NonNull Chat holder, int position) {
        holder.profile.setImageResource(firsts.get(position).profile);
        holder.name.setText(firsts.get(position).name);
        holder.time.setText(firsts.get(position).time);
        holder.message.setText(firsts.get(position).message);
        holder.profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imageView = dialog.findViewById(R.id.dp);
                imageView.setImageResource(firsts.get(holder.getAdapterPosition()).profile);
                dialog.show();
            }
        });
        holder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, MainActivity2.class);
                intent.putExtra("img",firsts.get(holder.getAdapterPosition()).profile);
                intent.putExtra("txt",firsts.get(holder.getAdapterPosition()).name);
                intent.putExtra("x",firsts.get(holder.getAdapterPosition()).message);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {

        return firsts.size();
    }

    public static class Chat extends RecyclerView.ViewHolder{
        ImageView profile;
        TextView name;
        TextView time;
        TextView message;
        LinearLayout layout;
        ImageView pop;

        public Chat(@NonNull View itemView) {
            super(itemView);
            profile = itemView.findViewById(R.id.profile);
            name = itemView.findViewById(R.id.name);
            time = itemView.findViewById(R.id.t);
            message = itemView.findViewById(R.id.m);
           layout = itemView.findViewById(R.id.chat);
           pop = itemView.findViewById(R.id.dp);

        }
    }
}
