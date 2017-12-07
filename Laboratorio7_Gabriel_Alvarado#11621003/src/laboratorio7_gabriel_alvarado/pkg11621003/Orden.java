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
public class Orden {
    public String cajero;
    public String cliente;
    public ArrayList<Productos> ListProductos= new ArrayList();

    public Orden(String cajero, String cliente) {
        this.cajero = cajero;
        this.cliente = cliente;
    }

    public String getCajero() {
        return cajero;
    }

    public void setCajero(String cajero) {
        this.cajero = cajero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Productos> getListProductos() {
        return ListProductos;
    }

    public void setListProductos(ArrayList<Productos> ListProductos) {
        this.ListProductos = ListProductos;
    }

    @Override
    public String toString() {
        return "Orden{" + "cajero=" + cajero + ", cliente=" + cliente + ", ListProductos=" + ListProductos + '}';
    }
    
    
}
