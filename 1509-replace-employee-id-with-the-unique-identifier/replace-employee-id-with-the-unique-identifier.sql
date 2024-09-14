# Write your MySQL query statement below
#SELECT uni.unique_id,emp.name
#FROM Employees as emp
#LEFT JOIN EmployeeUNI as uni
#ON uni.id=emp.id;

SELECT uni.unique_id,emp.name
FROM EmployeeUNI as uni
RIGHT JOIN Employees as emp
ON uni.id=emp.id;