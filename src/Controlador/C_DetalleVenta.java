
package Controlador;

import Modelo.Conexion;
import Modelo.M_DetalleVenta;
import Vista.frm_Ventas;
import Vista.frm_DetalleVentas;
import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class C_DetalleVenta {
   private M_DetalleVenta mDetalleVenta;

    public C_DetalleVenta(M_DetalleVenta mDetalleVenta) {
        this.mDetalleVenta = mDetalleVenta;
    }

  public void insertarDetalleVenta(int idVenta, String dniCliente, String nombreCliente, Date fecha, double total, String nombreAdministrador) throws SQLException {
        mDetalleVenta.insertarDetalleVenta(idVenta, dniCliente, nombreCliente, (java.sql.Date) fecha, total, nombreAdministrador);
    }

     public String buscarNombreClientePorDNI(String dniCliente) throws SQLException {
        return mDetalleVenta.buscarNombreClientePorDNI(dniCliente);
    }

    public Object[] obtenerInformacionVentaPorID(int idVenta) throws SQLException {
        return mDetalleVenta.obtenerInformacionVentaPorID(idVenta);
    }
}
