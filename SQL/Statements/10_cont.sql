-- Esta consulta cuenta el número total de registros en la tabla users, sin importar si algunos campos son NULL o no.
SELECT COUNT(*) FROM users; 

-- Esta consulta cuenta el número de registros en la tabla users donde el campo age no es NULL.
SELECT COUNT(age) FROM users; 

-- Esta consulta cuenta el número de registros en la tabla users donde el campo email no es NULL.
SELECT COUNT(email) FROM users; 
