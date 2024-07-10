-- Esta consulta SQL combina el uso de COUNT y HAVING para realizar un filtro basado en el resultado de una función de agregación.
SELECT COUNT(age) FROM users HAVING COUNT(age) > 0