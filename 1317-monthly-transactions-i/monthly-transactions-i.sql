# Write your MySQL query statement below
select Left(trans_date,7) as month,country,count(state) as trans_count,sum(state="approved") as approved_count,sum(amount) as trans_total_amount,sum((state='approved')*amount) as approved_total_amount
from Transactions
group by month,country;