# PARCIAL2AREP

Este repositorio contiene la implementación de la lógica para el parcial 2 del curso de Arquitectura de Redes Empresariales y Programación (AREP). 
## Instancias Corriendo

El proyecto tiene dos instancias corriendo en paralelo:

![Instancias Corriendo](https://github.com/user-attachments/assets/83bb1c70-0088-46ac-b350-5cd504ca3235)

## Controladores

Para la lógica de negocio, se definieron los siguientes controladores:

### 1. Controlador 1
![Controlador 1](https://github.com/user-attachments/assets/e45e4a56-a580-4a06-8e0f-a41c9864c482)

### 2. Controlador 2
![Controlador 2](https://github.com/user-attachments/assets/c29ce670-ff85-45a1-914f-50f31487c08b)

## Pruebas

Se intentó realizar pruebas utilizando Postman, debido a que no se logró desplegar el proxy correctamente. Sin embargo, las pruebas no fueron exitosas, ya que el objeto DTO no fue respondido adecuadamente por el servicio. A continuación, se muestra el error generado en Postman:

![Error en Postman](https://github.com/user-attachments/assets/03601a38-740e-4765-b1ff-3d2ab17fb1cc)

## Video

El video con la demostración del proyecto está incluido en el PowerPoint proporcionado.

##Arquitectura

C:.
│   README.md
│   
├───.idea

│       .gitignore

│       misc.xml

│       modules.xml

│       PARCIAL2AREP.iml

│       vcs.xml

│       workspace.xml

│
├───calculadorSearch

│   │   .gitattributes

│   │   .gitignore

│   │   mvnw

│   │   mvnw.cmd

│   │   pom.xml

│   │

│   ├───.mvn

│   │   └───wrapper

│   │           maven-wrapper.properties

│   │

│   └───src

│       ├───main

│       │   ├───java

│       │   │   └───com

│       │   │       └───edu

│       │   │           └───escuelaing

│       │   │               └───calculadorSearch

│       │   │                   │   CalculadorSearchApplication.java

│       │   │                   │

│       │   │                   ├───controlador

│       │   │                   │       CalculadoraSearchControlador.java

│       │   │                   │

│       │   │                   └───modelo

│       │   │                           ParametrosDTO.java

│       │   │

│       │   └───resources

│       │           application.properties
│       │

│       └───test

│           └───java

│               └───com

│                   └───edu

│                       └───escuelaing

│                           └───calculadorSearch

│                                   CalculadorSearchApplicationTests.java

│

└───proxy

    │   .gitattributes
    
    │   .gitignore
    
    │   mvnw
    
    │   mvnw.cmd
    
    │   pom.xml
    
    │
    
    ├───.mvn
    
    │   └───wrapper
    
    │           maven-wrapper.properties
    
    │
    
    ├───bin
    
    │   └───main
    
    │       └───com
    
    │           └───edu
    
    │               └───escuelaing
    
    │                   └───proxy
    
    │                           ProxyApplication.class
    
    │
    
    └───src
    
        ├───main
        
        │   ├───java
        
        │   │   └───com
        
        │   │       └───edu
        
        │   │           └───escuelaing
        
        │   │               └───proxy
        
        │   │                       ProxyApplication.java
        
        │   │
        
        │   └───resources
        
        │           application.properties
        
        │
        
        └───test
        
            └───java
            
                └───com
                
                    └───edu
                    
                        └───escuelaing
                        
                            └───proxy
                            
                                    ProxyApplicationTests.java





## Instrucciones de Ejecución



1. Asegúrate de tener todas las dependencias necesarias instaladas.

2. Ejecuta las instancias utilizando el comando adecuado según la configuración del proyecto.

3. Inicializar las instancias 


## Aclaraciones

- El proxy no se desplegó correctamente, lo que impidió probar el servicio de manera completamente funcional.


