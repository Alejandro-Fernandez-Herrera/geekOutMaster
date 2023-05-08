package myProject;

import javax.swing.*;

public class Main {
    public static void main(String[] arg) {
        SwingUtilities.invokeLater(new Runnable() {
        public void run() {

            Ventana PRIMER = new Ventana();
            PRIMER.setVisible(true);


        }
        });


    }
}