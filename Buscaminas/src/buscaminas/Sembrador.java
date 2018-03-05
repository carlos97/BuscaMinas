/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas;

import java.util.Random;

/**
 *
 * @author Estudiantes
 */
class Sembrador {
    
    void sembrarCorazones(Celda[][] celda, int cant){
        Random ran = new Random(System.currentTimeMillis());
        for(Celda[] laFila:celda){
            for(Celda laCelda:laFila){
                if(ran.nextInt(100) >70){
                    laCelda.setMiCorazon(new Corazon());
                }
            }
        }
    }
}
