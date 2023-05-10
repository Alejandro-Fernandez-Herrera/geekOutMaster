package myProject;
import java.util.Random;

/**
 * @brief la clase Dados se encargará de generar una cara aleatoria entre las sgtes posibilidades:<br>
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
    private int numeroCaraAccion;
    private String funcion;
    private String nombreDado;
    private String activoInactivo;

    public Dados(){
    }


    public void setNumAccion(){
        int numeroAleatorio;
        Random aleatorio = new Random();
        numeroAleatorio = aleatorio.nextInt(6)+1;
        if(numeroCaraAccion == numeroAleatorio){
            setNumAccion();
        }else{
            numeroCaraAccion = numeroAleatorio;
        }
    }


    public void setNumAccionNoAleatorio(int numero){
        numeroCaraAccion = numero;
    }


    public void setFuncion(String _accion){
        funcion = _accion;
    }


    public void setNombreDado(String _nombre){
        nombreDado = _nombre;
    }


    public void setActivoInactivo(String estado){
        activoInactivo = estado;
    }


    public int getNumAccion(){
        return numeroCaraAccion;
    }


    public String getFuncion(){
        return funcion;
    }


    public String getNombreDado(){
        return nombreDado;
    }
}