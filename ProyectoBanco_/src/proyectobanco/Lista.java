/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobanco;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public abstract class Lista {
      protected  ArrayList<String>listaTransacción = new ArrayList();
      protected  ArrayList<Persona>listaPersona = new ArrayList();
      public abstract void imprimeLista();
      //para cola
      public abstract void pone(Persona p);
      public abstract void quita();
      
      //para pila
      public abstract void mete(String s);
      public abstract void saca();
      
      
}
