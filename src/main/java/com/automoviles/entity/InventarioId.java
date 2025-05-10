package com.automoviles.entity;

import lombok.Data;
import java.io.Serializable;

@Data
public class InventarioId implements Serializable {
    private String modelo;
    private String nombreLocal;
} 