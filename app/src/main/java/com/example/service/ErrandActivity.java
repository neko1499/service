package com.example.service;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.service.databinding.ActivityErrandBinding;

public class ErrandActivity extends AppCompatActivity {

    private ActivityErrandBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityErrandBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        binding.button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ErrandActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}