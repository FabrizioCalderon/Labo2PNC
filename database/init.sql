-- Crear la base de datos
DROP DATABASE IF EXISTS automoviles_db;
CREATE DATABASE automoviles_db;

-- Conectarse a la base de datos
\c automoviles_db;

-- Crear la tabla de inventario
CREATE TABLE inventario (
    modelo VARCHAR(100),
    nombre_local VARCHAR(100),
    cantidad INTEGER,
    costo DECIMAL(10,2),
    precio_venta DECIMAL(10,2),
    PRIMARY KEY (modelo, nombre_local)
);

-- Crear la tabla de ventas
CREATE TABLE venta (
    id SERIAL PRIMARY KEY,
    nombre_local VARCHAR(100),
    modelo VARCHAR(100),
    id_empleado BIGINT,
    nombre_empleado VARCHAR(100)
);

-- Insertar algunos datos de ejemplo
INSERT INTO inventario (modelo, nombre_local, cantidad, costo, precio_venta) VALUES
('Toyota Corolla', 'Local Central', 5, 25000.00, 30000.00),
('Honda Civic', 'Local Norte', 3, 22000.00, 28000.00),
('Ford Mustang', 'Local Sur', 2, 35000.00, 45000.00);

INSERT INTO venta (nombre_local, modelo, id_empleado, nombre_empleado) VALUES
('Local Central', 'Toyota Corolla', 1, 'Juan Pérez'),
('Local Norte', 'Honda Civic', 2, 'María García'),
('Local Sur', 'Ford Mustang', 3, 'Carlos López'); 