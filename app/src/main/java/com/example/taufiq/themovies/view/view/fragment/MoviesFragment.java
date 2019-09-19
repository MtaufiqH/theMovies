package com.example.taufiq.themovies.view.view.fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.taufiq.themovies.BuildConfig;
import com.example.taufiq.themovies.R;
import com.example.taufiq.themovies.view.adapter.AdapterMovies;
import com.example.taufiq.themovies.view.api.Api_Client;
import com.example.taufiq.themovies.view.api.Api_Route;
import com.example.taufiq.themovies.view.model.remote.movies.Movie;
import com.example.taufiq.themovies.view.model.remote.movies.MovieResult;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class MoviesFragment extends Fragment {


    List<MovieResult> movieItems;
    ProgressBar progressBar;


    public MoviesFragment() {
        // Required empty public constructor
    }

    private void initRetrofit() {

        String API_KEY = BuildConfig.API_KEY;
        Api_Route api_route = Api_Client.RetrofitClient().create(Api_Route.class);
        Call<Movie> call = api_route.getMovie(API_KEY,"en-US");
        call.enqueue(new Callback<Movie>() {
            @Override
            public void onResponse(@NonNull Call<Movie> call, @NonNull Response<Movie> response) {
                movieItems = response.body().getResults();
                progressBar.setVisibility(View.GONE);
                Toast.makeText(getContext(), "Success" , Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onFailure(@NonNull Call<Movie> call, @NonNull Throwable t) {
                progressBar.setVisibility(View.GONE);
                Toast.makeText(getContext(), "" +t , Toast.LENGTH_SHORT).show();
                t.printStackTrace();
            }
        });
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //moviesDataLoad();
        return inflater.inflate(R.layout.fragment_movies_, container, false);

    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        initRetrofit();
        progressBar = view.findViewById(R.id.my_progres_dialog);
        RecyclerView recyclerView = view.findViewById(R.id.rv_movies);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        AdapterMovies adapter = new AdapterMovies(movieItems);
        recyclerView.setAdapter(adapter);


    }


}

