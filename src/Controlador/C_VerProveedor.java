
package Controlador;

import Modelo.M_VerProveedor;
import Vista.frm_VerProveedor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class C_VerProveedor {
    private M_VerProveedor modelo;
    private frm_VerProveedor vista;

    public C_VerProveedor(M_VerProveedor modelo, frm_VerProveedor vista) {
        this.modelo = modelo;
        this.vista = vista;
        initController();
    }

    private void initController() {
        vista.getBtnBuscar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarProveedor();
            }
        });
    }
  private void buscarProveedor() {
        try {
              int id = Integer.parseInt(vista.getTxtBuscarProveedor().getText());
            List<Object[]> proveedor = modelo.buscarProveedorPorID(id);
            DefaultTableModel tableModel = (DefaultTableModel) vista.getJTableProveedor().getModel();
            tableModel.setRowCount(0); // Limpiar la tabla antes de agregar los datos
            for (Object[] rowData : proveedor) {
                tableModel.addRow(rowData);
            }
            if (!proveedor.isEmpty()) {
                JOptionPane.showMessageDialog(vista, "Proveedor encontrado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(vista, "Por favor, ingrese un ID válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
  
}