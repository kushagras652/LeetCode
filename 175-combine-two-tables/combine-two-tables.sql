# Write your MySQL query statement below
# SELECT Person.firstName,Person.lastName,Address.city,Address.state
# FROM Person
# INNER JOIN Address
# ON Person.personId=Address.personId;
SELECT 
    p.firstName,
    p.lastName,
    a.city,
    a.state
FROM 
    Person p
LEFT JOIN 
    Address a
ON 
    p.personId = a.personId;
