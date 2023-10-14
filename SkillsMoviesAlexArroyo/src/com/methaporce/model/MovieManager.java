package com.methaporce.model;

import java.util.List;

public class MovieManager implements MovieManagerInterface {

    private final DataAccessInterface data;

    public MovieManager(){
        this.data = new DataAccessImplementation();
    }
    @Override
    public void addMovie(String nameMovie) {
        Movies movie = new Movies(nameMovie);
        Boolean append = false;
        try{
            append = data.CheckIfFileExists(NAME_RESOURCE);
            data.Write(movie,NAME_RESOURCE,append);
        }
        catch (DataAccessExceptions exceptions){
            System.out.println("\nError de acceso a datos");
            exceptions.printStackTrace(System.out);
        }
    }

    @Override
    public void listarMovie() {
        try{
           List<Movies> movie = this.data.Listar(NAME_RESOURCE);
           for (Movies movies : movie){
               System.out.println("Pelicula : " + movies);
           }
        }
        catch (DataAccessExceptions exceptions){
            System.out.println("\nError de acceso a datos");
            exceptions.printStackTrace(System.out);
        }
    }

    @Override
    public void searchMovie(String movieSearch) {
        String result = null;
        try{
           result = this.data.Search(NAME_RESOURCE,movieSearch);
        }
        catch (DataAccessExceptions exceptions){
            System.out.println("\nError de acceso a datos");
            exceptions.printStackTrace(System.out);
        }
        if (result == null){
            System.out.println("No se ha encontrado la pelicula");
        }
        else {
            System.out.println("Pelicula encontrada : " + result);
        }
    }

    @Override
    public void startMovieControl() {
        try {
            if(this.data.CheckIfFileExists(NAME_RESOURCE)){
                data.Delete(NAME_RESOURCE);
                data.Create(NAME_RESOURCE);
            }
            else{
                data.Create(NAME_RESOURCE);
            }
        }
        catch (Exception exceptions){
            System.out.println("\nError al iniciar control de peliculas");
            exceptions.printStackTrace(System.out);
        }
    }
}
