/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lautaro
 */
import controlador.Controller;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import modelo.Persona;
import modelo.PersonaDAO;
import static spark.Spark.*;

public class Main { 
    
    public static void main(String[] args) {
        //port(4567); //lo pongo por las dudas, porque no me anda a veces 
        
        PersonaDAO.init();
        
        // obtener las personas registradas
        get("/personas", Controller.personas);

        // obtener los hijos de una persona
        get("/persona/:nombre/hijos", Controller.getHijos);

        // obtener los nietos de una persona
        get("/persona/:nombre/nietos", Controller.getNietos);

        //awaitInitialization();
        //System.out.println("Servicio REST iniciado en http://localhost:4567");
    }
}
