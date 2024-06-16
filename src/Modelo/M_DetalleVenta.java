
package Modelo;
import java.sql.*;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class M_DetalleVenta {
  private Connection connection;

    public M_DetalleVenta() throws SQLException {
        connection = Conexion.getConnection();
    }
    
      public void insertarDetalleVenta(int idVenta, String dniCliente, String nombreCliente, Date fecha, double total, String nombreAdministrador) throws SQLException {
        String query = "{CALL InsertarDetalleVenta(?, ?, ?, ?, ?, ?)}";
        try (Connection conn = Conexion.getConnection();
             CallableStatement stmt = conn.prepareCall(query)) {
            stmt.setInt(1, idVenta);
            stmt.setString(2, dniCliente);
            stmt.setString(3, nombreCliente);
            stmt.setDate(4, new java.sql.Date(fecha.getTime()));
            stmt.setDouble(5, total);
            stmt.setString(6, nombreAdministrador);
            stmt.execute();
        }
    }

    
  public String buscarNombreClientePorDNI(String dniCliente) throws SQLException {
        String nombreCliente = "";
        String query = "SELECT nombre FROM cliente WHERE dni = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, dniCliente);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    nombreCliente = rs.getString("nombre");
                }
            }
        }
        return nombreCliente;
    }

     public Object[] obtenerInformacionVentaPorID(int idVenta) throws SQLException {
        String query = "SELECT cantidad, precio FROM ventas WHERE idVenta = ?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, idVenta);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Object[]{rs.getInt("cantidad"), rs.getDouble("precio")};
            }
        }
        return null;
    }
}