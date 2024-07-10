--Esta consulta selecciona todos los registros de la tabla users donde el campo name es igual a 'Diego'.
SELECT * FROM users WHERE name IN ('Diego');

-- Esta consulta selecciona todos los registros de la tabla users donde el campo name es igual a 'Diego' o 'Valentina'.
SELECT * FROM users WHERE name IN ('Diego', 'Valentina');