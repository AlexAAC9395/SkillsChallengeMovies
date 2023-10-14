package com.methaporce.view;

import com.methaporce.model.MovieManager;
import com.methaporce.model.MovieManagerInterface;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MovieManagerInterface manager = new MovieManager();
        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");
        int option;
        System.out.println("---------------------------");
        System.out.println("Sofware - Controller Movies");
        System.out.println("---------------------------");
        do{
            System.out.println("\nDigite una opcion, por favor");
            System.out.println("1. Iniciar control de peliculas");
            System.out.println("2.Agregar pelicula");
            System.out.println("3. Listar peliculas");
            System.out.println("4. Buscar pelicula");
            System.out.println("5. Salir");
            System.out.println("Seleccione una opcion: ");
            option = teclado.nextInt();

            System.out.println("");

            switch (option){
                case 1:
                    manager.startMovieControl();
                    break;
                case 2:
                    System.out.println("Digite el nombre de la pelicula: ");
                    String nameMovie = teclado.next();
                    manager.addMovie(nameMovie);
                    System.out.println("Pelicula agregada con exito");
                    break;
                case 3:
                    System.out.println("");
                    manager.listarMovie();
                    break;
                case 4:
                    System.out.println("");
                    System.out.println("Digite la pelicula a buscar : ");
                    String searchMovie = teclado.next();
                    manager.searchMovie(searchMovie);
                    System.out.println("Pelicula encontrada con exito");
                    break;
                case 5:
                    System.out.println("");
                    System.out.println("------------------------------------");
                    System.out.println("Gracias por participar, hasta pronto");
                    System.out.println("------------------------------------");
                    option = 5;
                    break;

                default:
                    System.out.println("");
                    System.out.println("---------------------------------------");
                    System.out.println("Opcion no disponible, vuelva a intentar");
                    System.out.println("---------------------------------------");
                    break;
            }
        }
        while (option != 5);
    }
}