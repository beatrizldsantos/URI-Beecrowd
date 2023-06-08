select c.name, round((((s.math*2.0) + (s.specific*3.0) + (s.project_plan * 5.0))/10.0),2) as avg
from candidate c
join score s on c.id = s.candidate_id
order by avg DESC;