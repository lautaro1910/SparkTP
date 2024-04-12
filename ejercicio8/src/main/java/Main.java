
import controlador.Controller;
import modelo.EquipoDAO;
import modelo.PartidoDAO;
import static spark.Spark.get;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lautaro
 */
public class Main {
    public static void main(String[] args) {
        //port(4567); //lo pongo por las dudas, porque no me anda a veces

        EquipoDAO.init();
        PartidoDAO.init();
        
        
        // obtener todos los partidos
        get("/partidos", Controller.getPartidos);
        
        // obtener los partidos jugados por un equipo dado
        get("/partidos/:equipo/getPartidosJugados", Controller.getPartidosPorEquipo);
        
        // obtener equipos con los que jugo de local
        get("/partidos/:equipo/getPartidosLocal", Controller.getPartidosPorEquipoLocal);
        
        // obtener jugar de visitante
        get("/partidos/:equipo/getDeVisitante", Controller.getPartidosVisitante);
        
        // obtener cantidad de partidos ganados por un equipo
        get("/partidos/:equipo/getPartidosGanados", Controller.getPartidosGanadosEquipo);
        
        // obtener cantidad de goles convertidos por equipo
        get("/partidos/:equipo/getGoles", Controller.getGolesPorEquipo);

        //awaitInitialization();
        //System.out.println("Servicio REST iniciado en http://localhost:4567");
    }    
}
