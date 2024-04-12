package modelo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lautaro
 */
public class Modelo {
    
    public static boolean testPalindromo(String palabra) {
        int sizeWord = 0, aux, ret = 0;
        String palabraAux = palabra.toLowerCase();
        sizeWord = palabra.length();
        
        aux = sizeWord;
        
        for(int i = 0; i < sizeWord/2; i++){
            if(palabraAux.charAt(i) != palabraAux.charAt(aux-1)){
                ret = 1;
                break;
            }
            aux = aux - 1;
        }
        return ret == 0;
    }
    
}
