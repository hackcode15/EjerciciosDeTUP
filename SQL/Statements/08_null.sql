-- muestra todos los registros de la tabla users donde el campo email es NULL.
SELECT * FROM users WHERE email IS NULL;

-- muestra todos los registros de la tabla users donde el campo email no es NULL.
SELECT * FROM users WHERE email IS NOT NULL;

-- muestra todos los registros de la tabla users donde el campo email no es NULL y la edad es 19.
SELECT * FROM users WHERE email IS NOT NULL AND age = 19;

-- muestra los campos name, surname y age de la tabla users. Si surname es NULL, devuelve 'vacio'. Si age es NULL, devuelve 0.
-- y con 'as' define el alias del encabezado de la columna
select name, ifnull(surname, 'vacio') as surname, ifnull(age, 0) as age from users;

-- Esta consulta evalúa la función ISNULL con el valor NULL. La función ISNULL devuelve 1 si el valor es NULL, de lo contrario, devuelve 0.
select isnull(null);