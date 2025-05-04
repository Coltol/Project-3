package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

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

        Button buttonSquare = findViewById(R.id.squareButton);
        Button buttonCircle = findViewById(R.id.circleButton);
        Button buttonTriangle = findViewById(R.id.triangleButton);
        ImageView image = findViewById(R.id.imageView);

        buttonSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeImage(1, image);
            }
        });

        buttonCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeImage(2, image);
            }
        });

        buttonTriangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeImage(3, image);
            }
        });
    }

    private void changeImage(int picNum, ImageView image){
        if (picNum == 1){
            image.setImageResource(R.drawable.square);
        }
        else if (picNum == 2){
            image.setImageResource(R.drawable.circle);
        }
        else if (picNum == 3){
            image.setImageResource(R.drawable.triangle);
        }
    }
}

