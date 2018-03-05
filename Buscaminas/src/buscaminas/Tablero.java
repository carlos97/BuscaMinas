/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas;

/**
 *
 * @author Estudiantes
 */
public class Tablero {
    Celda[][] celdas;
    Cronometro miCronometro;
    Contador miContador;
    Emoji emoji;
    
    public Tablero(int ancho,int largo){
        celdas = new Celda[ancho][largo];
        for(int fila=0;fila<largo;fila++){
            for(int columna = 0; columna<ancho;columna++){
                celdas[fila][columna] = new Celda();
            }
        }
        
        Sembrador miTrabajador = new Sembrador();
        miTrabajador.sembrarCorazones(celdas,50);
    }
}
