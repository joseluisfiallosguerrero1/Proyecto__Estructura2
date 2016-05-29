
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christian
 */
public class Hilo extends Thread {
    public Hilo() {
    }
    
    
    public void run(JButton boton, ImageIcon imagen) {
        boton.setIcon(imagen);
        this.esperarXsegundos(4);
        
    }

    private void esperarXsegundos(int num) {
        try {
            Thread.sleep(num*1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

}
