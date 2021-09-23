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
public class Cola extends Lista {

    @Override
    public void pone(Persona p) {
        this.listaPersona.add(p);
    }

    @Override
    public void quita() {
         this.listaPersona.remove(0);
    }

    @Override
    public void imprimeLista() {
        /*for (int i = 0; i < this.listaTransacción.size(); i++) {
            System.out.println(this.listaTransacción.get(i));
        }*/
    }

    //necesario para fines de abstracción. 
    @Override
    public void mete(String s) {

    }

    @Override
    public void saca() {
    }
}
