create database bank_system;
use bank_system;

create table Account(
    account_no int primary key,
    holder_name varchar(30),
    balance decimal(12,2)
);

create table Transaction_History(
    txn_id int auto_increment primary key,
    from_account int,
    to_account int,
    amount decimal(12,2),
    txn_date timestamp default current_timestamp
);

insert into Account values(2001, "Amit Singh", 40000.00);
insert into Account values(2002, "Neha Kapoor", 25000.00);


select * from Account;
+------------+---------------+----------+
| account_no | holder_name   | balance  |
+------------+---------------+----------+
| 2001       | Amit Singh    | 40000.00 |
| 2002       | Neha Kapoor   | 25000.00 |
+------------+---------------+----------+


-- start transaction
start transaction;

update Account
set balance = balance - 10000
where account_no = 2001;

update Account
set balance = balance + 10000
where account_no = 2002;

insert into Transaction_History(from_account, to_account, amount)
values(2001, 2002, 10000);

commit;
-- transaction end


select * from Account;
+------------+---------------+----------+
| account_no | holder_name   | balance  |
+------------+---------------+----------+
| 2001       | Amit Singh    | 30000.00 |
| 2002       | Neha Kapoor   | 35000.00 |
+------------+---------------+----------+


select * from Transaction_History;
+--------+--------------+------------+---------+---------------------+
| txn_id | from_account | to_account | amount  | txn_date            |
+--------+--------------+------------+---------+---------------------+
| 1      | 2001         | 2002       | 10000.00| 2026-02-13 10:15:21 |
+--------+--------------+------------+---------+---------------------+






















