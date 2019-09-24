package com.example.taufiq.themovies.view.adapter;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.example.taufiq.themovies.BuildConfig;
import com.example.taufiq.themovies.R;
import com.example.taufiq.themovies.view.model.remote.tvs.TvResult;
import com.example.taufiq.themovies.view.view.DetailTvActivity;

import java.util.ArrayList;

/**
 * Created By Taufiq on 8/26/2019.
 */
public class AdapterTv extends RecyclerView.Adapter<AdapterTv.tvViewHolder> {

    private ArrayList<TvResult> moviesList;

    public AdapterTv(ArrayList<TvResult> moviesList) {
        this.moviesList = moviesList;
    }

    @NonNull
    @Override
    public tvViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new tvViewHolder(LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.show_recycler_item, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull tvViewHolder tvViewHolder, int i) {
        tvViewHolder.bind(moviesList.get(i),i);
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }

    class tvViewHolder extends RecyclerView.ViewHolder{

        TextView movieTitle, movieRatingScore,minOverview;
        ImageView moviePoster;

        tvViewHolder(@NonNull View itemView) {
            super(itemView);

            movieTitle = itemView.findViewById(R.id.mv_title);
            movieRatingScore = itemView.findViewById(R.id.mv_rating);
            moviePoster = itemView.findViewById(R.id.mv_poster);
            minOverview = itemView.findViewById(R.id.overview_placeholder);
        }



        private void bind(final TvResult tvResult, final int position) {

            movieTitle.setText(tvResult.getOriginalName());
            movieRatingScore.setText(tvResult.getVoteAverage());
            minOverview.setText(tvResult.getOverview());

           final int roundCornerValue = 16;
           String image = BuildConfig.URL_IMAGE + tvResult.getPosterPath();
            Glide.with(itemView).load(image)
                    .apply(new RequestOptions().transform(new CenterCrop(),new RoundedCorners(roundCornerValue)))
                    .into(moviePoster);


            itemView.setOnClickListener(view -> {
                Intent moveToDetail = new Intent(itemView.getContext(), DetailTvActivity.class);
                moveToDetail.putExtra("DATA",moviesList.get(position));
                itemView.getContext().startActivity(moveToDetail);
            });

        }
    }
}
