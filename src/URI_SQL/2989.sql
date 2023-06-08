with b (matr, nome, valor, dep, div) as 
(
select e.matr, e.nome, v.valor as valor, e.lotacao, e.lotacao_div from empregado e
join emp_venc on e.matr = emp_venc.matr
join vencimento v on emp_venc.cod_venc = v.cod_venc
UNION ALL
select e.matr, e.nome, (d.valor * -1.0) as valor, e.lotacao, e.lotacao_div from empregado e
join emp_desc on e.matr = emp_desc.matr
join desconto d on emp_desc.cod_desc = d.cod_desc
),
a (dep, div, nome, salario) as
(
select dep.nome, div.nome, b.nome, sum(b.valor) as salario from b
join departamento dep on dep.cod_dep = b.dep
join divisao div on div.cod_divisao = b.div
group by dep.nome, div.nome, b.nome
order by dep.nome asc, div.nome asc
)
select dep as departamento, div as divisao, round(avg(salario),2) as media, round(max(salario),2) as maior 
from a
group by departamento, divisao
order by media desc;