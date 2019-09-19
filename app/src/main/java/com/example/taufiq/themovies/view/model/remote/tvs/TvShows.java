package com.example.taufiq.themovies.view.model.remote.tvs;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created By Taufiq on 9/13/2019.
 */
public class TvShows {

    @SerializedName("page")
    @Expose
    private int page;

    @SerializedName("total_result")
    @Expose
    private int total_result;

    @SerializedName("results")
    @Expose
    private List<Tv_Result> movie_results;

    public class Tv_Result {

        @SerializedName("original_name")
        @Expose
        private String originalName;
        @SerializedName("genre_ids")
        @Expose
        private List<Integer> genreIds = null;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("popularity")
        @Expose
        private Double popularity;
        @SerializedName("origin_country")
        @Expose
        private List<String> originCountry;
        @SerializedName("vote_count")
        @Expose
        private Integer voteCount;
        @SerializedName("first_air_date")
        @Expose
        private String firstAirDate;
        @SerializedName("backdrop_path")
        @Expose
        private String backdropPath;
        @SerializedName("original_language")
        @Expose
        private String originalLanguage;
        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("vote_average")
        @Expose
        private Double voteAverage;
        @SerializedName("overview")
        @Expose
        private String overview;
        @SerializedName("poster_path")
        @Expose
        private String posterPath;

        public String getOriginalName() {
            return originalName;
        }

        public void setOriginalName(String originalName) {
            this.originalName = originalName;
        }

        public List<Integer> getGenreIds() {
            return genreIds;
        }

        public void setGenreIds(List<Integer> genreIds) {
            this.genreIds = genreIds;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Double getPopularity() {
            return popularity;
        }

        public void setPopularity(Double popularity) {
            this.popularity = popularity;
        }

        public List<String> getOriginCountry() {
            return originCountry;
        }

        public void setOriginCountry(List<String> originCountry) {
            this.originCountry = originCountry;
        }

        public Integer getVoteCount() {
            return voteCount;
        }

        public void setVoteCount(Integer voteCount) {
            this.voteCount = voteCount;
        }

        public String getFirstAirDate() {
            return firstAirDate;
        }

        public void setFirstAirDate(String firstAirDate) {
            this.firstAirDate = firstAirDate;
        }

        public String getBackdropPath() {
            return backdropPath;
        }

        public void setBackdropPath(String backdropPath) {
            this.backdropPath = backdropPath;
        }

        public String getOriginalLanguage() {
            return originalLanguage;
        }

        public void setOriginalLanguage(String originalLanguage) {
            this.originalLanguage = originalLanguage;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Double getVoteAverage() {
            return voteAverage;
        }

        public void setVoteAverage(Double voteAverage) {
            this.voteAverage = voteAverage;
        }

        public String getOverview() {
            return overview;
        }

        public void setOverview(String overview) {
            this.overview = overview;
        }

        public String getPosterPath() {
            return posterPath;
        }

        public void setPosterPath(String posterPath) {
            this.posterPath = posterPath;
        }
    }

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

    public List<Tv_Result> getMovie_results() {
        return movie_results;
    }

    public void setMovie_results(List<Tv_Result> movie_results) {
        this.movie_results = movie_results;
    }
}
