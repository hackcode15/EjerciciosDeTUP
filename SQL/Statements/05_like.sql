-- muestra todos los registros de la tabla users donde el correo electrónico termina en "gmail.com".
SELECT * FROM users WHERE email LIKE '%gmail.com';

--  muestra todos los correos electrónicos que comienzan con "vale".
SELECT * FROM users WHERE email LIKE 'vale%';