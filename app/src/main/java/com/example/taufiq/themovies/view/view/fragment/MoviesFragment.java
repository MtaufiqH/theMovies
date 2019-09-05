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
               getResources().getString(R.string.oldman_date), "(2018)", getResources().getString(R.string.genres_comedy), "https://image.tmdb.org/t/p/original/i9AzJ052wq5zf8qlAsPJwdINGZS.jpg", "6.5", getResources().getString(R.string.oldman_runtime),"https://image.tmdb.org/t/p/original/zR0FmGpXDFabwxSag6AWAj0nDa4.jpg","",getResources().getString(R.string.movie_status)));

        movieItems.add(new Movies("Hello, Love, Goodbye", getResources().getString(R.string.hello_love_goodbye_overview),
                getResources().getString(R.string.hello_love_goodbye_date), "(2019)", getResources().getString(R.string.genres_romance), "https://image.tmdb.org/t/p/original/kTca5fpKhFOKIiG0tz8tynhsWs5.jpg", "5.8", getResources().getString(R.string.hello_love_goodbye_runtime),"https://image.tmdb.org/t/p/original/foMDjFHrTrex6Rr6bApB8TbWlie.jpg","",getResources().getString(R.string.movie_status)));

        movieItems.add(new Movies("The Lion King", "Simba idolises his father, King Mufasa, and takes to heart his own royal destiny. But not everyone in the kingdom celebrates the new cub's arrival. Scar, Mufasa's brother—and former heir to the throne—has plans of his own. The battle for Pride Rock is ravaged with betrayal, tragedy and drama, ultimately resulting in Simba's exile. With help from a curious pair of newfound friends, Simba will have to figure out how to grow up and take back what is rightfully his.",
                "July 19, 2019", "(2019)", "Adventure", "https://image.tmdb.org/t/p/original/2bXbqYdUdNVa8VIWXVfclP2ICtT.jpg", "7.2", "1h 58m","https://image.tmdb.org/t/p/original/1TUg5pO1VZ4B0Q1amk3OlXvlpXV.jpg", " ","Released"));

        movieItems.add(new Movies("John Wick: Chapter 3", "Super-assassin John Wick returns with a $14 million price tag on his head and an army of bounty-hunting killers on his trail. After killing a member of the shadowy international assassin’s guild, the High Table, John Wick is excommunicado, but the world’s most ruthless hit men and women await his every turn.",
                "May 9, 2019", "(2019)", "Crime", "https://image.tmdb.org/t/p/original/ziEuG1essDuWuC5lpWUaw1uXY2O.jpg", "7.1", "2h 11m","https://image.tmdb.org/t/p/original/vVpEOvdxVBP2aV166j5Xlvb5Cdc.jpg","","Released"));

        movieItems.add(new Movies("Dark Phoenix", "The X-Men face their most formidable and powerful foe when one of their own, Jean Grey, starts to spiral out of control. During a rescue mission in outer space, Jean is nearly killed when she's hit by a mysterious cosmic force. Once she returns home, this force not only makes her infinitely more powerful, but far more unstable. The X-Men must now band together to save her soul and battle aliens that want to use Grey's new abilities to rule the galaxy.",
                "June 7, 2019", "(2019)", "Action", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/kZv92eTc0Gg3mKxqjjDAM73z9cy.jpg", "6.2", "1h 54m","https://image.tmdb.org/t/p/original/cjRUhKyt2Jo3V1KNzc5tpPNfccG.jpg","","Released"));

        movieItems.add(new Movies("Avengers: Endgame", "After the devastating events of Avengers: Infinity War, the universe is in ruins due to the efforts of the Mad Titan, Thanos. With the help of remaining allies, the Avengers must assemble once more in order to undo Thanos' actions and restore order to the universe once and for all, no matter what consequences may be in store.",
                "April 22, 2019", "(2019)", "Adventure", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/or06FN3Dka5tukK1e9sl16pB3iy.jpg", "8.3", "3h 1m","https://image.tmdb.org/t/p/original/7RyHsO4yDXtBv1zUU3mTpHeQ0d5.jpg","","Released"));

        movieItems.add(new Movies("Men in Black", "The Men in Black have always protected the Earth from the scum of the universe. In this new adventure, they tackle their biggest, most global threat to date: a mole in the Men in Black organization.",
                "June 11, 2019", "(2019)", "Action", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/dPrUPFcgLfNbmDL8V69vcrTyEfb.jpg", "5.9", "1h 55m","https://image.tmdb.org/t/p/original/uK9uFbAwQ1s2JHKkJ5l0obPTcXI.jpg","","Released"));

        movieItems.add(new Movies("Avengers: Infinity War", "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
                "April 23, 2018", "(2018)", "Action", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/7WsyChQLEftFiDOVTGkv3hFpyyt.jpg", "8.3", "2h 29m","https://image.tmdb.org/t/p/original/lmZFxXgJE3vgrciwuDib0N8CfQo.jpg","","Released"));

        movieItems.add(new Movies("Aladdin", "A kindhearted street urchin named Aladdin embarks on a magical adventure after finding a lamp that releases a wisecracking genie while a power-hungry Grand Vizier vies for the same lamp that has the power to make their deepest wishes come true.",
                "May 24, 2019", "(2019)", "Adventure", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/3iYQTLGoy7QnjcUYRJy4YrAgGvp.jpg", "7.1", "2h 8m","https://image.tmdb.org/t/p/original/v4yVTbbl8dE1UP2dWu5CLyaXOku.jpg","","Released"));

        movieItems.add(new Movies("Angel Has Fallen", "Secret Service Agent Mike Banning is framed for the attempted assassination of the President and must evade his own agency and the FBI as he tries to uncover the real threat.",
                " August 23, 2019", "(2019)", "Action", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/fapXd3v9qTcNBTm39ZC4KUVQDNf.jpg", "5.8", "2h 1m","https://image.tmdb.org/t/p/original/k2WyDw2NTUIWnuEs5gT7wgrCQg6.jpg","","Released"));


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        RecyclerView recyclerView = view.findViewById(R.id.rv_movies);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        AdapterMovies adapter = new AdapterMovies(view.getContext(),movieItems);
        recyclerView.setAdapter(adapter);


    }


}

