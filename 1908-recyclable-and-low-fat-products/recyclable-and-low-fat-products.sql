SELECT p1.product_id
FROM Products p1
INNER JOIN Products p2
ON p1.product_id = p2.product_id
WHERE p1.low_fats = 'Y' AND p2.recyclable = 'Y';
