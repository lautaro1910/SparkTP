/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author lautaro
 */
public class Equipo {
    String nombre;
    int cantidadPartidosGanados;
    int cantidadGoles;

    public Equipo(String nombre, int cantidadPartidosGanados, int cantidadGoles) {
        this.nombre = nombre;
        this.cantidadPartidosGanados = cantidadPartidosGanados;
        this.cantidadGoles = cantidadGoles;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadPartidosGanados() {
        return cantidadPartidosGanados;
    }

    public void setCantidadPartidosGanados(int cantidadPartidosGanados) {
        this.cantidadPartidosGanados = cantidadPartidosGanados;
    }

    public int getCantidadGoles() {
        return cantidadGoles;
    }

    public void setCantidadGoles(int cantidadGoles) {
        this.cantidadGoles = cantidadGoles;
    }
    
    
}
