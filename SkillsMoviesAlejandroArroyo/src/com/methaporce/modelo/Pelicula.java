package com.methaporce.modelo;

public class Pelicula {
    //Agregar atributos
    private int Id;
    private String Nombre;
    private boolean Disponible;

    //Agregar constructores

    public Pelicula() {
    }
    public Pelicula(int Id, String Nombre, boolean Disponible) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Disponible = Disponible;
    }

    //Agregar Get
    public int getId() {
      return Id;
    }
    public String getNombre() {
        return Nombre;
    }
    public boolean getDisponible() {
        return Disponible;
    }

    //Agregar Set
    public void setId(int Id) {
      this.Id = Id;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public void setDisponible(boolean Disponible) {
        this.Disponible = Disponible;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "Id=" + Id +
                ", Nombre='" + Nombre + '\'' +
                ", Disponible=" + Disponible +
                '}';
    }
}