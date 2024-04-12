package modelo;


import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lautaro
 */
public class SpecialNumbers {
    public static String getSpecialNumber (String opcionUser) {
        int specialNum = 0;
        switch (opcionUser.toLowerCase()) {
            case "policia":
                specialNum = 911;
                break;
            case "bomberos":
                specialNum = 101;
                break;
            case "violencia de genero":
                specialNum = 144;
                break;
            case "defensa civil":
                specialNum = 103;
                break;
            case "emergencia ambiental":
                specialNum = 105;
                break;
            default:
                System.out.println("Esta opcion esta creada por defecto.");
                break;
        }
        return "El numero de " + opcionUser + " es: " + specialNum;
    }
    
    public static boolean validarOpcion(String opcionUser){
        ArrayList<String> emergencyNumbersArray = new ArrayList<>();
        emergencyNumbersArray.add("bomberos");
        emergencyNumbersArray.add("policia");
        emergencyNumbersArray.add("violencia de genero");
        emergencyNumbersArray.add("defensa civil");
        emergencyNumbersArray.add("defensa ambiental");
        if (! emergencyNumbersArray.contains(opcionUser.toLowerCase())){
            return false;
        }
        else {
            return true;
        }
    }
}
