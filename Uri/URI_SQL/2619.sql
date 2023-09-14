select p.name, f.name, p.price
from products p
join providers f on p.id_providers = f.id
join categories c on p.id_categories = c.id
where p.price > 1000 and c.name = 'Super Luxury';