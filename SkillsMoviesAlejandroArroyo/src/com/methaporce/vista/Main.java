package com.methaporce.vista;

import com.methaporce.modelo.Pelicula;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pelicula p1 = new Pelicula(1, "Hachiko", false);
        Pelicula p2 = new Pelicula(2, "Cadena Perpetua", true);
        Pelicula p3 = new Pelicula(3, "El padrino", true);
        Pelicula p4 = new Pelicula(4, "El caballero oscuro", true);
        Pelicula p5 = new Pelicula(5, "El padrino Parte II", false);
        Pelicula p6 = new Pelicula(6, "12 hombres sin piedad", true);
        Pelicula p7 = new Pelicula(7, "La lista de Schindler", false);
        Pelicula p8 = new Pelicula(8, "El señor de los anillos El retorno del rey", true);
        Pelicula p9 = new Pelicula(9, "Pulp Fiction", false);
        Pelicula p10 = new Pelicula(10, "El señor de los anillos La comunidad del anillo", true);
        Pelicula p11 = new Pelicula(11, "El bueno, el feo y el malo", false);
        Pelicula p12 = new Pelicula(12, "Forrest Gump", true);
        Pelicula p13 = new Pelicula(13, "El club de la lucha", true);
        Pelicula p14 = new Pelicula(14, "El señor de los anillos Las dos torres", false);
        Pelicula p15 = new Pelicula(15, "Origen", false);
        Pelicula p16 = new Pelicula(16, "Star Wars El imperio contraataca", false);
        Pelicula p17 = new Pelicula(17, "Matrix", true);
        Pelicula p18 = new Pelicula(18, "Uno de los nuestros", false);
        Pelicula p19 = new Pelicula(19, "Alguien voló sobre el nido del cuco", true);
        Pelicula p20 = new Pelicula(20, "Seven", false);
        Pelicula p21 = new Pelicula(21, "Los siete samuráis", true);
        Pelicula p22 = new Pelicula(22, "Qué bello es vivir ", false);
        Pelicula p23 = new Pelicula(23, "El silencio de los corderos", false);
        Pelicula p24 = new Pelicula(24, "Ciudad de Dios", false);
        Pelicula p25 = new Pelicula(25, "Salvar al soldado Ryan", false);
        Pelicula p26 = new Pelicula(26, "La vida es bella", false);
        Pelicula p27 = new Pelicula(27, "Interstellar", false);
        Pelicula p28 = new Pelicula(28, "La milla verde", true);
        Pelicula p29 = new Pelicula(29, "Regreso al futuro", true);
        Pelicula p30 = new Pelicula(30, "El viaje de Chihiro", true);
        //Crear una lista de peliculas
        List<Pelicula> movies = new ArrayList<>();
        movies.add(p1);
        movies.add(p2);
        movies.add(p3);
        movies.add(p4);
        movies.add(p5);
        movies.add(p6);
        movies.add(p7);
        movies.add(p8);
        movies.add(p9);
        movies.add(p10);
        movies.add(p11);
        movies.add(p12);
        movies.add(p13);
        movies.add(p14);
        movies.add(p15);
        movies.add(p16);
        movies.add(p17);
        movies.add(p18);
        movies.add(p19);
        movies.add(p20);
        movies.add(p21);
        movies.add(p22);
        movies.add(p23);
        movies.add(p24);
        movies.add(p25);
        movies.add(p26);
        movies.add(p27);
        movies.add(p28);
        movies.add(p29);
        movies.add(p30);

        //Se obtiene la lista completa y se imprime en consola
        System.out.println(" ");
        System.out.println("---------------------------------------------------------- ");
        System.out.println("                  Mostrar lista de peliculas               ");
        System.out.println("---------------------------------------------------------- ");
        for (Pelicula p : movies) {
            System.out.println(p.toString());
        }

        //Se cuenta el número de elementos de la lista y se imprime en consola
        int size = movies.size();
        System.out.println(" ");
        System.out.println("---------------------------------------------------------- ");
        System.out.println("               El número de elementos es de " + size);
        System.out.println("---------------------------------------------------------- ");

        // Muestra la lista de las peliculas no disponibles y las imprime en consola
        System.out.println(" ");
        System.out.println("---------------------------------------------------------- ");
        System.out.println("         Mostrar lista de peliculas no disponibles         ");
        System.out.println("---------------------------------------------------------- ");
        for (Pelicula p : movies) {
            if (p.getDisponible() == false) {
                System.out.println(p);
            }
        }

        // Muestra la lista de las peliculas disponibles y las imprime en consola
        System.out.println(" ");
        System.out.println("---------------------------------------------------------- ");
        System.out.println("         Mostrar lista de peliculas disponibles         ");
        System.out.println("---------------------------------------------------------- ");
        for (Pelicula p : movies) {
            if (p.getDisponible() == true) {
                System.out.println(p);
            }
        }
        //Marca pelicula disponible de acuerdo al Id especificado y se muestra en la consola
        System.out.println(" ");
        System.out.println("---------------------------------------------------------- ");
        System.out.println("Muestra pelicula disponible de acuerdo al Id(0) especificado");
        System.out.println("---------------------------------------------------------- ");
        movies.get(5);
        for (Pelicula activa : movies) {
            if (activa.getDisponible() == true) {
                System.out.println("Se encuentra activa " + activa);
            }
            else {
                System.out.println("Se encuentra inactiva");
            }
        }
        //Se elimina una pelicula en base al Id especificado y se muestra la lista nueva en consola
        System.out.println(" ");
        System.out.println("---------------------------------------------------------- ");
        System.out.println("  Muestra lista actualizada eliminando el Id(0) especificado  ");
        System.out.println("---------------------------------------------------------- ");
        movies.remove(0);
        for (Pelicula delete : movies) {
            System.out.println(delete);
        }
        //Se elimina una pelicula en base al Id ingresado por el usuario y se muestra la lista nueva en consola
        System.out.println(" ");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Muestra lista actualizada eliminando el Id especificado por el usuario");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("---------------------------------------------------------- ");
        System.out.println("              Ingrese una posición a eliminar              ");
        System.out.println("---------------------------------------------------------- ");
        int posDelete = sc.nextInt();
        movies.remove(posDelete);
        for (Pelicula delete : movies) {
            System.out.println(delete);
        }
    }
}