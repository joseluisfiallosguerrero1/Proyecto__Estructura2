/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jose
 */
public class mapa {
    int[][] tablero;
    Movimiento jugada;

    public mapa() {
    }

    public mapa(int[][] tablero, Movimiento jugada) {
        this.tablero = tablero;
        this.jugada = jugada;
    }

    public int[][] getTablero() {
        return tablero;
    }

    public void setTablero(int[][] tablero) {
        this.tablero = tablero;
    }

    public Movimiento getJugada() {
        return jugada;
    }

    public void setJugada(Movimiento jugada) {
        this.jugada = jugada;
    }

    @Override
    public String toString() {
        return "mapa{" + "tablero=" + tablero + ", jugada=" + jugada + '}';
    }
    
}