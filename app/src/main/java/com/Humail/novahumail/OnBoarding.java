package com.Humail.novahumail;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import com.example.novahumail.R;

import java.util.Objects;

public class OnBoarding extends AppCompatActivity {
    Button contact_us_btn, education_btn, myWork_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding);
        Objects.requireNonNull(getSupportActionBar()).hide();
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        getWindow().setStatusBarColor(ContextCompat.getColor(getApplicationContext(), R.color.primary));


        contact_us_btn = findViewById(R.id.btn_contact_us);
        education_btn = findViewById(R.id.btn_utubeChnl);
        myWork_btn = findViewById(R.id.btn_my_work);


        contact_us_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h = new Intent(getApplicationContext(), ContactUs.class);
                startActivity(h);
            }
        });


        education_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h = new Intent(getApplicationContext(), MyEducation.class);
                startActivity(h);
            }
        });


        Animation education_btn_anim = AnimationUtils.loadAnimation(this, R.anim.splash_logo_animation);
        education_btn.setAnimation(education_btn_anim);


        Animation myWork_btn_anim = AnimationUtils.loadAnimation(this, R.anim.my_work_btn_alpha_animation);
        myWork_btn.setAnimation(myWork_btn_anim);


        Animation contactUs_btn_anim = AnimationUtils.loadAnimation(this, R.anim.splash_text_animation);
        contact_us_btn.setAnimation(contactUs_btn_anim);


        myWork_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h = new Intent(getApplicationContext(), AndroidAppProjectsList.class);
                startActivity(h);
            }
        });


    }
}