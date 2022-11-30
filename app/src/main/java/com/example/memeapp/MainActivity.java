package com.example.memeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Getmeme();
        TextView textView;
        Button button1 = null;
        Button button2 = null;
        ImageView imageView;
        RelativeLayout relativeLayout;

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Sharememe();
            }

            private void Sharememe() {



            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Getmeme();
            }
        });

    }

    private void Getmeme() {
    }
}