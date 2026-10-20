Select employee_id,
Case when employee_id%2 = 1 and name not like 'M%'
then salary else 0 end as bonus
from employees
Order by employee_id