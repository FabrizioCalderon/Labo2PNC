package com.automoviles.controller;

import com.automoviles.entity.Inventario;
import com.automoviles.repository.InventarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventario")
@CrossOrigin(origins = "*")
public class InventarioController {

    @Autowired
    private InventarioRepository inventarioRepository;

    @GetMapping("/local/{nombreLocal}")
    public ResponseEntity<List<Inventario>> getInventarioPorLocal(@PathVariable String nombreLocal) {
        List<Inventario> inventario = inventarioRepository.findByNombreLocal(nombreLocal);
        if (inventario.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(inventario);
    }

    @GetMapping("/todos")
    public ResponseEntity<List<Inventario>> getAllInventario() {
        List<Inventario> inventario = inventarioRepository.findAll();
        if (inventario.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(inventario);
    }
} 