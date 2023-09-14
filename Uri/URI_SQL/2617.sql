select p.name, f.name
from products p 
join providers f on p.id_providers = f.id
where f.name = 'Ajax SA';