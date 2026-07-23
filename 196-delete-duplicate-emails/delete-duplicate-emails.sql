# Write your MySQL query statement below
-- Select distinct id,email from Person;
Delete p1
from Person p1
join person p2
on p1.email=p2.email and p1.id>p2.id