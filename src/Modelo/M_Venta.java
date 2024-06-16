
package Modelo;
import Modelo.Conexion;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.sql.PreparedStatement;

public class M_Venta {
 private Connection connection;

    public M_Venta() throws SQLException {
        connection = Conexion.getConnection();
    }

   public void insertarVenta(String codigoProducto, String nombreProducto, int cantidad, double precio) throws SQLException {
        String query = "{CALL InsertarVenta(?, ?, ?, ?)}";
        try (Connection conn = Conexion.getConnection();
             CallableStatement stmt = conn.prepareCall(query)) {
            stmt.setString(1, codigoProducto);
            stmt.setString(2, nombreProducto);
            stmt.setInt(3, cantidad);
            stmt.setDouble(4, precio);
            stmt.execute();
        }
    }



   public Object[] buscarProductoPorCodigo(String codigoProducto) throws SQLException {
        String query = "SELECT codigoProducto, nombreProducto, cantidad, precio FROM producto WHERE codigoProducto = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, codigoProducto);
            try (ResultSet rs = stmt.executeQuery()) {
              if (rs.next()) {
                   String nombreProducto = rs.getString("nombreProducto");
                    int cantidad = rs.getInt("cantidad");
                    double precio = rs.getDouble("precio");
                    return new Object[] { codigoProducto, nombreProducto, cantidad, precio };
                } else {
                    return null;
                }
            }
        } catch (SQLException ex) {
            // Manejar la excepción según sea necesario
            ex.printStackTrace();
            throw ex; // Lanzar de nuevo la excepción para que sea manejada por el llamador
        }
    }
}

