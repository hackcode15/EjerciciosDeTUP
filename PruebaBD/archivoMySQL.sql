-- Creamos una base de datos
CREATE DATABASE pruebaBD;

-- Usamos la base de datos creada
USE pruebaBD;

-- Creacion de la tabla cliente
CREATE TABLE cliente (
	id_cliente INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(45) NOT NULL,
    apellido VARCHAR(45),
    edad INT NOT NULL,
    telefono VARCHAR(100),
    PRIMARY KEY(id_cliente)
);

-- Sedder
-- Insercion de datos
INSERT INTO cliente (nombre, apellido, edad, telefono) VALUES
('Juan', 'Pérez', 25, '+34 612345678'),
('María', 'González', 32, '+34 623456789'),
('Carlos', 'Rodríguez', 45, '+34 634567890'),
('Ana', 'Martínez', 28, '+34 645678901'),
('Luis', 'Sánchez', 37, '+34 656789012'),
('Laura', 'Fernández', 29, '+34 667890123'),
('Pedro', 'López', 41, '+34 678901234'),
('Carmen', 'Díaz', 33, '+34 689012345'),
('Miguel', 'Ruiz', 52, '+34 690123456'),
('Isabel', 'Torres', 39, '+34 601234567'),
('Francisco', 'Jiménez', 44, NULL),
('Patricia', 'Moreno', 31, '+34 612345987'),
('Alberto', 'Romero', 36, NULL),
('Lucía', 'Navarro', 27, '+34 623456098'),
('Roberto', 'Muñoz', 48, '+34 634567109');

SELECT * FROM cliente;

UPDATE cliente SET edad = 45, telefono = 77777 WHERE id_cliente = 12;
