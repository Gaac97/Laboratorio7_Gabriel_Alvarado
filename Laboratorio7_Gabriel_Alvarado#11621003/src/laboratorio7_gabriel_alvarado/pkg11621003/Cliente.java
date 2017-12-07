/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio7_gabriel_alvarado.pkg11621003;

import java.util.ArrayList;

/**
 *
 * @author Gabriel Alvarado
 */
public class Cliente {
    public String nombre;
    public String edad;
    public ArrayList<Orden> ListOrdenes = new ArrayList();

    public Cliente(String nombre, String edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public ArrayList<Orden> getListOrdenes() {
        return ListOrdenes;
    }

    public void setListOrdenes(ArrayList<Orden> ListOrdenes) {
        this.ListOrdenes = ListOrdenes;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", edad=" + edad + ", ListOrdenes=" + ListOrdenes + '}';
    }
    
    
}
