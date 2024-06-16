
package Modelo;
import java.sql.*;


public class M_EliminarCliente {
    public int eliminarClientePorID(String id) throws SQLException {
        try (Connection conn = Conexion.getConnection()) {
            String sql = "{CALL EliminarClientePorID(?)}";
            try (CallableStatement stmt = conn.prepareCall(sql)) {
                stmt.setString(1, id);
                return stmt.executeUpdate();
            }
        }
    }
}