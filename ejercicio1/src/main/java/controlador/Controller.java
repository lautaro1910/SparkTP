/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Modelo;
import spark.Route;
import java.io.IOException;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 *
 * @author lautaro
 */
public class Controller {

    public static Route checkPalindromo = (req, res) -> {
        ObjectMapper mapperObj = new ObjectMapper();
        String palabra = req.params(":palabra");
        String ret;
        boolean isPalindrome = Modelo.testPalindromo(palabra);
        if (isPalindrome) {
            ret = "La palabra '" + palabra + "' es un palíndromo";
        } else {
            ret = "La palabra '" + palabra + "' no es un palíndromo";
        }
        String jsonStr = mapperObj.writeValueAsString(ret);
        return jsonStr;
    };

}
