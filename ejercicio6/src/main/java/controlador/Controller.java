/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Articulo;
import spark.Request;
import spark.Response;
import spark.Route;
import java.io.IOException;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import modelo.ArticuloDAO;

/**
 *
 * @author lautaro
 */
public class Controller {
    
    // Ruta para trabajar con la palabra ingresada por el usuario
    public static Route devolverArticulo = (Request req, Response res) -> {
        int cod = Integer.parseInt(req.params("codigo"));
        ObjectMapper mapperObj = new ObjectMapper();
        Articulo ret = ArticuloDAO.getArticulo(cod, ArticuloDAO.getAllArticulos());
        String jsonStr = mapperObj.writeValueAsString(ret);
        
        return jsonStr;
    };
}
