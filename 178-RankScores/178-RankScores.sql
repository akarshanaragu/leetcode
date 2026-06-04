-- Last updated: 6/4/2026, 10:33:47 AM
-- Write your PostgreSQL query statement below
SELECT score,
       DENSE_RANK() OVER (ORDER BY score DESC) AS rank
FROM Scores;