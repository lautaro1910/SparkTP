
import controlador.Controller;
import java.util.List;
import modelo.Autor;
import static spark.Spark.get;
import static spark.Spark.post;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Arrays;
import modelo.AutorDAO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author lautaro
 */
public class Main {

    public static void main(String[] args) {
        //port(4567); //lo pongo por las dudas, porque no me anda a veces

        AutorDAO.init();
        
        // Ruta para trabajar con la palabra ingresada por el usuario
        get("/devolverLibros/:autor", Controller.devolverLibros);

        //awaitInitialization();
        //System.out.println("Servicio REST iniciado en http://localhost:4567");
    }
}
