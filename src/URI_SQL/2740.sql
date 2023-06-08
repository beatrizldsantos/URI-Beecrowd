(select format('Podium: %s', team) as name
from league
limit 3)
UNION ALL
(WITH t AS (SELECT team, position FROM league ORDER BY position DESC LIMIT 2)
 SELECT format('Demoted: %s', t.team) FROM t ORDER BY t.position ASC)