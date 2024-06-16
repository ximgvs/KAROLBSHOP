
package Modelo;
import Controlador.LoginControl;
import javax.swing.*;
import java.awt.event.*;

public class login {
    private JTextField txtUsuario;
    private JPasswordField txtPassword;
    private JButton btnIniciarSesion;
    private LoginControl loginControl;

    public login(JTextField txtUsuario, JPasswordField txtPassword, JButton btnIniciarSesion) {
        this.txtUsuario = txtUsuario;
        this.txtPassword = txtPassword;
        this.btnIniciarSesion = btnIniciarSesion;
        initListeners();
    }

    private void initListeners() {
        // Agregar ActionListener al botón de "Iniciar Sesión"
        btnIniciarSesion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String usuario = txtUsuario.getText();
                String contraseña = new String(txtPassword.getPassword());
                loginControl.iniciarSesion(usuario, contraseña);
            }
        });
    }

    public void setLoginControl(LoginControl loginControl) {
        this.loginControl = loginControl;
    }
}