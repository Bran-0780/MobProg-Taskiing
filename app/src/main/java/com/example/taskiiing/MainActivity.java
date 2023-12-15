package com.example.taskiiing;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    protected FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // floating action button
        floatingActionButton = findViewById(R.id.add_task);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AddTask.class);
                startActivity(intent);
            }
        });

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
                return true;
            }
            else if (item.getItemId() == R.id.Calendar) {
                startActivity(new Intent(getApplicationContext(),CalendarActivity.class));
                overridePendingTransition(0,0);
                return true;
            }
            return false;
        }

        ) ;
    }
}