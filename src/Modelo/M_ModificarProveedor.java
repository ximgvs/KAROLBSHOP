
package Modelo;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class M_ModificarProveedor {
    public ResultSet buscarProveedorPorID(int id) throws SQLException {
        Connection conn = Conexion.getConnection();
        String sql = "{CALL BuscarProveedorPorID(?)}";
        CallableStatement stmt = conn.prepareCall(sql);
        stmt.setInt(1, id);
        return stmt.executeQuery();
    }

    public void modificarProveedor(int id, String ruc, String nombre, String telefono, String direccion, String razonSocial) throws SQLException {
        Connection conn = Conexion.getConnection();
        String sql = "{CALL ModificarProveedor(?, ?, ?, ?, ?, ?)}";
        CallableStatement stmt = conn.prepareCall(sql);
        stmt.setInt(1, id);
        stmt.setString(2, ruc);
        stmt.setString(3, nombre);
        stmt.setString(4, telefono);
        stmt.setString(5, direccion);
        stmt.setString(6, razonSocial);
        stmt.executeUpdate();
    }
}