
package Controlador;
import javax.swing.*;
import java.sql.*;

public class LoginControl {
    private JFrame Sistema;

    public LoginControl(JFrame Sistema) {
        this.Sistema = Sistema;
    }

    public void iniciarSesion(String usuario, String contraseña) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemaKarol", "root", "root")) {
            // Llamada al procedimiento almacenado para verificar las credenciales
            String sql = "{CALL CrearUusuario(?, ?)}";
            try (CallableStatement stmt = conn.prepareCall(sql)) {
                stmt.setString(1, usuario);
                stmt.setString(2, contraseña);
                try (ResultSet rs = stmt.executeQuery()) {
                    if (rs.next()) {
                        // Las credenciales son válidas
                        JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso.");
                        abrirFrmSistema();
                    } else {
                        // Las credenciales son inválidas
                        JOptionPane.showMessageDialog(null, "Credenciales incorrectas.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexión: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void abrirFrmSistema() {
        Sistema.setVisible(true);
    }
}


