-- Esta consulta cuenta cuántos registros hay para cada valor único de age en la tabla users.
SELECT COUNT(age), age FROM users GROUP BY age;

-- Esta consulta cuenta cuántos registros hay para cada valor único de age en la tabla users, 
-- y luego ordena los resultados por age en orden ascendente.
SELECT COUNT(age), age FROM users GROUP BY age ORDER BY age ASC;

-- Esta consulta cuenta cuántos registros hay para cada valor único de age en la tabla users donde age es mayor que 22, 
-- y luego ordena los resultados por age en orden ascendente.
SELECT COUNT(age), age FROM users WHERE age > 22 GROUP BY age ORDER BY age ASC;