/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.SpecialNumbers;
import spark.Request;
import spark.Response;
import spark.Route;

/**
 *
 * @author lautaro
 */
public class Controller {

    // Ruta para trabajar con la palabra ingresada por el usuario
    public static Route returnNumbers = (Request req, Response res) -> {
        String palabra = req.params("palabra");
        boolean isSpecialNumber = SpecialNumbers.validarOpcion(palabra);
        if (isSpecialNumber) {
            String ret = SpecialNumbers.getSpecialNumber(palabra);
            return ret;
        } else {
            return "Se ingreso una palabra invalida";
        }
    };
}
