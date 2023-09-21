// Ejercicio Jesús Mercado
// application.properties
# Conexión a MySQL
spring.datasource.url=jdbc:mysql://localhost:3306/tienda_libros_db?createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.password=admin
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# Crear la base de datos en caso de ser necesario
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

// TiendaLibrosApplication.java
package utn.tienda_libros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TiendaLibrosApplication {

	public static void main(String[] args) {
		SpringApplication.run(TiendaLibrosApplication.class, args);
	}

}

// Fin Ejercicio Jesús Mercado
