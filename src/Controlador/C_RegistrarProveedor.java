
package Controlador;
import Modelo.M_RegistrarProveedor;
import Vista.frm_RegistrarProveedor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;


public class C_RegistrarProveedor {
    private M_RegistrarProveedor modelo;
    private frm_RegistrarProveedor vista;

    public C_RegistrarProveedor(M_RegistrarProveedor modelo, frm_RegistrarProveedor vista) {
        this.modelo = modelo;
        this.vista = vista;
        initController();
    }

    private void initController() {
        vista.getBtnRegistrar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registrarProveedor();
            }
        });
    }

    private void registrarProveedor() {
        String ruc = vista.getRucProveedor();
        String nombre = vista.getNombreProveedor();
        String telefono = vista.getTelefonoProveedor();
        String direccion = vista.getDireccionProveedor();
        String razonSocial = vista.getRazonProveedor();

        if (ruc.isEmpty() || nombre.isEmpty() || telefono.isEmpty() || direccion.isEmpty() || razonSocial.isEmpty()) {
            JOptionPane.showMessageDialog(vista, "Todos los campos deben estar llenos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            modelo.registrarProveedor(ruc, nombre, telefono, direccion, razonSocial);
            JOptionPane.showMessageDialog(vista, "Proveedor registrado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            // Actualizar tabla si es necesario
            agregarProveedorATabla(ruc, nombre, telefono, direccion, razonSocial);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(vista, "Error al registrar proveedor: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void agregarProveedorATabla(String ruc, String nombre, String telefono, String direccion, String razonSocial) {
        DefaultTableModel tableModel = (DefaultTableModel) vista.getJTableProveedor().getModel();
        tableModel.addRow(new Object[]{ruc, nombre, telefono, direccion, razonSocial});
    }
}