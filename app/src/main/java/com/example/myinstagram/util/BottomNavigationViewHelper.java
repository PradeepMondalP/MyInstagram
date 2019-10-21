package com.example.myinstagram.util;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.example.myinstagram.home.MainActivity;
import com.example.myinstagram.R;
import com.example.myinstagram.profile.ProfileActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomNavigationViewHelper {

    private static final String TAG = "BottomNavigationView";

   public static void enableNavigation(final Context context , BottomNavigationView view)
   {
       view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
           @Override
           public boolean onNavigationItemSelected(@NonNull MenuItem item) {

               switch (item.getItemId())
               {
                   case R.id.id_ic_house:  // activty nnum 0  (Main Activity)
                       Intent intent = new Intent(context , MainActivity.class);
                       Toast.makeText(context, "home act", Toast.LENGTH_SHORT).show();
                       context.startActivity(intent) ;

                       break;

                   case R.id.id_ic_search:  // activty num 1  (Search Activiyt)
                       Intent intent2 = new Intent(context , MainActivity.class);
                       Toast.makeText(context, "search act", Toast.LENGTH_SHORT).show();
                       context.startActivity(intent2);
                       break;

                   case R.id.id_ic_cirlce:  //activity num 2  (Share Activty)
                       Intent intent3 = new Intent(context , MainActivity.class);
                       Toast.makeText(context, "share act", Toast.LENGTH_SHORT).show();
                       context.startActivity(intent3);
                       break;

                   case R.id.id_ic_alert:   //activity num 3 (Likes actvity)
                       Intent intent4 = new Intent(context , MainActivity.class);
                       Toast.makeText(context, "likes act", Toast.LENGTH_SHORT).show();
                       context.startActivity(intent4);
                       break;

                   case R.id.id_ic_android:   //actvtiy num 4  (Profilr Activyt)
                       Intent intent5 = new Intent(context , ProfileActivity.class);
                       Toast.makeText(context, "prpofile act", Toast.LENGTH_SHORT).show();
                       context.startActivity(intent5);
                       break;
               }
               return false;
           }
       });
   }
}
