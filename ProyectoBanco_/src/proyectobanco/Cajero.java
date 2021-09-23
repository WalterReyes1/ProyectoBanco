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
public class Cajero {
    Pila p;
    boolean vacio = true;
    Persona persona;

    public Pila getP() {
        return p;
    }

    public void setP(Pila p) {
        this.p = p;
    }

    public boolean isVacio() {
        return vacio;
    }

    public void setVacio(boolean vacio) {
        this.vacio = vacio;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    
}
