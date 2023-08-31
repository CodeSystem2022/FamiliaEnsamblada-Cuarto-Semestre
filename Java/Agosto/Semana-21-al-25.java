//Ejercicio Gerardo Duckwitz
package utn.estudiantes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EstudiantesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstudiantesApplication.class, args);
	}

}


#Conexion MySQL
spring.datasource.url=jdbc:mysql://localhost:3306/estudiantes
spring.datasource.username=root

spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

#Evitar que se cree el esquema nuevamente
spring.jpa.hibernate.ddl-auto=none
spring.jpa.show-sql=true

#Desactivar el tomcat, esto es porque no es aplicacion web, es por terminal
spring.main.web-application-type=none

  //Fin ejercicio Gerardo Duckwitz

//Ejercicio de Yesica López

#EstudiantesApplication.java
package utn.estudiantes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EstudiantesApplication {
    public static void main(String[] args){ SpringApplication.run(EstudiantesApplication.class, args);
    }
}

#application.properties
#Conexión MySQL
spring.datasource.url=kdbc:mysql://localhost:3306/estudiantes
spring.datasource.username=root
spring.datasource.password=admin       
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

#Evitar que se cree el esquema nuevamente
spring.jpa.hibernate.ddl-auto=none
spring.jpa.show-sql=true

#Desactivar el tomcat
spring.main.web-application-type=none

//Fin Ejercicio Yesica López

//Ejercicio Jose Remaggi
package utn.estudiantes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EstudiantesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstudiantesApplication.class, args);
	}

}


#Conexion MySQL
spring.datasource.url=jdbc:mysql://localhost:3306/estudiantes
spring.datasource.username=root

spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

#Evitar que se cree el esquema nuevamente
spring.jpa.hibernate.ddl-auto=none
spring.jpa.show-sql=true

#Desactivar el tomcat, esto es porque no es aplicacion web, es por terminal
spring.main.web-application-type=none

  //Fin ejercicio Jose Remaggi

//Ejercicio Anabel Alesci
#EstudiantesApplication.java
package utn.estudiantes;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EstudiantesApplication {
	public static void main(String[] args){ SpringApplication.run(utn.estudiantes.EstudiantesApplication.class, args);
	}
}

#application.properties
#Conexión MySQL
spring.datasource.url=kdbc:mysql://localhost:3306/estudiantes
spring.datasource.username=root
spring.datasource.password=admin
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
#Evitar que se cree el esquema nuevamente
spring.jpa.hibernate.ddl-auto=none
spring.jpa.show-sql=true
#Desactivar el tomcat 
spring.main.web-application-type=none

//Fin Ejercicio Anabel Alesci