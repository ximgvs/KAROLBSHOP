
package Controlador;
import Modelo.M_ReporteVenta;
import Vista.frm_ReporteVenta;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

public class C_ReporteVenta {
    private M_ReporteVenta modelo;
    private frm_ReporteVenta vista;

    public C_ReporteVenta(frm_ReporteVenta vista) {
        this.modelo = new M_ReporteVenta();
        this.vista = vista;
    }

    public void buscarVentasPorFechas(Date fechaInicio, Date fechaFin) throws SQLException {
        List<Object[]> listaReporte = modelo.obtenerReporteVentas(fechaInicio, fechaFin);
        vista.mostrarReporteVentas(listaReporte);
    }
}




    

