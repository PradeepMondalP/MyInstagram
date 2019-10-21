package com.example.myinstagram.profile;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myinstagram.R;
import com.example.myinstagram.util.BottomNavigationViewHelper;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ProfileActivity extends AppCompatActivity {
    private static final String TAG = "SearchActivuty";
    private static final int ACTIVITY_NUM =4 ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigation();
    }

    private void bottomNavigation() {

        BottomNavigationView view = (BottomNavigationView)findViewById(R.id.bottomNavigation_view_bar);
        BottomNavigationViewHelper.enableNavigation(ProfileActivity.this , view);

        Menu menu = view.getMenu();
        MenuItem item = menu.getItem(ACTIVITY_NUM);
        item.setChecked(true);
        finish();

    }
}
