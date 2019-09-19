package com.example.taufiq.themovies.view.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.taufiq.themovies.BuildConfig;
import com.example.taufiq.themovies.R;
import com.example.taufiq.themovies.view.model.remote.movies.MovieResult;

public class DetailMoviesActivity extends AppCompatActivity {

    private static final String TAG = "DetailMoviesActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies_detail);

        ImageView backdrop_movie = findViewById(R.id.imageView_backdrop);
        TextView movie_title = findViewById(R.id.movie_title);
        TextView movie_date = findViewById(R.id.date_id);
        TextView movie_rating = findViewById(R.id.mv_rating);
        TextView movie_overview = findViewById(R.id.overview_id);


        ActionBar actionBar = getSupportActionBar();

        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        Intent myIntent = getIntent();

        if (myIntent.hasExtra("DATA")) {
            MovieResult movies = myIntent.getParcelableExtra("DATA");

            Glide.with(this)
                    .load(BuildConfig.URL_IMAGE + movies.getBackdropPath())
                    .into(backdrop_movie);

            movie_title.setText(movies.getOriginalTitle());
            movie_date.setText(movies.getReleaseDate());
            movie_rating.setText(movies.getVoteAverage());
            movie_overview.setText(movies.getOverview());

        }
            Log.d(TAG, "Intent has no extras");

    }
}
