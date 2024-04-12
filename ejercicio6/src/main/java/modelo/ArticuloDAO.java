/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Random;

/**
 *
 * @author lautaro
 */
public class ArticuloDAO {
    private static Articulo[] articulos = new Articulo[4];
    
    public static void init () {
          CrearArticulosRandom(articulos); // CONSULTAR
    }
    
    public static void CrearArticulosRandom(Articulo[] articulos) {
        for (int i = 0; i < articulos.length; i++) {
            int codigo = 100 + i;
            String descripcion = generarDescripcionAleatoria();
            double precioNeto = generarPrecioNetoAleatorio();
            double iva = 0.21;

            // Crear el artículo y agregarlo al arreglo
            articulos[i] = new Articulo(codigo, descripcion, precioNeto, iva);
        }
    }
    
    public static Articulo[] getAllArticulos(){
        return articulos;
    }

    // funciones auxiliares q necesite
    // descipcion random, poca imaginacion
    public static String generarDescripcionAleatoria() {
        String[] descripciones = {"Articulo A", "Articulo B", "Articulo C", "Articulo D"};
        Random random = new Random();
        return descripciones[random.nextInt(descripciones.length)];
    }

    // precio aleatorio (entre 10 y 10000)
    public static double generarPrecioNetoAleatorio() {
        Random random = new Random();
        return 10 + (10000 - 10) * random.nextDouble();
    }

    //obtener el articulo dado el codigo
    public static Articulo getArticulo(int codigo, Articulo[] articulos) {
        for (Articulo articulo : articulos) {
            if (articulo.getCodigo() == codigo) {
                return articulo;
                //return ImprimirArticulo(articulo);
            }     
        }
        //return "NO EXISTE EL ARTICULO";
        return null;
    }
    
    //codigo q hice antes de que se retorne un articulo como tal. Ya que queria retornar un string
    public static String ImprimirArticulo (Articulo articulo){
        String ret = "";
        ret += "Codigo articulo: " + articulo.getCodigo();
        ret += "Descipcion articulo: " + articulo.getDescripcion();
        ret += "Precio articulo: " + articulo.getPrecioNeto();
        ret += "IVA articulo: " + articulo.getIva();
        ret += "TOTAL articulo: " + articulo.getTotal();
        return ret;
    }
}
