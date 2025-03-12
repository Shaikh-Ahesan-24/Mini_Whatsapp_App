package com.example.whatsapp;


import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {

    VideoView videoView;
    ImageView profile;
    TextView name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        videoView = findViewById(R.id.videoplayer);
        profile = findViewById(R.id.pro);
        name = findViewById(R.id.name);
        Bundle bundle = getIntent().getExtras();
        if(bundle !=null){
            profile.setImageResource(bundle.getInt("profile"));
            name.setText(getIntent().getExtras().getString("name"));
            String path = "android.resource://"+getPackageName()+"/raw/nabi";
            Uri uri = Uri.parse(path);
            videoView.setVideoURI(uri);
            videoView.start();
        }

    }
}