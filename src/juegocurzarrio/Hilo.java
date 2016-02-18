/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package juegocurzarrio;

import java.io.File;
import javax.swing.JProgressBar;

/**
 *
 * @author Pablo
 */
public class Hilo extends Thread implements Runnable {

    JProgressBar barra1;
    private int num = 0;

    public Hilo(JProgressBar bar1) {
        barra1 = bar1;
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(90);
                llenarBarra();


            } catch (InterruptedException ex) {
            }
        }
    }

    public void llenarBarra() {
        int a = 100;

        if (barra1.getValue() <= 100) {
            num += 3;
            barra1.setValue(num);
            barra1.setStringPainted(true);

        } else {
            barra1.setValue(0);
        }
    }
}
