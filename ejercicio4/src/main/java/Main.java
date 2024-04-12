/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lautaro
 */
import controlador.Controller;
import modelo.SpecialNumbers;
import static spark.Spark.*;

public class Main {

    public static void main(String[] args) {
        //port(4567); //lo pongo por las dudas, porque no me anda a veces

        // Ruta para trabajar con la palabra ingresada por el usuario
        get("/emergencyNumbers/:palabra", Controller.returnNumbers);

        //awaitInitialization();
        //System.out.println("Servicio REST iniciado en http://localhost:4567");
    }
}
