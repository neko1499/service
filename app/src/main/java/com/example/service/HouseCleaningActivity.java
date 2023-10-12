package com.example.service;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.service.databinding.ActivityHouseCleaningBinding;

public class HouseCleaningActivity extends AppCompatActivity {

    private ActivityHouseCleaningBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityHouseCleaningBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        binding.button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HouseCleaningActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}