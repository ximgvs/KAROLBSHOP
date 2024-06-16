
package Modelo;

import java.sql.Connection;
import java.sql.CallableStatement;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class M_EliminarProducto {
    public boolean eliminarProductoPorCodigo(String codigoProducto) {
        try (Connection conn = Conexion.getConnection()) {
            String sql = "{CALL EliminarProductoPorCodigo(?)}";
            try (CallableStatement stmt = conn.prepareCall(sql)) {
                stmt.setString(1, codigoProducto);
                int rowsDeleted = stmt.executeUpdate();
                return rowsDeleted > 0;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al eliminar producto: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}
