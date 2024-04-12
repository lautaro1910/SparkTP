/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Radio;
import spark.Request;
import spark.Response;
import spark.Route;

/**
 *
 * @author lautaro
 */
public class Controller {

    public static Route devolverRadio = (Request req, Response res) -> {
        int radio = Integer.parseInt(req.params("radio"));
        double perimetroRet = Radio.retPerimtro(radio);
        double areaRet = Radio.retArea(radio);
        return "Radio: '" + radio + "'<br>Area: '" + areaRet + "'<br>Perimetro: '" + perimetroRet + "'";
    };
}
