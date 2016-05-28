/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jose
 */
public class vacia extends Pieza {

    public vacia() {
    }

   @Override
    public boolean isValidMovement(Pieza[][] tablero, int pos1, int pos2, int pos3, int pos4, int jugador) {
        return false;
    }

}
