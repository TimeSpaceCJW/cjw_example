create table admin (id int primary key, name varchar(40), deptName varchar(40));
create table product (id int primary key, name varchar(40), detail varchar(255), price int);

insert into admin (id, name, deptName) values (1, '최주욱', 'SI사업본부');
insert into admin (id, name, deptName) values (2, '김보성', 'SI사업본부');

insert into product (id, name, detail, price) values (1, 'ELDEN RING', 'FromSoftware Game', 68000);


select * from admin;

