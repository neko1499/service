package com.example.service;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.service.databinding.ActivityLaundryBinding;

public class LaundryActivity extends AppCompatActivity {

    private ActivityLaundryBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityLaundryBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        binding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LaundryActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}