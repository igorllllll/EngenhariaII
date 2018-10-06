
create database biblioteca;
show databases;
use biblioteca;


create table clientes( 

	_id integer NOT NULL auto_increment,
	_nome  varchar(45) NOT NULL,
    _idade int NOT NULL,
    _cpf    varchar(25) NOT NULL,
    _tel   varchar(45) NOT NULL,
    _sex   varchar(25) NOT NULL,
    _end   varchar(25) NOT NULL,
    _usuario varchar(25) NOT NULL,
    _senha varchar(25) NOT NULL,
    primary key(_id)
    
);
create table livro(
	_titulo varchar(45) NOT NULL,
	_autor  varchar(45) NOT NULL,
    _genero  varchar(45) NOT NULL,
    _ano  varchar(10) NOT NULL,
    _nome  float NOT NULL
);

drop table users, users;

show tables;

insert into users(_nome, _senha, _sexo) values ("Orrana", "2009", "Fêmea");
insert into hist(_peso, _altura, _imc, FK_USER) values (74.6, 1.74, 24.6, 1);


select * from users;