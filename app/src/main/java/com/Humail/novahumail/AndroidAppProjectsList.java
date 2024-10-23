package com.Humail.novahumail;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.novahumail.R;

import java.util.ArrayList;
import java.util.Objects;

public class AndroidAppProjectsList extends AppCompatActivity {

    ImageView goBackPage_iv;
    ArrayList<String> arrAndroidAppProjectNames = new ArrayList<>();
    ListView androidAppProjectNamesLV;
//    ArrayList<String> arrIds = new ArrayList<>();
//    Spinner spinner;
//    ArrayList<String> arrLanguages = new ArrayList<>();
//    AutoCompleteTextView actxtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_app_projects_list);
        Objects.requireNonNull(getSupportActionBar()).hide();
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        getWindow().setStatusBarColor(ContextCompat.getColor(getApplicationContext(),R.color.lite_primary));

        goBackPage_iv = findViewById(R.id.iv_go_back_page);

        androidAppProjectNamesLV = findViewById(R.id.LV_AndroidAppProjectNames);
//        spinner = findViewById(R.id.spinner);
//        actxtView = findViewById(R.id.actxtView);

//        to add data in the arrayList
        arrAndroidAppProjectNames.add("WebTask");
        arrAndroidAppProjectNames.add("Weather Volley");
        arrAndroidAppProjectNames.add("Weather Update Master");
        arrAndroidAppProjectNames.add("Weather Forecast");
        arrAndroidAppProjectNames.add("Vote Casting Calculator");
        arrAndroidAppProjectNames.add("taxi User And Driver");
        arrAndroidAppProjectNames.add("Registration And Login");
        arrAndroidAppProjectNames.add("Online Food Ordering System Master");
        arrAndroidAppProjectNames.add("My Learning App Master");
        arrAndroidAppProjectNames.add("Medicine Shop");
        arrAndroidAppProjectNames.add("KUPA UI");
        arrAndroidAppProjectNames.add("JBOX");
        arrAndroidAppProjectNames.add("Hotel Bill Management");
        arrAndroidAppProjectNames.add("Homemade Food");
        arrAndroidAppProjectNames.add("Food Ordering Application");
        arrAndroidAppProjectNames.add("Fiverr");
        arrAndroidAppProjectNames.add("Driver");
        arrAndroidAppProjectNames.add("Cup Cost Calculator");
        arrAndroidAppProjectNames.add("UO Cgpa Calculator");
        arrAndroidAppProjectNames.add("Calender App New");
        arrAndroidAppProjectNames.add("Calculator");
        arrAndroidAppProjectNames.add("Open Insta Look");
        arrAndroidAppProjectNames.add("Devrnz");
        arrAndroidAppProjectNames.add("WAW Bluetooth Connection App");
        arrAndroidAppProjectNames.add("Nova Humail");

        ArrayAdapter<String> adapterAndroidAppProjectName = new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_list_item_1
                , arrAndroidAppProjectNames);
        androidAppProjectNamesLV.setAdapter(adapterAndroidAppProjectName);

        androidAppProjectNamesLV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Toast.makeText(AndroidAppProjectsList.this, "Projects will be Update here...", Toast.LENGTH_SHORT).show();
                }
            }
        });


//        // spinner
//
//        arrIds.add("CNIC card");
//        arrIds.add("A card");
//        arrIds.add("B card");
//        arrIds.add("C card");
//        arrIds.add("D card");
//        arrIds.add("E card");
//
//        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, arrIds);
//        spinner.setAdapter(spinnerAdapter);
//
//
////        autocomplete txtView
//
//        arrLanguages.add("C");
//        arrLanguages.add("C++");
//        arrLanguages.add("JAVA");
//        arrLanguages.add("PHP");
//        arrLanguages.add("Objective C");
//        arrLanguages.add("CScript");
//
//        ArrayAdapter<String> actvAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrLanguages);
//        actxtView.setAdapter(actvAdapter);
//        actxtView.setThreshold(1);


        goBackPage_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h = new Intent(getApplicationContext(), OnBoarding.class);
                startActivity(h);
                finish();
            }
        });


    }
}