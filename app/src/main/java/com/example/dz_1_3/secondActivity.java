package com.example.dz_1_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {
    String area,city,street;
    TextView textArea,textCity,textStreet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_acnivity);
        area = getIntent().getStringExtra("area");
        city = getIntent().getStringExtra("city");
        street = getIntent().getStringExtra("street");
        findView();
        textArea.setText(area);
        textCity.setText(city);
        textStreet.setText(street);


    }
    private void findView(){
        textArea = findViewById(R.id.print_area);
        textCity = findViewById(R.id.print_city);
        textStreet = findViewById(R.id.print_street);

    }

}