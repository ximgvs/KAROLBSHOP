
package Controlador;
import Modelo.M_RegistrarCliente;
import Vista.frm_RegistrarCliente;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;

public class C_RegistrarCliente {
    private M_RegistrarCliente modelo;
    private frm_RegistrarCliente vista;

    public C_RegistrarCliente(M_RegistrarCliente modelo, frm_RegistrarCliente vista) {
        this.modelo = modelo;
        this.vista = vista;
        initController();
    }

    private void initController() {
        vista.getBtnRegistrar().addActionListener(e -> registrarCliente());
    }

    private void registrarCliente() {
        String dniCliente = vista.getTxtDniCliente().getText().trim();
        String nombreCliente = vista.getTxtNombreCliente().getText().trim();
        String telefonoCliente = vista.getTxtTelefonoCliente().getText().trim();
        String direccionCliente = vista.getTxtDireccionCliente().getText().trim();

        if (dniCliente.isEmpty() || nombreCliente.isEmpty() || telefonoCliente.isEmpty() || direccionCliente.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            modelo.insertarCliente(dniCliente, nombreCliente, telefonoCliente, direccionCliente);
            JOptionPane.showMessageDialog(null, "Cliente registrado exitosamente.");
            agregarClienteATabla(dniCliente, nombreCliente, telefonoCliente, direccionCliente);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al registrar cliente: " + ex.getMessage(), "Error", 
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void agregarClienteATabla(String dniCliente, String nombreCliente, String telefonoCliente, 
            String direccionCliente) {
        DefaultTableModel tableModel = (DefaultTableModel) vista.getJTableCliente().getModel();
        tableModel.addRow(new Object[]{dniCliente, nombreCliente, telefonoCliente, direccionCliente});
    }
}

