package com.Humail.novahumail;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.novahumail.R;

public class SplashScreen extends AppCompatActivity {

    ImageView splash_logo_iv;
    TextView splash_text_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        getSupportActionBar().hide();
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        getWindow().setStatusBarColor(ContextCompat.getColor(getApplicationContext(), R.color.primary));


        splash_logo_iv = findViewById(R.id.iv_splash_logo);
        splash_text_tv = findViewById(R.id.tv_splash_text);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent h = new Intent(getApplicationContext(), OnBoarding.class);
                startActivity(h);
                finish();
            }
        }, 4000);


//        logo animation
        Animation logo_anim = AnimationUtils.loadAnimation(this, R.anim.splash_logo_animation);
        splash_logo_iv.setAnimation(logo_anim);


//        text animation
        Animation text_anim = AnimationUtils.loadAnimation(this, R.anim.splash_text_animation);
        splash_text_tv.setAnimation(text_anim);

    }
}