package com.example.whatsapp;

import android.app.Dialog;
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


public class RecycleThird extends RecyclerView.Adapter<RecycleThird.Call> {
    Context context;
    ArrayList<Third> thirds;
    Dialog dialog;
    public RecycleThird(Context context,ArrayList<Third> thirds){
        this.context = context;
        this.thirds = thirds;
    }
    @NonNull
    @Override
    public Call onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =LayoutInflater.from(context).inflate(R.layout.call,parent,false);
        dialog = new Dialog(context);
        dialog.setContentView(R.layout.popup);
        return new Call(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Call holder, int position) {
       holder.profile.setImageResource(thirds.get(position).profile);
       holder.name.setText(thirds.get(position).name);
       holder.message.setText(thirds.get(position).message);
       holder.profile.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               ImageView imageView = dialog.findViewById(R.id.dp);
               imageView.setImageResource(thirds.get(holder.getAdapterPosition()).profile);
               dialog.show();
           }
       });
       holder.itemView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(context, MainActivity4.class);
               intent.putExtra("image",thirds.get(holder.getAdapterPosition()).profile);
               intent.putExtra("name",thirds.get(holder.getAdapterPosition()).name);
               intent.putExtra("message",thirds.get(holder.getAdapterPosition()).message);
               context.startActivity(intent);
           }
       });
    }

    @Override
    public int getItemCount() {
        return thirds.size();
    }

    public static class Call extends RecyclerView.ViewHolder{
         ImageView profile;
         TextView name;
         TextView message;
        public Call(@NonNull View itemView) {
            super(itemView);
            profile = itemView.findViewById(R.id.profile);
            name = itemView.findViewById(R.id.name);
            message = itemView.findViewById(R.id.m);

        }
    }
}
