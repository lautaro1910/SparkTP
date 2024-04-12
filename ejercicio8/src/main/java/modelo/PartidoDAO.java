/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lautaro
 */
public class PartidoDAO {
    public static Partido[] partidos;
    
   
    public static void init() {
        
        //partidos jugados
        Partido partido1 = new Partido(true, "boca", "river", 0, 1);
        Partido partido2 = new Partido(true, "racing", "boca", 0, 3);
        Partido partido3 = new Partido(true, "independiente", "boca", 1, 1);
        Partido partido4 = new Partido(true, "independiente", "racing", 2, 2);
        Partido partido5 = new Partido(true, "river", "independiente", 3, 0);
    
        //partidos por jugar
        Partido partido6 = new Partido(false, "river", "boca", 0, 0);
        Partido partido7 = new Partido(false, "boca", "racing", 0, 0);
        
        
        partidos = new Partido[]{partido1, partido2, partido3, partido4, partido5, partido6, partido7};
    }
    
    
    // funcion para devolver todos los partidos
    public static Partido[] getPartidosAll () {
        return partidos;
    }
    
    
    // funcion para devolver todos los partidos jugados por determinado equipo
    public static List<Partido> getPartidoPorEquipo (String equipo){
        ArrayList<Partido> partidosPorEquipo = new ArrayList<>();
        for(Partido partido: partidos){
            if(partido.getEquipoLocal().toLowerCase().equals(equipo.toLowerCase()) || partido.getEquipoVisitante().toLowerCase().equals(equipo.toLowerCase())){
                if(partido.getYaSeJugo() == true){
                    partidosPorEquipo.add(partido);
                }
            }
        }
        return partidosPorEquipo;
    }
    
    // equipos con los que jugó de local.
    public static List<Partido> getPartidosDeLocal (String equipo){
        ArrayList<Partido> partidosDeLocal = new ArrayList<>();
        for(Partido partido: partidos){
            if(partido.getEquipoLocal().toLowerCase().equals(equipo.toLowerCase())){
                if(partido.getYaSeJugo() == true){
                    partidosDeLocal.add(partido);
                }
            }
        }
        return partidosDeLocal;
    }
    
    // equipos con los que debe jugar de visitante
    public static List<Partido> getPartidosPorJugarVisitante (String equipo){
        ArrayList<Partido> partidosVisitante = new ArrayList<>();
        for(Partido partido: partidos){
            if(partido.getEquipoVisitante().toLowerCase().equals(equipo.toLowerCase())){
                if(partido.getYaSeJugo() == false){
                    partidosVisitante.add(partido);
                }
            }
        }
        return partidosVisitante;
    }
}
