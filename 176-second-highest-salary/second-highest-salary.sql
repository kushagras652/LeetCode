# Write your MySQL query statement below
select max(salary) as SecondHighestSalary from Employee WHERE salary <(SELECT max(salary) from Employee);