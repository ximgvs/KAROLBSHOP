
package Modelo;
        
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.lang.model.util.Types;
public class M_ReporteVenta {
  public List<Object[]> obtenerReporteVentas(Date fechaInicio, Date fechaFin) throws SQLException {
        List<Object[]> listaReporte = new ArrayList<>();
        String query = "{CALL ObtenerReporteVentas(?, ?)}";

        try (Connection conn = Conexion.getConnection();
             CallableStatement stmt = conn.prepareCall(query)) {
            stmt.setDate(1, fechaInicio);
            stmt.setDate(2, fechaFin);

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Object[] reporte = new Object[10];
                    reporte[0] = rs.getInt("idVenta");
                    reporte[1] = rs.getString("codigoProducto");
                    reporte[2] = rs.getString("nombreProducto");
                    reporte[3] = rs.getInt("cantidad");
                    reporte[4] = rs.getDouble("precio");
                    reporte[5] = rs.getString("dniCliente");
                    reporte[6] = rs.getString("nombreCliente");
                    reporte[7] = rs.getDate("fecha");
                    reporte[8] = rs.getDouble("total");
                    reporte[9] = rs.getString("nombreAdministrador");
                    listaReporte.add(reporte);
                }
            }
        }
        return listaReporte;
    }
}