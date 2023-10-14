package com.methaporce.model;

import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class DataAccessImplementation implements DataAccessInterface {

    @Override
    public Boolean CheckIfFileExists(String ResourceName) throws DataAccessExceptions {
        File archive = new File(ResourceName);
        return archive.exists();
    }

    @Override
    public List<Movies> Listar(String ResourceName) throws ReadingAccessDataExceptions {
        File archive = new File(ResourceName);
        List<Movies> peliculas = new ArrayList<>();
        try {

            BufferedReader entity = new BufferedReader(new FileReader(archive));
            String content = null;
            content = entity.readLine();

            while (content != null) {
                Movies movie= new Movies(content);
                peliculas.add(movie);
                content = entity.readLine();
            }
            entity.close();
        } catch (IOException exception) {
            exception.printStackTrace(System.out);
            throw new ReadingAccessDataExceptions("Excepción al listar peliculas : " + exception.getMessage());
        }
        return peliculas;
    }

    @Override
    public void Write(Movies movies, String ResourceName, Boolean Append) throws WritingAccessDataExceptions {
        File archive = new File(ResourceName);
        try{
            PrintWriter exit = new PrintWriter(new FileWriter(archive,Append));
            exit.println(movies.toString());
            exit.close();
        }
        catch (IOException exception){
            exception.printStackTrace(System.out);
            throw new WritingAccessDataExceptions("Excepción al escribir en el archivo :" + exception.getMessage());
        }
    }

    @Override
    public String Search(String ResourceName, String Search) throws ReadingAccessDataExceptions {
        File archive = new File(ResourceName);
        String result = null;
        try {
            BufferedReader entity = new BufferedReader(new FileReader(archive));
            String line = null;
            line = entity.readLine();
            int index = 1;

            while (line != null) {
                if (Search != null && Search.equalsIgnoreCase(line)) {
                    System.out.println(" ");
                    result = " Pelicula " + line + "encontrada en el indice" + index;
                    break;
              }
                line = entity.readLine();
                index ++;
            }
            entity.close();
        }
        catch (IOException exception){
            exception.printStackTrace(System.out);
            throw new ReadingAccessDataExceptions("Excepción buscar al buscar la pelicula : " + exception.getMessage());
        }
        return result;
    }

    @Override
    public void Create(String ResourceName) throws DataAccessExceptions {
        File archive = new File(ResourceName);
        try{
            PrintWriter exit = new PrintWriter(new FileWriter(archive));
            exit.close();
            System.out.println("Se ha creado el archivo con exito");
        }
        catch (IOException exception){
           exception.printStackTrace(System.out);
           throw new DataAccessExceptions("Excepción al crear archivo: " + exception.getMessage());
        }
    }

    @Override
    public void Delete(String ResourceName) throws DataAccessExceptions {
        File archive  = new File(ResourceName);
        if (archive.exists()){
            archive.delete();
        }
        System.out.println("Se ha borrado el archivo");
    }
}
