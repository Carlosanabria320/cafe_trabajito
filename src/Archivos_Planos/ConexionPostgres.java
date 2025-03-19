/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archivos_Planos;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author SENA
 */
public class ConexionPostgres {

    private final String HOST = "localhost";
    private final String PUERTO = "5432";
    private final String NOMBRE = "Cafeteria";
    private final String USER = "postgres";
    private final String PASSWORD = "123456789";

    public Connection getConexion() {
        Connection conexion = null;
        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://" + HOST + ":" + PUERTO + "/" + NOMBRE;
            conexion = DriverManager.getConnection(url, USER, PASSWORD);
            JOptionPane.showMessageDialog(null, "Conexion Exitosa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }
        return conexion;
    }

    public static void main(String[] args) {
        ConexionPostgres Conexion = new ConexionPostgres();
        Conexion.getConexion();
    }
}
