//Ejercicio Gerardo Duckwitz
  public boolean eliminarEstudiante(Estudiate estudiante){
        PreparedStatement ps;
        Connection con = getConnection();
        String sql = "DELETE FROM estudiantes2022 WHERE idestudiante2022=?"
                try{
                    ps = con.prepareStatement(sql);
                    ps.setInt(1,estudiante.getIdEstudiante());
                    ps.execute();
                    return true;
                }catch (Exception e){
                    System.out.println("Error al eliminar el estudiante" +e.getMessage());
                }finally{
                    try{
                        con.close();
                    }catch (Exception e){
                        System.out.println("Error al cerrar la conexion");
                    }

                }
                return false;
    }


    public static void main(String[] args) {
        var salir = false;
        var consola = new Scanner((System.in));
        var estudianteDao = new EstudianteDAO()
                while (!salir){
                    try{
                        mostrarMenu();
                        salir = ejecutarOpciones(consola, estudianteDao);
                    }catch (Exception e){
                        System.out.println("Ocurrio un error");
                    }

                }
    }
    private static void mostrarMenu(){
        System.out.print("""
                ********** Sistema de Estudiantes***********
                1. Listar Estudiantes
                2. Buscar Estudiantes
                3. Agregar Estudiante
                4. Modificar Estudiante
                5. Eliminar Estudiante
                6. Salir
                Elige una opcion:
                
                
                """);
    }

//Fin ejercicio Gerardo Duckwitz
*

//Ejercicio Jose Remaggi
  public boolean eliminarEstudiante(Estudiate estudiante){
        PreparedStatement ps;
        Connection con = getConnection();
        String sql = "DELETE FROM estudiantes2022 WHERE idestudiante2022=?"
                try{
                    ps = con.prepareStatement(sql);
                    ps.setInt(1,estudiante.getIdEstudiante());
                    ps.execute();
                    return true;
                }catch (Exception e){
                    System.out.println("Error al eliminar el estudiante" +e.getMessage());
                }finally{
                    try{
                        con.close();
                    }catch (Exception e){
                        System.out.println("Error al cerrar la conexion");
                    }

                }
                return false;
    }


    public static void main(String[] args) {
        var salir = false;
        var consola = new Scanner((System.in));
        var estudianteDao = new EstudianteDAO()
                while (!salir){
                    try{
                        mostrarMenu();
                        salir = ejecutarOpciones(consola, estudianteDao);
                    }catch (Exception e){
                        System.out.println("Ocurrio un error");
                    }

                }
    }
    private static void mostrarMenu(){
        System.out.print("""
                ********** Sistema de Estudiantes***********
                1. Listar Estudiantes
                2. Buscar Estudiantes
                3. Agregar Estudiante
                4. Modificar Estudiante
                5. Eliminar Estudiante
                6. Salir
                Elige una opcion:
                
                
                """);
    }

//Fin ejercicio Jose Remaggi
//Ejercicio Anabel Alesci
//Metodo para ejecutar las opciones, va a regresar un valor booleani, ya que es el que
// puede modificar el valor de la variable salir, si es verdadero termina el ciclo while
private static boolean ejecutarOpciones(Scanner consola, EstudianteDAO estudianteDAO){
  var opcion = Integer.parseInt(consola.nextLine());
  var salir = false;
  switch(opcion){
    case 1 -> {//listar estudiantes
      System.out.println("Listado de Estudiantes");
      //no muestra la informacion, solo recupera la info y regresa una lista
        var estudiantes = estudianteDAO.listarEstudiantes();//recibe el listado
        //vamos a iterar cada objeto de tipo estudiante
        estudiantes.forEach(System.out::println);//para imprimir la lista
        }//Fin Caso 1
        case 2 -> {//Buscar estudiante por id
      System.out.println("Introduce el id_estudiante a buscar: ");
      var idEstudiante = Integer.parseInt(consola.nextLine());
      var estudiante = new Estudiante(idEstudiante);
      var encontrado = estudianteDAO.buscarEstudiantePorId(estudiante);
      if(encontrado)
        System.out.println("Estudiante encontrado: "+ estudiante);
      else
        System.out.prinln("Estudiante NO encontrado: "+ estudiante);
        }//Fin caso 2
        case 3 ->{//Agregar estudiante
        System.out.println("Agregar estudiante: ");
        System.out.println("Nombre: ");
        var nombre=console.nextLine();
        System.out.println("Apellido: ");
        var apellido=console.nextLine();
        System.out.println("Telefono: ");
        var telefono=console.nextLine();
        System.out.println("Email: ");
        var email=console.nextLine();
        //crear objeto estudiante(sin id)
        var estudiante=new Estudiante(nombre,apellido,telefono,email);
        var agregado=estudianteDAO.agregarEstudiante(estudiante);
        if(agregado)
        System.out.println("Estudiante agregado: "+estudiante);
        else
        System.out.println("Estudiante NO agregado"+estudiante);
        }//Fin Caso 3
        case 4 -> {//Modificar estudiante
      System.out.println("Modificar estudiante: ");
      //Aqui lo primero es especificar cual es el id del objeto a modificar
        System.out.println("Id Estudiante: ");
        var idEstudiante =Integer.parseInt(consola.nextLine());
        System.out.println("Nombre: ");
        var nombre = consola.nextLine();
        System.out.println("Apellido: ");
        var apellido = consola.nextLine();
        System.out.println("Telefono: ");
        var telefono = consola.nextLine();
        System.out.println("Email: ");
        var email = consola.nextLine();
        //crea el objeto estudiante a modificar
        var estudiante =
        new Estudiante(idEstudiante, nombre, apellido, telefono, email);
        var modificado = estudianteDAO.modificarEstudiante(estudiante);
        if(modificado)
        System.out.println("Estudiante modificado"+ estudiante);
        else
          System.out.println("Estudiante No modificado"+ estudiante);
    }//Fin caso 4
        case 5 -> {//Eliminar estudiante
        System.out.println("Eliminar estudiante: ");
        System.out.println("Id estudiante: ");
        var idEstudiante = Integer.parseInt(consola.nextLine());
        var estudiante = new Estudiante(idEstudiante);
        var eliminado = estudianteDAO.eliminarEstudiante(estudiante);
        if(eliminado)
          System.out.println("Estudiante eliminado: "+ estudiante);
        else
          System.out.println("Estudiante NO eliminado: "+ estudiante);
        }//Fin caso 5
        case 6 ->{//salir
        System.out.println("Hasta pronto!!!");
        salir=true;
        }//fin caso 6
        default -> System.out.println("Opción no reconocida, ingrese otra opción");
        }//Fin switch
        return salir;
        }
        }//fin clase

        }
        //Fin Ejercicio Anabel Alesci

//Ejercicio Yesica López

package UTN.dato;
  
import UTN.dominio.Estudiante;

import static UTN.conexion.Conexion.getConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
  
public class EstudianteDAO {
    //Método listar
    public List<Estudiante> listarEstudiantes(){
        List<Estudiante> estudiantes = new ArrayList<>();
        //Creamos algunos objetos que son necesarios para comunicarnos con la base de datos
        PreparedStatement ps; //Envía la sentencia a la base de datos
        //Creamos un objeto de tipo conexión
        Connection con = getConnection();
        String sql ="SELECT * FROM estudiantes2022 ORDER BY idestudiantes2022";
        try{
            ps =con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(ps.next()){
                var estudiante = new Estudiante();
                estudiante. setIdEstudiante(rs.getInt("idestudiantes2022"));
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setTelefono(rs.getString("telefono"));
                estudiante.setEmail(rs.getString("email"));
                //falta agregarlo a la lista
                estudiantes.add(estudiante);
            }
        }catch (Exception e){
            System.out.println("Ocurrió un error al seleccionar datos: "+e.getMessage());
        }
    
      finally{
        try{
            con.close();
        }catch(Exception e){
            System.out.println("Ocurrió un error al cerrar la conexión: "+e.getMessage());
        }
     }//Fin finally
     return estudiantes;
    }//Fin método listar

    //Método por id -> fin by id
    public boolean buscarEstudiantePorId(Estudiante estudiante){
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();
        String sql = "SELECT * FROM estudiantes2022 WHERE idestudiantes2022=?";
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1,estudiante.getIdEstudiante());
            rs = ps.executeQuery();
            if(rs.next()){
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setEmail(rs.getString("email")); 
                 return true; //Se encontro un registro
            }//Fin if
        }catch(Exception e){
             System.out.println("Ocurrió un error al buscar estudiante: "+e.getMessage());
        }//Fin catch
        finally {
            try{
                 con.close();
            }catch(Exception e){
                  System.out.println("Ocurrió un error al cerrar la conexión: "+e.getMessage());
            }//Fin catch
        }//Fin finally
        return false;
}//Fin método
    
       //Método agregar un nuevo estudiante
       public boolean agregarEstudiante(Estudiante estudiante){
            PreparedStatement ps;
            Connection con = getConnection();
            String sql = "INSERT INTO estudiantes2022 (nombre,apellido,telefono,email)VALUES(?,?,?,?)";
             try{
                  ps = con.prepareStatement(sql);
                  ps.setString(1,estudiante.getNombre());
                 ps.setString(2,estudiante.getApellido());
                 ps.setString(3,estudiante.getTelefono());
                 ps.setString(4,estudiante.getEmail());
                 ps.execute();
                 return true; 
                }catch(Exception e){
                     System.out.println("Ocurrió un error al agregar estudiante: "+e.getMessage());
                }//Fin catch
               finally{
                  try{
                     con.close();
                    }catch (Exception e){
                       System.out.println("Error al cerrar la conexión: "+e.getMessage());
                    }//Fin catch
               }//Fin finally
               return false;
    }//Fin método agregarEstudiante
        

    //Método para modificar estudiante
    public boolean modificarEstudiante(Estudiante estudiante){
        PreparedStatement ps;
        Connection con = getConnection();
        String sql = "UPDATE estudiante2822 SET nombre=?, apellido=?, telefono=?, email=? WHERE idestudiantes2022=?";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1,estudiante.getNombre());
            ps.setString(2,estudiante.getApellido());
            ps.setString(3,estudiante.getTelefono());
            ps.setString(4,estudiante.getEmail());
            ps.setString(5,estudiante.getIdEstudiante());
            ps.execute();
            return true;
        }catch(Exception e){
            System.out.println("Error al modificar estudiante: "+e.getMessage());
        }//Fin catch
        finally{
            try{
                con.close();
            } catch(Exception e){
                System.out.println("Error al cerrar la conexión: "+e.getMessage());
            }//Fin catch
        }//Fin finally
        return false;
        
}//Fin método modificarEstudiante
   
   //Método Eliminar Estudiante
   public boolean eliminarEstudiante(Estudiante estudiante){
       PreparedStatement ps;
       Connection con = getConnection();
       String sql = "DELETE FROM estudiantes2022 WHERE idestudiante2022=?";
       try{
           ps = con.prepareStatement(sql);
           ps.setInt(1, estudiante.getIdEstudiante());
           ps.execute();
       }catch(Exception e){
           System.out.println("Error al eliminar estudiante: "e.getMessage());
       }
       finally{
           try{
               con.close();
           }catch(Exception e){
               System.out.println("Error al cerar la conexión: "e.getMessage());
           }
       }
       return false;
   }//Fin Método Eliminar Estudiante
    
    
   public static void main(String[] args) {
        var estudianteDao = new EstudianteDAO();
        //Modificar estudiante
        //var estudianteModificado = new Estudiante(1,"Juan Carlos","Juarez","5789033809","juan@mail.com");
        //var modificado = estudianteDao.modificarEstudiante(estudianteModificado);
        //if(modificado)
         //   System.out.println("Estudiante modificado: "+estudianteModificado);
        //else
        //    System.out.println("No se modifico el estudiante: "+estudianteModificado);
        
        //Agregar estudiante
        var nuevoEstudiante= new Estudiante("Carlos","Lara","5433435452", "carlos@mail.com");
        var agregado= estudianteDao.agregarEstudiante(nuevoEstudiante);
        if(agregado)
           System.out.println("Estudianteagregado: "+nuevoEstudiante);
        else
           System.out.println("No se ha agregado estudiante: "+nuevoEstudiante);
        
        //Eliminar estudiante con id 3
        var estudianteEliminar = new Estudiante(4);
        var eliminado = estudianteDAO.eliminarEstudiante(estudianteEliminar);
        if(eliminado)
            System.out.println("Estudiante eliminado "+estudianteEliminar);
        else
            System.out.println("No se elimino estudiante: "+estudianteEliminar);        
        
        //Listar los estudiantes
        System.out.println("Listado de estudiantes: ");
        List<Estudiante> estudiantes = estudianteDao.listarEstudiantes();
        estudiantes.forEach(System.out::println);//Función lambda para imprimir
        
        //Buscar por id
        //var estudiante1= new Estudiante(1);
        //System.out.println("Estudiante antes de la busqueda: "+estudiante1);
        //var encontrado = estudianteDao.buscarEstudiantePorId(estudiante1);
        //if(encontrado)
        //    System.out.println("Estudiante encontrado: "+estudiante1);
        //else
        //    System.out.println("No se encontro el estudiante: "+estudiante1.getIdEstudiante);
        
    }
}     

//Fin Ejercicio Yesica López
