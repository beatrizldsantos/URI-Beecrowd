select format('Approved: %s', name) as name, grade
from students
where grade >= 7.0
order by grade desc;