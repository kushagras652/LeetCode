SELECT 
    s.user_id, 
    ROUND(
        SUM(IFNULL(c.action, 'timeout') = 'confirmed') / 
        (SUM(IFNULL(c.action, 'timeout') = 'timeout') + SUM(IFNULL(c.action, 'timeout') = 'confirmed')), 
    2) AS confirmation_rate
FROM Signups s
LEFT JOIN Confirmations c
ON s.user_id = c.user_id
GROUP BY s.user_id;
