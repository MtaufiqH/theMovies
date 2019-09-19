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
        return inflater.inflate(R.layout.fragment_tv, container, false);
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
