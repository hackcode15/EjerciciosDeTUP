-- Muestra todos los usuarios con edad = 19
SELECT * FROM users WHERE age = 19;

-- Muestra los nombres unicos que tienen 15 años
SELECT DISTINCT name FROM users WHERE age = 15;

-- Muestra la lista de edades unicas que tienen 15 años
SELECT DISTINCT age FROM users WHERE age = 15;

-- Muestra todos los usuarios con edad mayor a 19
SELECT * FROM users WHERE age > 19;