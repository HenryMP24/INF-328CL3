-- Database: registro

-- DROP DATABASE registro;



CREATE TABLE alumno(
	ID_ALUMNO VARCHAR(50) PRIMARY KEY NOT NULL,
	CI INT NOT NULL,
	Nombre VARCHAR(50) NOT NULL,
	ApellidoP VARCHAR(50) NOT NULL,
	ApellidoM VARCHAR(50) NOT NULL,
	Telefono VARCHAR(50) NOT NULL
);

INSERT INTO alumno (ID_ALUMNO,CI, Nombre, ApellidoP, ApellidoM, Telefono)    
    VALUES ('AL-1',7082735,'Pedro','Ticona','Mamani','12321123');  

INSERT INTO alumno(ID_ALUMNO,CI, Nombre, ApellidoP, ApellidoM, Telefono)  
    VALUES ('AL-2',7657565,'Ever','Quispe','Mayta','43431123');  

INSERT INTO alumno(ID_ALUMNO,CI, Nombre, ApellidoP, ApellidoM, Telefono)  
    VALUES ('AL-3',7564444,'Micaela','Cortez','Montaño','23244421');  

INSERT INTO alumno(ID_ALUMNO,CI, Nombre, ApellidoP, ApellidoM, Telefono)    
    VALUES ('AL-4',6456456,'Roberto','Perales','Montaño','32324123');  

INSERT INTO alumno(ID_ALUMNO,CI, Nombre, ApellidoP, ApellidoM, Telefono)   
    VALUES ('AL-5',4564564,'Jose','Mamani','Mamani','32134444');  

INSERT INTO alumno(ID_ALUMNO,CI, Nombre, ApellidoP, ApellidoM, Telefono)   
    VALUES ('AL-6',6666774,'Francisco','Ruiz','Serrano','65456234');  

INSERT INTO alumno(ID_ALUMNO,CI, Nombre, ApellidoP, ApellidoM, Telefono)    
    VALUES ('AL-7',8787866,'Jesus','Rubio','Muñoz','54634233');  

INSERT INTO alumno(ID_ALUMNO,CI, Nombre, ApellidoP, ApellidoM, Telefono)   
    VALUES ('AL-8',9898989,'Miguel','Perez','Jimenez','42366662');  

INSERT INTO alumno(ID_ALUMNO,CI, Nombre, ApellidoP, ApellidoM, Telefono)    
    VALUES ('AL-9',6786786,'Josefa','Romero','Alfaro','23423662');  

INSERT INTO alumno(ID_ALUMNO,CI, Nombre, ApellidoP, ApellidoM, Telefono)   
    VALUES ('AL-10',9898989,'Isabel','Moreno','Diaz','23423232');  

INSERT INTO alumno(ID_ALUMNO,CI, Nombre, ApellidoP, ApellidoM, Telefono)    
    VALUES ('AL-11',6786786,'Maria Dolores','Navarro','Serrano','12312311');  

INSERT INTO alumno(ID_ALUMNO,CI, Nombre, ApellidoP, ApellidoM, Telefono)    
    VALUES ('AL-12',6786786,'Maria Pilar','Perez','Marques','12312355');  

INSERT INTO alumno(ID_ALUMNO,CI, Nombre, ApellidoP, ApellidoM, Telefono)    
    VALUES ('AL-13',6786788,'Antonia','Rodriguez','Navarro','12312315');
    
INSERT INTO alumno(ID_ALUMNO,CI, Nombre, ApellidoP, ApellidoM, Telefono)    
    VALUES ('AL-14',8899667,'Antonio','Nina','Ruiz','12312313');
    
INSERT INTO alumno(ID_ALUMNO,CI, Nombre, ApellidoP, ApellidoM, Telefono)  
    VALUES ('AL-15',7868996,'David','Mayta','Saez','55533331');  

Select *from alumno


CREATE TABLE materia(
	ID_MATERIA VARCHAR(50) PRIMARY KEY NOT NULL,
	Nombre VARCHAR(50) NOT NULL
);


INSERT INTO materia(ID_MATERIA, Nombre)  
    VALUES ('PG-I','Programacion I');  

INSERT INTO materia(ID_MATERIA, Nombre)  
    VALUES ('PG-II','Programacion II');
INSERT INTO materia(ID_MATERIA, Nombre)  
    VALUES ('PG-III','Programación III');
INSERT INTO materia(ID_MATERIA, Nombre)  
    VALUES ('ML','Matematica Lineal');
INSERT INTO materia(ID_MATERIA, Nombre)  
    VALUES ('PW-I','Paginas Web I');
INSERT INTO materia(ID_MATERIA, Nombre)  
    VALUES ('PW-II','Paginas web II');
INSERT INTO materia(ID_MATERIA, Nombre)  
    VALUES ('EST-I','Estadistica I');
INSERT INTO materia(ID_MATERIA, Nombre)  
    VALUES ('EST-II','Estadistica II');
INSERT INTO materia(ID_MATERIA, Nombre)  
    VALUES ('OP-I','Operativa I');
INSERT INTO materia(ID_MATERIA, Nombre)  
    VALUES ('OP-II','Operativa II');
INSERT INTO materia(ID_MATERIA, Nombre)  
    VALUES ('OP-III','Operativa III');
INSERT INTO materia(ID_MATERIA, Nombre)  
    VALUES ('SO-I','Sistemas Operativos I');
INSERT INTO materia(ID_MATERIA, Nombre)  
    VALUES ('SO-II','Sistemas Operativos II');
INSERT INTO materia(ID_MATERIA, Nombre)  
    VALUES ('FIS-I','Fisica I');
INSERT INTO materia(ID_MATERIA, Nombre)  
    VALUES ('FIS-II','Fisica II');


select * from materia



CREATE TABLE docente(
	ID_DOCENTE VARCHAR(50) PRIMARY KEY NOT NULL,
	Nombre VARCHAR(50) NOT NULL,
	ApellidoP VARCHAR(50) NOT NULL,
	ApellidoM VARCHAR(50) NOT NULL,
	Telefono VARCHAR(50) NOT NULL,
	Gmail VARCHAR(100) NOT NULL
);


INSERT INTO docente(ID_DOCENTE, Nombre, ApellidoP, ApellidoM, Telefono,Gmail)  
    VALUES ('DO-1','Roberto','Peralta','Montaño','12345632','robert@gmail.com');
INSERT INTO docente(ID_DOCENTE, Nombre, ApellidoP, ApellidoM, Telefono,Gmail)  
    VALUES ('DO-2','Marcos','Mamani','Peña','32345123','Marcos@gmail.com');
INSERT INTO docente(ID_DOCENTE, Nombre, ApellidoP, ApellidoM, Telefono,Gmail)  
    VALUES ('DO-3','Nilza','Quispe','Mamani','12423255','Nilza@gmail.com');
INSERT INTO docente(ID_DOCENTE, Nombre, ApellidoP, ApellidoM, Telefono,Gmail)  
    VALUES ('DO-4','Yovana ','Cortez','Alcon','12344445','Yovana@gmail.com');


select * from docente


CREATE TABLE periodo(
	ID_PERIODO VARCHAR(50) PRIMARY KEY NOT NULL,
	Nombre VARCHAR(50) NOT NULL,
	FechaIni VARCHAR(100) NOT NULL,
	FechaFin VARCHAR(100) NOT NULL
);

INSERT INTO periodo(ID_PERIODO, Nombre, FechaIni, FechaFin)  
    VALUES ('PE-1','Periodo 1','25 enero 2020','30 Junio 2020');
INSERT INTO periodo(ID_PERIODO, Nombre, FechaIni, FechaFin)  
    VALUES ('PE-2','Periodo 2','12 agosto 2020','25 Diciembre 2020');

select *from periodo

CREATE TABLE clase(
	ID_CLASE VARCHAR(50) PRIMARY KEY NOT NULL,
	ID_MATERIA VARCHAR(50) NOT NULL,
	ID_DOCENTE VARCHAR(50) NOT NULL,
	capacidad VARCHAR(50) NOT NULL
);



INSERT INTO clase(ID_CLASE, ID_MATERIA, ID_DOCENTE, capacidad)  
    VALUES ('CLA-1','PG-I','DO-1','50');
INSERT INTO clase(ID_CLASE, ID_MATERIA, ID_DOCENTE, capacidad)  
    VALUES ('CLA-2','PG-III','DO-4','40');
INSERT INTO clase(ID_CLASE, ID_MATERIA, ID_DOCENTE, capacidad)  
    VALUES ('CLA-3','FIS-II','DO-1','30');
INSERT INTO clase(ID_CLASE, ID_MATERIA, ID_DOCENTE, capacidad)  
    VALUES ('CLA-4','EST-II','DO-3','60');
INSERT INTO clase(ID_CLASE, ID_MATERIA, ID_DOCENTE, capacidad)  
    VALUES ('CLA-5','SO-II','DO-2','40');


select * from clase


CREATE TABLE nota(
	ID_NOTA VARCHAR(50) PRIMARY KEY NOT NULL,
	ID_ALUMNO VARCHAR(50) NOT NULL,
	ID_PERIODO VARCHAR(50) NOT NULL,
	ID_CLASE VARCHAR(50) NOT NULL,
	Calificacion VARCHAR(50) NOT NULL
);



INSERT INTO nota(ID_NOTA, ID_ALUMNO, ID_PERIODO, ID_CLASE, Calificacion)  
    VALUES ('NOT-1','AL-1','PE-1','CLA-1','51');
INSERT INTO nota(ID_NOTA, ID_ALUMNO, ID_PERIODO, ID_CLASE, Calificacion)  
    VALUES ('NOT-2','AL-2','PE-1','CLA-1','60');
INSERT INTO nota(ID_NOTA, ID_ALUMNO, ID_PERIODO, ID_CLASE, Calificacion)  
    VALUES ('NOT-3','AL-4','PE-1','CLA-1','42');
INSERT INTO nota(ID_NOTA, ID_ALUMNO, ID_PERIODO, ID_CLASE, Calificacion)  
    VALUES ('NOT-4','AL-5','PE-1','CLA-1','80');
INSERT INTO nota(ID_NOTA, ID_ALUMNO, ID_PERIODO, ID_CLASE, Calificacion)  
    VALUES ('NOT-5','AL-12','PE-1','CLA-1','70');


INSERT INTO nota(ID_NOTA, ID_ALUMNO, ID_PERIODO, ID_CLASE, Calificacion)  
    VALUES ('NOT-6','AL-15','PE-1','CLA-2','43');
INSERT INTO nota(ID_NOTA, ID_ALUMNO, ID_PERIODO, ID_CLASE, Calificacion)  
    VALUES ('NOT-7','AL-10','PE-1','CLA-2','45');
INSERT INTO nota(ID_NOTA, ID_ALUMNO, ID_PERIODO, ID_CLASE, Calificacion)  
    VALUES ('NOT-8','AL-5','PE-1','CLA-2','22');
INSERT INTO nota(ID_NOTA, ID_ALUMNO, ID_PERIODO, ID_CLASE, Calificacion)  
    VALUES ('NOT-9','AL-8','PE-1','CLA-2','59');
INSERT INTO nota(ID_NOTA, ID_ALUMNO, ID_PERIODO, ID_CLASE, Calificacion)  
    VALUES ('NOT-10','AL-7','PE-1','CLA-2','80');


INSERT INTO nota(ID_NOTA, ID_ALUMNO, ID_PERIODO, ID_CLASE, Calificacion)  
    VALUES ('NOT-11','AL-3','PE-2','CLA-3','56');
INSERT INTO nota(ID_NOTA, ID_ALUMNO, ID_PERIODO, ID_CLASE, Calificacion)  
   VALUES ('NOT-12','AL-6','PE-2','CLA-3','76');
INSERT INTO nota(ID_NOTA, ID_ALUMNO, ID_PERIODO, ID_CLASE, Calificacion)  
    VALUES ('NOT-13','AL-9','PE-2','CLA-3','54');
INSERT INTO nota(ID_NOTA, ID_ALUMNO, ID_PERIODO, ID_CLASE, Calificacion)  
    VALUES ('NOT-14','AL-11','PE-2','CLA-3','34');
INSERT INTO nota(ID_NOTA, ID_ALUMNO, ID_PERIODO, ID_CLASE, Calificacion)  
    VALUES ('NOT-15','AL-13','PE-2','CLA-3','23');


INSERT INTO nota(ID_NOTA, ID_ALUMNO, ID_PERIODO, ID_CLASE, Calificacion)  
    VALUES ('NOT-16','AL-14','PE-1','CLA-4','45');
INSERT INTO nota(ID_NOTA, ID_ALUMNO, ID_PERIODO, ID_CLASE, Calificacion)  
    VALUES ('NOT-17','AL-11','PE-1','CLA-4','64');
INSERT INTO nota(ID_NOTA, ID_ALUMNO, ID_PERIODO, ID_CLASE, Calificacion)  
    VALUES ('NOT-18','AL-5','PE-1','CLA-4','67');
INSERT INTO nota(ID_NOTA, ID_ALUMNO, ID_PERIODO, ID_CLASE, Calificacion)  
    VALUES ('NOT-19','AL-6','PE-1','CLA-4','45');
INSERT INTO nota(ID_NOTA, ID_ALUMNO, ID_PERIODO, ID_CLASE, Calificacion)  
    VALUES ('NOT-20','AL-3','PE-1','CLA-4','76');


INSERT INTO nota(ID_NOTA, ID_ALUMNO, ID_PERIODO, ID_CLASE, Calificacion)  
    VALUES ('NOT-21','AL-10','PE-2','CLA-5','45');
INSERT INTO nota(ID_NOTA, ID_ALUMNO, ID_PERIODO, ID_CLASE, Calificacion)  
    VALUES ('NOT-22','AL-2','PE-2','CLA-5','33');
INSERT INTO nota(ID_NOTA, ID_ALUMNO, ID_PERIODO, ID_CLASE, Calificacion)  
    VALUES ('NOT-23','AL-5','PE-2','CLA-5','57');
INSERT INTO nota(ID_NOTA, ID_ALUMNO, ID_PERIODO, ID_CLASE, Calificacion)  
    VALUES ('NOT-24','AL-6','PE-2','CLA-5','65');
INSERT INTO nota(ID_NOTA, ID_ALUMNO, ID_PERIODO, ID_CLASE, Calificacion)  
    VALUES ('NOT-25','AL-10','PE-2','CLA-5','45');


select * from nota