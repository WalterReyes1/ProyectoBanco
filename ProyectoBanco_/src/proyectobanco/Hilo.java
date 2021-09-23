/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobanco;

import java.util.Random;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 *
 * @author hp
 */
public class Hilo extends Thread {

    int cont = 1;
    int cont1 = 0;
    String nombre1;
    String nombre2;
    JLabel cola1;
    boolean ayuda=false;
    Cola colaPersona;

    public Cola getColaPersona() {
        return colaPersona;
    }

    public void setColaPersona(Cola colaPersona) {
        this.colaPersona = colaPersona;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }
    JLabel cola2;
    JLabel cola3;
    JLabel cola4;
    JLabel Persona1;
    JLabel Persona2;
    JLabel Persona3;
    JLabel Persona4;
    JButton Buffon;
    JProgressBar barra;
    boolean avanzar;
    boolean vive;
    Cola co1;

    public Cola getCo1() {
        return co1;
    }

    public void setCo1(Cola co1) {
        this.co1 = co1;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public JButton getBuffon() {
        return Buffon;
    }

    public void setBuffon(JButton Buffon) {
        this.Buffon = Buffon;
    }

    

    public JLabel getCola1() {
        return cola1;
    }

    public void setCola1(JLabel cola1) {
        this.cola1 = cola1;
    }

    public JLabel getCola2() {
        return cola2;
    }

    public void setCola2(JLabel cola2) {
        this.cola2 = cola2;
    }

    public JLabel getCola3() {
        return cola3;
    }

    public void setCola3(JLabel cola3) {
        this.cola3 = cola3;
    }

    public JLabel getCola4() {
        return cola4;
    }

    public void setCola4(JLabel cola4) {
        this.cola4 = cola4;
    }

    public JLabel getPersona1() {
        return Persona1;
    }

    public void setPersona1(JLabel Persona1) {
        this.Persona1 = Persona1;
    }

    public JLabel getPersona2() {
        return Persona2;
    }

    public void setPersona2(JLabel Persona2) {
        this.Persona2 = Persona2;
    }

    public JLabel getPersona3() {
        return Persona3;
    }

    public void setPersona3(JLabel Persona3) {
        this.Persona3 = Persona3;
    }

    public JLabel getPersona4() {
        return Persona4;
    }

    public void setPersona4(JLabel Persona4) {
        this.Persona4 = Persona4;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    @Override
    public void run() {
      barra.setMaximum(120);
      barra.setValue(0);
    while(vive){
    
        if(avanzar){
          barra.setValue(barra.getValue()+1);
          
          
          if(barra.getValue()%2 == 0){
//              barra.setString(colaPersona.listaPersona.get(barra.getValue()).getNombre());
          }
           
             
            
          
       //activar y modificar propiedad stringPainted para que esto funciones
      //  barra.setString("Manipulando Archivo "+Integer.toString(barra.getValue())+"%" );
        if(barra.getValue()==120){
           
           
           
                barra.setValue(0);
                
                break;
           }
            
           // botoncito.setVisible(true);
            //Buffon.doClick();
            
           
           // break;
        }
        
        try{
         Thread.sleep(1000);

        } catch (InterruptedException ex) {
            
        }
        
        
    }
    }
}
       
    


