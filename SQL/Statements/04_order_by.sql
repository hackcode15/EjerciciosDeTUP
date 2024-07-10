-- Ordena de menor a mayor (orden ascendente) por defecto
SELECT * FROM users ORDER BY age;

SELECT * FROM users ORDER BY age ASC; -- Orden ascendente

SELECT * FROM users ORDER BY age DESC; -- Orden descendente

-- Muestra todos los campos que tengan ese email y los ordena por edad de forma descendente
SELECT * FROM users WHERE email = 'taysonm895@gmail.com'  ORDER BY age DESC

-- Muestra solo los nombres que tengan ese email y los ordena por edad de forma descendente
SELECT name FROM users WHERE email = 'taysonm895@gmail.com'  ORDER BY age DESC


