// Ejercicio Anabel Alesci
@Component
public class LibroFrom extends JFrame {
    LibroServicio libroServicio;
    private JPanel panel;
    private Jtable tablaLibros;
    private JTextField libroTexto;
    private JTextField autorTexto;
    private JTextField existenciasTexto;
    Private DefaultTableModel tablaModeloLibros;

    @Autowired
    public LibroFrom(LibroServicio libroServicio){
        this.libroServicio = libroServicio;
        iniciarForma();
        agregarButton.addActionListener(e ->{

        });
    }
}
// Fin Ejercicio Anabel Alesci

//Ejercicio Gerardo Duckwitz
private void agregarLibro(){
        //Leer los valores del formulario

        if (libroTexto.getText().equals("")){
            mostrarMensaje("Ingresa el nombre del libro");
            libroTexto.requestFocusInWindow();
            return;
        }
        var nombreLibro = libroTexto.getText();
        var autor = autorTexto.getText();
        var precio = Double.parseDouble(precioTexto.getText());
        var existencias = Integer.parseInt(existenciasTexto.getText());
        //Creamos el objeto libro
        var libro = new Libro();
        libro.setNombreLibro(nombreLibro);
        libro.setAutor(autor);
        libro.setPrecio(precio);
        libro.setExistencias(existencias);
        this.libroServicio.guardarLibro(libro);
        mostrarMensaje("Se agrego el libro...");
        limpiarFormulario();
        listarLibros();
    }
    private void limpiarFormulario(){
        libroTexto.setText("");
        autorTexto.setText("");
        precioTexto.setText("");
        existenciasTexto.setText("");
    }
    private void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(this, mensaje);

    }

//Fin ejercicio Gerardo Duckwitz

//Ejercicio de Yesica López

//libroFrom.java

import java.awt.*;

@Component
public class LibroFrom extends JFrame {
    LibroServicio libroServicio;
    private JPanel panel;
    private Jtable tablaLibros;
    private JTextField libroTexto;
    private JTextField autorTexto;
    private JTextField precioTexto;
    private JTextField existenciasTexto;
    private JButton agregarButton;
    private JButton modificarButton;
    private JButton eliminarButton;
    Private DefaultTableModel tablaModeloLibros;

    @Autowired
    public LibroFrom(LibroServicio libroServicio){
        this.libroServicio = libroServicio;
        iniciarForma();
        agregarButton.addActionListener(e -> agregarLibro());
    }
    
private void iniciarForma(){
    setContentPane(panel);
    set DefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    setSize(900, 700);
    //Para obtener les dimenciones de la ventana
    Toolkit toolkit = Toolkit.getDefaultToolkit();
    Dimension tamanioPantalla = toolkit.getScreenSize();
    int x = (tamanioPantalla.width - getWidth()/2);
    int y = (tamanioPantalla.height - getHeight()/2);
    setLocation(x, y);
}

private void agregarLibro(){
        //Leer los valores del formulario
        if (libroTexto.getText().equals("")){
            mostrarMensaje("Ingresa el nombre del libro");
            libroTexto.requestFocusInWindow();
            return;
        }
        var nombreLibro = libroTexto.getText();
        var autor = autorTexto.getText();
        var precio = Double.parseDouble(precioTexto.getText());
        var existencias = Integer.parseInt(existenciasTexto.getText());

        //Creamos el objeto libro
        var libro = new Libro();
        //libro.setNombreLibro(nombreLibro);
        //libro.setAutor(autor);
        //libro.setPrecio(precio);
        //libro.setExistencias(existencias);
        this.libroServicio.guardarLibro(libro);
        mostrarMensaje("Se agrego el libro...");
        limpiarFormulario();
        listarLibros();
    }
    private void limpiarFormulario(){
        libroTexto.setText("");
        autorTexto.setText("");
        precioTexto.setText("");
        existenciasTexto.setText("");
    }

    private void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(this, mensaje);
    }

    private void createUIComponents(){
        this.tablaModeloLibros = new DefaultTableModel(0, 5);
        String[] cabecera = {"Id", "Libro", "Autor", "Precio", "Existencias"};
        this.tablaModeloLibros.setColumnIdentifiers(cabecera);
        //Instanciar el objeto de JTable
        this.tablaLibros = new JTable(tablaModeloLibros);
        listarLibros();
    }

    private void listarLibros(){
        //Limpiar la tabla
        tablaModeloLibro.setRowCount(0);
        //Obtener los libros de la BD
        var libros = librosServicios.listarLibros();
        //Iteramos cada libro 
        libros.forEach((libro) -> {//Función Lambda
             //Creamos cada registro para agregarlos a la tabla
             Object [] renglonLibro = {
                     libro.getIdLibro(),
                     libro.getNombreLibro(),
                     libro.getAutor(),
                     libro.getPrecio(),
                     libro.getExistencias()   
              };
              this.tablaModeloLibros.addRow(renglonLibro);
         });
     }
}

//Fin Ejercicio Yesica López
//Ejercicio Jose Remaggi
private void agregarLibro(){
    //Leer los valores del formulario

    if (libroTexto.getText().equals("")){
        mostrarMensaje("Ingresa el nombre del libro");
        libroTexto.requestFocusInWindow();
        return;
    }
    var nombreLibro = libroTexto.getText();
    var autor = autorTexto.getText();
    var precio = Double.parseDouble(precioTexto.getText());
    var existencias = Integer.parseInt(existenciasTexto.getText());
    //Creamos el objeto libro
    var libro = new Libro();
    libro.setNombreLibro(nombreLibro);
    libro.setAutor(autor);
    libro.setPrecio(precio);
    libro.setExistencias(existencias);
    this.libroServicio.guardarLibro(libro);
    mostrarMensaje("Se agrego el libro...");
    limpiarFormulario();
    listarLibros();
}
private void limpiarFormulario(){
    libroTexto.setText("");
    autorTexto.setText("");
    precioTexto.setText("");
    existenciasTexto.setText("");
}
private void mostrarMensaje(String mensaje){
    JOptionPane.showMessageDialog(this, mensaje);

}

//Fin ejercicio Jose Remaggi
