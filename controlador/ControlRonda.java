package myProject.controlador;


import myProject.modelo.Ronda;
import myProject.vista.GUI;
import myProject.vista.ImagenDado;


public class ControlRonda {
    public static Ronda num;
    public static ImagenDado imagenDado;

    public static ControlDado controlDado;



    public ControlRonda() {
    }


    public int rondas(int ron) {
        num = new Ronda(ron);
        if (num.inhabilitar() <= 5) {
            return num.getNum();
        } else {
            return num.getNum();
        }
    }

    public static void recorrer(String[] vigentes) {
        num = new Ronda();
        imagenDado = new ImagenDado();
        boolean todosIguales = true;
        for (int i = 1; i < vigentes.length; i++) {
            if (!vigentes[i].equals(vigentes[0])) {
                todosIguales = false;
                break;
            }
        }
        System.out.println("Dados" + controlDado.dados);

        if (vigentes[0].equals("1") && todosIguales == true) {
            GUI.mensajeRondas(Integer.parseInt(vigentes[0]));
        } else if (vigentes[0].equals("2") && todosIguales == true) {
            GUI.mensajeRondas(Integer.parseInt(vigentes[0]));
            System.out.println("Pierdes todos los puntos.");
        } else if (vigentes[0].equals("3") && todosIguales == true) {
            GUI.mensajeRondas(Integer.parseInt(vigentes[0]));
            System.out.println("No sumas.");
        } else if (vigentes[0].equals("4") && todosIguales == true) {
            GUI.mensajeRondas(Integer.parseInt(vigentes[0]));
            System.out.println("No sumas.");
        } else if (vigentes[0].equals("5") && todosIguales == true) {
            GUI.mensajeRondas(Integer.parseInt(vigentes[0]));
            System.out.println("No sumas.");
        } else if(vigentes[0].equals("6") && todosIguales == true){
            GUI.mensajeRondas(Integer.parseInt(vigentes[0]));
        }


    }


}
