select p.name
from products p
join providers f on p.id_providers = f.id
where f.name LIKE 'P%' and p.amount BETWEEN 10 and 20;