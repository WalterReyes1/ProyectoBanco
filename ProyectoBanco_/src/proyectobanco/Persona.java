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
public class Persona {
    String nombre;
    int id;
    String transaccion;

    public Persona(String nombre, int id, String transaccion) {
        this.nombre = nombre;
        this.id = id;
        this.transaccion = transaccion;
    }

    @Override
    public String toString() {
        return  "nombre: " + nombre + ", id: " + id + ", transaccion:" + transaccion ;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(String transaccion) {
        this.transaccion = transaccion;
    }
    
}
