package com.example.service;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.service.databinding.ActivityPlumbingBinding;

public class PlumbingActivity extends AppCompatActivity {

    private ActivityPlumbingBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityPlumbingBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        binding.button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlumbingActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}