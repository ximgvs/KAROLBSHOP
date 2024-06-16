

package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Conexion {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/sistemaKarol";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, DB_USERNAME, DB_PASSWORD);
    }
}

   
    

