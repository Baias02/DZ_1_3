package com.example.dz_1_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    AppCompatButton button;
    EditText area, city, street;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findView();
        setClicks();
    }

    private void findView() {
        button = findViewById(R.id.NEXT);
        area = findViewById(R.id.area);
        city = findViewById(R.id.city);
        street = findViewById(R.id.street);
    }

    private void setClicks() {
        button.setOnClickListener(view -> {
            if (!area.getText().toString().isEmpty() && !city.getText().toString().isEmpty() &&
                    !street.getText().toString().isEmpty()) {
                navigateToSecondArea(area.getText().toString(), city.getText().toString(), street.getText().toString());
            } else {
                Toast.makeText(this, "Запольните все поля", Toast.LENGTH_LONG).show();
            }
        });
    }

    private void navigateToSecondArea(String area, String city, String street) {
        Intent intent = new Intent(this, secondActivity.class);
        intent.putExtra("area", area);
        intent.putExtra("city", city);
        intent.putExtra("street", street);
        startActivity(intent);
    }

}