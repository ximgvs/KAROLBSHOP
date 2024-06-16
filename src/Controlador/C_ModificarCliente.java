
package Controlador;
import Modelo.M_ModificarCliente;
import Vista.frm_ModificarCliente;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;

public class C_ModificarCliente {
    private M_ModificarCliente modelo;
    private frm_ModificarCliente vista;

    public C_ModificarCliente(M_ModificarCliente modelo, frm_ModificarCliente vista) {
        this.modelo = modelo;
        this.vista = vista;
        initController();
    }

    private void initController() {
        vista.getBtnBuscar().addActionListener(e -> buscarCliente());
        vista.getBtnGuardar().addActionListener(e -> guardarCambiosCliente());
    }

    private void buscarCliente() {
        String idCliente = vista.getTxtBuscarCliente().getText();

        try {
            ResultSet rs = modelo.buscarClientePorID(idCliente);

            if (rs.next()) {
                vista.getTxtIdCliente().setText(rs.getString("id_cliente"));
                vista.getTxtDniCliente().setText(rs.getString("dni"));
                vista.getTxtNombreCliente().setText(rs.getString("nombre"));
                vista.getTxtTelefonoCliente().setText(rs.getString("telefono"));
                vista.getTxtDireccionCliente().setText(rs.getString("direccion"));

                JOptionPane.showMessageDialog(vista, "Cliente encontrado.");

                DefaultTableModel model = (DefaultTableModel) vista.getJTableCliente().getModel();
                model.setRowCount(0);
                model.addRow(new Object[]{
                        rs.getString("id_cliente"),
                        rs.getString("dni"),
                        rs.getString("nombre"),
                        rs.getString("telefono"),
                        rs.getString("direccion")
                });
            } else {
                JOptionPane.showMessageDialog(vista, "Cliente no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(vista, "Error al buscar cliente: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void guardarCambiosCliente() {
        String idCliente = vista.getTxtBuscarCliente().getText();
        String dniCliente = vista.getTxtDniCliente().getText();
        String nombreCliente = vista.getTxtNombreCliente().getText();
        String telefonoCliente = vista.getTxtTelefonoCliente().getText();
        String direccionCliente = vista.getTxtDireccionCliente().getText();

        try {
            modelo.modificarCliente(idCliente, dniCliente, nombreCliente, telefonoCliente, direccionCliente);
            JOptionPane.showMessageDialog(vista, "Cliente actualizado exitosamente.");
            buscarCliente();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(vista, "Error al guardar cambios del cliente: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}