/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

/**
 *
 * @author InnoVausuario
 */
public class Comprador {

    private String nombre;
    private String cedula;

    public Comprador(String nom, String id) {
        nombre = nom;
        cedula = id;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerCedula(String n) {
        cedula = n;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCedula() {
        return cedula;
    }

    @Override
    public String toString() {
        String cadena = String.format(
                "Nombre: %s\n"
                + "Cedula: %s\n",
                obtenerNombre(),
                obtenerCedula());
        return cadena;
    }
}
