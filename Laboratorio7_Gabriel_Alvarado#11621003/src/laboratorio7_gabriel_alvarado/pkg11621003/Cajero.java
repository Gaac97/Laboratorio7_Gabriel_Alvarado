/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio7_gabriel_alvarado.pkg11621003;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gabriel Alvarado
 */
public class Cajero extends Thread {

    public Principal principal = new Principal();
    public Compra mostrar = new Compra();
    public Orden o;
    boolean vive = true;
    public String nombre;
    public String id;
    public ArrayList<Orden> ListOrdenes = new ArrayList();

    public Cajero() {
    }

    public Cajero(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;

    }

    public ArrayList<Orden> getListOrdenes() {
        return ListOrdenes;
    }

    public void setListOrdenes(ArrayList<Orden> ListOrdenes) {
        this.ListOrdenes = ListOrdenes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId2() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public void run() {

        Productos p = new Productos();
        Cliente c = new Cliente();
        mostrar.setVisible(true);
        mostrar.nombreCajero.setText(nombre);
        mostrar.NombreCliente.setText(c.getNombre());
        mostrar.tf_proceso.setText(p.getNombre());
        int tiempo = p.getTiempo();

        JTable tablaTemporal = new JTable();

        DefaultTableModel modelo = (DefaultTableModel) mostrar.jt_tabla.getModel();
        while (true) {

            for (int i = 0; i < ListOrdenes.size(); i++) {
                mostrar.NombreCliente.setText(c.getNombre());
                for (int j = 0; j < ListOrdenes.get(i).ListProductos.size(); j++) {

                    mostrar.tf_proceso.setText(ListOrdenes.get(i).ListProductos.get(j).getNombre());
                    try {
                        Thread.sleep(ListOrdenes.get(i).ListProductos.get(j).getTiempo() * 1000);
                    } catch (InterruptedException ex) {
                    }
                    Object[] newrow = {ListOrdenes.get(i).ListProductos.get(j).getNombre(), ListOrdenes.get(i).ListProductos.get(j).getPrecio(), ListOrdenes.get(i).ListProductos.get(j).getTiempo()};
                    modelo.addRow(newrow);
                    mostrar.jt_tabla.setModel(modelo);

                }

            }

        }

    }

}
