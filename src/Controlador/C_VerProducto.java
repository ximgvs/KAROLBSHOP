
package Controlador;
import Modelo.M_VerProducto;
import Vista.frm_VerProducto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class C_VerProducto {
    private M_VerProducto modelo;
    private frm_VerProducto vista;

    public C_VerProducto(M_VerProducto modelo, frm_VerProducto vista) {
        this.modelo = modelo;
        this.vista = vista;
        initController();
    }

    private void initController() {
        vista.getBtnBuscar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarProducto();
            }
        });
    }

    private void buscarProducto() {
        String codigoProducto = vista.getCodigoProducto();
        List<Object[]> productos = modelo.buscarProductoPorCodigo(codigoProducto);
        DefaultTableModel tableModel = (DefaultTableModel) vista.getJTableProducto().getModel();
        tableModel.setRowCount(0); // Limpiar la tabla antes de agregar los datos
        for (Object[] rowData : productos) {
            tableModel.addRow(rowData);
        }
        if (!productos.isEmpty()) {
            JOptionPane.showMessageDialog(vista, "Producto(s) encontrado(s) correctamente.", 
                  "Éxito", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
    

