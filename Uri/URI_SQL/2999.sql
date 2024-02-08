WITH ans AS
(
    SELECT 
        emp.nome AS Empregado,
        sal.sal_li AS salario,
        AVG(sal.sal_li) OVER (PARTITION BY div.cod_divisao) AS media_div
    FROM 
    (
        SELECT 
            sal_sum.matr,
            sal_sum.bruto AS sal_bruto,
            sal_desc.desconto AS sal_desc,
            COALESCE((sal_sum.bruto - sal_desc.desconto),sal_sum.bruto) AS sal_li
        FROM
            SELECT e.matr,  COALESCE(SUM(v.valor), 0) AS bruto 
            FROM 
                empregado AS e
            LEFT JOIN
                emp_venc AS ev
            ON e.matr = ev.matr
            LEFT JOIN
                vencimento AS v
            ON v.cod_venc = ev.cod_venc

            GROUP BY e.matr
        ) AS sal_sum
        LEFT JOIN
        (
            SELECT e.matr, SUM(d.valor) as desconto FROM
                empregado AS e
            JOIN
                emp_desc AS ed
            ON e.matr = ed.matr

            JOIN
                desconto AS d
            ON d.cod_desc = ed.cod_desc

            GROUP BY e.matr
        ) AS sal_desc

        ON sal_sum.matr = sal_desc.matr
    ) AS sal
    JOIN
    (
        SELECT nome, matr, lotacao_div, gerencia_div FROM empregado
    ) AS emp
    ON sal.matr = emp.matr
    JOIN
    (
        SELECT cod_divisao, nome FROM divisao
    ) AS div
    ON div.cod_divisao IN ( emp.lotacao_div, emp.gerencia_div )
)
select empregado, salario FROM ans
WHERE (salario >= 8000) AND salario > media_div;
