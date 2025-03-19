/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archivos_Planos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author SENA
 */
public class Conexion {

    String USER, PASSWORD, NOMBRE, PUERTO, iP;
    Statement sentencia;
    Connection conexion = null;

    public Conexion(String USER, String PASSWORD, String NOMBRE, String PUERTO, String iP) {
        this.USER = USER;
        this.PASSWORD = PASSWORD;
        this.NOMBRE = NOMBRE;
        this.PUERTO = PUERTO;
        this.iP = iP;
    }

    public Connection getConexion() {
        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://" + ":" + PUERTO + "/" + NOMBRE;
            conexion = DriverManager.getConnection(url, USER, PASSWORD);
            JOptionPane.showMessageDialog(null, "Conexion Exitosa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }
        return conexion;
    }

    public void Conectar(String Driver, String Puente, boolean sw) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
        Class.forName(Driver).newInstance();
        if (sw) {
            conexion = DriverManager.getConnection("jdbc:" + Puente
                    + "://" + iP
                    + ":" + PUERTO
                    + "/" + NOMBRE, USER, PASSWORD);
        } else {
            conexion = DriverManager.getConnection("jdbc:" + Puente
                    + ":" + NOMBRE, USER, PASSWORD);
        }
        sentencia = conexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                ResultSet.CONCUR_UPDATABLE);

    }

    public void cerrar() throws SQLException {
        getConexion().close();
    }

    public ResultSet Consultar(String Consulta) throws SQLException {
        return (sentencia.executeQuery(Consulta));
    }

    public void Actualizar(String Actualiza) throws SQLException {
        int S = sentencia.executeUpdate(Actualiza);
    }

    public void Conexionpostgres() throws ClassNotFoundException,
            SQLException, InstantiationException, IllegalAccessException {
        Conectar("org.postgresql.Driver", "postgresql", true);

    }
}
