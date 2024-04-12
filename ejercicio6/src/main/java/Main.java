/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lautaro
 */
import controlador.Controller;
import modelo.ArticuloDAO;
import static spark.Spark.*;

public class Main {

    public static void main(String[] args) {
        //port(4567); //lo pongo por las dudas, porque no me anda a veces

        //Articulo[] articulos = new Articulo[4];
        //Articulo.CrearArticulosRandom(articulos); //en otro ejercicio lo hice al reves, lo puse en controller. Consultar como se hace
        //pase lo de arriba porque lo necesitaba en Controlador
        
        ArticuloDAO.init();
        

        // Ruta para trabajar con la palabra ingresada por el usuario
        get("/devolverArticulo/:codigo", Controller.devolverArticulo);

        //awaitInitialization();
        //System.out.println("Servicio REST iniciado en http://localhost:4567");
    }
}
