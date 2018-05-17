drop table if exists user;

create table user (userId varchar primary key, password varchar);

insert into user (userId, password) values ('root', 'root');