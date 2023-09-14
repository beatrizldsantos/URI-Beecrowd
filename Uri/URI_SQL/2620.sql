select c.name, o.id
from customers c inner join orders o on c.id = o.id_customers
where o.orders_date between to_date('2016-01-01','YYYY-MM-DD')
and to_date('2016-06-30','YYYY-MM-DD');
