# AREP-WebServer

En este laboratorio se implementa un servidor capaz de 
responder a solicitudes de archivos estáticos como imágenes o archivos html,
este servidor cuenta con inversión de control y permite al usuario usar la notación
@RequestMapping para construir POJOS para publicar peticiones GET personalizadas
en el servidor.

## Pre-requisitos
* [Maven](https://maven.apache.org/) - Administrador de dependencias
* [Git](https://git-scm.com/) - Sistema de control de versiones
* [Java](https://www.java.com/) - Tecnología para el desarrollo de aplicaciones

## Instrucciones de uso 

Para descargar el proyecto se debe usar 
```
git clone https://github.com/Jcro15/AREP-Taller-Anotaciones
```

Una vez descargado el proyecto este debe compilarse con la siguiente instrucción

```
mvn package 
```

Para ejecutar la aplicación se debe usar el comando 

```
java -cp target/classes edu.escuelaing.arep.MicroSpringBoot edu.escuelaing.arep.TestController
```


## EndPoint de prueba
Para probar que la anotación está funcionando se debe consultar la ruta / y se debería
recibir la cadena "Greetings from Spring Boot! 10/10", también se puede acceder
directamente al archivo estático  en /index.html . Finalmente se tiene el endpoint
/hello que muestra un html con una imagen. Los dos endpoints mencionados se implementaron
usando la anotación personalizada @RequestMapping.

## Enlace Heroku
  [Despliegue en Heroku](https://arepanotaciones.herokuapp.com/)

## Construido con

* [Maven](https://maven.apache.org/) - Administrador de dependencias

## Autor

* **Juan Camilo Rojas Ortiz** - *Estudiante de ingeniería de sistemas* 

## Licencia

Este proyecto esta bajo la licencia GNU(General Public License) los detalles se pueden encontrar en el archivo [LICENSE](LICENSE)

