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
