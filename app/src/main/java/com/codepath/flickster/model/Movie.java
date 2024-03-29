package com.codepath.flickster.model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    String posterPath;
    String title;
    String overview;
    String backdropPath;
    String voteAverage;
    String movieId;

    public Movie(JSONObject jsonObject) throws JSONException {
        posterPath=jsonObject.getString("poster_path");
        title=jsonObject.getString("title");
        overview=jsonObject.getString("overview");
        backdropPath=jsonObject.getString("backdrop_path");
        voteAverage=jsonObject.getString("vote_average");
        movieId=jsonObject.getString("id");
    }

    public static List<Movie> fromJSONArray(JSONArray moviejsonArray) throws JSONException {
        List<Movie> movies=new ArrayList<>();
        for (int i=0;i<moviejsonArray.length();i++){
            movies.add(new Movie(moviejsonArray.getJSONObject(i)));
        }
        return movies;
    }

    public String getPosterPath() {
        return String.format("https://image.tmdb.org/t/p/w342/ %s" ,posterPath);
    }

    public String getTitle() {
        return title;
    }

    public String getOverview() {
        return overview;
    }

    public String getBackdropPath() {
        return String.format("https://image.tmdb.org/t/p/w342/ %s" ,backdropPath);    }

    public String getVoteAverage() {
        return voteAverage;
    }

    public String getMovieId() {
        return movieId;
    }
}
