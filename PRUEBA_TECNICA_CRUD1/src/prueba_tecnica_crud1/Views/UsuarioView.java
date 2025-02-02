/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba_tecnica_crud1.Views;

import java.awt.GridLayout;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author jorge
 */
public class UsuarioView extends JFrame {
    JTextField nombreField, edadField, direccionField, telefonoField;
    JLabel fotoLabel;
    JButton cargarFotoBtn, guardarBtn;
    byte[] fotoBytes;
    
    public UsuarioView()  {
        setTitle("PRUEBA TECNICA");
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(6,2));
        
        add(new JLabel("Nombre:"));
        nombreField = new JTextField();
        add(nombreField);
        
        add(new JLabel("Edad:"));
        edadField = new JTextField();
        add(edadField);
        
        add(new JLabel("Dirección:"));
        direccionField = new JTextField();
        add(direccionField);
        
        add(new JLabel("Teléfono:"));
        telefonoField = new JTextField();
        add(telefonoField);
        
        fotoLabel = new JLabel("No hay imagen", SwingConstants.CENTER);
        add(fotoLabel);
        
        cargarFotoBtn = new JButton("Cargar Foto");
        cargarFotoBtn.addActionListener(e -> cargarFoto());
        add(cargarFotoBtn);
        
        guardarBtn = new JButton("Guardar");
        add(guardarBtn);
        
        setVisible(true);
    }
    
    private void cargarFoto() {
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try {
                FileInputStream fis = new FileInputStream(file);
                fotoBytes = fis.readAllBytes();
                fotoLabel.setText("Imagen cargada");
            } catch (IOException e) {
            }
        }
    }

    
}
