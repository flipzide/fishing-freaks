package fishingfreaks.ffapp;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, BottomNavigationView.OnNavigationItemSelectedListener {

    // Declare bottom navigation view
    BottomNavigationView bottomNavigationView;

    // SECOND LISTVIEW ATTEMPT
    ListView search_fish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set bottom nav on create
        bottomNavigationView = findViewById(R.id.bottom_navigation);

        // Listen for clicks on bottom navigation
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.nav_home);
    }

    // Declare activity fragments
//    FragmentHome homeFragment = new FragmentHome();
    FragmentSearch searchFragment = new FragmentSearch();
    FragmentAdd addFragment = new FragmentAdd();
    FragmentProfile profileFragment = new FragmentProfile();


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        // Switch statement to change fragment activities
        switch (item.getItemId()) {
            case R.id.nav_home:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, searchFragment).commit();
                break;
            case R.id.nav_add:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, addFragment).commit();
                break;
            case R.id.nav_profile:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, profileFragment).commit();
                break;
        }

        return true;
    }
}