# Ppractica-Ordenes-BackEnd

Este proyecto consiste en una aplicación desarrollada mediante el framework Spring y permite realizar ordenes de productos para clientes. El proyecto se comunica a través de servicios REST a la parte FrontEnd, desarrollada en Angular.

- Para la clonación del proyecto FrontEnd desarrollado en Angular, se puede acceder a través de:https://github.com/ebenavidesa1/Ppractica-Ordenes-FrontEnd.git

- Se encuentra adjunto el script con la estructura de la base de datos utilizada, en el gestor de datos mysql.

- Para la ejecución del proyecto, es necesario importar en el IDE de desarrollo que se vaya a utilizar.

- La conexión de la base de datos con la aplicación BackEnd, se la realiza a través de hibernate, mediante la modificación del archivo src/main/resources/application.properties.

server.contextPath=/ordenes

spring.datasource.url=jdbc:mysql://localhost:3306/pruebaOrdenes

spring.datasource.username=root

spring.datasource.password=12345

