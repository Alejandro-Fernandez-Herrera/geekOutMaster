package myProject;


/**
 * @Brief la clase Model_geekOutMaster se encarga de aplicar las reglas del juego y determinar el estado del juego
 * @autors Jose David Giraldo <br> Alejandro Fernandez Herrera
 * @version v.0.1.0
 * @date 2023-04-05
 * @estados
 * <br>=estados=
 * <br>estado 1:
 * <br>estado 2:
 * <br>estado 3:
 * <br>estado 4:
 * <br>estado 5:
 */

public class Model_geekOutMaster {
    //TODO: implementar clase padre para generar 10 dados hijos
    private Dados dado1, dado2, dado3, dado4, dado5, dado6, dado7, dado8, dado9, dado10;
    private int tiro, punto, estado, flag;
    private String estadoToString;
    private int[] caras; //vector que almacena las caras de los dados


    //constructor
    public Model_geekOutMaster(){
        dado1 = new Dados();
        dado2 = new Dados();
        dado3 = new Dados();
        dado4 = new Dados();
        dado5 = new Dados();
        dado6 = new Dados();
        dado7 = new Dados();
        dado8 = new Dados();
        dado9 = new Dados();
        dado10 = new Dados();
        caras = new int[10]; //define el tamaño del arrego del vector
        flag = 0;

    }

    /**
     * @brief metodo que calcula el valor del tiro
     * @return el valor del tiro
     * @date 2023-04-05
     * @version v.0.1.0
     */

    public void calcularTiro(){
        caras [0] = dado1.getCara();
        caras [1] = dado2.getCara();
        caras [2] = dado3.getCara();
        caras [3] = dado4.getCara();
        caras [4] = dado5.getCara();
        caras [5] = dado6.getCara();
        caras [6] = dado7.getCara();
        caras [7] = dado8.getCara();
        caras [8] = dado9.getCara();
        caras [9] = dado10.getCara();

        //tiro = caras[0] + caras[1]; // suma de las caras de los dados
    }


    /**
     * @brief metodo que determina el valor del juego
     * @return el valor del juego
     * @date 2023-04-05
     * @version v.0.1.0
     * =estados=
     * estado 1:
     * estado 2:
     * estado 3:
     */

    public void determinarJuego() {
        if (flag == 0) {
            if (tiro == 7 || tiro == 11) {
                estado = 1;
            } else {
                if (tiro == 2 || tiro == 3 || tiro == 12) {
                    estado = 2;
                } else {
                    estado = 3;
                    punto = tiro;
                    flag = 1;
                }
            }

        } else {
            //ronda de punto
            rondaPunto();
        }
    }

    /**
     * @brief metodo que determina el valor del juego
     * estado 4: gana
     * estado 5: pierde al sacar 7
     */
    private void rondaPunto(){
        if(tiro == punto){
            estado = 4; //gana
            flag = 0; // inicia una nueva ronda de juego.
        }if(tiro == 7){
            estado = 5; //pierde
            flag = 0; // inicia una nueva ronda de juego.
        }

    }

    //necesito devolver lo que esta en los atributos de la clase - getter


    public int getTiro() {
        return tiro;
    }

    public int getPunto() {
        return punto;
    }

    /**
     * @brief metodo que devuelve el estado del juego
     * @return mensaje para la clase vista
     * @date 2023-04-05
     * @version v.0.1.0
     */


    public String getEstadoToString() {
        //personaliza los mensajes que se muestran en la interfaz grafica
        switch (estado){
            case 1:
                estadoToString = "Ganaste con Natural";
                break;
            case 2:
                estadoToString = "Pierde - CRAPS!!!";
                break;
            case 3:
                estadoToString = "Punto en " +punto+ " - \nSigue Jugando y no saques 7!!!";
                break;
            case 4:
                estadoToString = "Ganaste";
                break;
            case 5:
                estadoToString = "Pierdes por sacar 7";
                break;
        }
        return estadoToString;
    }

    public int[] getCaras() {
        return caras;
    }


}



