# Write your MySQL query statement below
select e2.name
from employee e1
inner join employee e2
on e1.managerId=e2.id
group by e2.id,e2.name
having count(e1.id)>=5;