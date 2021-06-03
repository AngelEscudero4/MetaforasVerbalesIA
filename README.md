# MetaforasVerbalesIA
Programa realizado durante la beca de colaboración con el departamento de Inteligencia Artificial en el año 2021

Proyecto hecho desde eclipse, explico como configurarlo aqui (desde otro editor no se como sera):

File -> Open proyects from file system -> seleccionas src
Click derecho en src, build path, add external archives, json-simple-1.1.1.jar, lo encuentras en https://code.google.com/archive/p/json-simple/
(necesario para Thesaurus -> https://thesaurus.altervista.org/testjava)


## MetaforasVerbales.java 

Para que se vea correctamente las tildes poner en codificacion UTF-8


* buscarSinonimos -> 
	* Uso de thesaurus: necesitas una clave propia, la cual puedes sacar de esta pagina: https://thesaurus.altervista.org/mykey
	* Una vez la tengas sustituyes en String key y ya te deberia funcionar


* analisis -> Uso de librairy:
	 * Puedes ver la pagina http://librairy.linkeddata.es/nlp/api.html que te dara la idea de las cosas que tienen y poder probarlas
	 * Para ejecutarlo desde tu pc tienes que instalarlo en local, aqui te pone como hacerlo: https://github.com/librairy/nlp (mira la parte de run locally)
	 * Cada vez que quieras ejecutar el programa deberas ejecutar docker y el comando docker run --rm -p 7777:7777 -e "REST_PATH=/nlp" librairy/nlp:latest
	 * en una terminal para que funcione en local
	 
   
   
## filtrarFrecuencia.java
	 
* frecsPalabras.txt -> Si se quiere actualizar o saber como lo he conseguido:
	* Descargar lista total de frecuencias de http://corpus.rae.es/lfrecuencias.html
	* Extraer el txt y guardarlo con el nombre de frecs.txt en codificacion ISO-8859-1 para que esten bien las tildes, dentro de src
	* Ejecutar filtrarFrecuencia.java para quedarse con las palabras en orden y generar el fichero frecsPalabras.txt 
	* Puedes eliminar frecs.txt si te molesta, solo es necesario frecsPalabras.txt para el funcionamiento de MetaforasVerbales.java
