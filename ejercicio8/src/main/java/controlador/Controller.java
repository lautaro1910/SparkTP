/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.io.IOException;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import modelo.EquipoDAO;
import modelo.Partido;
import modelo.PartidoDAO;
import org.eclipse.jetty.client.api.Request;
import org.eclipse.jetty.client.api.Response;
import spark.Route;

/**
 *
 * @author lautaro
 */
public class Controller {
    
    // Ruta para obtener todos los partidos
    public static Route getPartidos = (spark.Request req, spark.Response res) -> {
        ObjectMapper mapperObj = new ObjectMapper();
        Partido[] partidos = PartidoDAO.getPartidosAll();
        String jsonStr = mapperObj.writeValueAsString(partidos);
        return jsonStr;
    };
    
    // Ruta para obtener todos los partidos jugados por un equipo
    public static Route getPartidosPorEquipo = (spark.Request req, spark.Response res) -> {
        ObjectMapper mapperObj = new ObjectMapper();
        List<Partido> partidos = PartidoDAO.getPartidoPorEquipo(req.params("equipo"));
        String jsonStr = mapperObj.writeValueAsString(partidos);
        return jsonStr;
    };
    
    // Ruta para obtener todos los partidos jugados por un equipo de local
    public static Route getPartidosPorEquipoLocal = (spark.Request req, spark.Response res) -> {
        ObjectMapper mapperObj = new ObjectMapper();
        List<Partido> partidos = PartidoDAO.getPartidosDeLocal(req.params("equipo"));
        String jsonStr = mapperObj.writeValueAsString(partidos);
        return jsonStr;
    };
    
    // Ruta para obtener todos los partidos que debe jugar VISITANTE
    public static Route getPartidosVisitante = (spark.Request req, spark.Response res) -> {
        ObjectMapper mapperObj = new ObjectMapper();
        List<Partido> partidos = PartidoDAO.getPartidosPorJugarVisitante(req.params("equipo"));
        String jsonStr = mapperObj.writeValueAsString(partidos);
        return jsonStr;
    };
    
    // Ruta para obtener cantidad de partidos ganados
    public static Route getPartidosGanadosEquipo = (spark.Request req, spark.Response res) -> {
        ObjectMapper mapperObj = new ObjectMapper();
        int cantPartidos = EquipoDAO.getPartidosGanados(req.params("equipo"), PartidoDAO.partidos);
        String ret = "La cantidad de partidos ganados por el equipo " + req.params("equipo") + " es de: " + cantPartidos;
        String jsonStr = mapperObj.writeValueAsString(ret);
        return jsonStr;
    };
    
    // Ruta para obtener cantidad de partidos ganados
    public static Route getGolesPorEquipo = (spark.Request req, spark.Response res) -> {
        ObjectMapper mapperObj = new ObjectMapper();
        int cantGoles = EquipoDAO.getGolesEquipo(req.params("equipo"), PartidoDAO.partidos);
        String ret = "La cantidad de goles convertidos por el equipo " + req.params("equipo") + " es de: " + cantGoles;
        String jsonStr = mapperObj.writeValueAsString(ret);
        return jsonStr;
    };

}
