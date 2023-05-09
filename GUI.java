package myProject;

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
    private Header headerProject;
    private JLabel mano, textoPuntaje, textoPuntajeTotal, textoRonda;
    private JButton lanzar, ayuda, salir, creditos, botonExplicacion, continuarReiniciar;
    private JPanel panelDadosActivos, panelDadosUtilizados, panelDadosInactivos, panelPuntaje, panelRonda;
    private ImageIcon imageMano, imageExplicacion, imageDado;

    /**
     * Constructor de la clase GUI
     */
    public GUI() {
        initGUI();

        //Configuración por defecto del JFrame
        this.setTitle("Geek Out Masters");
        this.setUndecorated(true);
        this.pack();
        this.setResizable(true);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * Este método se utiliza para configurar la configuración predeterminada de JComponent,
     * crear objetos de escucha y control utilizados para la clase GUI
     */
    private void initGUI() {
        //Configurar el diseño del contenedor JFrame
        this.getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();


        //Configurar JComponents

        /**
         * Creacion del titulo
         */
        headerProject = new Header("Geek Out! Masters", Color.BLACK);

        constraints.gridx = 3;
        constraints.gridy = 1;
        constraints.gridwidth = 3;
        constraints.fill = GridBagConstraints.CENTER;
        this.add(headerProject, constraints);

        /**
         * Creacion de boton "Ayuda"
         */
        ayuda = new JButton(" help ");
        //ayuda.addActionListener(escucha);
        ayuda.setBackground(Color.green);
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.NONE;
        constraints.anchor = GridBagConstraints.CENTER;
        this.add(ayuda, constraints);

        /**
         * Creacion de boton "Créditos"
         */
        creditos = new JButton(" Créditos ");
        //creditos.addActionListener(escucha);
        creditos.setBackground(Color.yellow);
        constraints.gridx=2;
        constraints.gridy=1;
        constraints.gridwidth=1;
        constraints.fill=GridBagConstraints.CENTER;
        constraints.anchor=GridBagConstraints.LINE_START;
        this.add(creditos,constraints);


        /**
         * Creacion de boton "Salir"
         */
        salir = new JButton("Salir");
        //salir.addActionListener(escucha);
        salir.setBackground(Color.red);
        constraints.gridx=8;
        constraints.gridy=1;
        constraints.gridwidth=1;
        constraints.fill=GridBagConstraints.NONE;
        constraints.anchor=GridBagConstraints.LINE_END;
        this.add(salir,constraints);

        /**
         * Creacion de panel dados activos
         */
        panelDadosActivos = new JPanel(); // se crea un panel secundario con la funcion de ubicar los dados activos
        panelDadosActivos.setPreferredSize(new Dimension(300,300)); // dimensiones del panel
        panelDadosActivos.setBorder(BorderFactory.createTitledBorder("Dados Activos")); // titulo del panel
        panelDadosActivos.setBackground(Color.white);
        //panelDadosActivos.add(mano);

        constraints.gridx=3;
        constraints.gridy=2;
        constraints.gridwidth=3;
        constraints.fill=GridBagConstraints.BOTH;
        constraints.anchor=GridBagConstraints.CENTER;
        add(panelDadosActivos,constraints); //esto agrega el JPanel creado a la ventana principal para inicializarlo

        /**
         * Creacion de panel dados inactivos
         */
        panelDadosInactivos =  new JPanel();
        panelDadosInactivos.setPreferredSize(new Dimension(300,300));
        panelDadosInactivos.setBorder(BorderFactory.createTitledBorder("Dados Inactivos"));
        panelDadosInactivos.setBackground(Color.white);

        //ubico el panel en la grilla para que quede ordenado
        constraints.gridx=0;
        constraints.gridy=2;
        constraints.gridwidth=3;
        constraints.fill=GridBagConstraints.BOTH;
        constraints.anchor=GridBagConstraints.CENTER;
        add(panelDadosInactivos,constraints); //agrega el panel y el constrains

        /**
         * Creacion de panel dados utilizados
         */

        panelDadosUtilizados = new JPanel();
        panelDadosUtilizados.setPreferredSize(new Dimension(300,300));
        panelDadosUtilizados.setBorder(BorderFactory.createTitledBorder("Dados utilizados"));
        panelDadosUtilizados.setBackground(Color.white);

        //ubico el panel en la grilla para que quede ordenado
        constraints.gridx=6;
        constraints.gridy=2;
        constraints.gridwidth=3;
        constraints.fill=GridBagConstraints.BOTH;
        constraints.anchor=GridBagConstraints.CENTER;
        add(panelDadosUtilizados,constraints); //agrega el panel y el constrains

        /**
         * Creacion de panel puntaje
         */
        panelPuntaje = new JPanel();
        panelPuntaje.setLayout(new GridLayout(0,1));//GridLayout con una sola columna, y el número de filas será determinado automáticamente en función del número de componentes que se agreguen al panel.
        panelPuntaje.setPreferredSize(new Dimension(200,100));
        panelPuntaje.setBorder(BorderFactory.createTitledBorder("Puntaje"));
        panelPuntaje.setBackground(new Color(112, 215, 163, 255));
        //panelPuntaje.add(textoPuntajeTotal);
        //panelPuntaje.add(textoPuntaje);

        constraints.gridx=3;
        constraints.gridy=3;
        constraints.gridwidth=3;
        constraints.fill=GridBagConstraints.BOTH;
        constraints.anchor=GridBagConstraints.CENTER;
        add(panelPuntaje,constraints);

        
    }
}



