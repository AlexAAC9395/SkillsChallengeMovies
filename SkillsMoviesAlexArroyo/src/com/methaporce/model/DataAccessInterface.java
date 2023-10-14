package com.methaporce.model;

import java.util.List;

public interface DataAccessInterface {
    //Se crean los métodos necesarios para ejecutar operaciones al archivo
    public Boolean CheckIfFileExists(String ResourceName) throws DataAccessExceptions;
    public List<Movies> Listar (String ResourceName) throws ReadingAccessDataExceptions;
    public void Write(Movies movies, String ResourceName, Boolean Append) throws WritingAccessDataExceptions;
    public String Search (String ResourceName, String Search) throws ReadingAccessDataExceptions;
    public void Create (String ResourceName) throws DataAccessExceptions;
    public void Delete(String ResourceName) throws DataAccessExceptions;
}
