show tables;
select * from insa;
create table insa2 (
	idx int not null auto_increment primary key,
	name varchar(20) not null,
	age int default 20,
	gender char(2) default '여자',
	ipsail datetime default now()
);

desc insa2;
select * from insa2;
insert into insa2 values (default, '홍길동',default,'남자',default);
insert into insa2 values (default, '김말숙',default,default,default);
insert into insa2 (name) values ('오하늘');