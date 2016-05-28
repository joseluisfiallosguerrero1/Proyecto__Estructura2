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

    Pieza[][] tablero;
    Movimiento jugada;

    public mapa() {
        tablero = new Pieza[8][8];
    }

    public mapa(Pieza[][] tab, Movimiento jugada) {
        this.tablero = new Pieza[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                this.tablero[i][j] = tab[i][j];
            }
        }
        this.jugada = jugada;
    }

    public Pieza[][] getTablero() {
        return tablero;
    }

    public void setTablero(Pieza[][] tablero) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                this.tablero[i][j] = tablero[i][j];
            }
        }
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
