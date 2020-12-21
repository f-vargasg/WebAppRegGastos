/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fvgprinc.app.web.reggastos.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author garfi
 */
public class ConexionSQL {
        private static final String IP_ADDRESS = "10.25.1.86";
    private static final String DB_NAME = "TESTDB";
    private static final String USER = "admin";
    private static final String PASSWORD = "valerie5250";
    private static final String SERVICE = "3306";   // Port

    public static Connection getConnetion() throws SQLException {

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            // conn =  DriverManager.getConnection("jdbc:mariadb://10.25.1.80:3306/dbTest1", "fvargas", "valerie5250");

        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return DriverManager.getConnection("jdbc:mariadb://" + IP_ADDRESS + 
                                           ":" + SERVICE + 
                                           "/" + DB_NAME, USER, PASSWORD);

    }
    
    public static void main(String[] args) throws SQLException {
        Connection conn = ConexionSQL.getConnetion();
        if (conn  != null) {
            System.out.println("Conexión Exitosa!!!");
        }
    }
}
