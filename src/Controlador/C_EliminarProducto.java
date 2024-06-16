
package Controlador;

import Modelo.M_EliminarProducto;
import Vista.frm_EliminarProducto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class C_EliminarProducto {
    private M_EliminarProducto modelo;
    private frm_EliminarProducto vista;

    public C_EliminarProducto(M_EliminarProducto modelo, frm_EliminarProducto vista) {
        this.modelo = modelo;
        this.vista = vista;
        initController();
    }

    private void initController() {
        vista.getBtnEliminar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminarProducto();
            }
        });
    }

    private void eliminarProducto() {
        String codigoProducto = vista.getCodigoProducto();
        if (modelo.eliminarProductoPorCodigo(codigoProducto)) {
            JOptionPane.showMessageDialog(vista, "Producto eliminado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            vista.limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(vista, "No se encontró ningún producto con el código proporcionado.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

