create database mysql_gcr;
use mysql_gcr;

create table Employee(Id int(5) primary key, Name char(20), Salary decimal(10,2));

insert into Employee values(101, "Abhinav Shakya" , 12000.00);
insert into Employee values(102, "Mansi Pathak" , 10000.00);
insert into Employee values(103, "Manasvi Suryavanshi" , 13000.00);
insert into Employee values(104, "Raman Jothe" , 14000.00);
insert into Employee values(105, "Vikash Dubey" , 15000.00);


select * from Employee;
+-----+---------------------------+-----------+
| Id  | Name                      | Salary    |
+-----+---------------------------+-----------+
| 101 | Abhinav Shakya            | 12000.00  |
| 102 | Mansi Pathak              | 10000.00  |
| 103 | Manasvi Suryavanshi		  | 13000.00  |
| 104 | Raman Jothe               | 14000.00  |
| 105 | Vikash Dubey              | 15000.00  |
+-----+---------------------------+-----------+


update Employee set Salary = 15000.00 where Id = 103;

select * from Employee;
+-----+---------------------------+-----------+
| Id  | Name                      | Salary    |
+-----+---------------------------+-----------+
| 101 | Abhinav Shakya            | 12000.00  |
| 102 | Mansi Pathak              | 10000.00  |
| 103 | Manasvi Suryavanshi       | 15000.00  |
| 104 | Raman Jothe               | 14000.00  |
| 105 | Vikash Dubey              | 15000.00  |
+-----+---------------------------+-----------+


delete from Employee where Id = 105;

select * from Employee;
+-----+---------------------------+-----------+
| Id  | Name                      | Salary    |
+-----+---------------------------+-----------+
| 101 | Abhinav Shakya            | 12000.00  |
| 102 | Mansi Pathak              | 10000.00  |
| 103 | Manasvi Suryavanshi       | 15000.00  |
| 104 | Raman Jothe               | 14000.00  |
+-----+---------------------------+-----------+


select * from Employee where name = 'Mansi Pathak';
+-----+---------------------------+-----------+
| Id  | Name                      | Salary    |
+-----+---------------------------+-----------+
| 102 | Mansi Pathak              | 10000.00  |
+-----+---------------------------+-----------+



