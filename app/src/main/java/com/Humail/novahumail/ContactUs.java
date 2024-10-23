package com.Humail.novahumail;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import android.Manifest;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.novahumail.R;

import java.io.InputStream;
import java.util.Objects;

public class ContactUs extends AppCompatActivity {
    Button txtMsg_btn, phoneCall_btn, wtspMsg_btn, wtspCall_btn, uTubeChannel_btn, linkdIn_btn, insta_btn, twtr_btn;
    ImageView goBackPage_iv;

    private static final String CHANNEL_ID = "My Channel";
    private static final int NOTIFICATION_ID = 100;
    private static final int REQUEST_PHONE_CALL = 1;

    //bcz it find which notification is this
    public static final int REQ_CODE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
        Objects.requireNonNull(getSupportActionBar()).hide();
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        getWindow().setStatusBarColor(ContextCompat.getColor(getApplicationContext(), R.color.lite_primary));


        goBackPage_iv = findViewById(R.id.iv_go_back_page);

        txtMsg_btn = findViewById(R.id.btn_bs_computer_science);
        phoneCall_btn = findViewById(R.id.btn_phoneCall);
        wtspMsg_btn = findViewById(R.id.btn_wtspMsg);
        wtspCall_btn = findViewById(R.id.btn_wtspCall);
        uTubeChannel_btn = findViewById(R.id.btn_utubeChnl);
        linkdIn_btn = findViewById(R.id.btn_LinkedIn);
        insta_btn = findViewById(R.id.btn_insta);
        twtr_btn = findViewById(R.id.btn_twtr);


        txtMsg_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ContactUs.this, "Only Phone Call is Available Now ", Toast.LENGTH_SHORT).show();
            }
        });


        wtspMsg_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ContactUs.this, "Only Phone Call is Available Now ", Toast.LENGTH_SHORT).show();
            }
        });


        wtspCall_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ContactUs.this, "Only Phone Call is Available Now ", Toast.LENGTH_SHORT).show();
            }
        });


        uTubeChannel_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ContactUs.this, "Only Phone Call is Available Now ", Toast.LENGTH_SHORT).show();
            }
        });


        linkdIn_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ContactUs.this, "Only Phone Call is Available Now ", Toast.LENGTH_SHORT).show();
            }
        });


        insta_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ContactUs.this, "Only Phone Call is Available Now ", Toast.LENGTH_SHORT).show();
            }
        });


        twtr_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ContactUs.this, "Only Phone Call is Available Now ", Toast.LENGTH_SHORT).show();
            }
        });


        goBackPage_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h = new Intent(getApplicationContext(), OnBoarding.class);
                startActivity(h);
                finish();
            }
        });


        phoneCall_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel: +92 306 1782318"));
//                check and allow permission for call
                if (ActivityCompat.checkSelfPermission(ContactUs.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(ContactUs.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_PHONE_CALL);
                } else {
                    startActivity(callIntent);
                }
            }
        });


//setting animation on buttons

        Animation txtMgs_btn_anim = AnimationUtils.loadAnimation(this, R.anim.txt_msg_btn_animation);
        txtMsg_btn.setAnimation(txtMgs_btn_anim);

        Animation phoneCall_btn_anim = AnimationUtils.loadAnimation(this, R.anim.phone_call_btn_animation);
        phoneCall_btn.setAnimation(phoneCall_btn_anim);

        Animation wtspMsg_btn_anim = AnimationUtils.loadAnimation(this, R.anim.wtsp_msg_btn_animation);
        wtspMsg_btn.setAnimation(wtspMsg_btn_anim);

        Animation wtspCall_btn_anim = AnimationUtils.loadAnimation(this, R.anim.wtsp_call_btn_animation);
        wtspCall_btn.setAnimation(wtspCall_btn_anim);

        Animation utubeChannel_btn_anim = AnimationUtils.loadAnimation(this, R.anim.utube_channel__btn_animation);
        uTubeChannel_btn.setAnimation(utubeChannel_btn_anim);

        Animation linkdIn_btn_anim = AnimationUtils.loadAnimation(this, R.anim.linkdin_btn_animation);
        linkdIn_btn.setAnimation(linkdIn_btn_anim);

        Animation insta_btn_anim = AnimationUtils.loadAnimation(this, R.anim.insta_btn_animation);
        insta_btn.setAnimation(insta_btn_anim);

        Animation twtr_btn_anim = AnimationUtils.loadAnimation(this, R.anim.twtr_btn_animation);
        twtr_btn.setAnimation(twtr_btn_anim);


        InputStream is = getResources().openRawResource(R.raw.contact_us_lotty_anim);


//Creating Simple Notfication

//        Drawable drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.wtsp_call, null);
//        BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
//        Bitmap largeIcon = bitmapDrawable.getBitmap();
//
//        Notification notification;
//        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
//        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
//            notification = new Notification.Builder(this)
//                    .setLargeIcon(largeIcon)
//                    .setSmallIcon(R.drawable.ic_nova_logo_no_background_1_adobe_express)
//                    .setContentText("Contact with HUMAIL")
//                    .setSubText("Want to save HUMAIL Contact")
//                    .setChannelId(CHANNEL_ID)
//                    .build();
//            nm.createNotificationChannel(new NotificationChannel(CHANNEL_ID, "New Channel", NotificationManager.IMPORTANCE_HIGH));
//        } else {
//            notification = new Notification.Builder(this)
//                    .setLargeIcon(largeIcon)
//                    .setSmallIcon(R.drawable.ic_nova_logo_no_background_1_adobe_express)
//                    .setContentText("Contact with HUMAIL")
//                    .setSubText("Want to save HUMAIL Contact")
//                    .build();
//        }
//        nm.notify(NOTIFICATION_ID, notification);


//creating custom notification

        Intent iNotify = new Intent(getApplicationContext(), OnBoarding.class);
        //clear the recent activities
        iNotify.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);


        PendingIntent pi = PendingIntent.getActivity(getApplicationContext(), REQ_CODE, iNotify, PendingIntent.FLAG_IMMUTABLE);
//        PendingIntent pi = PendingIntent.getActivity(this, REQ_CODE, iNotify, PendingIntent.FLAG_UPDATE_CURRENT);


        //png sending from drawable to bitmap drawable
        Drawable drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.wtsp_call, null);
        BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
        Bitmap largeIcon = bitmapDrawable.getBitmap();

        Notification notification;
        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        //Big Picture Style
        //jb notification ko strech ya lamba krty hn to tb yay text ata hai

        Notification.BigPictureStyle bigPictureStyle = new Notification.BigPictureStyle()
                //it is minimize the drawable to bitmap drawable code
                .bigPicture(((BitmapDrawable) ResourcesCompat.getDrawable(getResources(), R.drawable.wtsp_call, null)).getBitmap()).bigLargeIcon(largeIcon).setBigContentTitle("Image Sent by custom Humail").setSummaryText("Image Message");

        //inbox style
        Notification.InboxStyle inboxStyle = new Notification.InboxStyle().addLine("A").addLine("B").addLine("C").addLine("D").addLine("E").addLine("F").addLine("G").addLine("H").addLine("I").addLine("J").addLine("K").setBigContentTitle("Full Message").setSummaryText("Message from Armughan");


        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            notification = new Notification.Builder(this).setLargeIcon(largeIcon).setSmallIcon(R.drawable.ic_nova_logo_no_background_1_adobe_express).setContentText("Contact with HUMAIL").setSubText("Want to save HUMAIL Contact").setChannelId(CHANNEL_ID)
                    //setting the big picture style in notification
                    .setStyle(bigPictureStyle).setContentIntent(pi).build();
            nm.createNotificationChannel(new NotificationChannel(CHANNEL_ID, "New Channel", NotificationManager.IMPORTANCE_HIGH));
        } else {
            notification = new Notification.Builder(this).setLargeIcon(largeIcon).setSmallIcon(R.drawable.ic_nova_logo_no_background_1_adobe_express).setContentText("Contact with HUMAIL").setContentIntent(pi)
                    //setting style
                    .setStyle(bigPictureStyle).setSubText("Want to save HUMAIL Contact").build();
        }
        nm.notify(NOTIFICATION_ID, notification);

    }
}