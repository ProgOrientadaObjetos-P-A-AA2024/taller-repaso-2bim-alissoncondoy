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
public class TipoSedan extends Vehiculo {
    private double porcentajeDescuento;
    private double valorDescuento;
    private double seguroMecanico;

    public TipoSedan(double porcentajeD, double seguroM, Comprador pro, String mar,
            double precioB) {
        super(pro, mar, precioB);
        porcentajeDescuento = porcentajeD;
        seguroMecanico = seguroM;
    }

    public void establecerPorcentajeDescuento(double n) {
        porcentajeDescuento = n;
    }

    public void establecerValorDescuento() {
        valorDescuento = precioBase * (porcentajeDescuento / 100);
    }

    @Override
    public void establecerPrecioFinal() {
        seguroMecanico = precioBase * 0.01;
        precioFinal = precioBase - valorDescuento + seguroMecanico;
    }

    public double obtenerPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public double obtenerValorDescuento() {
        return valorDescuento;
    }

    public double obtenerSeguroMecanico() {
        return seguroMecanico;
    }

    @Override
    public String toString() {
        String cadena = String.format("TIPO SEDAN\n"
                + "%s"
                + "Porcentaje de descuento: %.2f%%\n"
                + "Valor descuento: $%.2f\n"
                + "Seguro mecanico: $%.2f\n"
                + "Precio final: $%.2f\n",
                super.toString(),
                obtenerPorcentajeDescuento(),
                obtenerValorDescuento(),
                obtenerSeguroMecanico(),
                obtenerPrecioFinal());
        return cadena;
    }
}