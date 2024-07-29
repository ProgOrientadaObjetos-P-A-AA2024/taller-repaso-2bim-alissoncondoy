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
public class TipoCamioneta extends Vehiculo {
    private double porcentajeAdicionalImportacion;
    private double valorAdicionalImportacion;
    private double seguroMantenimiento;

    public TipoCamioneta(double porcAdiI, double seguroM, Comprador pro, String mar,
            double precioB) {
        super(pro, mar, precioB);
        porcentajeAdicionalImportacion = porcAdiI;
        seguroMantenimiento = seguroM;
    }

    public void establecerPorcentajeAdicionalImportacion(double n) {
        porcentajeAdicionalImportacion = n;
    }

    public void establecerValorAdicionalImportacion() {
        valorAdicionalImportacion = precioBase * (porcentajeAdicionalImportacion / 100);
        seguroMantenimiento = valorAdicionalImportacion * 1.5;
    }
    
    public void establcerSeguroMantenimiento(double n){
        seguroMantenimiento = n;
    }

    @Override
    public void establecerPrecioFinal() {
        precioFinal = precioBase + valorAdicionalImportacion + seguroMantenimiento;
    }

    public double obtenerPorcentajeAdicionalImportacion() {
        return porcentajeAdicionalImportacion;
    }

    public double obtenerValorAdicionalImportacion() {
        return valorAdicionalImportacion;
    }

    public double obtenerSeguroMantenimiento() {
        return seguroMantenimiento;
    }

    @Override
    public String toString() {
        String cadena = String.format("TIPO CAMIONETA\n"
                + "%s"
                + "Porcentaje adicional de importacion: %.2f%%\n"
                + "Valor adicional de importacion: $%.2f\n"
                + "Seguro de mantenimiento: $%.2f\n"
                + "Precio final: $%.2f\n",
                super.toString(),
                obtenerPorcentajeAdicionalImportacion(),
                obtenerValorAdicionalImportacion(),
                obtenerSeguroMantenimiento(),
                obtenerPrecioFinal());
        return cadena;
    }
}
