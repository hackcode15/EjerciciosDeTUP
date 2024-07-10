-- muestra todos los registros de la tabla users donde el correo electrónico no es 'vale2016@hotmail.com'.
SELECT * FROM users WHERE NOT email = 'vale2016@hotmail.com';

-- muestra todos los registros de la tabla users donde el correo electrónico no es 'vale2016@hotmail.com' y la edad es 19.
SELECT * FROM users WHERE NOT email = 'vale2016@hotmail.com' AND age = 19;

-- muestra todos los registros de la tabla users donde el correo electrónico no es 'vale2016@hotmail.com' o la edad es 19.
SELECT * FROM users WHERE NOT email = 'vale2016@hotmail.com' OR age = 19;