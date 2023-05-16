package myProject.modelo;





public class Ronda {
    public static int num = 1;

    public Ronda(int num) {

        this.num = num;
    }

    /*
     * Constructor de la clase
     */
    public Ronda(){}

    /*
     * Devuelve un valor que representa el numero maximo de veces que
     * se puede lanzar un dado en una ronda.
     */

    public int inhabilitar() {
        if (num >= 5) {
            return 5;
        } else {
            return 0;
        }
    }

    /*
     * Devuelve booleano que indica si la ronda ha llegado a su estado final o no.
     */

    public boolean estadoFinal(int numero){
        if(numero==1){
            num = numero;
            return true;
        }
        if (numero == 2) {
            num = numero;
            return true;
        }
        if (numero == 3) {
            num = numero;
            return true;
        }
        if (numero == 4) {
            num = numero;
            return true;
        }
        if (numero == 5) {
            num = numero;
            return true;
        } else {
            System.out.println("Valida y no");
            return false;
        }
    }




    /*
     * Devuelve el valor actual de la variable num
     */


    public int getNum() {
        return num;
    }

}
