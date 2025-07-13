# Write your MySQL query statement below


-- select E.name
-- from Employee E
-- join (
--     select managerId, COUNT(*) as reports
-- from Employee
-- where managerId is not null
-- group by managerId
-- having COUNT(*) >= 5
-- ) M
-- on E.id=M.managerId;


SELECT 
NAME
FROM Employee
WHERE ID IN (
    SELECT managerId
    FROM Employee
    GROUP BY managerId
    HAVING COUNT(*) >= 5)