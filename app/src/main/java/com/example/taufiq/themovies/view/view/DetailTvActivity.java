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

public class DetailTvActivity extends AppCompatActivity {

    private static final String TAG = "DetailTvActivity";

    private TextView genres, tv_title, tv_date, tv_rating,
            tv_runtime, tv_overview;

    private ImageView backdrop_tv, tv_network;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_tv);


        genres = findViewById(R.id.mv_genres);
        backdrop_tv = findViewById(R.id.imageView_tv);
        tv_title = findViewById(R.id.movie_title);
        tv_date = findViewById(R.id.date_id);
        tv_rating = findViewById(R.id.mv_rating);
        tv_runtime = findViewById(R.id.runtime_id);
        tv_network = findViewById(R.id.network_ic_id);
        tv_overview = findViewById(R.id.overview_id);


        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }


        Intent intent = getIntent();
        if (intent.hasExtra("ITEM")) {
            Movies tvShow = intent.getParcelableExtra("ITEM");

            Glide.with(this)
                    .load(tvShow.getBackground())
                    .into(backdrop_tv);

            Glide.with(this).load(tvShow.getNetwork()).into(tv_network);

            tv_title.setText(tvShow.getMovieTitle());
            tv_date.setText(tvShow.getDateRelease());
            tv_rating.setText(tvShow.getRatingScore());
            genres.setText(tvShow.getGenres());
            tv_runtime.setText(tvShow.getRuntime());

            tv_overview.setText(tvShow.getOverviewMovies());

        } else
            Log.d(TAG, "Intent has no extras!");
    }
}
