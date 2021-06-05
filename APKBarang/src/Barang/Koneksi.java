/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Barang;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author g
 */
public class Koneksi {
    private static Connection databasekoneksi;
    public static Connection koneksiDB() throws SQLException {
        if (databasekoneksi == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/databarang";
                String user = "root";
                String pass = "";
                
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                databasekoneksi = DriverManager.getConnection(url,user,pass);  
            
            } catch (Exception e) {
                System.err.println("Koneksi Gagal "+e.getMessage());
            }
        } return databasekoneksi;
    } 

    static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
