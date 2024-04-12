/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import modelo.Persona;
import modelo.PersonaDAO;
import spark.Request;
import spark.Response;
import spark.Route;
import java.io.IOException;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Set;

/**
 *
 * @author lautaro
 */
public class Controller {

    

    public static void controller() {
        
    }

    // obtener las personas registradas
    public static Route personas = (Request req, Response res) -> {
        Set<String> p = PersonaDAO.getP();
        ObjectMapper mapperObj = new ObjectMapper();
        String jsonStr = mapperObj.writeValueAsString(p);
        return jsonStr;
    };

    public static Route getHijos = (Request req, Response res) -> {
        List<String> p = PersonaDAO.getHijos(req.params("nombre"));
        ObjectMapper mapperObj = new ObjectMapper();
        String jsonStr = mapperObj.writeValueAsString(p);
        return jsonStr;
    };

    public static Route getNietos = (Request req, Response res) -> {
        List<String> p = PersonaDAO.getNietos(req.params("nombre"));
        ObjectMapper mapperObj = new ObjectMapper();
        String jsonStr = mapperObj.writeValueAsString(p); 
        return jsonStr;
    };

}
