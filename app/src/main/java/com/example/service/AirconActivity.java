package com.example.service;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.service.databinding.ActivityAirconBinding;

public class AirconActivity extends AppCompatActivity {

    private ActivityAirconBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityAirconBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        binding.button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AirconActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}