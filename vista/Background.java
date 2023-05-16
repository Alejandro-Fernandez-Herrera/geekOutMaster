package myProject.vista;

import javax.swing.*;
import java.awt.*;


public class Background extends JPanel {
    private Image imagenFondo;

    public Background(Image imagenFondo) {
        this.imagenFondo = imagenFondo;
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (imagenFondo != null) {
            g.drawImage(imagenFondo, 0, 0, getWidth(), getHeight(), null);
        }
    }
}