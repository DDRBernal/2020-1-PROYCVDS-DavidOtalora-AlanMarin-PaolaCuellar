CREATE TABLE IF NOT EXISTS USUARIO (
  userName VARCHAR(50) PRIMARY KEY,
  documento INT unique,
  nombre VARCHAR(20) NULL,
  apellido VARCHAR(30) NULL,
  ocupacion VARCHAR(20) NULL,
  clave VARCHAR(20) NOT NULL,
  tipoUsuario VARCHAR(30) NOT NULL,
  email VARCHAR(150) UNIQUE);

CREATE TABLE IF NOT EXISTS INICIATIVA (
    nombreIniciativa VARCHAR(50) NOT NULL,
    fecha DATE NOT NULL,
    estado VARCHAR(2) NOT NULL,
    proponente VARCHAR(50) NOT null,
    area VARCHAR(150) NULL,
    dependencia VARCHAR(20) NULL,
    descripcion VARCHAR(200) NOT null,
    PRIMARY KEY (nombreIniciativa,proponente),
    CONSTRAINT fk_Ususario_proponente FOREIGN KEY (proponente) REFERENCES USUARIO(userName));

CREATE TABLE IF NOT EXISTS PALABRACLAVE(
  palabra_clave VARCHAR(20)NOT NULL,
  nombreIniciativa VARCHAR(50) NOT NULL,
  proponente VARCHAR(50) NOT null,
  PRIMARY KEY (palabra_clave,nombreIniciativa),
  CONSTRAINT fk_Iniciativa_nombreI FOREIGN KEY (nombreIniciativa,proponente) REFERENCES INICIATIVA (nombreIniciativa,proponente));


CREATE TABLE IF NOT EXISTS COMENTARIO(
  id  INT PRIMARY KEY,
  fecha DATE NOT NULL,
  autor VARCHAR(50) NOT NULL,
  contenido VARCHAR(200) NOT NULL,
  nombreIniciativa VARCHAR(50) NOT NULL,
  proponente VARCHAR(50) NOT null,
  CONSTRAINT fk_Usuario_autor FOREIGN KEY (autor) REFERENCES USUARIO (userName),
  CONSTRAINT fk_Iniciativa_nombreI FOREIGN KEY (nombreIniciativa,proponente) REFERENCES INICIATIVA (nombreIniciativa,proponente));

CREATE TABLE IF NOT EXISTS VOTO(
  votante VARCHAR(50) NOT NULL,
  nombreIniciativa VARCHAR(50) NOT NULL,
  proponente VARCHAR(50) NOT null,
  PRIMARY KEY (votante,nombreIniciativa),
  CONSTRAINT fk_Usuario_votante FOREIGN KEY (votante) REFERENCES USUARIO (userName),
  CONSTRAINT fk_Iniciativa_nombreI FOREIGN KEY (nombreIniciativa,proponente) REFERENCES INICIATIVA (nombreIniciativa,proponente));


--Ususario administrador:
INSERT INTO USUARIO (userName,documento,nombre,apellido,ocupacion,clave,tipoUsuario,email) VALUES ("admin",0,"admin","admin","admin","PaolaAlanDavid","Admin","alan.marin@mail.escuelaing.edu.co");


