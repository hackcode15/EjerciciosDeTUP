-- SINTAXIS DE SQL SERVER
-- CREAMOS LA BASE DE DATOS
-- CREATE DATABASE pizzaTOT;

-- USAMOS LA BD CREADA
USE pizzaTOT;

-- CREACIONES DE TABLAS
/*CREATE TABLE pizza (
	id_pizza INT NOT NULL IDENTITY(1,1), -- AUTO INCREMENTABLE
	nombre VARCHAR(100) NOT NULL,
	precio FLOAT NOT NULL,
	stock INT NOT NULL,
	PRIMARY KEY(id_pizza)
);*/

/*CREATE TABLE ingrediente (
	id_ingrediente INT NOT NULL IDENTITY(1,1),
	nombre VARCHAR(100) NOT NULL,
	stock INT NOT NULL,
	PRIMARY KEY(id_ingrediente)
);*/

/*CREATE TABLE ingredientexpizza (
	id INT NOT NULL IDENTITY(1,1),
	id_pizza INT NOT NULL,
	id_ingrediente INT NOT NULL,
	CONSTRAINT fk_pizza FOREIGN KEY(id_pizza) REFERENCES pizza(id_pizza),
	CONSTRAINT fk_ingrediente FOREIGN KEY(id_ingrediente) REFERENCES ingrediente(id_ingrediente)
);*/

-- SEEDER
/*INSERT INTO pizza (nombre, precio, stock) VALUES
('Margarita', 10.99, 25),
('Pepperoni', 12.99, 18),
('Vegetariana', 11.50, 30);*/

/*INSERT INTO ingrediente (nombre, stock) VALUES
('Masa', 100),
('Salsa de tomate', 50),
('Queso mozzarella', 75),
('Pepperoni', 40),
('Champi�ones', 30),
('Pimientos', 35),
('Cebolla', 45);*/

/*INSERT INTO ingredientexpizza (id_pizza, id_ingrediente) VALUES
(1, 1), (1, 2), (1, 3),
(2, 1), (2, 2), (2, 3), 
(2, 4), (3, 1), (3, 2), 
(3, 5), (3, 6), (3, 7);*/

-- Procedimientos almacenados
CREATE PROCEDURE agregar_pizza
	@n_nombre VARCHAR(100),
	@n_precio FLOAT,
	@n_stock INT
AS
BEGIN
	INSERT INTO pizza(nombre, precio, stock)
	VALUES (@n_nombre, @n_precio, @n_stock)
END

CREATE PROCEDURE actualizar_pizza
	@n_id_pizza INT,
	@n_precio FLOAT
AS
BEGIN
	UPDATE pizza SET precio = @n_precio WHERE id_pizza = @n_id_pizza
END

CREATE PROCEDURE agregar_ingrediente
	@n_nombre VARCHAR(100),
	@n_stock INT
AS
BEGIN
	INSERT INTO ingrediente(nombre, stock)
	VALUES (@n_nombre, @n_stock)
END

CREATE PROCEDURE actualizar_ingrediente
	@n_id_ingrediente INT,
	@n_nombre VARCHAR(100)
AS
BEGIN
	UPDATE ingrediente SET nombre = @n_nombre WHERE id_ingrediente = @n_id_ingrediente
END

UPDATE ingrediente SET nombre = 'Jamon Crudo' WHERE id_ingrediente = 1;

-- CONSULTAS
SELECT * FROM pizza;
SELECT * FROM ingrediente;
SELECT * FROM ingredientexpizza;

-- LISTAR LAS PIZZAS CON SUS INGREDIENTES
SELECT p.nombre AS 'NOMBRE PIZZA', i.nombre AS 'NOMBRE_INGREDIENTE'
FROM ingredientexpizza ixp 
LEFT JOIN pizza p ON ixp.id_pizza = p.id_pizza
LEFT JOIN ingrediente i ON ixp.id_ingrediente = i.id_ingrediente
ORDER BY p.nombre;

-- LISTAR LAS PIZZAS CON SU CANTIDAD DE INGREDIENTES
SELECT p.nombre AS 'NOMBRE_PIZZA', COUNT(ixp.id) AS 'CANTIDAD_INGREDIENTES'
FROM ingredientexpizza ixp
LEFT JOIN pizza p ON ixp.id_pizza = p.id_pizza
GROUP BY p.nombre
ORDER BY CANTIDAD_INGREDIENTES;

-- LISTAR LOS INGREDIENTES DE UNA PIZZA EN ESPECIFICO
SELECT i.nombre AS 'INGREDIENTE'
FROM ingredientexpizza ixp
LEFT JOIN ingrediente i ON ixp.id_ingrediente = i.id_ingrediente
LEFT JOIN pizza p ON ixp.id_pizza = p.id_pizza
WHERE p.nombre = 'Margarita'
ORDER BY i.nombre;

-- ELIMINAR UN INGREDIENTE DE UNA PIZZA
DELETE FROM ingredientexpizza WHERE id_pizza = 1;

CREATE PROCEDURE agregar_ingrediente_a_pizza
	@n_id_pizza INT,
	@n_id_ingrediente INT
AS
BEGIN
	INSERT INTO ingredientexpizza (id_pizza, id_ingrediente)
	VALUES (@n_id_pizza, @n_id_ingrediente)
END

-- ver los ingredientes de una pizza
SELECT i.nombre AS 'NOMBRE_INGREDIENTE'
FROM ingredientexpizza ixp
LEFT JOIN ingrediente i ON ixp.id_ingrediente = i.id_ingrediente
LEFT JOIN pizza p ON ixp.id_pizza = p.id_pizza
WHERE p.id_pizza = 1
ORDER BY i.nombre;

CREATE PROCEDURE ver_ingredientes_de_una_pizza 
	@n_id_pizza INT
AS
BEGIN
	SELECT i.nombre AS 'NOMBRE_INGREDIENTE'
	FROM ingredientexpizza ixp
	LEFT JOIN ingrediente i ON ixp.id_ingrediente = i.id_ingrediente
	LEFT JOIN pizza p ON ixp.id_pizza = p.id_pizza
	WHERE p.id_pizza = @n_id_pizza
	ORDER BY i.nombre;
END

-- a�adir ingrediente a pizza
CREATE PROCEDURE a�adir_ingrediente_a_pizza
	@n_id_pizza INT,
	@n_id_ingrediente INT
AS
BEGIN
	INSERT INTO ingredientexpizza(id_pizza, id_ingrediente)
	VALUES (@n_id_pizza, @n_id_ingrediente)
END

SELECT * FROM pizza;
SELECT * FROM ingrediente;
SELECT * FROM ingredientexpizza;

DELETE FROM ingredientexpizza 
WHERE id_pizza = 1 AND id_ingrediente = 2;

CREATE PROCEDURE eliminar_ingrediente_de_pizza
    @id_pizza INT,
    @id_ingrediente INT
AS
BEGIN
    DELETE FROM ingredientexpizza 
    WHERE id_pizza = @id_pizza AND id_ingrediente = @id_ingrediente
END
