
package Modelo;

import Vista.frm_ModificarProducto;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.SQLException;

      
public class M_RegistrarProducto { //permitira el alcance con los SP
    public List<String> obtenerNombresProveedores() { 
    List<String> proveedores = new ArrayList<>();
    //PRIMERAMENTE SE DEBERAN DE CARGAR LOS NOMBRES PREVIAMENTE REGISTRADO DE PROVEEDOR
    // DE ESTE MODO AL GENERAR LOS PRODUCTOS SE PODRA CONTAR CON LOS CBX CARGADOS DE ESTA INFORMACION
    // POR LO QUE SE CREA UNA INSTANCIA SELECT DE LA TABLA PROVEEDOR PARA ELLO
    try (Connection conn = Conexion.getConnection()) {
        String sql = "SELECT nombre FROM proveedor";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    String nombreProveedor = rs.getString("nombre");
                    proveedores.add(nombreProveedor);
                    System.out.println("Proveedor encontrado: " + nombreProveedor); // Agregar registro de depuración
                }
            }
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al cargar los proveedores: " 
                + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    return proveedores;
}
    //OBTENIDOS LOS NOMBRES DE PROVEEDORES, SE LLAMA AL PROCEDIMIENTO PARA INICIAR EL REGISTRO
    //CONTANDO CON LOS ATRIBUTOS QUE ESTA TABLA LLEVA MENCIONANDO EN ESTE LADO SU TIPO DE DATO
    
        public void registrarProducto(String codigoProducto, String nombreProducto, int cantidadProducto,
                double precioProducto, String proveedorNombre) {
        try (Connection conn = Conexion.getConnection()) {
            String sql = "CALL InsertarProducto(?, ?, ?, ?, ?)";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, codigoProducto);
                stmt.setString(2, nombreProducto);
                stmt.setInt(3, cantidadProducto);
                stmt.setDouble(4, precioProducto);
                stmt.setString(5, proveedorNombre);
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Producto registrado exitosamente.");
            } //SE GENERA UN TRY Y CATCH PARA CONTAR CON LOS ERRORES EN CASO OCURRAN
            //AMBOS GENERANDO MENSAJE YA SEA DE ERROR O EXITO, TODO PREVIA CONEXION A LA BD
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al registrar producto: " + ex.getMessage(), 
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

     
     