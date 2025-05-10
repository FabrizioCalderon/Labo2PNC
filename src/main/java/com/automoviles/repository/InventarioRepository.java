package com.automoviles.repository;

import com.automoviles.entity.Inventario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface InventarioRepository extends JpaRepository<Inventario, String> {
    List<Inventario> findByNombreLocal(String nombreLocal);
} 