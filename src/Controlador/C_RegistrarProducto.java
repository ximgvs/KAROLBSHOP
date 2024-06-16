
package Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import Modelo.M_RegistrarProducto;
import Vista.frm_RegistrarProducto;
import Vista.frm_ModificarProducto;

//PARA INICIAR EL CONTROLADOR SE LLAMARAN A LA VISTA Y MODELO LOS CUALES NOS SERVIRAN PARA
//OBTENER LA CONEXION QUE SE REQUIEREN, YA QUE EN CADA APARTADO EXISTEN METODOS Y LLAMADOS QUE 
//SE NECESITAN ENTRE SI, TODO LLAMADO DESDE SU CARPETA CORRESPONDIENTE
public class C_RegistrarProducto {
    private frm_RegistrarProducto vista;
    private M_RegistrarProducto modelo;
     
    public C_RegistrarProducto(frm_RegistrarProducto vista, M_RegistrarProducto modelo) {
        this.vista = vista;
        this.modelo = modelo;
        initController();
    }

    private void initController() {
        cargarProveedores();
        vista.getBtnRegistrar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registrarProducto();
            }
        });  
    }
    //COMO ANTES MENCIONADO, SE TIENE ESTE METODO PARA OBTENER LOS NOMBRES DE LOS PROVEEDORE
    //ACA CONECTANDO A LO DE MODELO DONDE SE LLAMO A LA TABLA CORRESPONDIENTE, AQUI SOLO SE ESPECIFICA
    // QUE PARA LA VISTA TOME EL CBX PROVEEDORES Y LOS IGUALES SABIENDO LO DEL P.A
    private void cargarProveedores() {
        List<String> proveedores = modelo.obtenerNombresProveedores();
        vista.setProveedores(proveedores);
    }
    //FINALMENTE ESPECIFICANDO QUE AQUELLOS ATRIBUTOS SEÑALADOS DEL PA DE MODELO, AQUI SE TOMARAN
    //A IGUARLOS CON LA VISTA (FORMULARIO)CON SUS RESPETIVOS TEXTFIELD PARA QUE TODO SE CONECTE EXITOSAMENTE
    //ARGUMENTANDO QUE PARA TANTO REGISTRARPRODUCTO DE MODELO Y VISTA TIENEN LOS MISMO ATRIBUTOS
    // Y DEBEN CONECTARSE EN ESE ORDEN
    private void registrarProducto() {
        String codigo = vista.getCodigoProducto();
        String nombre = vista.getNombreProducto();
        int cantidad = vista.getCantidadProducto();
        double precio = vista.getPrecioProducto();
        String proveedor = vista.getProveedorNombre();

        modelo.registrarProducto(codigo, nombre, cantidad, precio, proveedor);
        vista.addProductoATabla(codigo, nombre, cantidad, precio, proveedor);
      } 
}

    
