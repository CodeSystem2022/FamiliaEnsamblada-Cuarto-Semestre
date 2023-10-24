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

//Ejercicio Matías Villa

package utn.tienda_libros.vista;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import utn.tienda_libros.servicio.LibroServicio;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

@Component
public class LibroFrom extends JFrame {
    LibroServicio libroServicio;
    private JPanel panel;
    //private JTable TablaLibros;
    private JScrollPane tablaLibros;
    private JTable TablaLibros;

    private DefaultTableModel tablaModeloLibros;

    @Autowired
    public LibroFrom(LibroServicio libroServicio){
        this.libroServicio = libroServicio;
        iniciarForma();

    }

    public static void setVisable(boolean b) {
    }

    private void iniciarForma(){
        setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Anotación
        createUIComponents();
        pack();
        //fin anotación
        setVisible(true);
        setSize(900, 700);
        //Para obtener las dimensiones de la ventana
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension tamanioPantalla = toolkit.getScreenSize();
        int x = (tamanioPantalla.width - getWidth()/2);
        int y = (tamanioPantalla.height - getHeight()/2);
        setLocation(x,y);
        setVisible(true);

    }


    private void createUIComponents() {
        this.tablaModeloLibros = new DefaultTableModel(0,5);
        //Array para las 5 columnas
        String[] cabecera = {"Id","Libro","Autor","Precio","Cantidades"};
        this.tablaModeloLibros.setColumnIdentifiers(cabecera);
        //Instanciar el objeto de Jtable
       this.tablaLibros = new JScrollPane(tablaLibros);
       listarLibros();
    }

    private void listarLibros(){
        //Limpiar la tabla
        tablaModeloLibros.setRowCount(0);
        //Obtener libros de la base de datos
        var libros = libroServicio.listarLibros();
        //Iteramos cada libro
        libros.forEach((libro) -> {//función lambda
                //creamos registro para agregarlos a la tabla
            Object [] renglonlibro ={
                    libro.getIdLibro(),
                    libro.getNombreLibro(),
                    libro.getAutor(),
                    libro.getPrecio(),
                    libro.getExistencias()
            };
            this.tablaModeloLibros.addRow(renglonlibro);

        });


    }
}


//Fin ejercicio Matías Villa.

//Fin ejercicio Jose Remaggi

//Ejercicio Victoria Zaccaro
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
        tablaModeloLibro.setRowCount(0);
        //Obtener los libros de la BD
        var libros = librosServicios.listarLibros();
        //Iteramos cada libro 
        libros.forEach((libro) -> {
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
//Fin ejercicio Victoria zaccaro

// Ejercicio Jesús Mercado

package utn.tienda_libros.vista;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import utn.tienda_libros.servicio.LibroServicio;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Component
public class LibroFrom extends JFrame {
    LibroServicio libroServicio;
    private JPanel panel;
    private JTable tablaLibros;
    private JTextField libroTexto;
    private JTextField autorTexto;
    private JTextField precioTexto;
    private JTextField existenciasTexto;
    private JButton agregarButton;
    private JButton modificarButton;
    private JButton eliminarButton;
    private JButton agergarButton;
    private DefaultTableModel tablaModeloLibros;

    @Autowired
    public LibroFrom(LibroServicio libroServicio){
        this.libroServicio = libroServicio;
        iniciarForma();
        agregarButton.addActionListener(e -> agregarLibro());
    }

    private void iniciarForma(){
        setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(900, 700);
        // Para obtener las dimenciones de la ventana
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension tamanioPantalla = toolkit.getScreenSize();
        int x = (tamanioPantalla.width - getWidth()/2);
        int y = (tamanioPantalla.height - getHeight()/2);
        setLocation(x, y);
    }

    private void agregarLibro(){
        // Leer los valores del formulario
        if(libroTexto.getText().equals("")){
            mostrarMensaje("Ingresa el nombre del libro");
            libroTexto.requestFocusInWindow();
            return;
        }
        var nombreLibro = libroTexto.getText();
        var autor = autorTexto.getText();
        var precio = Double.parseDouble(precioTexto.getText());
        var existencias = Integer.parseInt(existenciasTexto.getText());
        // Creamos el objeto libro
        var libro = new Libro(null, nombreLibro, autor, precio, existencias);
        // libro.setNombreLibro(nombreLibro);
        // libro.setAutor(autor);
        // libro.setPrecio(precio);
        // libro.setExistencias(existencias);
        this.libroServicio.guardarLibro(libro);
        mostrarMensaje("Se agrego el libro...");
        limpiarFormulario();
        listarLibros();
    }

    private void limpiarFormulario() {
        libroTexto.setText("");
        autorTexto.setText("");
        precioTexto.setText("");
        existenciasTexto.setText("");
    }

    private void mostrarMensaje(String mensaje){
        JOptionPane.showConfirmDialog(this, mensaje);
    }

    private void createUIComponents() {
        this.tablaModeloLibros = new DefaultTableModel(0, 5);
        String[] cabecera = {"Id", "Libro", "Autor", "Precio", "Existencias"};
        this.tablaModeloLibros.setColumnIdentifiers(cabecera);
        // Instanciar el objeto de JTable
        this.tablaLibros = new JTable(tablaModeloLibros);
        listarLibros();
    }

    private void listarLibros() {
        // Limpiar la tabla
        tablaModeloLibros.setRowCount(0);
        // Obtener los libros de la BD
        var libros = libroServicio.listarLibros();
        // Iteramos cada libro
        libros.forEach((libro) -> { // Función Lambda
            // Creamos cada registro para agregarlos a la tabla
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


// Fin Ejercicio Jesús Mercado
