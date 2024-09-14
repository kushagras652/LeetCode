# Write your MySQL query statement below
select x.student_id , x.student_name , y.subject_name,count(z.student_id) as attended_exams
from Students x
cross join Subjects y
left join Examinations z
on x.student_id = z.student_id and y.subject_name = z.subject_name
group by x.student_id , x.student_name, y.subject_name
order by x.student_id,y.subject_name;

