WITH ClientPayback AS (
    SELECT
        c.name AS name,
        c.investment AS investment,
        o.client_id AS client_id,
        o.month AS month,
        SUM(o.profit) OVER (PARTITION BY o.client_id ORDER BY o.month) AS cumulative_profit
    FROM clients c
    JOIN operations o ON c.id = o.client_id
)
SELECT
    cp.name AS name,
    cp.investment AS investment,
    MIN(cp.month) AS month_of_payback,
    MIN(cp.cumulative_profit) - cp.investment AS "return"
FROM ClientPayback cp
WHERE cp.cumulative_profit >= cp.investment
GROUP BY cp.name, cp.investment
ORDER BY "return" DESC;
