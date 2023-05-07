package myProject;
import java.util.Random;

/**
 * @brief la clase Dados se encarga de generar una cara aleatoria entre las sgtes posibilidades:<br>
 * Cara de puntos con el número 42<br>
 * Los Meeples permiten relanzar los dados<br>
 * Las Naves Espaciales eliminan un dado<br>
 * Los Superhéroes revelarán el lado oculto de la cara<br>
 * Los Corazones nos brindarán un dado extra<br>
 * Los Dragones causan pérdida<br>
 * @autors Jose David Giraldo <br> Alejandro Fernandez
 * @version v.0.1.0
 * @date 2023-04-05
 */
public class Dados {
    private int cara;

    /**
     * @brief constructor de la clase dado
     * @date 2023-04-05
     * @version v.0.1.0
     */

    public int getCara() {
        Random aleatorio = new Random();
        cara = aleatorio.nextInt(6)+1;
        return cara;
    }
}
