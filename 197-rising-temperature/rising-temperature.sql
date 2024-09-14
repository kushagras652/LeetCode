# Write your MySQL query statement below
SELECT W1.id
FROM Weather as W1,Weather as W2
Where DATEDIFF(W1.recordDate,w2.recordDate)=1
AND W1.temperature>W2.temperature;