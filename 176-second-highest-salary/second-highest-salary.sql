# Write your MySQL query statement below

-- select distinct salary SecondHighestSalary from employee order by salary desc limit 1,1;

select Max(salary) SecondHighestSalary from employee where salary < (select Max(salary) from employee where salary );
