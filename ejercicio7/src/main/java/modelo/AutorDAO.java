/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author lautaro
 */
public class AutorDAO {
    
    public static List<Autor> autores = new ArrayList<>();
    
    
    
    public static void init (){
        //lista de autores y libros e inicializacion de cada item del arraylist
        
        // Autor 1
        Autor autor1 = new Autor("GabrielGarciaMarquez",
                Arrays.asList("Cien años de soledad", "El amor en los tiempos del cólera", "Crónica de una muerte anunciada"));
        autores.add(autor1);

        // Autor 2
        Autor autor2 = new Autor("JKRowling",
                Arrays.asList("Harry Potter y la piedra filosofal", "Harry Potter y la cámara secreta", "Harry Potter y el prisionero de Azkaban"));
        autores.add(autor2);

        // Autor 3
        Autor autor3 = new Autor("StephenKing",
                Arrays.asList("El resplandor", "It", "Misery"));
        autores.add(autor3);
    }
    
    public static List<Autor> getAllAutores(){
        return autores;
    }
    
    //funcion para obtener todos los libros del autor
    public static List<String> getLibrosPorAutor(String nombreAutor) {
        for (Autor autor : autores) {
            if (autor.getNombre().toLowerCase().equals(nombreAutor.toLowerCase())) {
                return (autor.getLibros());
            }
        }
        return null;
    }
}
