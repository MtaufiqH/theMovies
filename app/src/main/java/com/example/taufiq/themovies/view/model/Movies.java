package com.example.taufiq.themovies.view.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created By Taufiq on 8/26/2019.
 */
public class Movies implements Parcelable {

    private String movieTitle;
    private String overviewMovies;
    private String dateRelease;
    private String yearRelease;
    private String genres;
    private String poster;
    private String ratingScore;
    private String runtime;
    private String background;
    private String network;
    private String status;

    public Movies(String movieTitle, String overviewMovies, String dateRelease, String yearRelease, String genres, String poster, String ratingScore, String runtime, String background, String network, String status) {
        this.movieTitle = movieTitle;
        this.overviewMovies = overviewMovies;
        this.dateRelease = dateRelease;
        this.yearRelease = yearRelease;
        this.genres = genres;
        this.poster = poster;
        this.ratingScore = ratingScore;
        this.runtime = runtime;
        this.background = background;
        this.network = network;
        this.status = status;
    }

    protected Movies(Parcel in) {
        movieTitle = in.readString();
        overviewMovies = in.readString();
        dateRelease = in.readString();
        yearRelease = in.readString();
        genres = in.readString();
        poster = in.readString();
        ratingScore = in.readString();
        runtime = in.readString();
        background = in.readString();
        network = in.readString();
        status = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(movieTitle);
        dest.writeString(overviewMovies);
        dest.writeString(dateRelease);
        dest.writeString(yearRelease);
        dest.writeString(genres);
        dest.writeString(poster);
        dest.writeString(ratingScore);
        dest.writeString(runtime);
        dest.writeString(background);
        dest.writeString(network);
        dest.writeString(status);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Movies> CREATOR = new Creator<Movies>() {
        @Override
        public Movies createFromParcel(Parcel in) {
            return new Movies(in);
        }

        @Override
        public Movies[] newArray(int size) {
            return new Movies[size];
        }
    };

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getOverviewMovies() {
        return overviewMovies;
    }

    public void setOverviewMovies(String overviewMovies) {
        this.overviewMovies = overviewMovies;
    }

    public String getDateRelease() {
        return dateRelease;
    }

    public void setDateRelease(String dateRelease) {
        this.dateRelease = dateRelease;
    }

    public String getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(String yearRelease) {
        this.yearRelease = yearRelease;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getRatingScore() {
        return ratingScore;
    }

    public void setRatingScore(String ratingScore) {
        this.ratingScore = ratingScore;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}