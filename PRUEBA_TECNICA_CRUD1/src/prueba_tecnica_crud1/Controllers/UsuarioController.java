/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba_tecnica_crud1.Controllers;
import java.sql.*;
import javax.swing.*;

import com.sun.jdi.connect.spi.Connection;
import prueba_tecnica_crud1.Database.DatabaseManager;
import prueba_tecnica_crud1.Models.Usuario;

/**
 *
 * @author jorge
 */
public class UsuarioController {
    public static void guardarUsuario(Usuario usuario) {
        String sql = "INSERT INTO usuarios (nombre, edad, direccion, telefono, foto) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseManager.connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, usuario.nombre);
            pstmt.setInt(2, usuario.edad);
            pstmt.setString(3, usuario.direccion);
            pstmt.setString(4, usuario.telefono);
            pstmt.setBytes(5, usuario.foto);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario guardado correctamente");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
