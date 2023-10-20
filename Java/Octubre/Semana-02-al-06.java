//Ejercicio Gerardo Duckwitz
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
    private JTable tablaLibros;
    private DefaultTableModel tablaModeloLibros;


    @Autowired
    public LibroFrom(LibroServicio libroServicio){
        this.libroServicio = libroServicio;
        iniciarForma();
    }
    private void iniciarForma(){
        setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(900,700);
        //Para obtener las dimensiones de la ventana
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension tamanioPantalla = toolkit.getScreenSize();
        int x = (tamanioPantalla.width - getWidth()/2);
        int y = (tamanioPantalla.height - getHeight()/2);
        setLocation(x,y);
    }

    private void createUIComponents() {
        this.tablaModeloLibros = new DefaultTableModel(0,5);
        String[] cabecera = {"Id", "Libro", "Autor", "Precio", "Existencias"};
        this.tablaModeloLibros.setColumnIdentifiers(cabecera);
        //Instanciar el objeto de JTable
        this.tablaLibros =  new JTable(tablaModeloLibros);
        listarLibros();
    }
    private void listarLibros(){
        //Limpiar la tabla
        tablaModeloLibros.setRowCount(0);
        //Obtener los libros de la BD
        var libros = libroServicio.listarLibros();
        //Iteramos cada libro
        libros.forEach(libro -> {
            //Creamos cada registro para agregarlos a la tabla
            Object [] renglonLibro = {
                    libro.getIdlibro(),
                    libro.getNombreLibro(),
                    libro.getAutor(),
                    libro.getPrecio(),
                    libro.getExistencias()
            };
            this.tablaModeloLibros.addRow(renglonLibro);
        });
    }
}

//Fin ejercicio Gerardo Duckwitz

//Ejercicio de Yesica López
//TiendaLibrosApplication.java

package utn.tienda_libros;

import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication; 
import org.springframework.context.ConfigurableApplicationContext;  
import org.springframework.boot.builder.SpringApplicationBuilder; 
import org.springframework.boot.WebApplicationType; 
import utn.tienda_libros.vista.LibroFrom;
import java.awt.EventQueue;

@SpringBootApplication
public class TiendaLibrosApplication{
	
	public static void main(String[] args){ 
		
		ConfigurableApplicationContext contextoSpring = 
			new SpringApplicationBuilder(TiendaLibrosApplication.class)
				.headless(false)
				.web(WebApplicationType.NONE)
				.run(args);
		
		//Ejecutammos el código para cargar el formulario
		EventQueue.invokeLater(() -> {   //Método Lambda
			//Obtenemos el objeto from a través del spring
			LibroFrom libroFrom = contextoSpring.getBean(LibroFrom.class);
			libroFrom.setVisible(true);

                });
    }
}

//Fin Ejercicio Yesica López

//Ejercicio de Jose Remaggi
//TiendaLibrosApplication.java

package utn.tienda_libros;

import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication; 
import org.springframework.context.ConfigurableApplicationContext;  
import org.springframework.boot.builder.SpringApplicationBuilder; 
import org.springframework.boot.WebApplicationType; 
import utn.tienda_libros.vista.LibroFrom;
import java.awt.EventQueue;

@SpringBootApplication
public class TiendaLibrosApplication{
	
	public static void main(String[] args){ 
		
		ConfigurableApplicationContext contextoSpring = 
			new SpringApplicationBuilder(TiendaLibrosApplication.class)
				.headless(false)
				.web(WebApplicationType.NONE)
				.run(args);
		
		//Ejecutammos el código para cargar el formulario
		EventQueue.invokeLater(() -> {   //Método Lambda
			//Obtenemos el objeto from a través del spring
			LibroFrom libroFrom = contextoSpring.getBean(LibroFrom.class);
			libroFrom.setVisible(true);

                });
    }
}

//Fin Ejercicio Jose Remaggi

//Ejercicio de Anabel Alesci
//TiendaLibrosApplication.java

package utn.tienda_libros;

import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication; 
import org.springframework.context.ConfigurableApplicationContext;  
import org.springframework.boot.builder.SpringApplicationBuilder; 
import org.springframework.boot.WebApplicationType; 
import utn.tienda_libros.vista.LibroFrom;
import java.awt.EventQueue;

@SpringBootApplication
public class TiendaLibrosApplication{
	
	public static void main(String[] args){ 
		
		ConfigurableApplicationContext contextoSpring = 
			new SpringApplicationBuilder(TiendaLibrosApplication.class)
				.headless(false)
				.web(WebApplicationType.NONE)
				.run(args);
		
		//Ejecutammos el código para cargar el formulario
		EventQueue.invokeLater(() -> {   //Método Lambda
			//Obtenemos el objeto from a través del spring
			LibroFrom libroFrom = contextoSpring.getBean(LibroFrom.class);
			libroFrom.setVisible(true);

                });
    }
}

//Fin Ejercicio Anabel Alesci

//Ejercicio victoria zaccaro
package utn.tienda_libros;

import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication; 
import org.springframework.context.ConfigurableApplicationContext;  
import org.springframework.boot.builder.SpringApplicationBuilder; 
import org.springframework.boot.WebApplicationType; 
import utn.tienda_libros.vista.LibroFrom;
import java.awt.EventQueue;

@SpringBootApplication
public class TiendaLibrosApplication{
	public static void main(String[] args){ 
		ConfigurableApplicationContext contextoSpring = 
			new SpringApplicationBuilder(TiendaLibrosApplication.class)
				.headless(false)
				.web(WebApplicationType.NONE)
				.run(args);
		EventQueue.invokeLater(() -> {  
			LibroFrom libroFrom = contextoSpring.getBean(LibroFrom.class);
			libroFrom.setVisible(true);

                });
    }
}

//fin ejercicio victoria zaccaro
