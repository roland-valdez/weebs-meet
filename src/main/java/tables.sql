create table users(
    id bigint not null ,
    email varchar(50) not null ,
    firstName varchar(50) not null,
    lastName varchar(50)  not null ,
    password varchar(50) not null,
    username varchar(50) not null,
    primary key (id)
);