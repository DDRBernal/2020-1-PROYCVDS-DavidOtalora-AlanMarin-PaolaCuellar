CREATE TABLE IF NOT EXISTS USUARIO (
  nombre VARCHAR(50) NOT NULL,
  documento INT(20) PRIMARY KEY,
  contrasena VARCHAR(20) NOT NULL,
  tipoUsuario VARCHAR(20) NOT NULL,
  email VARCHAR(150) UNIQUE);


insert into usuario (nombre,documento,contrasena,tipoUsuario,email) values ('Paola','2106888','1234','Administrador','paola.cuellar@mail.escuelaing.edu.co');
insert into usuario (nombre,documento,contrasena,tipoUsuario,email) values ('David','2107329','admin','Administrador','david.otalora@mail.escuelaing.edu.co');
insert into usuario (nombre,documento,contrasena,tipoUsuario,email) values ('Alan','2106756','admin','Administrador','alan.marin@mail.escuelaing.edu.co');
insert into usuario (nombre,documento,contrasena,tipoUsuario,email) values ('Juan','2105432','sc23','Administrador','juan.sc@mail.escuelaing.edu.co');
insert into usuario (nombre,documento,contrasena,tipoUsuario,email) values ('Nicolas','2114666','cg97','Administrador','nicolas.cg@mail.escuelaing.edu.co');