package modelo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lautaro
 */
public class Radio {
    public static final double PI = 3.14159265358979323846;

    public static double retPerimtro(double radio) {
        return (2 * PI * radio);
    }

    public static double retArea(double radio){
        return (PI * (radio*radio));
    }
}
