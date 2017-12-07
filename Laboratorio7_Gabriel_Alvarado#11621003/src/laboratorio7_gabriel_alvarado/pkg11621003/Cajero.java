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
public class Cajero {
public String nombre;
public String id;
public ArrayList <Orden> ListOrdenes = new ArrayList();

    public Cajero(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Orden> getListOrdenes() {
        return ListOrdenes;
    }

    public void setListOrdenes(ArrayList<Orden> ListOrdenes) {
        this.ListOrdenes = ListOrdenes;
    }

    @Override
    public String toString() {
        return "Cajero{" + "nombre=" + nombre + ", id=" + id + ", ListOrdenes=" + ListOrdenes + '}';
    }
    

}
