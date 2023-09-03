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

//Ejercicio Victoria Zaccaro
	package utn.estudiantes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EstudiantesApplication {

    public static void main(String[] args) {
        SpringApplication.run(EstudiantesApplication.class, args);
    }

}

//Conexión MySQL
spring.datasource.url=jdbc:mysql://localhost:3306/estudiantes
spring.datasource.username=root
spring.datasource.password=
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

#Evitar que se cree el esquema nuevamente
spring.jpa.hibernate.ddl-auto=none
spring.jpa.show-sql=true

#Desactivar el Tomcat
spring.main.web-application-type=none

//Fin Ejercicio Victoria Zaccaro	
//Ejercicio Matías Villa

package utn.estudiantes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EstudiantesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstudiantesApplication.class, args);
	}

}

//Conexión MySQL


spring.datasource.url=jdbc:mysql://localhost:3306/estudiantes2
spring.datasource.username=root
spring.datasource.password=admin
spring.datasource.drive-class-name=com.mysql.cj.jdbc.Driver

#evitar que se cree el esquema nuevamente

#no ejecutamos ninguna sentencia que modifique las operaciones o ejecuciones de la base de datos
spring.jpa.hibernate.ddl-auto=none
#Mostrar los sql que se ejecutaran
spring.jpa.show-sql=true

#Desactivar el tomcat porque la app no es web, es por consola
spring.main.web-application-type=none
#limpia la consola

//Fin Ejercicio Matías Villa
	
