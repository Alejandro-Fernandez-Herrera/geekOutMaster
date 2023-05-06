package myProject;

import java.util.Random;

/**
 * @brief la clase dado se encarga de generar un numero aleatorio entre 1 y 6 y hacerla visible
 * @author Alejandro Fernandez Herrera
 * @mail alejandro.fernandez.herrera@correounivalle.edu.co
 * @version v.0.1.0
 * @date 2023-04-05
 */
public class Dados {
    private int cara;

    /**
     * @brief constructor de la clase dado
     * @return un numero entre 1 y 6
     * @date 2023-04-05
     * @version v.0.1.0
     */

    public int getCara() {
        Random aleatorio = new Random();
        cara = aleatorio.nextInt(6)+1;
        return cara;
    }
}
