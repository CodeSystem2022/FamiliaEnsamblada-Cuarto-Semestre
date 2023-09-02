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
