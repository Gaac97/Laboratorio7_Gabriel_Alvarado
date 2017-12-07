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
    boolean vive=true;
    public String nombre;
    public String id;
    public ArrayList<Orden> ListOrdenes = new ArrayList();

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

    public String getId2() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void run() {
        Productos p = new Productos();
        Cliente c = new Cliente();
        mostrar.setVisible(true);
        mostrar.nombreCajero.setText(nombre);
        mostrar.NombreCliente.setText(c.getNombre());
        int tiempo = p.getTiempo();
        
        JTable tablaTemporal = new JTable();
        Compra mostracion = new Compra();
        DefaultTableModel modelo = (DefaultTableModel) mostrar.jt_tabla.getModel();
        DefaultTableModel borrar = (DefaultTableModel) mostrar.jt_tabla.getModel();
        while (true) {
            while (mostrar.jt_tabla.getRowCount() > 0) {
                modelo.removeRow(0);
            }
            mostrar.jt_tabla.setModel(modelo);
            for (Orden t1 : ListOrdenes) {
                if (t1.equals(nombre)) {
                    Object[] fila = {t1.cajero, t1.cliente,p.tiempo};
                    modelo.addRow(fila);
                }
            }
            mostrar.jt_tabla.setModel(modelo);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }

    }

}
