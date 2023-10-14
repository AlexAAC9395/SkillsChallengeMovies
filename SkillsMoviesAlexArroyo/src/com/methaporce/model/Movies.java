package com.methaporce.model;

public class Movies {
    private int Id;
    private String Name;
    private Boolean Available;

    //Agregar atributos
    public Movies() {
    }
    public Movies(int Id) {
        this.Id = Id;
    }
    public Movies(String Name) {
        this.Name = Name;
    }
    public Movies(Boolean Available) {
        this.Available = Available;
    }
    //Agregar Get y Set
    public int getId() {
        return Id;
    }
    public String getName() {
        return Name;
    }
    public Boolean getAvailable() {
        return Available;
    }
    public void setId(int id) {
        this.Id = Id;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public void setAvailable(Boolean Available) {
        this.Available = Available;
    }

    @Override
    public String toString() {
        return Name;
    }
}
