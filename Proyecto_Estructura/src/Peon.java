/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jose
 */
public class Peon extends Pieza {

    public Peon() {
    }

    public Peon(boolean esblanca) {
        super(esblanca);
    }

    @Override
    public boolean isValidMovement(Pieza[][] tablero, int pos1, int pos2, int pos3, int pos4, int jugador) {
        boolean validacion = false;
        if (jugador == 1) {
            if ((pos2 == pos4) && (pos1 + 1 == pos3)) {
                if (tablero[pos3][pos4] instanceof vacia) {
                    validacion = true;
                }
            }
            if ((pos2 == pos4) && (pos1 + 2 == pos3) && (pos1 == 1)) {
                if (tablero[pos3][pos4] instanceof vacia) {
                    validacion = true;
                }
            }
            if ((pos4 == pos2 + 1 && pos3 == pos1 + 1) || (pos4 == pos2 - 1 && pos3 == pos1 + 1)) {
                if (tablero[pos3][pos4].isEsblanca() != tablero[pos1][pos2].isEsblanca() && !(tablero[pos3][pos4] instanceof vacia)) {
                    validacion = true;
                }
            }
        } else {
            if ((pos2 == pos4) && (pos1 - 1 == pos3 || pos1 - 2 == pos3)) {
                if (tablero[pos3][pos4] instanceof vacia) {
                    validacion = true;
                }
            }
            if ((pos4 == pos2 - 1 && pos3 == pos1 - 1) || (pos4 == pos2 + 1 && pos3 == pos1 - 1)) {
                if (tablero[pos3][pos4].isEsblanca() != tablero[pos1][pos2].isEsblanca() && !(tablero[pos3][pos4] instanceof vacia)) {
                    validacion = true;
                }
            }
            if ((pos2 == pos4) && (pos1 - 2 == pos3) && (pos1 == 6)) {
                if (tablero[pos3][pos4] instanceof vacia) {
                    validacion = true;
                }
            }
        }
        return validacion;
    }

}
