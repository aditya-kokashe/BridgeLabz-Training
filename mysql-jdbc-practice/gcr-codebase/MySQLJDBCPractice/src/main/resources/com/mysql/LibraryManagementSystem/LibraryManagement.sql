create database library_system;
use library_system;


create table Book(
    book_id int primary key,
    title varchar(50),
    author varchar(40),
    category varchar(30),
    available_copies int
);


create table Student(
    student_id int primary key,
    name varchar(40),
    department varchar(30)
);


create table Borrow(
    borrow_id int auto_increment primary key,
    student_id int,
    book_id int,
    borrow_date date,
    return_date date,
    fine decimal(8,2),
    foreign key(student_id) references Student(student_id),
    foreign key(book_id) references Book(book_id)
);



insert into Book values(1, "Java", "James", "Programming", 5);
insert into Book values(2, "Database", "Common", "Database", 3);
insert into Book values(3, "Operating", "Galvin", "System", 4);


insert into Student values(101, "Rahul Sharma", "CSE");
insert into Student values(102, "Sneha Verma", "IT");



select * from Book;
+---------+--------------------+---------------+-------------+------------------+
| book_id | title              | author        | category    | available_copies |
+---------+--------------------+---------------+-------------+------------------+
| 1       | Java 			   | James         | Programming | 5                |
| 2       | Database 		   | Common        | Database    | 3                |
| 3       | Operating  		   | Galvin        | System      | 4                |
+---------+--------------------+---------------+-------------+------------------+



update Book
set available_copies = available_copies - 1
where book_id = 1;


insert into Borrow(student_id, book_id, borrow_date)
values(101, 1, '2026-02-01');


select * from Borrow;
+-----------+------------+---------+------------+-------------+------+
| borrow_id | student_id | book_id | borrow_date| return_date | fine |
+-----------+------------+---------+------------+-------------+------+
| 1         | 101        | 1       | 2026-02-01 | NULL        | NULL |
+-----------+------------+---------+------------+-------------+------+


update Borrow
set return_date = '2026-02-15',
    fine = (datediff('2026-02-15','2026-02-01') - 7) * 10
where borrow_id = 1;


update Book
set available_copies = available_copies + 1
where book_id = 1;

select * from Borrow;
+-----------+------------+---------+------------+------------+-------+
| borrow_id | student_id | book_id | borrow_date| return_date| fine  |
+-----------+------------+---------+------------+------------+-------+
| 1         | 101        | 1       | 2026-02-01 | 2026-02-15 | 70.00 |
+-----------+------------+---------+------------+------------+-------+


select * from Book
where category = "Database"
and available_copies > 0;
+---------+------------------+----------+----------+------------------+
| book_id | title            | author   | category | available_copies |
+---------+------------------+----------+----------+------------------+
| 2       | Database         | Common   | Database | 3                |
+---------+------------------+----------+----------+------------------+

