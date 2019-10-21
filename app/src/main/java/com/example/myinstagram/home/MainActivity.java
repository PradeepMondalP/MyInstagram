package com.example.myinstagram.home;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.myinstagram.R;
import com.example.myinstagram.util.BottomNavigationViewHelper;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private static final int ACTIVITY_NUM=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigation();
    }

    private void bottomNavigation() {

        BottomNavigationView view = (BottomNavigationView)findViewById(R.id.bottomNavigation_view_bar);
        BottomNavigationViewHelper.enableNavigation(MainActivity.this , view);

        Menu menu = view.getMenu();
        MenuItem item = menu.getItem(ACTIVITY_NUM);
        item.setChecked(true);

    }


}
