package com.example.service;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

import com.example.service.databinding.ActivityHaircutBinding;
import com.example.service.databinding.ActivityMainBinding;

public class HaircutActivity extends AppCompatActivity {

    private ActivityHaircutBinding binding;
    private RatingBar ratingBar;
    private Button submitReview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityHaircutBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HaircutActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        binding.hairRatingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
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
                    Toast.makeText(HaircutActivity.this, message, Toast.LENGTH_SHORT).show();
                }
            }
        });
        binding.hairRatingBar1.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
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
                    Toast.makeText(HaircutActivity.this, message, Toast.LENGTH_SHORT).show();
                }
            }
        });
        binding.hairRatingBar2.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
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
                    Toast.makeText(HaircutActivity.this, message, Toast.LENGTH_SHORT).show();
                }
            }
        });

        binding.hairBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HaircutActivity.this, "Ratings Submitted", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(HaircutActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        binding.hairBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HaircutActivity.this, "Ratings Submitted", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(HaircutActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        binding.hairBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HaircutActivity.this, "Ratings Submitted", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(HaircutActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }
}