package com.example.taufiq.themovies.view.view;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.example.taufiq.themovies.R;
import com.example.taufiq.themovies.view.view.fragment.MoviesFragment;
import com.example.taufiq.themovies.view.view.fragment.TvFragment;

public class MainActivity extends AppCompatActivity {


    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.nav_bottom);
        initFragment(new MoviesFragment());

        bottomNavigationSetup(bottomNavigationView);


        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(false);
        }
    }

    private void bottomNavigationSetup(BottomNavigationView bottomNavigationView) {

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {

                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                        int nav_id = menuItem.getItemId();
                        switch (nav_id) {
                            case R.id.movies_menu:

                                initFragment(new MoviesFragment());
                                break;

                            case R.id.tv_menu:
                                initFragment(new TvFragment());
                                break;

                            case R.id.settings_id:
                                Intent intent = new Intent(Settings.ACTION_LOCALE_SETTINGS);
                                startActivity(intent);
                                break;
                        }
                        return true;
                    }
                });

    }


    /**
     * @param fragment initializing fragment transaction
     */
    private void initFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit();

    }
}
