package com.example.service;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.service.databinding.ActivityHaircutBinding;
import com.example.service.databinding.ActivityMainBinding;

public class HaircutActivity extends AppCompatActivity {

    private ActivityHaircutBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityHaircutBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HaircutActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }
}