package myProject;

import javax.swing.*;

public class Ventana extends JFrame {
    private JPanel ventana;
    private JButton iniciarJuegoButton;
    private JButton salirDelJuegoButton;

    public Ventana() {
        // Configuramos la ventana
        setSize(300, 200);
        setLocationRelativeTo(null);
        setTitle("GEEK OUT! MASTERS");

        // Configuramos el panel
        ventana = new JPanel();
        iniciarJuegoButton = new JButton("Iniciar Juego");
        salirDelJuegoButton = new JButton("Salir del Juego");

        ventana.add(iniciarJuegoButton);
        ventana.add(salirDelJuegoButton);

        add(ventana);

        // Mostramos la ventana
        setVisible(true);
    }
}