package com.example.myinstagram.home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TableLayout;

import com.example.myinstagram.R;
import com.example.myinstagram.util.BottomNavigationViewHelper;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private static final int ACTIVITY_NUM=0;
    private ViewPager myViewPager;
    private TabLayout myTablayout;
    private SectionPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();

        bottomNavigation();

        setupViewPager();
    }

    private void initialize() {

        myTablayout = (TabLayout)findViewById(R.id.tabs);
        myViewPager = (ViewPager)findViewById(R.id.container);
    }

    // responsible for adding 3 tabs on HomeActivity
    private void setupViewPager(){

        adapter = new SectionPagerAdapter(getSupportFragmentManager());
        myViewPager.setAdapter(adapter);
        myTablayout.setupWithViewPager(myViewPager);

        myTablayout.getTabAt(0).setIcon(R.drawable.ic_camera);
        myTablayout.getTabAt(1).setIcon(R.drawable.ic_house);
        myTablayout.getTabAt(2).setIcon(R.drawable.ic_instagram);
    }

    private void bottomNavigation() {

        BottomNavigationView view = (BottomNavigationView)findViewById(R.id.bottomNavigation_view_bar);
        BottomNavigationViewHelper.enableNavigation(MainActivity.this , view);

        Menu menu = view.getMenu();
        MenuItem item = menu.getItem(ACTIVITY_NUM);
        item.setChecked(true);

    }


}
