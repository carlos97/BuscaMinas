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
public class Celda {
    private Corazon miCorazon;
    private Bandera miBandera;
    private int minasAlRededor;
    private boolean estado;

    public Corazon getMiCorazon() {
        return miCorazon;
    }

    public void setMiCorazon(Corazon miCorazon) {
        this.miCorazon = miCorazon;
    }

    public Bandera getMiBandera() {
        return miBandera;
    }

    public void setMiBandera(Bandera miBandera) {
        this.miBandera = miBandera;
    }

    public int getMinasAlRededor() {
        return minasAlRededor;
    }

    public void setMinasAlRededor(int minasAlRededor) {
        this.minasAlRededor = minasAlRededor;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}
