/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christian
 */
public class Hilo implements Runnable {
    Pieza[][] tablero;
    Movimiento movimiento;

    public Hilo(Pieza[][] tablero, Movimiento movimiento) {
        this.tablero = tablero;
        this.movimiento = movimiento;
    }
    
    
    @Override
    public void run() {
        tablero[movimiento.getX2()][movimiento.getY2()]=tablero[movimiento.getX1()][movimiento.getY1()];
        tablero[movimiento.getX1()][movimiento.getY1()]=new  vacia();
        this.esperarXsegundos();
    }

    private void esperarXsegundos() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

}
