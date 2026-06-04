-- Last updated: 6/4/2026, 10:33:45 AM
-- Write your PostgreSQL query statement below
SELECT email
FROM Person
GROUP BY email
HAVING COUNT(*) > 1;