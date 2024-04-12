package modelo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lautaro
 */
public class Inflacion {
    
    public static final double INFPROP = 20.6;
    
    public static double CalcularInflacion (int monto, int meses){
        double tasaInflacion = INFPROP / 100;
        double ret = monto * Math.pow(1 + tasaInflacion, meses);
        return ret;
    }
}
