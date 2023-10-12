package com.example.service;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.service.databinding.ActivityMainBinding;
import com.example.service.databinding.ActivityManicureBinding;

public class ManicureActivity extends AppCompatActivity {

    private ActivityManicureBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityManicureBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        binding.button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManicureActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}