package Controlador;
import Modelo.Conexion;
import Modelo.M_Venta;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.List;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class C_Venta {
  
    private M_Venta mVenta;

    public C_Venta(M_Venta mVenta) {
        this.mVenta = mVenta;
    }

      public void insertarVenta(String codigoProducto, String nombreProducto, int cantidad, double precio) throws SQLException {
        mVenta.insertarVenta(codigoProducto, nombreProducto, cantidad, precio);
    }

    public Object[] buscarProductoPorCodigo(String codigoProducto) throws SQLException {
        return mVenta.buscarProductoPorCodigo(codigoProducto);
    }
}