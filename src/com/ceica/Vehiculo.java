package com.ceica;

public class Vehiculo
{
    public String marca,modelo,annofabricacion;

    public Vehiculo(String marca, String modelo, String annofabricacion)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.annofabricacion = annofabricacion;
    }

    public void mostrarDetalles()
    {
        System.out.println("Detalles del vehículo: ");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año de fabricación: " + annofabricacion);

    }
}
