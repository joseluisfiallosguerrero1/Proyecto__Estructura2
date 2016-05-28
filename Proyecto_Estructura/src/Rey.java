/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jose
 */
public class Rey extends Pieza {

    public Rey() {
    }

    public Rey(boolean esblanca) {
        super(esblanca);
    }

    @Override
    public boolean isValidMovement(Pieza[][] tablero, int x1, int y1, int x2, int y2, int turno) {
        boolean retorno = true;

        if (x1 < 8 && x1 >= 0 && x2 < 8 && x2 >= 0 && y1 < 8 && y1 >= 0 && y2 < 8 && y2 >= 0) {
            if ((x2 == x1 - 1) && (y2 == y1 - 1)) {
                retorno = true;
            } else if ((x2 == x1 - 1) && (y2 == y1)) {
                retorno = true;
            } else if ((x2 == x1 - 1) && (y2 == y1 + 1)) {
                retorno = true;
            } else if ((x2 == x1 + 1) && (y2 == y1 + 1)) {
                retorno = true;
            } else if ((x2 == x1) && (y2 == y1 - 1)) {
                retorno = true;
            } else if ((x2 == x1) && (y2 == y1 + 1)) {
                retorno = true;
            } else if ((x2 == x1 + 1) && (y2 == y1 - 1)) {
                retorno = true;
            } else if ((x2 == x1 + 1) && (y2 == y1)) {
                retorno = true;
            } else {
                retorno = false;
            }

        }
        return retorno;
    }
}
