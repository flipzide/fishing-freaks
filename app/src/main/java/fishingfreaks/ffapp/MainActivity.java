package fishingfreaks.ffapp;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener,
        BottomNavigationView.OnNavigationItemSelectedListener {

//    private RecyclerView mRecyclerView;
//    private RecyclerView.Adapter mAdapter;
//    private RecyclerView.LayoutManager mLayoutManager;

    // Declare bottom navigation view
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Adapter Attempts
        // ATTEMPT #3 - Set recyclerView with adapter
//        ArrayList<item> itemsList = new ArrayList<>();
//        itemsList.add(new item(R.drawable.fish0, "Bass", R.drawable.profile0, 2500));
//        itemsList.add(new item(R.drawable.fish1, "Bass", R.drawable.profile1, 2500));
//        itemsList.add(new item(R.drawable.fish2, "Bass", R.drawable.profile2, 2500));
//        itemsList.add(new item(R.drawable.fish3, "Bass", R.drawable.profile3, 2500));
//        itemsList.add(new item(R.drawable.fish4, "Bass", R.drawable.profile4, 2500));
//
//        mRecyclerView = findViewById(R.id.recyclerView);
//        mRecyclerView.setHasFixedSize(true);
//        mLayoutManager = new LinearLayoutManager(this);
//        mAdapter = new CardAdapter(itemsList);
//
//        mRecyclerView.setLayoutManager(mLayoutManager);
//        mRecyclerView.setAdapter(mAdapter);

        // Set bottom nav on create
        bottomNavigationView = findViewById(R.id.bottom_navigation);

        // Listen for clicks on bottom navigation
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.nav_home);
    }

    // Declare bottom menu activity fragments
//  FragmentHome homeFragment = new FragmentHome();
    FragmentMain mainFragment = new FragmentMain();
    FragmentAdd addFragment = new FragmentAdd();
    FragmentProfile profileFragment = new FragmentProfile();


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        // Switch statement to change bottom menu fragment activities
        switch (item.getItemId()) {
            case R.id.nav_home:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, mainFragment).commit();
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