package com.example.whatsapp;

import android.os.Bundle;


import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        tabLayout = findViewById(R.id.tab);
        viewPager = findViewById(R.id.viewpager);
        toolbar = findViewById(R.id.toolbar);

        ViewPageradapter adapter = new ViewPageradapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        setSupportActionBar(toolbar);
       Objects.requireNonNull(tabLayout.getTabAt(0)).setIcon(R.drawable.baseline_chat_24);
       Objects.requireNonNull(tabLayout.getTabAt(1)).setIcon(R.drawable.baseline_layers_24);
       Objects.requireNonNull(tabLayout.getTabAt(2)).setIcon(R.drawable.baseline_call_24);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        new MenuInflater(this).inflate(R.menu.option,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.group){

        }else if(id==R.id.broad){

        }else if(id==R.id.link){

        }else if(id==R.id.start){

        }else if(id==R.id.payment){

        }else{

        }

        return super.onOptionsItemSelected(item);
    }




}