package com.methaporce.model;

public interface MovieManagerInterface {

    String NAME_RESOURCE = "movies.txt";
    public void addMovie(String nameMovie);
    public void listarMovie();
    public void searchMovie(String movieSearch);
    public void startMovieControl();
}
