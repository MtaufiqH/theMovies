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

import com.example.taufiq.themovies.R;
import com.example.taufiq.themovies.view.adapter.AdapterMovies;
import com.example.taufiq.themovies.view.model.Movies;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class MoviesFragment extends Fragment {

    List<Movies> movieItems = new ArrayList<>();

    public MoviesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        moviesDataLoad();
        return inflater.inflate(R.layout.fragment_movies_, container, false);

    }

    private void moviesDataLoad() {

        movieItems.add(new Movies("The Old Man & The Gun", getResources().getString(R.string.oldman_overview),
                getResources().getString(R.string.oldman_date), "(2018)", getResources().getString(R.string.genres_comedy), "https://image.tmdb.org/t/p/original/i9AzJ052wq5zf8qlAsPJwdINGZS.jpg", "6.5", getResources().getString(R.string.oldman_runtime), "https://image.tmdb.org/t/p/original/zR0FmGpXDFabwxSag6AWAj0nDa4.jpg", "", getResources().getString(R.string.movie_status)));

        movieItems.add(new Movies("Hello, Love, Goodbye", getResources().getString(R.string.hello_love_goodbye_overview),
                getResources().getString(R.string.hello_love_goodbye_date), "(2019)", getResources().getString(R.string.genres_romance), "https://image.tmdb.org/t/p/original/kTca5fpKhFOKIiG0tz8tynhsWs5.jpg", "5.8", getResources().getString(R.string.hello_love_goodbye_runtime), "https://image.tmdb.org/t/p/original/foMDjFHrTrex6Rr6bApB8TbWlie.jpg", "", getResources().getString(R.string.movie_status)));

        movieItems.add(new Movies("The Lion King", getResources().getString(R.string.lion_overview),
                getResources().getString(R.string.lion_date), "(2019)", getResources().getString(R.string.genres_adventure), "https://image.tmdb.org/t/p/original/2bXbqYdUdNVa8VIWXVfclP2ICtT.jpg", "7.2", getResources().getString(R.string.lion_runtime), "https://image.tmdb.org/t/p/original/1TUg5pO1VZ4B0Q1amk3OlXvlpXV.jpg", " ", getResources().getString(R.string.movie_status)));

        movieItems.add(new Movies("John Wick: Chapter 3", getResources().getString(R.string.john_overview),
                getResources().getString(R.string.john_date), "(2019)", getResources().getString(R.string.genre_crime), "https://image.tmdb.org/t/p/original/ziEuG1essDuWuC5lpWUaw1uXY2O.jpg", "7.1", getResources().getString(R.string.john_runtime), "https://image.tmdb.org/t/p/original/vVpEOvdxVBP2aV166j5Xlvb5Cdc.jpg", "", getResources().getString(R.string.movie_status)));

        movieItems.add(new Movies("Dark Phoenix", getResources().getString(R.string.dark_overview),
                getResources().getString(R.string.dark_date), "(2019)", getResources().getString(R.string.genres_action), "https://image.tmdb.org/t/p/w600_and_h900_bestv2/kZv92eTc0Gg3mKxqjjDAM73z9cy.jpg", "6.2", getResources().getString(R.string.dark_runtime), "https://image.tmdb.org/t/p/original/cjRUhKyt2Jo3V1KNzc5tpPNfccG.jpg", "", getResources().getString(R.string.movie_status)));

        movieItems.add(new Movies("Avengers: Endgame", getResources().getString(R.string.avenger_overview),
                getResources().getString(R.string.avenger_date), "(2019)", getResources().getString(R.string.genres_adventure), "https://image.tmdb.org/t/p/w600_and_h900_bestv2/or06FN3Dka5tukK1e9sl16pB3iy.jpg", "8.3", getResources().getString(R.string.avenger_runtime), "https://image.tmdb.org/t/p/original/7RyHsO4yDXtBv1zUU3mTpHeQ0d5.jpg", "", getResources().getString(R.string.movie_status)));

        movieItems.add(new Movies("Men in Black", getResources().getString(R.string.men_overview),
                getResources().getString(R.string.men_date), "(2019)", getResources().getString(R.string.genres_action), "https://image.tmdb.org/t/p/w600_and_h900_bestv2/dPrUPFcgLfNbmDL8V69vcrTyEfb.jpg", "5.9", getResources().getString(R.string.men_runtime), "https://image.tmdb.org/t/p/original/uK9uFbAwQ1s2JHKkJ5l0obPTcXI.jpg", "", getResources().getString(R.string.movie_status)));

        movieItems.add(new Movies("Avengers: Infinity War", getResources().getString(R.string.avengers_overview),
                getResources().getString(R.string.avengers_date), "(2018)", getResources().getString(R.string.genres_action), "https://image.tmdb.org/t/p/w600_and_h900_bestv2/7WsyChQLEftFiDOVTGkv3hFpyyt.jpg", "8.3", getResources().getString(R.string.avengers_runtime), "https://image.tmdb.org/t/p/original/lmZFxXgJE3vgrciwuDib0N8CfQo.jpg", "", getResources().getString(R.string.movie_status)));

        movieItems.add(new Movies("Aladdin", getResources().getString(R.string.aladin_overview),
                getResources().getString(R.string.aladin_date), "(2019)", getResources().getString(R.string.genres_adventure), "https://image.tmdb.org/t/p/w600_and_h900_bestv2/3iYQTLGoy7QnjcUYRJy4YrAgGvp.jpg", "7.1", getResources().getString(R.string.aladin_runtime), "https://image.tmdb.org/t/p/original/v4yVTbbl8dE1UP2dWu5CLyaXOku.jpg", "", getResources().getString(R.string.movie_status)));

        movieItems.add(new Movies("Angel Has Fallen", getResources().getString(R.string.angel_overview),
                getResources().getString(R.string.angel_date), "(2019)", getResources().getString(R.string.genres_action), "https://image.tmdb.org/t/p/w600_and_h900_bestv2/fapXd3v9qTcNBTm39ZC4KUVQDNf.jpg", "5.8", getResources().getString(R.string.angel_runtime), "https://image.tmdb.org/t/p/original/k2WyDw2NTUIWnuEs5gT7wgrCQg6.jpg", "", getResources().getString(R.string.movie_status)));


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        RecyclerView recyclerView = view.findViewById(R.id.rv_movies);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        AdapterMovies adapter = new AdapterMovies(view.getContext(), movieItems);
        recyclerView.setAdapter(adapter);


    }


}

