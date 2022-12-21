package com.example.restaurantapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class orderplace extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orderplace);

        findViewById(R.id.live_table_1).setOnClickListener(v -> showReservedToast());
        findViewById(R.id.live_table_2).setOnClickListener(v -> showReservedToast());
        findViewById(R.id.live_table_3).setOnClickListener(v -> showReservedToast());
        findViewById(R.id.live_table_4).setOnClickListener(v -> showReservedToast());
        findViewById(R.id.live_table_5).setOnClickListener(v -> showReservedToast());
        findViewById(R.id.live_table_6).setOnClickListener(v -> showReservedToast());
        findViewById(R.id.live_table_7).setOnClickListener(v -> showReservedToast());
        findViewById(R.id.empty_table_1).setOnClickListener(v -> showEmptyToast());
        findViewById(R.id.empty_table_2).setOnClickListener(v -> showEmptyToast());
        findViewById(R.id.empty_table_3).setOnClickListener(v -> showEmptyToast());
    }


    private void showReservedToast(){
        Toast.makeText(getBaseContext(), "DOLU", Toast.LENGTH_SHORT).show();
    }
    private void showEmptyToast(){
        Toast.makeText(getBaseContext(), "BOŞ", Toast.LENGTH_SHORT).show();
    }
}