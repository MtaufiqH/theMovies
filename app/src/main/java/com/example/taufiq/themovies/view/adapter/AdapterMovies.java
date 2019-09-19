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
import com.example.taufiq.themovies.view.model.remote.movies.MovieResult;
import com.example.taufiq.themovies.view.view.DetailMoviesActivity;

import java.util.List;

/**
 * Created By Taufiq on 8/26/2019.
 */
public class AdapterMovies extends RecyclerView.Adapter<AdapterMovies.movieViewHolder> {

    private List<MovieResult> moviesList;

    public AdapterMovies(List<MovieResult> moviesList) {
        this.moviesList = moviesList;
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

        TextView movieTitle, movieRatingScore, movieGenre, minOverView;
        ImageView moviePoster;

        private movieViewHolder(@NonNull View itemView) {
            super(itemView);

            movieTitle = itemView.findViewById(R.id.mv_title);
            movieRatingScore = itemView.findViewById(R.id.mv_rating);
            movieGenre = itemView.findViewById(R.id.mv_genres);
            moviePoster = itemView.findViewById(R.id.mv_poster);
            minOverView = itemView.findViewById(R.id.overview_placeholder);
        }

        private void bind(final MovieResult movies) {

          String vote_average =  movies.getVoteAverage().toString();

            movieTitle.setText(movies.getTitle());
            movieRatingScore.setText(vote_average);
            //movieGenre.setText(movies.getGenreIds().get(position));
            minOverView.setText(movies.getOverview());

            final  String posterPath = movies.getPosterPath();
            final String imgUrl = BuildConfig.URL_IMAGE;

            Glide.with(itemView).load(imgUrl + posterPath)
                    .apply(new RequestOptions().transform(new CenterCrop(), new RoundedCorners(16)))
                    .into(moviePoster);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent moveToDetail = new Intent(itemView.getContext(), DetailMoviesActivity.class);
                    itemView.getContext().startActivity(moveToDetail);
                }
            });

        }
    }

}
