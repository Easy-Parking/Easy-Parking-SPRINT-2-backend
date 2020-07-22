# Easy-Parking-SPRINT-2-backend

# Logo:

<p align="center">
    <img  src="img/logo.png">
</p>

# Arquitectura General

<p align="center">
    <img  src="img/diseño.JPG">
</p>

# link Repositorio backend y Beta microservico REST en heroku

- [Easy Parking Backend](https://github.com/Easy-Parking/Easy-Parking-SPRINT-2-backend.git) : repositorio Backend

- [Easy Parking Backend Heroku](https://backend-easyparking.herokuapp.com/) : heroku Backend
**Para probar el serivicio REST puede usar postman**

    - servicios:
        - GET: /users/byEmail/{emailUser}      **buscar usuario por email**
        - GET: /users/   **trae todos los usuarios registrados**
        - GET: /users/orderByRol/  **trae los usuarios por roles**
        - POST: /users/save/   **registra un usuario recibiendo un json como ejemplo:**
            ```json
            {
                "name": "Andresd Vasquez 2",
                "rol": "administrador",
                "email": "andres2@gmail.com",
                "password": "shshs23",
                "parkings": [array[1], array[2]...]  //array
                
            }
            ```
        - DELETE: /users/delete/{userEmail}   **elimina un usuario por email**

# Prerequisitos

Tener instalado Java jdk versiones 7+, Maven comandos, git y Spring Framework


# Diseño

## Modelo de dominio - (dominio - servicio - controlador - persistencia) User

<p align="center">
    <img  src="img/diagrama.png">
</p>

# Empezar

cargue las dependencias con:

```
mvn package
```

ejecute el servicio REST con cualquiera de los dos comandos:

```
java -jar target/easyparking-0.0.1-SNAPSHOT.jar
```

```
mvn spring-boot:run
```


# Built con

* [Maven](https://maven.apache.org/) - Dependency Management
* [JAVA JDK 8](http://www.oracle.com/technetwork/java/javase/overview/index.html) - construcción
* [JUnit 3.8.1](https://mvnrepository.com/artifact/junit/junit/3.8.1) - Test Dependency

* [Spring Framework 2.3.1](https://spring.io/projects/spring-framework) - Framework



# Autor

* **ANDRES DAVID VASQUEZ IBAÑEZ** - *Initial work* - [VASHIGO](https://github.com/vashigo)
