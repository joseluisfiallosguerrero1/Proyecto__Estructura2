/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author jose
 */
public class Pieza {
    boolean esblanca;

    public Pieza() {
    }

    public Pieza(boolean Pieza) {
        this.esblanca = Pieza;
    }

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
