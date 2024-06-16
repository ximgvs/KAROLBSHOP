
package Controlador;
import Modelo.M_ModificarProducto;
import Vista.frm_ModificarProducto;
import Modelo.M_ModificarProducto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class C_ModificarProducto {
    private M_ModificarProducto modelo;
    private frm_ModificarProducto vista;

    public C_ModificarProducto(M_ModificarProducto modelo, frm_ModificarProducto vista) {
        this.modelo = modelo;
        this.vista = vista;
        initController();
        cargarProveedores();
    }

    private void initController() {
        vista.getBtnBuscar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarProducto();
            }
        });

        vista.getBtnGuardarCambios().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guardarCambios();
            }
        });
    }

    private void buscarProducto() {
        String codigoProducto = vista.getCodigoProducto();
        modelo.buscarProductoPorCodigo(codigoProducto, vista);
    }

    private void guardarCambios() {
        String codigoProducto = vista.getCodigoProducto();
        String nombreProducto = vista.getNombreProducto();
        int cantidadProducto = vista.getCantidadProducto();
        double precioProducto = vista.getPrecioProducto();
        String proveedorNombre = vista.getProveedorNombre();
        modelo.guardarCambiosProducto(codigoProducto, nombreProducto, cantidadProducto, precioProducto, proveedorNombre);
     // Actualizar la fila seleccionada en la tabla
      
          int selectedRow = vista.getJTableProducto().getSelectedRow();
        if (selectedRow != -1) {
            DefaultTableModel tableModel = (DefaultTableModel) vista.getJTableProducto().getModel();
            tableModel.setValueAt(nombreProducto, selectedRow, 1);
            tableModel.setValueAt(cantidadProducto, selectedRow, 2);
            tableModel.setValueAt(precioProducto, selectedRow, 3);
            tableModel.setValueAt(proveedorNombre, selectedRow, 4);
            JOptionPane.showMessageDialog(vista, "Los cambios se han guardado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(vista, "No se ha seleccionado ninguna fila para actualizar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void cargarProveedores() {
        modelo.cargarProveedores(vista);
    }
}