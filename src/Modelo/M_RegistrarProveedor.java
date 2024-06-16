
package Modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.CallableStatement;
import java.sql.SQLException;

public class M_RegistrarProveedor {
    public void registrarProveedor(String ruc, String nombre, String telefono, String direccion, String razonSocial) throws SQLException {
        try (Connection conn = Conexion.getConnection()) {
            String sql = "{CALL InsertarProveedor(?, ?, ?, ?, ?)}";
            try (CallableStatement stmt = conn.prepareCall(sql)) {
                stmt.setString(1, ruc);
                stmt.setString(2, nombre);
                stmt.setString(3, telefono);
                stmt.setString(4, direccion);
                stmt.setString(5, razonSocial);
                stmt.executeUpdate();
            }
        }
    }
}