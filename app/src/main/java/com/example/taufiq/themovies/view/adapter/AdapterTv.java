package com.example.taufiq.themovies.view.adapter;

import android.content.Context;
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
import com.example.taufiq.themovies.R;
import com.example.taufiq.themovies.view.model.Movies;
import com.example.taufiq.themovies.view.view.DetailTvActivity;

import java.util.List;

/**
 * Created By Taufiq on 8/26/2019.
 */
public class AdapterTv extends RecyclerView.Adapter<AdapterTv.tvViewHolder> {

    private List<Movies> moviesList;

    public AdapterTv(List<Movies> moviesList) {
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

        tvViewHolder.bind(moviesList.get(i));
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }

    class tvViewHolder extends RecyclerView.ViewHolder{

        TextView movieTitle, movieYear, movieRatingScore, movieGenre,minOverview;
        ImageView moviePoster;

        public tvViewHolder(@NonNull View itemView) {
            super(itemView);

            movieTitle = itemView.findViewById(R.id.mv_title);
            movieRatingScore = itemView.findViewById(R.id.mv_rating);
            moviePoster = itemView.findViewById(R.id.mv_poster);
            minOverview = itemView.findViewById(R.id.overview_placeholder);
        }



        private void bind(final Movies movies) {

            movieTitle.setText(movies.getMovieTitle());
            movieRatingScore.setText(movies.getRatingScore());
            movieGenre.setText(movies.getGenres());
            minOverview.setText(movies.getOverviewMovies());

           final int roundCornerValue = 16;
            Glide.with(itemView).load(movies.getPoster())
                    .apply(new RequestOptions().transform(new CenterCrop(),new RoundedCorners(roundCornerValue)))
                    .into(moviePoster);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent moveToDetail = new Intent(itemView.getContext(), DetailTvActivity.class);
                    moveToDetail.putExtra("ITEM", movies);
                    itemView.getContext().startActivity(moveToDetail);
                }
            });

        }
    }
}
