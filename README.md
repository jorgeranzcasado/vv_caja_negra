# Verificación y Validación del Software 2021
GRUPO IWM-41 - Grupo 4

## Instrucciones para utilizar este proyecto

* Descargar el proyecto utilizando git clone desde el terminal o desde el IDE
* En Eclipse: Run > Run Configurations… > Maven Build seleccionamos el proyecto clonado en Base directory. En goals añadimos lo siguiente: install:install-file -Dfile=/my/path/SingleList.jar -DgroupId=com.singleList -DartifactId=SingleList -Dversion=0.0.1-SNAPSHOT -Dpackaging=jar donde /my/path/ es la dirrección donde se encuentra el .jar
* Ejecutar los Test 
