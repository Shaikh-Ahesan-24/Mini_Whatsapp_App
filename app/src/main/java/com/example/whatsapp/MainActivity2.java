package com.example.whatsapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;



public class MainActivity2 extends AppCompatActivity {

    ImageView imageView;
    TextView textView;
    TextView message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        imageView = findViewById(R.id.photo);
        textView = findViewById(R.id.name1);
        message = findViewById(R.id.name2);
        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            imageView.setImageResource(bundle.getInt("img"));
            textView.setText(getIntent().getExtras().getString("txt"));
            message.setText(getIntent().getExtras().getString("x"));
        }
    }
}