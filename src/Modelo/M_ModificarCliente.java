
package Modelo;
import java.sql.*;
import java.sql.*;

public class M_ModificarCliente {
    public ResultSet buscarClientePorID(String id) throws SQLException {
        Connection conn = Conexion.getConnection();
        String sql = "{CALL BuscarClientePorID(?)}";
        CallableStatement stmt = conn.prepareCall(sql);
        stmt.setString(1, id);
        return stmt.executeQuery();
    }

    public void modificarCliente(String id, String dni, String nombre, String telefono, String direccion) throws SQLException {
        try (Connection conn = Conexion.getConnection()) {
            String sql = "{CALL ModificarCliente(?, ?, ?, ?, ?)}";
            try (CallableStatement stmt = conn.prepareCall(sql)) {
                stmt.setString(1, id);
                stmt.setString(2, dni);
                stmt.setString(3, nombre);
                stmt.setString(4, telefono);
                stmt.setString(5, direccion);
                stmt.executeUpdate();
            }
        }
    }
}