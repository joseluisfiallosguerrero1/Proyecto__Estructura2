/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author jose
 */
public abstract class Pieza {
   boolean esblanca;

    public Pieza() {
    }

    public Pieza(boolean Pieza) {
        this.esblanca = Pieza;
    }

    
    public abstract boolean isValidMovement(Pieza[][] board,int x1, int y1, int x2, int y2, int turno);
    
    @Override
    public String toString() {
        return "Pieza{" + "Pieza=" + esblanca + '}';
    }

    public boolean isEsblanca() {
        return esblanca;
    }

    public void setEsblanca(boolean esblanca) {
        this.esblanca = esblanca;
    }
    
}
