package com.example.taskiiing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class AddTask extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);



        //        Make the bottom navbar
        BottomNavigationView bottom_nav = findViewById(R.id.bottom_navigation);
        bottom_nav.setSelectedItemId(R.id.Home);
        bottom_nav.setItemIconTintList(null);
        bottom_nav.setOnItemSelectedListener(item -> {

            if (item.getItemId() == R.id.Task){
                startActivity(new Intent(getApplicationContext(),TaskActivity.class));
                overridePendingTransition(0,0);
                return true;
            } else if (item.getItemId() == R.id.Home) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                overridePendingTransition(0,0);
                return true;
            }
            else if (item.getItemId() == R.id.Calendar) {
                startActivity(new Intent(getApplicationContext(),CalendarActivity.class));
                overridePendingTransition(0,0);
                return true;
            }
            return false;
        }
        );
    }
}