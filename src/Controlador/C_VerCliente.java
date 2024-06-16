
package Controlador;
import Modelo.M_VerCliente;
import Vista.frm_VerCliente;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class C_VerCliente {
    private M_VerCliente modelo;
    private frm_VerCliente vista;

    public C_VerCliente(M_VerCliente modelo, frm_VerCliente vista) {
        this.modelo = modelo;
        this.vista = vista;
        initController();
    }

    private void initController() {
        vista.getBtnBuscar().addActionListener(e -> buscarCliente());
    }

    private void buscarCliente() {
        String idCliente = vista.getTxtBuscarCliente().getText();

        try {
            ResultSet rs = modelo.buscarClientePorID(idCliente);

            if (rs.next()) {
                DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "DNI CLIENTE", "NOMBRE", "TELEFONO", "DIRECCION"}, 0);
                model.addRow(new Object[]{rs.getString("id_cliente"), rs.getString("dni"), rs.getString("nombre"), rs.getString("telefono"), rs.getString("direccion")});
                vista.getTableCliente().setModel(model);
                JOptionPane.showMessageDialog(null, "Cliente encontrado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                DefaultTableModel model = new DefaultTableModel(new String[]{"ID CLIENTE", "DNI", "NOMBRE_CLIENTE", "TELEFONO", "DIRECCION"}, 0);
                vista.getTableCliente().setModel(model);
                JOptionPane.showMessageDialog(null, "No se encontró ningún cliente con el ID proporcionado.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al buscar cliente: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}