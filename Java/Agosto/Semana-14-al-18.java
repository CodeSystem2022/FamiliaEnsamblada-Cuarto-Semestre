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
//Ejercicio Matías Villa
package UTN;

import UTN.conexion.Conexion;
import UTN.datos.EstudianteDAO;
import UTN.dominio.Estudiante;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SistemaEstudiantesApp{
    public static void main(String[] args) {
        var salir = false;
        var consola = new Scanner(System.in); //leer info de la consola
        //Se crea una instancia de la clase servicio, esto lo hacemos fuera del ciclo
        var estudianteDao = new EstudianteDAO();
        while(!salir){
            try{
            mostrarMenu();
            //Este es el método ejecutarOpciones que va a devolver el boolean
            salir = ejecutarOpciones(consola, estudianteDao);//Este arreoja una exepcion
        } catch(Exception e){
            System.out.println("Ocurrió un error al ejecutar la operación"+e.getMessage);
        }

    }//Fin while
} // Fin Main

private static void mostrarMenu(){
    System.out.println("""
            ****Sistema Estudiantes****
            1.Listar Estudiantes
            2.Buscar Estudiantes
            3.Agregar Estudiantes
            4.Modificar Estudiantes
            5.Eliminar Estudiantes
            6.Salir
            Elige una opción :
            
            """);


}

//Método para ejecutar opciones,va a regresar un valor boolean
    private static boolean ejecutarOpciones(Scanner consola, EstudianteDAO estudianteDAO) {
        var opcion = Integer.parseInt(consola.nextLine()); //recibe el número atraves del Scanner y lo convierte en un INT
        var salir = false;
        switch (opcion) {
            case 1 -> { //Listar estudiantes
                System.out.println("listado de estudiantes...");
                //no muestra la información solo recupera info y regresa una lista
                var estudiantes = estudianteDAO.listarEstudiantes();//recibe el listado
                //vamos a iterar cada objeto de tipo estudiante
                estudiantes.forEach(System.out::println);//imprimir lista
            }//Fin caso 1

            case 2 -> { //Buscar estudiantes por id
                System.out.println("introduce el id_estudiante a buscar:");
                var idEstudiante = Integer.parsInt(consola.nextLine());
                var estudiante = new Estudiantes(idEstudiante);
                var encontrado = estudianteDAO.buscarEstudiantePorId(estudiante); //recibe lo que ejecuto el usuario
                if (encontrado)
                    System.out.println("Estudiante Encontrado" + estudiante);
                else
                    System.out.println("Estudiante No encontrado" + estudiante);
            }//Fin caso 2

            case 3 -> { //Agregar Estudiante
                System.out.println("Agregar Estudiante: ");
                System.out.println("Nombre: ");
                var nombre = console.nextLine();
                System.out.println("Apellido: ");
                var apellido = console.nextline();
                System.out.println("Telefono: ");
                var telefono = consola.nextLine();
                System.out.println("Email: ");
                var email = consola.nextLine();
                //crear objeto estudiante(sin id, se agrega automaticamente)
                var estudiante = new Estudiante(nombre, apellido, telefono, email);
                var agregado = estudianteDAO.agregarEstudiante(estudiante);
                if (agregado)
                    System.out.println("Estudiante Agragado" + estudiante);


            }//fin caso 3

            case 4 -> {//Modificar Estudiante
                System.out.println("Modificar Estudiante: ");
                //Lo primero es identificar el id del objeto a modificar
                System.out.println("Id estudiante: ");
                var idEstudiante = Integer.parseInt(consola.nextLine());
                System.out.println("Nombre: ");
                var nombre = console.nextLine();
                System.out.println("Apellido: ");
                var apellido = console.nextline();
                System.out.println("Telefono: ");
                var telefono = consola.nextLine();
                System.out.println("Email: ");

                //crear objeto estudiante a modificar
                var estudiante = new Estudiante(idEstudiante, nombre, apellido, telefono, email);
                var modificado = estudianteDAO.modificarEstudiante(estudiante);
                if (modificado)
                    System.out.println("Estudiante modificado" + estudiante);
                else
                    System.out.println("Estudiante NO modificado" + estudiante);
            }//Fin caso 4

            case 5 -> {//Eliminar estudiante
                System.out.println("Eliminar estudiante:");
                System.out.println("Id estudiante: ");
                var idEstudiante = Integer.parseInt(consola.nextline());
                var estudiante = new Estudiante(idEstudiante);
                var eliminado = estudianteDAO.eliminarEstudiante(estudiante);
                if (eliminado)
                    System.out.println("Estudiante eliminado" + estudiante);
                else
                    System.out.println("Estudiante No eliminado" + estudiante);
            }//Fin caso 5

            case 6 -> {//salir
                System.out.println("Hasta pronto ");
                salir = true;
            }//Fin caso salir
            default -> System.out.println("Opcion no reconocida, ingrese otra opción");
        }//Fin switch

        return salir;

            }


        }
    



//Fin Ejercicio Matías Villa

//Ejercicio Jesús Mercado

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

//Fin ejercicio Jesús Mercado
