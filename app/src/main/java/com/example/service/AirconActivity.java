package com.example.service;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

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

        binding.airconRatingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
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
                    Toast.makeText(AirconActivity.this, message, Toast.LENGTH_SHORT).show();
                }
            }
        });
        binding.airconRatingBar1.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
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
                    Toast.makeText(AirconActivity.this, message, Toast.LENGTH_SHORT).show();
                }
            }
        });
        binding.airconRatingBar2.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
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
                    Toast.makeText(AirconActivity.this, message, Toast.LENGTH_SHORT).show();
                }
            }
        });

        binding.airconBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AirconActivity.this, "Ratings Submitted", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(AirconActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        binding.airconBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AirconActivity.this, "Ratings Submitted", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(AirconActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        binding.airconBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AirconActivity.this, "Ratings Submitted", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(AirconActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}