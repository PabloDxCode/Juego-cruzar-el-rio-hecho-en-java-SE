/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package juegocurzarrio;

import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerException;

/**
 *
 * @author Pablo-PC
 */
public class Sonido {
    
    BasicPlayer player = new BasicPlayer();
    String sonidoMovimiento = "/sonidos/pop.mp3";
    String sonidoBotones = "/sonidos/Botones.wav";
    String sonidoError = "/sonidos/BotonError.wav";
    String sonidoGanar = "/sonidos/Ganar1.mp3";
    String sonidoIn = "/sonidos/voz.mp3";
    
    public void sonidoM()
    {        
       try {
            player.open(getClass().getResource(sonidoMovimiento));
            player.play();
        } catch (BasicPlayerException ex) {
            System.out.println("Archivo no encontrado");
        }
    }
    
    public void sonidoB()
    {        
       try {
            player.open(getClass().getResource(sonidoBotones));
            player.play();
        } catch (BasicPlayerException ex) {
            System.out.println("Archivo no encontrado");
        }
    }
    
    
    public void sonidoE()
    {        
       try {
            player.open(getClass().getResource(sonidoError));
            player.play();
        } catch (BasicPlayerException ex) {
            System.out.println("Archivo no encontrado");
        }
    }
    
    public void sonidoGanar()
    {        
       try {
            player.open(getClass().getResource(sonidoGanar));
            player.play();
        } catch (BasicPlayerException ex) {
            System.out.println("Archivo no encontrado");
        }
    }
    
    public void Iistrucciones(){
        try {
            player.open(getClass().getResource(sonidoIn));
            player.play();
        } catch (BasicPlayerException ex) {
            System.out.println("Archivo no encontrado");
        }
    }
    
    public void IistruccionesStop(){
        try {
            player.open(getClass().getResource(sonidoIn));
            player.stop();
        } catch (BasicPlayerException ex) {
            System.out.println("Archivo no encontrado");
        }
    }
    
}