package com.example.whatsapp;


import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity4 extends AppCompatActivity {

     ImageView dp;
     TextView name;
     TextView message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main4);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        dp = findViewById(R.id.dp);
        name = findViewById(R.id.name);
        message = findViewById(R.id.number);
        Bundle bundle = getIntent().getExtras();
        if(bundle !=null){
          dp.setImageResource(bundle.getInt("image"));
          name.setText(getIntent().getExtras().getString("name"));
          message.setText(getIntent().getExtras().getString("message"));
        }
    }
}