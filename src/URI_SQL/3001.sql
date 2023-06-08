SELECT p.name,
CASE
    WHEN p.type = 'A' THEN 20.0
    WHEN p.type = 'B' THEN 70.0
    ELSE 530.5
END AS price
FROM products p
ORDER BY p.type asc, p.id desc;