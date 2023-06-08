select c.name
from customers c
join legal_person l on c.id = l.id_customers;