package com.example.taufiq.themovies.view.api;


import com.example.taufiq.themovies.view.model.remote.movies.Movie;
import com.example.taufiq.themovies.view.model.remote.tvs.TvShows;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created By Taufiq on 9/13/2019.
 */
public interface Api_Route {


    @GET("discover/movie")
    Call<Movie> getMovie(@Query("api_key") String api_key,@Query("language") String language);


    @GET("discover/tv")
    Call<TvShows> getTvShows(@Query("api_key") String api_key,@Query("language") String language);
}
