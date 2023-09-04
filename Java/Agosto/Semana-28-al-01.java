// Ejericio Gerardo Duckwitz

import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
//boilerplate - Repetitivo
@Data
 @NoArgsConstructor
@AllArgsConstructor
@ToString

public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idestudiantes;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;

}

//Fin ejercicio Gerardo Duckwitz

//Ejercicio de Yesica López

package utn.estudiantes.servicio;

import utn.estudiante.modelo.Estudiante;

import java.util.List;

public interface IEstudianteServicio{
	public List<Estudiante> listarEstudiantes();
	public Estudiante buscarEstudiantePorId(Integer idEstudiante);
	public void guardarEstudiante(Estudiante estudiante);
	public void eliminarEstudiante(Estudiante estudiante);
}

//Fin Ejercicio Yesica López


//Ejercicio Matías Villa

package utn.estudiantes.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
//boilerplate - Repetitivo
@Data //crea los metodos get y set
@NoArgsConstructor //agrega el constructor vacio
@AllArgsConstructor //agrega constructor con lso argumentos
@ToString //Agrega el Método toString
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEstudiantes2023;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;

}
//Fin ejercicio Matías
