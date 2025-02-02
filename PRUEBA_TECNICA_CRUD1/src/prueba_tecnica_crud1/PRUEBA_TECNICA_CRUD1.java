/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba_tecnica_crud1;

import javax.swing.SwingUtilities;
import prueba_tecnica_crud1.Database.DatabaseManager;
import prueba_tecnica_crud1.Views.UsuarioView;

/**
 *
 * @author jorge
 */
public class PRUEBA_TECNICA_CRUD1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DatabaseManager.createTable();
        SwingUtilities.invokeLater(() -> new UsuarioView());
    }
    
}
