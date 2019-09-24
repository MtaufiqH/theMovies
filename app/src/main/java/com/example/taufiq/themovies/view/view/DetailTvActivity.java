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
import com.example.taufiq.themovies.view.model.Movies;
import com.example.taufiq.themovies.view.model.remote.tvs.TvResult;

public class DetailTvActivity extends AppCompatActivity {

    private static final String TAG = "DetailTvActivity";

    private TextView  tv_title, tv_date, tv_rating,tv_overview;
    private ImageView backdrop_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_tv);


        backdrop_tv = findViewById(R.id.imageView_tv);
        tv_title = findViewById(R.id.movie_title);
        tv_date = findViewById(R.id.date_id);
        tv_rating = findViewById(R.id.mv_rating);
        tv_overview = findViewById(R.id.overview_id);


        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        initData();

    }


    private void initData(){
    Intent intent = getIntent();
        if (intent.hasExtra("DATA")) {
        TvResult tvShow = intent.getParcelableExtra("DATA");

        String image = BuildConfig.URL_IMAGE + tvShow.getBackdropPath();
        Glide.with(this)
                .load(image)
                .into(backdrop_tv);

        tv_title.setText(tvShow.getOriginalName());
        tv_date.setText(tvShow.getFirstAirDate());
        tv_rating.setText(tvShow.getVoteAverage());
        tv_overview.setText(tvShow.getOverview());

    } else
            Log.d(TAG, "Intent has no extras!");

    }

}
