package myProject;

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame{
    private Header headerProject;
    private JLabel mano, textoPuntaje, textoPuntajeTotal, textoRonda;
    private JButton lanzar, ayuda, salir, creditos, botonExplicacion, continuarReiniciar;
    private JPanel panelDadosActivos, panelDadosUtilizados, panelDadosInactivos, panelPuntaje, panelRonda;
    private ImageIcon imageMano, imageExplicacion, imageDado;

    /**
     * Constructor de la clase GUI
     */
    public GUI(){
        initGUI();

        //Configuración por defecto del JFrame
        this.setTitle("Geek Out Masters");
        this.setUndecorated(true);
        this.pack();
        this.setResizable(true);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
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

        constraints.gridx=3;
        constraints.gridy=1;
        constraints.gridwidth=3;
        constraints.fill=GridBagConstraints.CENTER;
        this.add(headerProject,constraints);
}



