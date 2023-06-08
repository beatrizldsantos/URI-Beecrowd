select c.id, c.name
from customers c left join locations l on c.id = l.id_customers 
group by c.id
having count(l.id) = 0
order by c.id;