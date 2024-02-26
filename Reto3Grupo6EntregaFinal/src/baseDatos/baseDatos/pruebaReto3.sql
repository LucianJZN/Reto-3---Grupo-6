drop database if exists cinesElorrieta;
create database cinesElorrieta;
use cinesElorrieta;

drop table if exists cine;
create table cine(
	idCine int primary key,
    nombreCine varchar(20) not null,
    direccion varchar(100) unique
);

drop table if exists sala;
create table sala(
		idCine int,
    idSala int,
    nombre varchar(50) not null,
    primary key (idCine, idSala),
    constraint fk_idCine_sala foreign key(idCine) references cine(idCine) on delete cascade
);

drop table if exists sesion;
create table sesion(
	idSesion int primary key,
    coste double not null,
    idCine int not null,
    idSala int not null,
    fecha date not null,
    hora time not null,
    idPelicula int not null,
    constraint fk_idCine_sesion foreign key(idCine, idSala) references sala(idCine, idSala) on update cascade
);

drop table if exists pelicula;
create table pelicula(
	idPelicula int primary key,
    titulo varchar(30) unique,
    duracion int not null,
    genero varchar(20) not null
);

alter table sesion
 add constraint fk_idPelicula_sesion foreign key(idPelicula) references pelicula(idPelicula);

drop table if exists entrada;
create table entrada(
	idEntrada int primary key,
    idSesion int not null,
    fechaCompra datetime not null,
    precioCompra double not null,
    DNI varchar(9) not null,
	constraint fk_idSesion_entrada foreign key(idSesion) references sesion(idSesion)
);

drop table if exists cliente;
create table cliente(
    DNI varchar(9) primary key,
    nombre varchar (50) not null,
    apellidos varchar (100) not null,
    sexo varchar (30) not null, #opciones("hombre" ,"mujer")
    contrasena varchar(100) not null
);

alter table entrada
add constraint fk_DNI_entrada foreign key(DNI) references cliente(DNI);

insert into cine values ('1', 'Cine Elorrieta','Agirre Lehendakariaren Etorb., 184, Deusto, 48015 Bilbo, Bizkaia');
insert into cine values ('2', 'Cine Yelmo Megapark','C.C. Megapark Avda. de la Rivera SN Barrio Ibarreta-Zuloko, 48903 Barakaldo, Biscay');
insert into cine values ('3', 'CINESA MAX OCIO	','Max Ocio, Kareaga K., S/N, 48903 Barakaldo, Biscay');


insert into sala values ('1', '00001','Sala 1');
insert into sala values ('2', '00002','Sala 1');
insert into sala values ('3', '00003','Sala 1');


insert into cliente values ('12345678W', 'Julio','Cesar', 'Hombre', '1234');
insert into cliente values ('12345678E', 'Lucian','Stelian', 'Hombre', '1234');

insert into pelicula values ('1', 'Barbie','1', 'Drama');
insert into pelicula values ('2', 'Avengers','2', 'Ciencia ficción');
insert into pelicula values ('3', 'John Wick','3', 'Acción');

insert into sesion values ('1', '8.99','1', '1', '2024-01-30', '16:00:00','1');
insert into sesion values ('2', '8.99','2', '2', '2024-01-30', '17:00:00', '2');
insert into sesion values ('3', '8.99','3', '3', '2024-01-30', '15:00:00','3');

insert into entrada values ('1', '1','2024-01-29 18:00:00', '6.99', '12345678E');
insert into entrada values ('2', '2','2024-01-29 19:00:00', '6.99', '12345678W');
insert into entrada values ('3', '3','2024-01-29 20:00:00', '6.99', '12345678Q');
insert into entrada values ('4', '1','2024-01-29 18:00:00', '6.99', '12345678E');
insert into entrada values ('5', '2','2024-01-29 19:00:00', '6.99', '12345678W');
insert into entrada values ('6', '1','2024-01-29 18:00:00', '6.99', '12345678E');
insert into entrada values ('7', '2','2024-01-29 19:00:00', '6.99', '12345678W');
insert into entrada values ('8', '3','2024-01-29 20:00:00', '6.99', '12345678Q');
insert into entrada values ('9', '1','2024-01-29 18:00:00', '6.99', '12345678E');
insert into entrada values ('10', '2','2024-01-29 19:00:00', '6.99', '12345678W');
insert into entrada values ('11', '1','2024-01-29 18:00:00', '6.99', '12345678E');
insert into entrada values ('12', '2','2024-01-29 19:00:00', '6.99', '12345678W');
insert into entrada values ('13', '3','2024-01-29 20:00:00', '6.99', '12345678Q');
insert into entrada values ('14', '1','2024-01-29 18:00:00', '6.99', '12345678E');
insert into entrada values ('15', '2','2024-01-29 19:00:00', '6.99', '12345678W');
insert into entrada values ('16', '1','2024-01-29 18:00:00', '6.99', '12345678E');
insert into entrada values ('17', '2','2024-01-29 19:00:00', '6.99', '12345678W');
insert into entrada values ('18', '3','2024-01-29 20:00:00', '6.99', '12345678Q');
insert into entrada values ('19', '1','2024-01-29 18:00:00', '6.99', '12345678E');
insert into entrada values ('20', '2','2024-01-29 19:00:00', '6.99', '12345678W');

select * from cliente;