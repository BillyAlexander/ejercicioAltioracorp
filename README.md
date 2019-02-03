# ejercicioAltioracorp
Desarrolle una aplicación web que se conecte a una base de datos en cualquier motor relacional (SQL Server, PostgreSQL, etc.). La aplicación debe hacer CRUD/ABM

## IMPORTANTE: 
Desarrolle la aplicación con la mejor calidad posible, como si se tratara de
una aplicación entregable a un cliente. La elección de frameworks y librerías se deja a su
criterio, siempre que correspondan a las plataformas Java o .NET. De igual forma, usted
tiene libertad para plantear una arquitectura y/o patrones de diseño que considere
apropiados, teniendo en mente que se busca que la aplicación web sea mantenible,
extensible y tenga una larga vida. También puede usar cualquier práctica o herramienta
que considere que facilite una evolución sostenible del código; sin embargo, no debe usar
asistentes o generadores de código fuente, porque el propósito del ejercicio es evaluar la
calidad del código desarrollado directamente por usted, en lo que se refiere a las buenas
prácticas empleadas, la arquitectura planteada, las herramientas escogidas, etc.


La aplicación debe gestionar un listado de Clientes, cada uno con Órdenes compuestas de Artículos. Para el Cliente, interesa registrar su nombre y apellido; para una Orden, su fecha y sus Artículos. Y para cada Artículo, un código, un nombre y un precio unitario. Para todas las Entidades, debe existir una pantalla correspondiente para crear instancias de la Entidad; sin embargo, solo para una de ellas, esa pantalla debe permitir modificar y eliminar además de crear (es suficiente un solo ejemplo de CRUD completo). Interesa principalmente la implementación de la lógica; no es necesario poner demasiado esfuerzo en asuntos visuales o de diseño gráfico.

# Breve descripciòn
https://www.youtube.com/watch?v=J6O8YMfK7vQ

# Entidad-Relación:
https://drive.google.com/file/d/1hkcsGlm7HAhulTaAfAws91GM04FaEKd6/view?usp=sharing

# App
https://drive.google.com/file/d/1D5aTimmLGnW4zQbPbQT0lx0ar9Osaud8/view?usp=sharing

# Front
git@github.com:BillyAlexander/altioraCortpFront.git

# add artículos
USE ALTIORA;
INSERT INTO ITEM(CREATION_DATE,STATUS,NAME_ITEM,PRICE_ITEM) VALUES ('2019-02-01 10:01:59',1,'ARTICULO 1',100);
INSERT INTO ITEM(CREATION_DATE,STATUS,NAME_ITEM,PRICE_ITEM) VALUES ('2019-02-01 10:01:59',1,'ARTICULO 2',200);
INSERT INTO ITEM(CREATION_DATE,STATUS,NAME_ITEM,PRICE_ITEM) VALUES ('2019-02-01 10:01:59',1,'ARTICULO 3',300);
INSERT INTO ITEM(CREATION_DATE,STATUS,NAME_ITEM,PRICE_ITEM) VALUES ('2019-02-01 10:01:59',1,'ARTICULO 4',400);
