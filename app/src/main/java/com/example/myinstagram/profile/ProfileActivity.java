package com.example.myinstagram.profile;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.myinstagram.R;
import com.example.myinstagram.util.BottomNavigationViewHelper;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ProfileActivity extends AppCompatActivity {
    private static final String TAG = "SearchActivuty";
    private static final int ACTIVITY_NUM =4 ;
    private Toolbar mToolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

     //   bottomNavigation();

        setUpToolbar();
    }

    private void setUpToolbar()
    {
        mToolbar =(Toolbar)findViewById(R.id.id_profile_toolbar);
        setSupportActionBar(mToolbar);

        mToolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.id_profile_menu:
                        Toast.makeText(ProfileActivity.this,
                                "will go to profile preferences", Toast.LENGTH_SHORT).show();

                }
                return false;
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.profile_menu , menu);
        return true;
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
