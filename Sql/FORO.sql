CREATE DATABASE FORO;
/*DROP TABLE USUARIOS;*/
CREATE TABLE USUARIOS(  ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
                        NOMBRE VARCHAR(50),
                        APELLIDOS VARCHAR(20),
                        CORREO VARCHAR(50),
                        CONTRASENA VARCHAR(20),
                        SEXO VARCHAR(2),
                        EDAD INT);

/*
INSERT INTO 
  USUARIOS 
      (NOMBRE, APELLIDOS, CORREO, CONTRASENA, SEXO, EDAD) 
VALUES
      ('FRANCISCO','LOPEZ', 'FRANCISCO12@HOTMAIL.COM','12345', 'H', 19)

*/