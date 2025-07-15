# Write your MySQL query statement below
SELECT p.project_id, ROUND(SUM(e.experience_years)/COUNT(e.employee_id),2) as average_years 
FROM Project p
left join Employee e
on p.employee_id=e.employee_id
group by p.project_id;
