package com.example.service;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

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

        binding.pratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
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
                    Toast.makeText(PlumbingActivity.this, message, Toast.LENGTH_SHORT).show();
                }
            }
        });
        binding.pratingBar1.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
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
                    Toast.makeText(PlumbingActivity.this, message, Toast.LENGTH_SHORT).show();
                }
            }
        });
        binding.pratingBar2.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
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
                    Toast.makeText(PlumbingActivity.this, message, Toast.LENGTH_SHORT).show();
                }
            }
        });

        binding.pBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PlumbingActivity.this, "Ratings Submitted", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(PlumbingActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        binding.pBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PlumbingActivity.this, "Ratings Submitted", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(PlumbingActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        binding.pBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PlumbingActivity.this, "Ratings Submitted", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(PlumbingActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}