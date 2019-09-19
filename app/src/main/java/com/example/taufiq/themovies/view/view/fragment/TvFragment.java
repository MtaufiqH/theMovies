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
import com.example.taufiq.themovies.view.adapter.AdapterTv;
import com.example.taufiq.themovies.view.model.Movies;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class TvFragment extends Fragment {

    List<Movies> movieItems = new ArrayList<>();

    public TvFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        tvShowsDataLoad();
        return inflater.inflate(R.layout.fragment_tv, container, false);
    }


    /*
     *
     * Load TVshows data
     * */
    private void tvShowsDataLoad() {

        movieItems.add(new Movies("The Flash", getResources().getString(R.string.flash_overview),
                getResources().getString(R.string.flash_date), "(2014)", getResources().getString(R.string.genres_sci_fi), "https://image.tmdb.org/t/p/w600_and_h900_bestv2/fki3kBlwJzFp8QohL43g9ReV455.jpg", "6.7", getResources().getString(R.string.flash_runtime), "https://image.tmdb.org/t/p/original/jC1KqsFx8ZyqJyQa2Ohi7xgL7XC.jpg", "https://image.tmdb.org/t/p/h30/ge9hzeaU7nMtQ4PjkFlc68dGAJ9.png", " "));

        movieItems.add(new Movies("Fear the Walking Dead", getResources().getString(R.string.fear_overview),
                getResources().getString(R.string.fear_date), "(2015)", getResources().getString(R.string.genres_horor), "https://image.tmdb.org/t/p/w600_and_h900_bestv2/lZMb3R3e5vqukPbeDMeyYGf2ZNG.jpg", "6.3", getResources().getString(R.string.fear_runtime), "https://image.tmdb.org/t/p/original/nUXzdD2Jo3wV9Q7mIZjK46Yyty4.jpg", "https://image.tmdb.org/t/p/h30/pmvRmATOCaDykE6JrVoeYxlFHw3.png", " "));

        movieItems.add(new Movies("Arrow", getResources().getString(R.string.arrow_overview),
                getResources().getString(R.string.arrow_date), "(2012)", getResources().getString(R.string.genre_crime), "https://image.tmdb.org/t/p/w600_and_h900_bestv2/mo0FP1GxOFZT4UDde7RFDz5APXF.jpg", "5.8", getResources().getString(R.string.arrow_runtime), "https://image.tmdb.org/t/p/original/eb0JaHVCEMhFwDUrjEJ0Ac8sQV.jpg", "https://image.tmdb.org/t/p/h30/ge9hzeaU7nMtQ4PjkFlc68dGAJ9.png", " "));

        movieItems.add(new Movies("Family Guy", getResources().getString(R.string.family_overview),
                getResources().getString(R.string.family_date), "(1999)", getResources().getString(R.string.genres_comedy), "https://image.tmdb.org/t/p/w600_and_h900_bestv2/q3E71oY6qgAEiw6YZIHDlHSLwer.jpg", "6.5", getResources().getString(R.string.family_runtime), "https://image.tmdb.org/t/p/original/2hzLQUJu4rJfm3LG8g52IC82ooj.jpg", "https://image.tmdb.org/t/p/h30/1DSpHrWyOORkL9N2QHX7Adt31mQ.png", " "));

        movieItems.add(new Movies("The Simpsons", getResources().getString(R.string.simpson_overview),
                getResources().getString(R.string.simpson_date), "(1989)", getResources().getString(R.string.genres_comedy), "https://image.tmdb.org/t/p/w600_and_h900_bestv2/yTZQkSsxUFJZJe67IenRM0AEklc.jpg", "7.1", getResources().getString(R.string.simpson_runtime), "https://image.tmdb.org/t/p/original/f5uNbUC76oowt5mt5J9QlqrIYQ6.jpg", "https://image.tmdb.org/t/p/h30/1DSpHrWyOORkL9N2QHX7Adt31mQ.png", " "));

        movieItems.add(new Movies("13 Reasons Why", getResources().getString(R.string.why_overview),
                getResources().getString(R.string.why_date), "(2017)", getResources().getString(R.string.genres_mystery), "https://image.tmdb.org/t/p/w600_and_h900_bestv2/nel144y4dIOdFFid6twN5mAX9Yd.jpg", "7.1", getResources().getString(R.string.why_runtime), "https://image.tmdb.org/t/p/original/sZb21d6EWKAEKZ9GrLQeMwX4cWN.jpg", "https://image.tmdb.org/t/p/h30/wwemzKWzjKYJFfCeiB57q3r4Bcm.png", " "));

        movieItems.add(new Movies("Cannon Busters", getResources().getString(R.string.canon_overview),
                getResources().getString(R.string.canon_date), "(2019)", getResources().getString(R.string.genres_animation), "https://image.tmdb.org/t/p/w600_and_h900_bestv2/etU8k5nzNG0HfIIDGcM5TP4HAWS.jpg", "6.0", getResources().getString(R.string.canon_runtime), "https://image.tmdb.org/t/p/original/cOCaCBTlnCsCgr0i0acuE52cDvo.jpg", "https://image.tmdb.org/t/p/h30/wwemzKWzjKYJFfCeiB57q3r4Bcm.png", " "));

        movieItems.add(new Movies("Gotham", getResources().getString(R.string.gotham_overview),
                getResources().getString(R.string.gotham_date), "(2014)", getResources().getString(R.string.genres_fantasy), "https://image.tmdb.org/t/p/w600_and_h900_bestv2/4XddcRDtnNjYmLRMYpbrhFxsbuq.jpg", "6.9", getResources().getString(R.string.gotham_runtime), "https://image.tmdb.org/t/p/original/bRFmBU0VPr9s1oeJHuS5Zb5nZQS.jpg", "https://image.tmdb.org/t/p/h30/1DSpHrWyOORkL9N2QHX7Adt31mQ.png", " "));

        movieItems.add(new Movies("Grey's Anatomy", getResources().getString(R.string.grey_overview),
                getResources().getString(R.string.grey_date), "(2005)", getResources().getString(R.string.genres_drama), "https://image.tmdb.org/t/p/w600_and_h900_bestv2/eqgIOObafPJitt8JNh1LuO2fvqu.jpg", "6.3", getResources().getString(R.string.grey_runtime), "https://image.tmdb.org/t/p/original/edmk8xjGBsYVIf4QtLY9WMaMcXZ.jpg", "https://image.tmdb.org/t/p/h30/ndAvF4JLsliGreX87jAc9GdjmJY.png", " "));

        movieItems.add(new Movies("Naruto Shippūden", getResources().getString(R.string.naruto_overview),
                getResources().getString(R.string.naruto_date), "(2017)", getResources().getString(R.string.genres_animation), "https://image.tmdb.org/t/p/w600_and_h900_bestv2/y600umqCiIlfPo4kJM6gnzbD3EE.jpg", "7.5", getResources().getString(R.string.naruto_runtime), "https://image.tmdb.org/t/p/original/mVMAzqnqmBRhep2H22ieYzUSdOW.jpg", "https://image.tmdb.org/t/p/h30/kGRavMqgyx4p2X4C96bjRCj50oI.png", " "));


    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        initRecyclerView(view);

    }

    /**
     * initialize RecyclerView into Fragment
     *
     * @param view
     */
    private void initRecyclerView(View view) {
        RecyclerView recyclerView = view.findViewById(R.id.recycler_tv);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        AdapterTv adapterTv = new AdapterTv(movieItems);
        recyclerView.setAdapter(adapterTv);

    }


}
