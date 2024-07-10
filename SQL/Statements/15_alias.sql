
-- Esta consulta selecciona el campo name y renombra el campo init_date como 'fecha de inicio en programacion' de la tabla users,
--pero solo para registros donde el campo name sea igual a 'Diego'.
SELECT name, init_date AS 'fecha de inicio en programacion' FROM users WHERE name = 'Diego';

-- Esta consulta concatena los campos name y surname de la tabla users y renombra el resultado como 'Nombre Completo'.
SELECT CONCAT(name, surname) AS 'Nombre Completo' FROM users;

--Esta consulta concatena el texto 'Nombre: ' con el campo name, luego concatena ', Apellido: ' con el campo surname de la tabla users, 
-- y renombra el resultado como 'Nombre Completo'.
SELECT CONCAT('Nombre: ', name, ', Apellido: ', surname) AS 'Nombre Completo' FROM users;