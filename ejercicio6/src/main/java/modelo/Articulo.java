package modelo;


import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author lautaro
 */
public class Articulo {

    private final int codigo;
    private final String descripcion;
    private final double precioNeto;
    private final double iva;
    private final double total;

    // Constructor
    public Articulo(int codigo, String descripcion, double precioNeto, double iva) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioNeto = precioNeto;
        this.iva = iva;
        this.total = precioNeto * (1 + iva);
    }

    // Métodos getter
    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecioNeto() {
        return precioNeto;
    }

    public double getIva() {
        return iva;
    }

    public double getTotal() {
        return total;
    }

    public int getCodigo() {
        return codigo;
    }

    
}
