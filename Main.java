package myProject;

import javax.swing.*;

public class Main {
    public static void main(String[] arg) {
        SwingUtilities.invokeLater(new Runnable() {
        public void run() {

            GUI PRIMER = new GUI();
            PRIMER.setVisible(true);


        }
        });


    }
}