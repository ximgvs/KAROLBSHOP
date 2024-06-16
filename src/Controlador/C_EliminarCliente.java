
package Controlador;
import Modelo.M_EliminarCliente;
import Vista.frm_EliminarCliente;
import javax.swing.*;
import java.sql.SQLException;


public class C_EliminarCliente {
    private M_EliminarCliente modelo;
    private frm_EliminarCliente vista;

    public C_EliminarCliente(M_EliminarCliente modelo, frm_EliminarCliente vista) {
        this.modelo = modelo;
        this.vista = vista;
        initController();
    }

    private void initController() {
        vista.getBtnEliminar().addActionListener(e -> eliminarCliente());
    }

    private void eliminarCliente() {
        String idCliente = vista.getTxtIdCliente().getText().trim();

        // Verificar que el campo no esté vacío
        if (idCliente.isEmpty()) {
            JOptionPane.showMessageDialog(vista, "Debe ingresar un ID de cliente.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            int rowsAffected = modelo.eliminarClientePorID(idCliente);
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(vista, "Cliente eliminado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(vista, "No se encontró un cliente con el ID proporcionado.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(vista, "Error al eliminar cliente: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}