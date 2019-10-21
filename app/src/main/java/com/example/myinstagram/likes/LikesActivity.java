package com.example.myinstagram.likes;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myinstagram.R;
import com.example.myinstagram.util.BottomNavigationViewHelper;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class LikesActivity extends AppCompatActivity {
    private static final String TAG = "LikesActivuty";
    private static final int ACTIVITY_NUM = 3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigation();
    }

    private void bottomNavigation() {

        BottomNavigationView view = (BottomNavigationView)findViewById(R.id.bottomNavigation_view_bar);
        BottomNavigationViewHelper.enableNavigation(LikesActivity.this , view);
        finish();
        Menu menu = view.getMenu();
        MenuItem item = menu.getItem(ACTIVITY_NUM);
        item.setChecked(true);




    }
}
