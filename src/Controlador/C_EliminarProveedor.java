
package Controlador;
import Modelo.M_EliminarProveedor;
import Vista.frm_EliminarProveedor;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;

public class C_EliminarProveedor {
    private M_EliminarProveedor modelo;
    private frm_EliminarProveedor vista;

    public C_EliminarProveedor(M_EliminarProveedor modelo, frm_EliminarProveedor vista) {
        this.modelo = modelo;
        this.vista = vista;
        initController();
    }

    private void initController() {
        vista.getBtnEliminar().addActionListener(e -> eliminarProveedor());
    }

    private void eliminarProveedor() {
        try {
            int idProveedor = Integer.parseInt(vista.getTxtBuscarProveedor().getText().trim());
            modelo.eliminarProveedorPorID(idProveedor);
            JOptionPane.showMessageDialog(vista, "Proveedor eliminado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(vista, "Error al eliminar proveedor: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(vista, "Por favor, ingrese un ID válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}