/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba_tecnica_crud1.Database;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
/**
 *
 * @author jorge
 */
public class DatabaseManager {
    private static final String DB_URL = "jdbc:sqlite:usuarios.db";
    
    public static Connection connect() {
        try {
        Class.forName("org.sqlite.JDBC"); // Asegura que el driver se cargue
        Connection conn = DriverManager.getConnection("jdbc:sqlite:usuarios.db");
        return conn;
    } catch (ClassNotFoundException e) {
        System.out.println("Error: No se encontró el driver de SQLite.");
        e.printStackTrace();
    } catch (SQLException e) {
        System.out.println("Error de conexión con la base de datos.");
        e.printStackTrace();
    }
    return null;
    }
    
    public static void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS usuarios (id INTEGER PRIMARY KEY AUTOINCREMENT, nombre TEXT, edad INTEGER, direccion TEXT, telefono TEXT, foto BLOB)";
        try (Connection conn = connect(); Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
