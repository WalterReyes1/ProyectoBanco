/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobanco;

/**
 *
 * @author hp
 */
public class Pila extends Lista {


    @Override
    public void mete(String s) {

      this.listaTransacción.add(s); 
     
    }

    @Override
    public void saca() {
      this.listaTransacción.remove(listaTransacción.size()-1);
    }
    
    //necesario para fines de abstracción
        @Override
    public void pone(Persona p) {
    }

    @Override
    public void quita() {
    }
    
    @Override
    public void imprimeLista(){
        for(int i = 0; i<this.listaTransacción.size();i++){
            System.out.println(this.listaTransacción.get(i));
        }
    }

}
