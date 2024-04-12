/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import modelo.Autor;
import modelo.AutorDAO;
import spark.Request;
import spark.Response;
import spark.Route;

/**
 *
 * @author lautaro
 */
public class Controller {

    // Ruta para trabajar con la palabra ingresada por el usuario
    public static Route devolverLibros = (Request req, Response res) -> {
        ObjectMapper mapperObj = new ObjectMapper();
        String autor = req.params(":autor");
        List<String> ret = AutorDAO.getLibrosPorAutor(autor);
        String jsonStr = mapperObj.writeValueAsString(ret);
        return jsonStr;
    };
}
