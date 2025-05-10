package com.automoviles.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "venta")
public class Venta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nombre_local")
    private String nombreLocal;
    
    @Column(name = "modelo")
    private String modelo;
    
    @Column(name = "id_empleado")
    private Long idEmpleado;
    
    @Column(name = "nombre_empleado")
    private String nombreEmpleado;
} 