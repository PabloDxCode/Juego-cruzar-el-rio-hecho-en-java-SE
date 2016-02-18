/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegocurzarrio;

import javax.swing.JOptionPane;
/**
 * @author Pablo
 */
public class Movimiento {
    int valor = 0;
    
    void Movimiento() {

    }
    
    public int ValidacionSalida(int izq, int der, int personaje, String lado) {
        if (izq == 0 && der == 0 && personaje == 0) {
            valor = 1;
        } else {
            if (izq == 1 && der == 0 && personaje == 0) {
                //derecha
                valor = 2;
            } else {
                if (izq == 0 && der == 1 && personaje == 0) {
                    valor = 3;
                } else {
                    if (izq == 1 && der == 1 && personaje == 0) {
                        //lleno
                        //JOptionPane.showMessageDialog(null, "Ya esta llena la balsa");
                        valor = 0;
                    } else {
                        if (izq == 1 && der == 0 && personaje == 1) {
                            valor = 4;
                        } else {
                            if (izq == 0 && der == 1 && personaje == 1) {
                                valor = 5;
                            } else {
                                if (izq == 1 && der == 1 && personaje == 1) {
                                    if (lado == "arriba") {
                                        valor = 6;
                                    } else {
                                        if (lado == "abajo") {
                                            valor = 7;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return valor;
    }
    
    public int ValidacionRegreso(int izq, int der, int personaje, String lado) {

        if (izq == 0 && der == 0 && personaje == 2) {
            valor = 1;
        } else {
            if (izq == 1 && der == 0 && personaje == 2) {
                //derecha
                valor = 2;
            } else {
                if (izq == 0 && der == 1 && personaje == 2) {
                    valor = 3;
                } else {
                    if (izq == 1 && der == 1 && personaje == 2) {
                        //lleno
                        //JOptionPane.showMessageDialog(null, "Ya esta llena la balsa");
                        valor = 0;
                    } else {
                        if (izq == 1 && der == 0 && personaje == 3) {
                            valor = 4;
                        } else {
                            if (izq == 0 && der == 1 && personaje == 3) {
                                valor = 5;
                            } else {
                                if (izq == 1 && der == 1 && personaje == 3) {
                                    if (lado == "arriba") {
                                        valor = 6;
                                    } else {
                                        if (lado == "abajo") {
                                            valor = 7;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return valor;
    }
    
}