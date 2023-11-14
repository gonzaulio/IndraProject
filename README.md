# Proyecto Servicio REST de Consulta a BBDD H2

## 1- Introducción
*Se ha desarrollado un servicio RESTful en Spring Boot que proporciona la funcionalidad de consultar precios aplicables a productos en función de una fecha específica para una cadena y un producto determinados. La aplicación utiliza una base de datos en memoria (H2) y está diseñada para ser fácilmente compilada, arrancada y probada. La aplicación sirve como un servicio de consulta de precios que puede ser integrado a proyectos más grandes y con bases de datos más complejas.* 

## 2- Requisitos Previos
	Java JDK (Versión 8 o superior)
	Maven
	Spring Tool Suite o Similar
	Postman
	Git

## 3- Arrancar
*Descargar el código fuente:*

	git clone https://github.com/gonzaulio/IndraProject.git
	cd IndraProject
	
*Compilar la aplicación:*

	mvn clean install
	
*Arrancar la aplicación:*

	Se debe importar la aplicación en el IDE que se esté utilizando y se ejecuta la carpeta src/main/java como Java Application.
	
## 4 - Probar
*Una vez la aplicación esté levantada en el puerto http://localhost:8080, se pueden realizar pruebas pasándole los parámetros definidos:*

	brandId  
	productId 
	date
 
*Algunas URL de ejemplo son:* 

	http://localhost:8080/api/prices?brandId=1&productId=35455&date=2020-06-14T16:00:00
	http://localhost:8080/api/prices?brandId=1&productId=35455&date=2020-06-14T21:00:00
	
## 5- Tests
*Se han definido los test necesarios y requeridos para probar la funcionalidad de la aplicación*