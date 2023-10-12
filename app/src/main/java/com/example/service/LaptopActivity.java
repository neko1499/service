package com.example.service;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.service.databinding.ActivityLaptopBinding;

public class LaptopActivity extends AppCompatActivity {
    private ActivityLaptopBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityLaptopBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        binding.button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LaptopActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}