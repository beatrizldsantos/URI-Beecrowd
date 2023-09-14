select p.name, f.name, c.name
from products p
join providers f on p.id_providers = f.id
join categories c on p.id_categories = c.id
where f.name = 'Sansul SA' and c.name = 'Imported';