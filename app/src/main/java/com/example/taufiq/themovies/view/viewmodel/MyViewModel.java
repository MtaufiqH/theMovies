package com.example.taufiq.themovies.view.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.view.View;
import android.widget.ProgressBar;

import com.example.taufiq.themovies.BuildConfig;
import com.example.taufiq.themovies.view.adapter.AdapterMovies;
import com.example.taufiq.themovies.view.api.Api_Client;
import com.example.taufiq.themovies.view.api.Api_Route;
import com.example.taufiq.themovies.view.model.remote.movies.Movie;
import com.example.taufiq.themovies.view.model.remote.movies.MovieResult;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created By Taufiq on 9/14/2019.
 */
public class MyViewModel extends ViewModel {

    private static final MutableLiveData<ArrayList<MovieResult>> movies = new MutableLiveData<>();
    String API_KEY = BuildConfig.API_KEY;
    String language = "en-US";
    private AdapterMovies adapterMovies;


    public MutableLiveData<ArrayList<MovieResult>> setMovies(final ProgressBar progressBar) {

        Api_Route api_route = Api_Client.RetrofitClient().create(Api_Route.class);
        Call<Movie> call = api_route.getMovie(API_KEY, language);
        call.enqueue(new Callback<Movie>() {
            @Override
            public void onResponse(@NotNull Call<Movie> call, @NotNull Response<Movie> response) {
                movies.postValue((ArrayList<MovieResult>) response.body().getMovie_results());
                progressBar.setVisibility(View.GONE);
            }

            @Override
            public void onFailure(@NotNull Call<Movie> call, Throwable t) {
                progressBar.setVisibility(View.GONE);
                t.printStackTrace();
            }
        });

        return movies;
    }
}
