/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jose
 */
public class Movimiento {
    Object pieza;
    int x1,x2,y1,y2;

    public Movimiento() {
    }

    public Movimiento(Object nuevo, int x1, int y1, int x2, int y2) {
        this.pieza = nuevo;
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public String cambiarY(int num){
        String retorno = "";
        if(num == 0){
            retorno = "A";
        }else if(num == 1){
            retorno = "B";
        }else if(num ==2){
            retorno = "C";
        }else if(num == 3){
            retorno = "D";
        }else if(num == 4){
            retorno = "E";
        }else if(num == 5){
            retorno = "F";
        }else if(num == 6){
            retorno = "G";
        }else if(num == 7){
            retorno = "H";
        }
        return retorno;
    }
    
    public int modificarX(int num){
        return num+1;
    }
    @Override
    public String toString() {
        return pieza.toString() + cambiarY(y1) + " , " + modificarX(x1) + "----->" + cambiarY(y2) + " , " + modificarX(x2);
    }
        
}
