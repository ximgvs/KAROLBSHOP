
package Controlador;
import Modelo.Conexion;
import Modelo.M_ModificarProveedor;
import Vista.frm_ModificarProveedor;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class C_ModificarProveedor {
    private M_ModificarProveedor modelo;
    private frm_ModificarProveedor vista;

    public C_ModificarProveedor(M_ModificarProveedor modelo, frm_ModificarProveedor vista) {
        this.modelo = modelo;
        this.vista = vista;
        initController();
    }

    private void initController() {
        vista.getBtnBuscar().addActionListener(e -> buscarProveedor());
        vista.getBtnGuardarCambios().addActionListener(e -> guardarCambiosProveedor());
    }

    private void buscarProveedor() {
        try {
            int idProveedor = Integer.parseInt(vista.getTxtBuscarProveedor().getText());
            ResultSet rs = modelo.buscarProveedorPorID(idProveedor);
            if (rs.next()) {
                DefaultTableModel model = (DefaultTableModel) vista.getTableProveedor().getModel();
                model.setRowCount(0); // Clear existing data
                model.addRow(new Object[]{
                    rs.getInt("id"),
                    rs.getString("ruc"),
                    rs.getString("nombre"),
                    rs.getString("telefono"),
                    rs.getString("direccion"),
                    rs.getString("razon_social")
                });

                vista.getTxtRuc().setText(rs.getString("ruc"));
                vista.getTxtNombre().setText(rs.getString("nombre"));
                vista.getTxtTelefono().setText(rs.getString("telefono"));
                vista.getTxtDireccion().setText(rs.getString("direccion"));
                vista.getTxtRazonSocial().setText(rs.getString("razon_social"));

                JOptionPane.showMessageDialog(vista, "Proveedor encontrado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                DefaultTableModel model = (DefaultTableModel) vista.getTableProveedor().getModel();
                model.setRowCount(0); // Clear existing data

                JOptionPane.showMessageDialog(vista, "No se encontró ningún proveedor con el ID proporcionado.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException | NumberFormatException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(vista, "Error al buscar proveedor: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void guardarCambiosProveedor() {
        try {
            int idProveedor = Integer.parseInt(vista.getTxtBuscarProveedor().getText());
            String ruc = vista.getTxtRuc().getText();
            String nombre = vista.getTxtNombre().getText();
            String telefono = vista.getTxtTelefono().getText();
            String direccion = vista.getTxtDireccion().getText();
            String razonSocial = vista.getTxtRazonSocial().getText();

            modelo.modificarProveedor(idProveedor, ruc, nombre, telefono, direccion, razonSocial);
            JOptionPane.showMessageDialog(vista, "Proveedor actualizado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            
            // Actualizar la tabla con los nuevos datos
            DefaultTableModel model = (DefaultTableModel) vista.getTableProveedor().getModel();
            model.setRowCount(0); // Clear existing data
            model.addRow(new Object[]{idProveedor, ruc, nombre, telefono, direccion, razonSocial});
        } catch (SQLException | NumberFormatException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(vista, "Error al actualizar proveedor: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}