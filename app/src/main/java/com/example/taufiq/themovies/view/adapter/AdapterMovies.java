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
import com.example.taufiq.themovies.view.view.DetailMoviesActivity;

import java.util.List;

/**
 * Created By Taufiq on 8/26/2019.
 */
public class AdapterMovies extends RecyclerView.Adapter<AdapterMovies.movieViewHolder> {


    private List<Movies> moviesList;
    Context context;

    public AdapterMovies(Context context, List<Movies> moviesList) {
        this.moviesList = moviesList;
        this.context = context;
    }

    @NonNull
    @Override
    public movieViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new movieViewHolder(LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.show_recycler_item, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull movieViewHolder movieViewHolder, int i) {
        movieViewHolder.bind(moviesList.get(i));
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }

    class movieViewHolder extends RecyclerView.ViewHolder {

        TextView movieTitle, movieYear, movieRatingScore, movieGenre,minOverView;
        ImageView moviePoster;

        private movieViewHolder(@NonNull View itemView) {
            super(itemView);

            movieTitle = itemView.findViewById(R.id.mv_title);
            movieYear = itemView.findViewById(R.id.mv_year);
            movieRatingScore = itemView.findViewById(R.id.mv_rating);
            movieGenre = itemView.findViewById(R.id.mv_genres);
            moviePoster = itemView.findViewById(R.id.mv_poster);
            minOverView = itemView.findViewById(R.id.overview_placeholder);
        }

        private void bind(final Movies movies) {

            movieTitle.setText(movies.getMovieTitle());
            movieYear.setText(movies.getYearRelease());
            movieRatingScore.setText(movies.getRatingScore());
            movieGenre.setText(movies.getGenres());
            minOverView.setText(movies.getOverviewMovies());

            Glide.with(itemView).load(movies.getPoster())
                    .apply(new RequestOptions().transform(new CenterCrop(),new RoundedCorners(16)))
                    .into(moviePoster);



            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent moveToDetail = new Intent(itemView.getContext(), DetailMoviesActivity.class);
                    moveToDetail.putExtra("ITEM",movies);
                    itemView.getContext().startActivity(moveToDetail);
                }
            });

        }
    }

}
