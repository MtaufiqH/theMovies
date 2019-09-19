package com.example.taufiq.themovies.view.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.taufiq.themovies.R;
import com.example.taufiq.themovies.view.model.Movies;

public class DetailMoviesActivity extends AppCompatActivity {

    private static final String TAG = "DetailMoviesActivity";

    private TextView genres, movie_title, movie_date, movie_rating,
            movie_runtime, movie_status, movie_overview;

    private ImageView backdrop_movie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies_detail);

        genres = findViewById(R.id.mv_genres);
        backdrop_movie = findViewById(R.id.imageView_backdrop);
        movie_title = findViewById(R.id.movie_title);
        movie_date = findViewById(R.id.date_id);
        movie_rating = findViewById(R.id.mv_rating);
        movie_runtime = findViewById(R.id.runtime_id);
        movie_status = findViewById(R.id.status_id);
        movie_overview = findViewById(R.id.overview_id);


        ActionBar actionBar = getSupportActionBar();

        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        Intent myIntent = getIntent();

        if (myIntent.hasExtra("ITEM")) {
            Movies movies = myIntent.getParcelableExtra("ITEM");

            Glide.with(this)
                    .load(movies.getBackground())
                    .into(backdrop_movie);

            movie_title.setText(movies.getMovieTitle());
            movie_date.setText(movies.getDateRelease());
            movie_rating.setText(movies.getRatingScore());
            genres.setText(movies.getGenres());
            movie_runtime.setText(movies.getRuntime());
            movie_status.setText(movies.getStatus());
            movie_overview.setText(movies.getOverviewMovies());


        } else
            Log.d(TAG, "Intent has no extras");

    }
}
