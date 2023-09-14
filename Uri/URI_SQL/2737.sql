(SELECT l.name, l.customers_number 
from lawyers l
where l.customers_number in ((select max(customers_number) from lawyers),(select min(customers_number) from lawyers))
order by l.customers_number DESC)
UNION ALL
(select 'Average', round(avg(customers_number)) from lawyers)