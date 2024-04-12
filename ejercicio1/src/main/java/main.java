/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lautaro
 */

import controlador.Controller;
import modelo.Modelo;
import static spark.Spark.*;

public class main {

    public static void main(String[] args) {
        //port(4567); //lo pongo por las dudas, porque no me anda a veces

        
        // Ruta para trabajar con la palabra ingresada por el usuario
        get("/palindromo/:palabra/checkPalindromo", Controller.checkPalindromo);
        
        
        //awaitInitialization();
        //System.out.println("Servicio REST iniciado en http://localhost:4567");
    }
}

