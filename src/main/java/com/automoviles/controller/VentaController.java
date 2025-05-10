package com.automoviles.controller;

import com.automoviles.entity.Venta;
import com.automoviles.repository.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ventas")
@CrossOrigin(origins = "*")
public class VentaController {

    @Autowired
    private VentaRepository ventaRepository;

    @GetMapping("/modelo/{modelo}")
    public ResponseEntity<List<Venta>> getVentasPorModelo(@PathVariable String modelo) {
        List<Venta> ventas = ventaRepository.findByModelo(modelo);
        if (ventas.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(ventas);
    }

    @GetMapping("/todos")
    public ResponseEntity<List<Venta>> getAllVentas() {
        List<Venta> ventas = ventaRepository.findAll();
        if (ventas.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(ventas);
    }
} 