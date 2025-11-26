package com.inventario.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Producto {
    @Id // Identificador único del producto
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Se auto incrementa automáticamente
    private Long id;

    private String nombre; //nombre del producto
    private String codigo; //código del producto
    private int cantidad; //cantidad disponible del producto
    private double precio; //precio del producto

    // Constructor vacío requerido por JPA
    public Producto() {}

    // Constructor con parámetros
    public Producto(String nombre, String codigo, int cantidad, double precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
}
