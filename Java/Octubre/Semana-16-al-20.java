
// Ejercicio Gerardo Duckwitz
    private void cargarLibroSeleccionado(){
        //Los indices de las columnas inician en 0
        var renglon = tablaLibros.getSelectedRow();
        if (renglon != -1){
            String idLibro = tablaLibros.getModel().getValueAt(renglon, 0).toString();
            idTexto.setText(idLibro);
            String nombreLibro = tablaLibros.getModel().getValueAt(renglon, 1).toString();
            libroTexto.setText(nombreLibro);
            String autor  = tablaLibros.getModel().getValueAt(renglon, 2).toString();
            autorTexto.setText(autor);
            String precio = tablaLibros.getModel().getValueAt(renglon, 3).toString();
            precioTexto.setText(precio);
            String existencias = tablaLibros.getModel().getValueAt(renglon, 4).toString();
            existenciasTexto.setText(existencias);
        }
    }
    private void modificarLibro(){
        if (this.idTexto.equals("")){
            mostrarMensaje("Debes seleccionar un registro en la tabla");
        }else{
            //Verificamos que nombre del libro no sea nulo
            if (libroTexto.getText().equals("")){
                mostrarMensaje("Digite el nombre del libro...");
                libroTexto.requestFocusInWindow();
                return;
            }
            //Llenamos el objeto libro a actualizar
            int idLibro = Integer.parseInt(idTexto.getText());
            var nombreLibro = libroTexto.getText();
            var autor = autorTexto.getText();
            var precio = Double.parseDouble(precioTexto
                    .getText());
            var existencias = Integer.parseInt(existenciasTexto.getText());
            var libro =  new Libro(idLibro, nombreLibro, autor, precio, existencias);
            libroServicio.guardarLibro(libro);
            mostrarMensaje("Se modifico el libro...");
            limpiarFormulario();
            listarLibros();
        }
    }

//Fin ejercicio Gerardo Duckwitz

//Ejercicio de Yesica López

private void eliminarLibro(){
	   var renglon = tablaLibros.getSelectedRow();
           if(renglon != -1){
              String idLibro = tablaLibros.getModel().getValueAt(renglon, 0).toString();
              var libro = new Libro();
              libro.setIdLibro(Integer.parseInt(idLibro));
              libroServicio.eliminarLibro(libro);
              mostrarMensaje("Libro "+idLibro+" ELIMINADO");
              limpiarFormulario();
              listarLibros();
           }
           else{
              mostarMensaje("No se ha seleccionado ningún libro de la tabla a eliminar");
           }
 }
//Fin Ejercicio Yesica López

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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@Component
public class LibroFrom extends JFrame {
    LibroServicio libroServicio;
    private JPanel panel;
    private JTable tablaLibros;
    private JTextField idTexto;
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
        tablaLibros.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                cargarLibroSeleccionado();
            }
        });
        modificarButton.addActionListener(e -> modificarLibro());
        eliminarButton.addActionListener(e -> eliminarLibro());
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

    private void cargarLibroSeleccionado(){
        // Los indices de las columnas inician en 8
        var renglon = tablaLibros.getSelectedRow();
        if(renglon != -1){
            String idLibro = tablaLibros.getModel().getValueAt(renglon, 0).toString();
            idTexto.setText(idLibro);
            String nombreLibro =
                    tablaLibros.getModel().getValueAt(renglon, 1).toString();
            libroTexto.setText(nombreLibro);
            String autor =
                    tablaLibros.getModel().getValueAt(renglon, 2).toString();
            autorTexto.setText(autor);
            String precio =
                    tablaLibros.getModel().getValueAt(renglon, 3).toString();
            precioTexto.setText(precio);
            String existencias =
                    tablaLibros.getModel().getValueAt(renglon, 4).toString();
            existenciasTexto.setText(existencias);
        }
    }

    private void modificarLibro(){
        if(this.idTexto.equals("")){
            mostrarMensaje("Debes seleccionar un registro en la tabla");
        }
        else {
            // Verificar que nombre del libro no sea nulo
            if(libroTexto.getText().equals("")){
                mostrarMensaje("Digite el nombre del libro...");
                libroTexto.requestFocusInWindow();
                return;
            }
            // Llenamos el objeto libro a actualizar
            int idLibro = Integer.parseInt(idTexto.getText());
            var nombreLibro = libroTexto.getText();
            var autor = autorTexto.getText();
            var precio = Double.parseDouble(precioTexto.getText());
            var existencias = Integer.parseInt(existenciasTexto.getText());
            var libro = new Libro(idLibro, nombreLibro, autor, precio, existencias);
            libroServicio.guardarLibro(libro);
            mostrarMensaje("Se modificó el libro...");
            limpiarFormulario();
            listarLibros();
        }
    }

    private void eliminarLibro(){
        var renglon = tablaLibros.getSelectedRow();
        if(renglon != -1){
            String idLibro =
                    tablaLibros.getModel().getValueAt(renglon, 0).toString();
            var libro = new Libro();
            libro.setIdLibro(Integer.parseInt(idLibro));
            libroServicio.eliminarLibro(libro);
            mostrarMensaje("Libro " +idLibro+" ELIMINADO");
            limpiarFormulario();
            listarLibros();
        }
        else {
            mostrarMensaje("No se ha seleccionado ningún libro de la tabla a eliminar");
        }
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
        idTexto = new JTextField("");
        idTexto.setVisible(false);
        this.tablaModeloLibros = new DefaultTableModel(0, 5){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        String[] cabecera = {"Id", "Libro", "Autor", "Precio", "Existencias"};
        this.tablaModeloLibros.setColumnIdentifiers(cabecera);
        // Instanciar el objeto de JTable
        this.tablaLibros = new JTable(tablaModeloLibros);
        // Evitamos que se seleccionen varios registros
        tablaLibros.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
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

//Ejercicio Matías Villa

package utn.tienda_libros.vista;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import utn.tienda_libros.modelo.Libro;
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
    private JTable TablaLibros;
    private JScrollPane tablaLibros;

    private JTextField LibroTexto;
    private JTextField AutorTexto;
    private JLabel Precio;
    private JTextField PrecioTexto;
    private JLabel Existencias;
    private JTextField ExistenciasTexto;
    private JLabel Autor;
    private JLabel Libro;
    private JButton Agregar;
    private JButton modificarButton;
    private JButton eliminarButton;
    private JLabel libro;

    private DefaultTableModel tablaModeloLibros;

    @Autowired
    public LibroFrom(LibroServicio libroServicio){
        this.libroServicio = libroServicio;
        iniciarForma();

        Agregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarLibro();
            }
        });
//
//        Agregar.addActionListener(e -> {
//
//        });
    }

    public void setVisible(boolean b){
        super.setVisible(b);
    }


    private void iniciarForma(){
        //panel = new JPanel();
        setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(900, 700);
        //Anotación
//        createUIComponents();
//        pack();
//        tablaLibros = new JScrollPane(TablaLibros);
//        panel.add(tablaLibros);
        //fin anotación

        //Para obtener las dimensiones de la ventana
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension tamanioPantalla = toolkit.getScreenSize();
        int x = (tamanioPantalla.width - getWidth()/2);
        int y = (tamanioPantalla.height - getHeight()/2);
        setLocation(x,y);
        setVisible(true);

    }

    private void agregarLibro(){
        //Leer los valores del formulario (de cada caja de texto)
        if (LibroTexto.getText().equals("")) {
            mostrarMensaje("Ingresa el nombre del libro:");
            LibroTexto.requestFocusInWindow();
            return;
        }

        var nombreLibro = LibroTexto.getText();
        var autor = AutorTexto.getText();
        var precio = Double.parseDouble(PrecioTexto.getText());
        var existencias = Integer.parseInt(ExistenciasTexto.getText());
        // Creamos el objeto del libro
        var libro = new Libro(null, nombreLibro, autor, precio, existencias);
        this.libroServicio.guardarLibro(libro);
        mostrarMensaje("Se agregó el libro...");
        limpiarFormulario();
        listarLibros();

    }

    private void limpiarFormulario() {
        LibroTexto.setText(""); // Cambiado de libroTexto a LibroTexto
        AutorTexto.setText(""); // Cambiado de autorTexto a AutorTexto
        PrecioTexto.setText(""); // Cambiado de precioTexto a PrecioTexto
        ExistenciasTexto.setText(""); // Cambiado de existenciasTexto a ExistenciasTexto
    }

    //Creamos el Método
    private void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(this, mensaje);

    }
    private void createUIComponents() {
        this.tablaModeloLibros = new DefaultTableModel(0,5); //cero no se especifica renglon, cinco columnas
        //Array para las 5 columnas
        String[] cabecera = {"Id","Libro","Autor","Precio","Cantidades"};
        this.tablaModeloLibros.setColumnIdentifiers(cabecera);
        //Instanciar el objeto de Jtable

        this.TablaLibros = new JTable(tablaModeloLibros);
      //  this.tablaLibros = new JScrollPane(TablaLibros);

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
            this.tablaModeloLibros.addRow(renglonlibro);//Agregamos a la tabla

        });
    }
}

//Fin Ejercicio Matías Villa

//Ejercicio Jose Remaggi

package utn.tienda_libros.vista;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import utn.tienda_libros.modelo.Libro;
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
    private JTable TablaLibros;
    private JScrollPane tablaLibros;

    private JTextField LibroTexto;
    private JTextField AutorTexto;
    private JLabel Precio;
    private JTextField PrecioTexto;
    private JLabel Existencias;
    private JTextField ExistenciasTexto;
    private JLabel Autor;
    private JLabel Libro;
    private JButton Agregar;
    private JButton modificarButton;
    private JButton eliminarButton;
    private JLabel libro;

    private DefaultTableModel tablaModeloLibros;

    @Autowired
    public LibroFrom(LibroServicio libroServicio){
        this.libroServicio = libroServicio;
        iniciarForma();

        Agregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarLibro();
            }
        });
//
//        Agregar.addActionListener(e -> {
//
//        });
    }

    public void setVisible(boolean b){
        super.setVisible(b);
    }


    private void iniciarForma(){
        //panel = new JPanel();
        setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(900, 700);
        //Anotación
//        createUIComponents();
//        pack();
//        tablaLibros = new JScrollPane(TablaLibros);
//        panel.add(tablaLibros);
        //fin anotación

        //Para obtener las dimensiones de la ventana
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension tamanioPantalla = toolkit.getScreenSize();
        int x = (tamanioPantalla.width - getWidth()/2);
        int y = (tamanioPantalla.height - getHeight()/2);
        setLocation(x,y);
        setVisible(true);

    }

    private void agregarLibro(){
        //Leer los valores del formulario (de cada caja de texto)
        if (LibroTexto.getText().equals("")) {
            mostrarMensaje("Ingresa el nombre del libro:");
            LibroTexto.requestFocusInWindow();
            return;
        }

        var nombreLibro = LibroTexto.getText();
        var autor = AutorTexto.getText();
        var precio = Double.parseDouble(PrecioTexto.getText());
        var existencias = Integer.parseInt(ExistenciasTexto.getText());
        // Creamos el objeto del libro
        var libro = new Libro(null, nombreLibro, autor, precio, existencias);
        this.libroServicio.guardarLibro(libro);
        mostrarMensaje("Se agregó el libro...");
        limpiarFormulario();
        listarLibros();

    }

    private void limpiarFormulario() {
        LibroTexto.setText(""); // Cambiado de libroTexto a LibroTexto
        AutorTexto.setText(""); // Cambiado de autorTexto a AutorTexto
        PrecioTexto.setText(""); // Cambiado de precioTexto a PrecioTexto
        ExistenciasTexto.setText(""); // Cambiado de existenciasTexto a ExistenciasTexto
    }

    //Creamos el Método
    private void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(this, mensaje);

    }
    private void createUIComponents() {
        this.tablaModeloLibros = new DefaultTableModel(0,5); //cero no se especifica renglon, cinco columnas
        //Array para las 5 columnas
        String[] cabecera = {"Id","Libro","Autor","Precio","Cantidades"};
        this.tablaModeloLibros.setColumnIdentifiers(cabecera);
        //Instanciar el objeto de Jtable

        this.TablaLibros = new JTable(tablaModeloLibros);
      //  this.tablaLibros = new JScrollPane(TablaLibros);

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
            this.tablaModeloLibros.addRow(renglonlibro);//Agregamos a la tabla

        });
    }
}

//Fin Ejercicio Jose Remaggi
//Ejercicio Anabel Alesci
private void cargarLibroSeleccionado(){
    //Los indices de las columnas inician en 0
    var renglon = tablaLibros.getSelectedRow();
    if (renglon != -1){
        String idLibro = tablaLibros.getModel().getValueAt(renglon, 0).toString();
        idTexto.setText(idLibro);
        String nombreLibro = tablaLibros.getModel().getValueAt(renglon, 1).toString();
        libroTexto.setText(nombreLibro);
        String autor  = tablaLibros.getModel().getValueAt(renglon, 2).toString();
        autorTexto.setText(autor);
        String precio = tablaLibros.getModel().getValueAt(renglon, 3).toString();
        precioTexto.setText(precio);
        String existencias = tablaLibros.getModel().getValueAt(renglon, 4).toString();
        existenciasTexto.setText(existencias);
    }
}
    private void modificarLibro(){
        if (this.idTexto.equals("")){
            mostrarMensaje("Debes seleccionar un registro en la tabla");
        }else{
            //Verificamos que nombre del libro no sea nulo
            if (libroTexto.getText().equals("")){
                mostrarMensaje("Digite el nombre del libro...");
                libroTexto.requestFocusInWindow();
                return;
            }
            //Llenamos el objeto libro a actualizar
            int idLibro = Integer.parseInt(idTexto.getText());
            var nombreLibro = libroTexto.getText();
            var autor = autorTexto.getText();
            var precio = Double.parseDouble(precioTexto
                    .getText());
            var existencias = Integer.parseInt(existenciasTexto.getText());
            var libro =  new Libro(idLibro, nombreLibro, autor, precio, existencias);
            libroServicio.guardarLibro(libro);
            mostrarMensaje("Se modifico el libro...");
            limpiarFormulario();
            listarLibros();
        }
    }
    //Fin Ejercicio Anabel Alesci
//Ejercicio victoria zaccaro
    private void eliminarLibro(){
        var renglon = tablaLibros.getSelectedRow();
        if(renglon != -1){
            String idLibro =
                    tablaLibros.getModel().getValueAt(renglon, 0).toString();
            var libro = new Libro();
            libro.setIdLibro(Integer.parseInt(idLibro));
            libroServicio.eliminarLibro(libro);
            mostrarMensaje("Libro " +idLibro+" ELIMINADO");
            limpiarFormulario();
            listarLibros();
        }
        else {
            mostrarMensaje("No se ha seleccionado ningún libro de la tabla a eliminar");
        }
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
//Fin ejercicio victoria zaccaro
