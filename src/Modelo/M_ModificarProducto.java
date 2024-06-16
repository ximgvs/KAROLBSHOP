
package Modelo;

import Vista.frm_ModificarProducto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

   public class M_ModificarProducto {
    public void buscarProductoPorCodigo(String codigoProducto, frm_ModificarProducto vista) {
        try (Connection conn = Conexion.getConnection()) {
            String sql = "{CALL BuscarProductoPorCodigo(?)}";
            try (CallableStatement stmt = conn.prepareCall(sql)) {
                stmt.setString(1, codigoProducto);
                try (ResultSet rs = stmt.executeQuery()) {
                    DefaultTableModel tableModel = (DefaultTableModel) vista.getJTableProducto().getModel();
                    tableModel.setRowCount(0);

                    if (!rs.isBeforeFirst()) {
                        JOptionPane.showMessageDialog(null, "No se encontró ningún producto con el código proporcionado.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    while (rs.next()) {
                        String codigo = rs.getString("codigo");
                        String nombre = rs.getString("nombre");
                        int cantidad = rs.getInt("cantidad");
                        double precio = rs.getDouble("precio");
                        String nombreProveedor = rs.getString("nombre_proveedor");

                        Object[] rowData = {codigo, nombre, cantidad, precio, nombreProveedor};
                        tableModel.addRow(rowData);

                        vista.setCodigoProducto(codigo);
                        vista.setNombreProducto(nombre);
                        vista.setCantidadProducto(cantidad);
                        vista.setPrecioProducto(precio);
                        vista.setProveedorNombre(nombreProveedor);
                    }
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al buscar producto: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
     public void guardarCambiosProducto(String codigoProducto, String nuevoNombre, int nuevaCantidad, double nuevoPrecio, String nuevoProveedor) {
        try (Connection conn = Conexion.getConnection()) {
            String sql = "{CALL ModificarProducto(?, ?, ?, ?, ?)}";
            try (CallableStatement stmt = conn.prepareCall(sql)) {
                stmt.setString(1, codigoProducto);
                stmt.setString(2, nuevoNombre);
                stmt.setInt(3, nuevaCantidad);
                stmt.setDouble(4, nuevoPrecio);
                stmt.setString(5, nuevoProveedor);
                stmt.executeUpdate();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al guardar cambios del producto: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
     
    public void cargarProveedores(frm_ModificarProducto vista) {
        try (Connection conn = Conexion.getConnection()) {
            String sql = "SELECT nombre FROM PROVEEDOR";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                try (ResultSet rs = stmt.executeQuery()) {
                    while (rs.next()) {
                        vista.addProveedor(rs.getString("nombre"));
                    }
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al cargar los proveedores: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}