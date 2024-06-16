
package Modelo;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class M_VerProducto {
    public List<Object[]> buscarProductoPorCodigo(String codigoProducto) {
        List<Object[]> productos = new ArrayList<>();
        try (Connection conn = Conexion.getConnection()) {
            String sql = "{CALL BuscarProductoPorCodigo(?)}";
            try (CallableStatement stmt = conn.prepareCall(sql)) {
                stmt.setString(1, codigoProducto);
                try (ResultSet rs = stmt.executeQuery()) {
                    if (!rs.isBeforeFirst()) {
                        // No se encontraron productos con el código proporcionado
                        JOptionPane.showMessageDialog(null, "No se encontró ningún producto con el código proporcionado.", "Error", JOptionPane.ERROR_MESSAGE);
                        return productos;
                    }
                    while (rs.next()) {
                        Object[] rowData = {
                            rs.getString("codigo"),
                            rs.getString("nombre"),
                            rs.getInt("cantidad"),
                            rs.getDouble("precio"),
                            rs.getString("nombre_proveedor")
                        };
                        productos.add(rowData);
                    }
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al buscar producto: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return productos;
    }
}