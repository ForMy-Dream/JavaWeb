delete emp
drop sequence dept_ID_sequence;

create sequence dept_ID_sequence
start with 1
minvalue 1
maxvalue 99999999
increment by 1
;

drop trigger EMP_ID_TRIGGET;

create trigger dept_ID_TRIGGET
before insert
on dept
for each row 
begin 
  select dept_ID_sequence.nextval  into :new.id from dual;
end;

create table dept(
id number not null,
name varchar2(32),
create_time date,
update_time date,
is_using number
)
select* from emp for update;
insert into emp
  (username,
   password,
   gender,
   image,
   job,
   entrydate,
   dept_id,
   create_time,
   update_time,
   is_using)
values
  ('QYM', '220717', 2, '', 1, sysdate, 1, sysdate, sysdate, 1);
commit;

select  * from dept
insert into dept(
                 name,
                 create_time,
                 update_time,
                 is_using) values('������',sysdate,sysdate,1);
commit;

select username,password,gender, image,job,entrydate,dept_id,create_time, update_time,is_using from emp
insert into emp (username,password,gender, image,job,entrydate,dept_id,create_time, update_time,is_using)values(?, ?, ?, ?,?, ?, ?, ?, ?, ?)

insert into emp (username,password,gender, image,job,entrydate,dept_id,create_time, update_time,is_using)values('testuser','', 1,'',1, '2025-01-14',1, '2025-01-14', '2025-01-14', 1)

select * from emp where username like '%'||'J'||'%'
select '%'||'J'||'%' from dual;

update emp set 
                   username='',
      
                   gender='',
                   image='',
                   job='',
                   entrydate='',
                   dept_id='',
                   create_time='',
                   update_time='',
                   is_using=''
