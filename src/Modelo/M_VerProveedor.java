
package Modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class M_VerProveedor {
    public List<Object[]> buscarProveedorPorID(int id) {
        List<Object[]> proveedor = new ArrayList<>();
        try (Connection conn = Conexion.getConnection()) {
            String sql = "{CALL BuscarProveedorPorID(?)}";
            try (CallableStatement stmt = conn.prepareCall(sql)) {
                stmt.setInt(1, id);
                try (ResultSet rs = stmt.executeQuery()) {
                    if (rs.next()) {
                        Object[] rowData = {
                            rs.getInt("id"),
                            rs.getString("ruc"),
                            rs.getString("nombre"),
                            rs.getString("telefono"),
                            rs.getString("direccion"),
                            rs.getString("razon_social")
                        };
                        proveedor.add(rowData);
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontró ningún proveedor con el ID proporcionado.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al buscar proveedor: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return proveedor;
    }
}