select l.name, cast(extract(DAY from l.payday) as integer) as day
from loan l;