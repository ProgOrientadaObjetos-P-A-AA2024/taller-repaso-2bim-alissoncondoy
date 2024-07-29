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
public class TipoSuv extends Vehiculo{
    private double porcentajeSeguro;
    private double seguroPersona;

    public TipoSuv(double porcentajeS, double seguroP, Comprador pro, String mar,
            double precioB) {
        super(pro, mar, precioB);
        porcentajeSeguro = porcentajeS;
        seguroPersona = seguroP;
    }

    public void establecerPorcentajeSeguroPers(double n) {
        porcentajeSeguro = n;
    }

    public void establecerSeguroPersona() {
        seguroPersona = precioBase * (porcentajeSeguro / 100);
    }
    
    @Override
    public void establecerPrecioFinal() {
        precioFinal = precioBase + seguroPersona;   
    }

    public double obtenerPorcentajeSeguroPers() {
        return porcentajeSeguro;
    }

    public double obtenerSeguroPerson() {
        return seguroPersona;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("TIPO SUV\n"
                + "%s"
                + "Porcentaje adicional del seguro: %.2f%%\n"
                + "Seguro personas: $%.2f\n"
                + "Precio final: $%.2f\n", 
                super.toString(),
                obtenerPorcentajeSeguroPers(),
                obtenerSeguroPerson(),
                obtenerPrecioFinal());
        return cadena;
    }
}
    

