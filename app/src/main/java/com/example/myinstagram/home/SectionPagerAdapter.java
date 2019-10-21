package com.example.myinstagram.home;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class SectionPagerAdapter  extends FragmentPagerAdapter {


    public SectionPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {

        switch (i)
        {

            case 0:
                CameraFragment cameraFragment = new CameraFragment();
                return  cameraFragment;

            case 1:
                HomeFragment homeFragment = new HomeFragment();
                return homeFragment;


            case 2:
                MessageFragment messageFragment = new MessageFragment();
                return messageFragment;

            default: return  null;
        }
    }

    @Override
    public int getCount() {
        return  3;
    }

//    @Nullable
//    @Override
//    public CharSequence getPageTitle(int position) {
//
//        switch (position)
//        {
//            case 0: return "Camera";
//
//            case 1: return "Home";
//
//            case 2: return "Message" ;
//
//            default: return  null;
//        }
//    }

}
