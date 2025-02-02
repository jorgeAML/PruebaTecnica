/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba_tecnica_crud1.Models;

/**
 *
 * @author jorge
 */
public class Usuario {
    int id;
    String nombre;
    int edad;
    String direccion;
    String telefono;
    byte[] foto;
    
    public Usuario(String nombre, int edad, String direccion, String telefono, byte[] foto) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.foto = foto;
    }
}
