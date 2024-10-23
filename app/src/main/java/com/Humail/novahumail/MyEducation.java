package com.Humail.novahumail;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.novahumail.R;

import java.util.Objects;

public class MyEducation extends AppCompatActivity {
    ImageView goBackPage_iv;
    Button bsInComputerScience_btn, fsc_pre_eng_btn, matric_in_science_btn, android_app_dev_btn, web_dev_btn, win_form_app_dev_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_education);
        Objects.requireNonNull(getSupportActionBar()).hide();
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        getWindow().setStatusBarColor(ContextCompat.getColor(getApplicationContext(), R.color.lite_primary));


        goBackPage_iv = findViewById(R.id.iv_go_back_page);

        bsInComputerScience_btn = findViewById(R.id.btn_bs_computer_science);
        fsc_pre_eng_btn = findViewById(R.id.btn_fsc_pre_engineering);
        matric_in_science_btn = findViewById(R.id.btn_matric_in_science);
        android_app_dev_btn = findViewById(R.id.btn_android_app_dev);
        web_dev_btn = findViewById(R.id.btn_web_dev);
        win_form_app_dev_btn = findViewById(R.id.btn_win_form_app_dev);


        goBackPage_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h = new Intent(getApplicationContext(), OnBoarding.class);
                startActivity(h);
                finish();
            }
        });


        bsInComputerScience_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MyEducation.this, "Details will be Update Soon", Toast.LENGTH_SHORT).show();
            }
        });


        fsc_pre_eng_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MyEducation.this, "Details will be Update Soon", Toast.LENGTH_SHORT).show();
            }
        });


        matric_in_science_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MyEducation.this, "Details will be Update Soon", Toast.LENGTH_SHORT).show();
            }
        });


        android_app_dev_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MyEducation.this, "Details will be Update Soon", Toast.LENGTH_SHORT).show();
            }
        });


        web_dev_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MyEducation.this, "Details will be Update Soon", Toast.LENGTH_SHORT).show();
            }
        });


        win_form_app_dev_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MyEducation.this, "Details will be Update Soon", Toast.LENGTH_SHORT).show();
            }
        });





    }
}