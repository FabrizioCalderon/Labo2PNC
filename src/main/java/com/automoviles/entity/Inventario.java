package com.automoviles.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "inventario")
@IdClass(InventarioId.class)
public class Inventario {
    
    @Id
    @Column(name = "modelo")
    private String modelo;
    
    @Id
    @Column(name = "nombre_local")
    private String nombreLocal;
    
    @Column(name = "cantidad")
    private Integer cantidad;
    
    @Column(name = "costo")
    private Double costo;
    
    @Column(name = "precio_venta")
    private Double precioVenta;
} 