/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import static spark.Spark.init;

/**
 *
 * @author lautaro
 */
public class PersonaDAO {

    //esto podria ir al DAO
    private static Map<String, List<String>> personasArray = new HashMap<>();
    
    //creo el map y seteo algunas personas en memoria
    public static Map<String, List<String>> init() {
        // elementos en memoria
        Persona.registrarPersona("Pablo", null, personasArray);
        Persona.registrarPersona("David", "Pablo", personasArray);
        Persona.registrarPersona("Sofía", "Pablo", personasArray);
        Persona.registrarPersona("Ana", "David", personasArray);
        Persona.registrarPersona("Juan", "David", personasArray);
        Persona.registrarPersona("María", "Sofía", personasArray);
        Persona.registrarPersona("Pedro", "Sofía", personasArray);
        return personasArray;
    }
    
    public static Set<String> getP() {
        return personasArray.keySet();
    }

    public static List<String> getHijos(String nombre) {
        List<String> hijos = personasArray.getOrDefault(nombre, new ArrayList<>());
        return hijos;
    }

    public static List<String> getNietos(String nombre) {
        List<String> nietos = new ArrayList<>();
        List<String> hijos = personasArray.getOrDefault(nombre, new ArrayList<>());
        for (String hijo : hijos) {
            nietos.addAll(personasArray.getOrDefault(hijo, new ArrayList<>()));
        }
        return nietos;
    }
}
