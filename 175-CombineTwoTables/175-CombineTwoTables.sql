-- Last updated: 6/4/2026, 10:33:52 AM
-- Write your PostgreSQL query statement below
SELECT p.firstName, 
       p.lastName, 
       a.city, 
       a.state
FROM Person p
LEFT JOIN Address a
ON p.personId = a.personId;