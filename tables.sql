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

--Usuario PMO - ODI:
INSERT INTO USUARIO (userName,documento,nombre,apellido,ocupacion,clave,tipoUsuario,email) VALUES ("pmo",0,"pmo","pmo","pmo","PaolaAlanDavid","PMO","pad@mail.escuelaing.edu.co");

--Usuario Proponente:
INSERT INTO USUARIO (userName,documento,nombre,apellido,ocupacion,clave,tipoUsuario,email) VALUES ("proponente",0,"proponente","proponente","proponente","PaolaAlanDavid","Proponente","propo@mail.escuelaing.edu.co");
INSERT INTO USUARIO (userName,documento,nombre,apellido,ocupacion,clave,tipoUsuario,email) VALUES ("proponente1",0,"proponente1","proponente1","proponente1","PaolaAlanDavid","Proponente","propo.one@mail.escuelaing.edu.co");
INSERT INTO USUARIO (userName,documento,nombre,apellido,ocupacion,clave,tipoUsuario,email) VALUES ("proponente2",0,"proponente2","proponente2","proponente2","PaolaAlanDavid","Proponente","propo.two@mail.escuelaing.edu.co");
INSERT INTO USUARIO (userName,documento,nombre,apellido,ocupacion,clave,tipoUsuario,email) VALUES ("proponente3",0,"proponente3","proponente3","proponente3","PaolaAlanDavid","Proponente","propo.three@mail.escuelaing.edu.co");
INSERT INTO USUARIO (userName,documento,nombre,apellido,ocupacion,clave,tipoUsuario,email) VALUES ("proponente4",0,"proponente4","proponente4","proponente4","PaolaAlanDavid","Proponente","propo.four@mail.escuelaing.edu.co");
INSERT INTO USUARIO (userName,documento,nombre,apellido,ocupacion,clave,tipoUsuario,email) VALUES ("proponente5",0,"proponente5","proponente5","proponente5","PaolaAlanDavid","Proponente","propo.five@mail.escuelaing.edu.co");
--Usuario de Consulta:
INSERT INTO USUARIO (userName,documento,nombre,apellido,ocupacion,clave,tipoUsuario,email) VALUES ("usuario",0,"usuario","usuario","usuario","PaolaAlanDavid","Usuario","usuario@mail.escuelaing.edu.co");

--Iniciativas
INSERT INTO INICIATIVA(nombreIniciativa,fecha,estado,proponente,area,dependencia,descripcion) 
VALUES("Protesis de brazos",'05-05-2020',"espera","proponente","mecanica","mecanica","Esta protesis fue creada para todas las personas, desde las de menos recursos hasta las con mejores recursos. El objetivo es ayudar a las personas que perdieron una extremidad o bien, sólo perdieron su función de forma parcial.");
INSERT INTO INICIATIVA(nombreIniciativa,fecha,estado,proponente,area,dependencia,descripcion) 
VALUES("Guante para personas con discapacidad",'10-03-2020',"revisión","proponente1","mecanica","mecanica","Su diseño no solo genera autonomía e impulsa la inserción social de las personas dependientes, sino que ayuda en los procesos de rehabilitación de las mismas.");
INSERT INTO INICIATIVA(nombreIniciativa,fecha,estado,proponente,area,dependencia,descripcion) 
VALUES("Exoesqueleto",'03-02-2020',"proyecto","proponente2","mecanica","mecanica","Su diseño simple pero eficiente permite caminar varios kilometros a la persona con tan solo una bateria, su manejo y mantenimiento es sencillo y ademas el costo de realizacion es muy bajo.");
INSERT INTO INICIATIVA(nombreIniciativa,fecha,estado,proponente,area,dependencia,descripcion) 
VALUES("ASELUS",'01-01-2020',"solucionado", "proponente3","ambiental", "ambiental", "sirve para la iluminación de espacios interiores: es diseñada para ser montada en techos de lámina, y cuenta con un interruptor y cargador solar.");
INSERT INTO INICIATIVA(nombreIniciativa,fecha,estado,proponente,area,dependencia,descripcion) 
VALUES("Soluciones de energía solar",'02-02-2020',"espera","proponente4","ambiental","ambiental","puede ser montada en postes y cuenta con un sistema inteligente que aprovecha al máximo la energía solar para almacenarla en las baterías en días nublados o soleados.");
INSERT INTO INICIATIVA(nombreIniciativa,fecha,estado,proponente,area,dependencia,descripcion) 
VALUES("Radar para personas con discapacidad",'20-03-2020',"espera","proponente5","mecanica","mecanica", "ayuda al usuario a crear mapas mentales de su entorno mediante la generación de sonidos que permiten a las personas desarrollar y utilizar sus capacidades de eco localización.");
INSERT INTO INICIATIVA(nombreIniciativa,fecha,estado,proponente,area,dependencia,descripcion) 
VALUES("My Mayor Company",'13-01-2020',"revision","proponente","sistemas","sistemas","promueve la financiación de personas particulares a proyectos del mundo de la cultura –música, cómics, libros, videojuegos, patrimonio, fotografía, cine.");
INSERT INTO INICIATIVA(nombreIniciativa,fecha,estado,proponente,area,dependencia,descripcion) 
VALUES("La Caixa",'25-04-2020',"revision","proponente1","industrial","industrial","facilita el pensamiento de un presupuesto de financiación para obtener un espacio de vivienda a un bajo costo según los ingresos que se obtienen en el año.");
INSERT INTO INICIATIVA(nombreIniciativa,fecha,estado,proponente,area,dependencia,descripcion) 
VALUES("Minka Dev",'13-05-2020',"solucionado","proponente2","sistemas","sistemas","identificadores de necesidades que ponen sobre la mesa un problema localizado en un país en vías de desarrollo.");
INSERT INTO INICIATIVA(nombreIniciativa,fecha,estado,proponente,area,dependencia,descripcion) 
VALUES("UEIA",'23-01-2020',"espera","proponente3","sistemas","sistemas","impulsar el emprendimiento, la acción social y la tecnología como plataforma de nuevos proyectos ligados al ámbito social con el fin de convertirlos en iniciativas empresariales viables o start-up.");
INSERT INTO INICIATIVA(nombreIniciativa,fecha,estado,proponente,area,dependencia,descripcion) 
VALUES("Llevalos a la escuela",'05-01-2020',"revision","proponente4","industrial","industrial","expone la necesidad de construir escuelas, formar profesores, suministrar material escolar y escolarizar a los más de 67 millones de niños.");
INSERT INTO INICIATIVA(nombreIniciativa,fecha,estado,proponente,area,dependencia,descripcion) 
VALUES("Aqui estoy",'30-04-2020',"espera","proponente5","sistemas","sistemas","promueve el reporte en tiempo y sitio real de menores que estén realizando un trabajo continuado a través de la aplicación Aquí estoy.");
INSERT INTO INICIATIVA(nombreIniciativa,fecha,estado,proponente,area,dependencia,descripcion) 
VALUES("Cassava Food Enhancer",'24-03-2020',"solucionado","proponente","industrial","industrial","extrae carbohidratos, proteínas y vitaminas para producir un alimento de bajo costo, rico en nutrientes, a distribuirse en gobiernos y familias vulnerables.");
INSERT INTO INICIATIVA(nombreIniciativa,fecha,estado,proponente,area,dependencia,descripcion) 
VALUES("AprendeMat",'16-02-2020',"espera","proponente1","matematicas","matematicas","Plantea problemas matemáticos de todo tipo, ordeandos por diferentes intervalos de edades.");
INSERT INTO INICIATIVA(nombreIniciativa,fecha,estado,proponente,area,dependencia,descripcion) 
VALUES("PHET",'21-01-2020',"revision","proponente2","fisica","fisica","contiene simulaciones interactivas para aprender matemáticas y física, como un laboratorio sin salir de casa.");
INSERT INTO INICIATIVA(nombreIniciativa,fecha,estado,proponente,area,dependencia,descripcion) 
VALUES("Agua y Pobreza",'10-03-2020',"espera","proponente4","ambiental","ambiental","acceder al agua potable en zonas rurales como La Guajira, Risaralda y Putumayo donde los recursos son limitados y se puede purificar la de sus ríos y pozos con el correcto uso de filtros naturales.");
INSERT INTO INICIATIVA(nombreIniciativa,fecha,estado,proponente,area,dependencia,descripcion) 
VALUES("Haus APP",'30-03-2020',"solucionado","proponente5","sistemas","sistemas", "alarma comunitaria dentro de una red social privada de vecinos ante una emergencia.");
INSERT INTO INICIATIVA(nombreIniciativa,fecha,estado,proponente,area,dependencia,descripcion) 
VALUES("House-APP",'07-04-2020',"proyecto","proponente5","sistemas","sistemas", "estar al tanto de noticias del barrio; crear grupos de chats de distintos temas afines a su comunidad; vender o regalar objetos; promover iniciativas vecinales.");