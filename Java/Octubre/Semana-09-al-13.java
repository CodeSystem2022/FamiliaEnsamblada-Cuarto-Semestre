
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