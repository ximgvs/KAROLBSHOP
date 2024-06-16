
package Modelo;
import java.sql.*;

public class M_EliminarProveedor {
    public void eliminarProveedorPorID(int id) throws SQLException {
        try (Connection conn = Conexion.getConnection()) {
            String sql = "{CALL EliminarProveedorPorID(?)}";
            try (CallableStatement stmt = conn.prepareCall(sql)) {
                stmt.setInt(1, id);
                stmt.executeUpdate();
            }
        }
    }
}