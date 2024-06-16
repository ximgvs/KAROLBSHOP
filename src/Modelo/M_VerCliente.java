
package Modelo;

import java.sql.*;

public class M_VerCliente {
    public ResultSet buscarClientePorID(String id) throws SQLException {
        Connection conn = Conexion.getConnection();
        String sql = "{CALL BuscarClientePorID(?)}";
        CallableStatement stmt = conn.prepareCall(sql);
        stmt.setString(1, id);
        return stmt.executeQuery();
    }
}
