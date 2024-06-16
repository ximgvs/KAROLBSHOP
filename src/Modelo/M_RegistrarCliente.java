
package Modelo;
import java.sql.*;

public class M_RegistrarCliente {
    public void insertarCliente(String dni, String nombre, String telefono, String direccion) throws SQLException {
        try (Connection conn = Conexion.getConnection()) {
            String sql = "{CALL InsertarCliente(?, ?, ?, ?)}";
            try (CallableStatement stmt = conn.prepareCall(sql)) {
                stmt.setString(1, dni);
                stmt.setString(2, nombre);
                stmt.setString(3, telefono);
                stmt.setString(4, direccion);
                stmt.execute();
            }
        }
    }
}