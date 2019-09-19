package com.example.taufiq.themovies.view.model.remote.movies;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By Taufiq on 9/13/2019.
 */
public class Movie {

    @SerializedName("page")
    @Expose
    private int page;

    @SerializedName("total_result")
    @Expose
    private int total_result;

    @SerializedName("results")
    @Expose
    private ArrayList<MovieResult> movie_results;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotal_result() {
        return total_result;
    }

    public void setTotal_result(int total_result) {
        this.total_result = total_result;
    }

    public ArrayList<MovieResult> getMovie_results() {
        return movie_results;
    }

    public void setMovie_results(ArrayList<MovieResult> movie_results) {
        this.movie_results = movie_results;
    }
}
