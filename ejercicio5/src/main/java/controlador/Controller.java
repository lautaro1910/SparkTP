/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Inflacion;
import spark.Request;
import spark.Response;
import spark.Route;
import static spark.Spark.post;
import java.io.IOException;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 *
 * @author lautaro
 */
public class Controller {

    // Ruta para trabajar con la palabra ingresada por el usuario
    public static Route calcularInflacion = (Request req, Response res) -> {
     
        int monto = Integer.parseInt(req.params("monto"));
        int meses = Integer.parseInt(req.params("meses"));
        double ret = Math.round(Inflacion.CalcularInflacion(monto, meses) * 100.0) / 100.0;
        return "El valor esperado para $" + monto + " en " + meses + " meses es de: " + ret + " ";
        
        
    };
}
