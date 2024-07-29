/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;
import java.util.ArrayList;
import paquete01.Comprador;
import paquete02.Concesionaria;
import paquete02.TipoCamioneta;
import paquete02.TipoSedan;
import paquete02.TipoSuv;
import paquete02.Vehiculo;

/**
 *
 * @author InnoVausuario
 */
public class Principal {
    public static void main(String[] args) {
        Comprador comprador1 = new Comprador("Sebastian Mena", "1103323711");
        Comprador comprador2 = new Comprador("Mateo Carrion", "1717670168");
        Comprador comprador3 = new Comprador("Mari Ochoa", "1150261665");

        TipoSedan sedan1 = new TipoSedan(15,150.0,comprador1,
                "Mercedes",29000);
        sedan1.establecerValorDescuento();
        TipoSedan sedan2 = new TipoSedan(22,500.0,comprador2,
                "Suzuki",20000);
        sedan2.establecerValorDescuento();
        
        
        TipoSuv suv = new TipoSuv(10,300.0, comprador1, 
                "Kia", 25000);
        suv.establecerSeguroPersona();

        TipoCamioneta camioneta = new TipoCamioneta(13,100,comprador2,
                "Toyota",26000);
        camioneta.establecerValorAdicionalImportacion();

        ArrayList<Vehiculo> lista = new ArrayList<>();
        lista.add(sedan1);
        lista.add(sedan2);
        lista.add(suv);
        lista.add(camioneta);

        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).establecerPrecioFinal();
        }
        
        Concesionaria concesionaria = new Concesionaria();
        concesionaria.establecerNombre("Concesionaria Cars");
        concesionaria.establecerVehiculos(lista);
        concesionaria.establecerVentasTotales();
        concesionaria.establecerVehiculoMasCaro();
        concesionaria.establecerVehiculoMasBarato();

        System.out.println(concesionaria);
    }
}