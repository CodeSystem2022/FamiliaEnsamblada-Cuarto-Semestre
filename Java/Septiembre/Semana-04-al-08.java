// Ejercicio Gerardo Duckwitz
ackage utn.estudiantes.servicio;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utn.estudiantes.modelo.Estudiante;
import utn.estudiantes.repositorio.EstudianteRepositorio;

import java.util.List;

@Service
public class EstudianteServicio implements IEstudianteServicio{
    @Autowired
    private EstudianteRepositorio estudianteRepositorio;
    @Override
    public List<Estudiante> listarEstudiantes() {
        List<Estudiante> estudiantes = estudianteRepositorio.findAll();
        return estudiantes;
    }

    @Override
    public Estudiante buscarEstudiantePorId(Integer idEstudiante) {
      Estudiante estudiante = estudianteRepositorio.findById(idEstudiante).orElse(null);
      return estudiante;
    }

    @Override
    public void guardarEstudiante(Estudiante estudiante) {
        estudianteRepositorio.save(estudiante);
        
    }

    @Override
    public void eliminarEstudiante(Estudiante estudiante) {
        estudianteRepositorio.delete(estudiante);
    }
}
package utn.estudiantes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import utn.estudiantes.servicio.EstudianteServicio;

@SpringBootApplication
public class EstudiantesApplication implements CommandLineRunner {
	@Autowired
	private EstudianteServicio estudianteServicio;
	private static final Logger logger = LoggerFactory.getLogger(EstudiantesApplication.class);

	String nl = System.lineSeparator();

	public static void main(String[] args) {

		logger.info("Iniciando la aplicacion...");
		//Levantar la frabrica de Spring
		SpringApplication.run(EstudiantesApplication.class, args);
		logger.info("Aplicacion finalizada!");

	}

	@Override
	public void run(String... args) throws Exception {
		logger.info(nl+"Ejecutando el metodo run de Spring..."+nl);

	}
}


//Fin ejercicio Gerardo Duckwitz

// Ejercicio Jose Remaggi
package utn.estudiantes.servicio;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utn.estudiantes.modelo.Estudiante;
import utn.estudiantes.repositorio.EstudianteRepositorio;

import java.util.List;

@Service
public class EstudianteServicio implements IEstudianteServicio{
    @Autowired
    private EstudianteRepositorio estudianteRepositorio;
    @Override
    public List<Estudiante> listarEstudiantes() {
        List<Estudiante> estudiantes = estudianteRepositorio.findAll();
        return estudiantes;
    }

    @Override
    public Estudiante buscarEstudiantePorId(Integer idEstudiante) {
      Estudiante estudiante = estudianteRepositorio.findById(idEstudiante).orElse(null);
      return estudiante;
    }

    @Override
    public void guardarEstudiante(Estudiante estudiante) {
        estudianteRepositorio.save(estudiante);
        
    }

    @Override
    public void eliminarEstudiante(Estudiante estudiante) {
        estudianteRepositorio.delete(estudiante);
    }
}
package utn.estudiantes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import utn.estudiantes.servicio.EstudianteServicio;

@SpringBootApplication
public class EstudiantesApplication implements CommandLineRunner {
	@Autowired
	private EstudianteServicio estudianteServicio;
	private static final Logger logger = LoggerFactory.getLogger(EstudiantesApplication.class);

	String nl = System.lineSeparator();

	public static void main(String[] args) {

		logger.info("Iniciando la aplicacion...");
		//Levantar la frabrica de Spring
		SpringApplication.run(EstudiantesApplication.class, args);
		logger.info("Aplicacion finalizada!");

	}

	@Override
	public void run(String... args) throws Exception {
		logger.info(nl+"Ejecutando el metodo run de Spring..."+nl);

	}
}


//Fin ejercicio Jose Remaggi
