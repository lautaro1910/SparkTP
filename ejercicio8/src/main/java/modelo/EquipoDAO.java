/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author lautaro
 */
public class EquipoDAO {

    public static void init() {
        Equipo boca = new Equipo("Boca Juniors", 0, 0);
        Equipo river = new Equipo("River Plate", 0, 0);
        Equipo racing = new Equipo("Racing Club", 0, 0);
        Equipo independiente = new Equipo("Club Atlético Independiente", 0, 0);

        /*
        //informacion acerca de partidos ganados etc
        //river
        river.setCantidadPartidosGanados(2);
        river.setCantidadGoles(4);
        //boca
        boca.setCantidadPartidosGanados(1);
        boca.setCantidadGoles(4);
        //racing
        racing.setCantidadPartidosGanados(0);
        racing.setCantidadGoles(2);
        //independiente
        independiente.setCantidadPartidosGanados(0);
        independiente.setCantidadGoles(3);*/
    }

    // cantidad de partidos ganados por un equipo
    public static int getPartidosGanados(String equipo, Partido[] partidos) {
        int partidosGanados = 0;

        for (Partido partido : partidos) {
            if (partido.getEquipoLocal().toLowerCase().equals(equipo.toLowerCase()) && 
                    partido.getGolesLocal() > partido.getGolesVisitante()) {
                partidosGanados++;
            } else {
                if (partido.getEquipoVisitante().toLowerCase().equals(equipo.toLowerCase()) && 
                        partido.getGolesVisitante() > partido.getGolesLocal()) {
                    partidosGanados++;
                }
            }
        }
        return partidosGanados;
    }

    //cantidad de goles convertidos por un equipo
    public static int getGolesEquipo(String equipo, Partido[] partidos) {
        int goles = 0;

        for (Partido partido : partidos) {
            if (partido.getEquipoLocal().toLowerCase().equals(equipo.toLowerCase())) {
                goles = goles + partido.getGolesLocal();
            } else {
                if (partido.getEquipoVisitante().toLowerCase().equals(equipo.toLowerCase())){
                    goles = goles + partido.getGolesVisitante();
                }
            }
        }
        return goles;
    }

}
