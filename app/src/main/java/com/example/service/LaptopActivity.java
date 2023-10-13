package com.example.service;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

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

        binding.pcratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (fromUser) {
                    String message = "";

                    if (rating <= 1.0) {
                        message = "Bad";
                    } else if (rating <= 2.0) {
                        message = "Poor";
                    } else if (rating <= 3.0) {
                        message = "Fair";
                    } else if (rating <= 4.0) {
                        message = "Good";
                    } else {
                        message = "Excellent";
                    }
                    Toast.makeText(LaptopActivity.this, message, Toast.LENGTH_SHORT).show();
                }
            }
        });
        binding.pcratingBar1.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (fromUser) {
                    String message = "";

                    if (rating <= 1.0) {
                        message = "Bad";
                    } else if (rating <= 2.0) {
                        message = "Poor";
                    } else if (rating <= 3.0) {
                        message = "Fair";
                    } else if (rating <= 4.0) {
                        message = "Good";
                    } else {
                        message = "Excellent";
                    }
                    Toast.makeText(LaptopActivity.this, message, Toast.LENGTH_SHORT).show();
                }
            }
        });
        binding.pcratingBar2.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (fromUser) {
                    String message = "";

                    if (rating <= 1.0) {
                        message = "Bad";
                    } else if (rating <= 2.0) {
                        message = "Poor";
                    } else if (rating <= 3.0) {
                        message = "Fair";
                    } else if (rating <= 4.0) {
                        message = "Good";
                    } else {
                        message = "Excellent";
                    }
                    Toast.makeText(LaptopActivity.this, message, Toast.LENGTH_SHORT).show();
                }
            }
        });

        binding.pcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LaptopActivity.this, "Ratings Submitted", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(LaptopActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        binding.pcBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LaptopActivity.this, "Ratings Submitted", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(LaptopActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        binding.pcBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LaptopActivity.this, "Ratings Submitted", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(LaptopActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}