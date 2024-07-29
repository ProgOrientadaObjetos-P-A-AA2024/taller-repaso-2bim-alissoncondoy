/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;
import paquete01.Comprador;

/**
 *
 * @author InnoVausuario
 */
public abstract class Vehiculo {
    protected Comprador propietario;
    protected String marca;
    protected double precioBase;
    protected double precioFinal;

    public Vehiculo(Comprador pro, String mar, double precioB) {
        propietario = pro;
        marca = mar;
        precioBase = precioB;
    }

    public void establecerPropietario(Comprador n) {
        propietario = n;
    }

    public void establecerMarca(String n) {
        marca = n;
    }

    public void establecerPrecioBase(double n) {
        precioBase = n;
    }

    public abstract void establecerPrecioFinal();

    public Comprador obtenerPropietario() {
        return propietario;
    }

    public String obtenerMarca() {
        return marca;
    }

    public double obtenerPrecioBase() {
        return precioBase;
    }

    public double obtenerPrecioFinal() {
        return precioFinal;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("%s\n"
                + "Marca: %s\n"
                + "Precio base: $%.2f\n",
                propietario.toString(),
                obtenerMarca(),
                obtenerPrecioBase());
        return cadena;
    }
}

    
       
