package myProject.vista;


import myProject.controlador.ControlDado;
import myProject.controlador.ControlRonda;
import myProject.modelo.Dado;
import myProject.vista.Help;
import myProject.vista.ImagenDado;
import myProject.vista.Background;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUI extends JFrame {
    private static ImagenDado dados;
    public static JFrame frame;
    private static JPanel fondo, opciones;
    private static vista.Titulo titulo;
    private static Listener listener;
    public static JButton btnLanzarDado;
    private int conteo = 1, dado;


    public GUI() {

        listener = new Listener();
        titulo = new vista.Titulo();
        frame = new JFrame();
        frame.setLayout(new BorderLayout());
        opciones = new JPanel(new GridLayout(2, 2));
        String texto = "De clic en el botón 'Lanzar Dados'";
        opciones.setBorder(titulo.gettitulo(texto));
        opciones.setOpaque(false);

        fondo = new Background(new ImageIcon(getClass().getResource("/myProject/recursos/Fondo.png")).getImage());
        frame.setContentPane(fondo);

        dados = new ImagenDado();
        opciones.add(dados.getDadosActivos());
        opciones.add(dados.getDadsInactivation());
        opciones.add(dados.getTablaPuntaje());
        opciones.add(dados.getDadosUtilizados());

        frame.getContentPane().add(opciones, BorderLayout.CENTER);

        initGUI();
        frame.setIconImage(new ImageIcon(getClass().getResource("/myProject/recursos/Logo.png")).getImage());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setTitle("GEEK OUT! MASTERS");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private static void initGUI() {
        Help ayuda = new Help();
        btnLanzarDado = new JButton("Lanzar Dado");
        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER, 40, 145));
        panelBotones.setPreferredSize(new Dimension(200, 650));
        panelBotones.add(btnLanzarDado);
        panelBotones.add(ayuda.botonAyuda);
        panelBotones.setOpaque(false);
        String texto = "Opciones";
        panelBotones.setBorder(titulo.gettitulo(texto));
        frame.getContentPane().add(panelBotones, BorderLayout.EAST);
        btnLanzarDado.addActionListener(listener);


    }




    private static void reiniciar() {

        opciones.removeAll();

        dados = new ImagenDado();
        opciones.add(dados.getDadosActivos());
        opciones.add(dados.getDadsInactivation());
        opciones.add(dados.getTablaPuntaje());
        opciones.add(dados.getDadosUtilizados());
        opciones.revalidate();
        opciones.repaint();

    }

    public static void mensajeRondas(int dado) {
        switch (dado) {
            case 1:
                JOptionPane.showConfirmDialog(null,
                        "HAS GANADO ESTA RONDA, DA CLIC EN LANZAR DADOS PARA VOLVER A JUGAR",
                        "INFORMACIÓN",JOptionPane.CLOSED_OPTION);
                btnLanzarDado.setEnabled(true);
                break;
            case 2:
                JOptionPane.showConfirmDialog(null,
                        "HAS PERDIDO ESTA RONDA Y LOS PUNTOS, DA CLIC EN LANZAR DADOS PARA VOLVER A JUGAR",
                        "INFORMACIÓN",JOptionPane.CLOSED_OPTION);
                btnLanzarDado.setEnabled(true);
                break;
            case 3:
                JOptionPane.showConfirmDialog(null,
                        "EN ESTA RONDA NO SUMAS PUNTOS, DA CLIC EN LANZAR DADOS PARA VOLVER A JUGAR",
                        "INFORMACIÓN",JOptionPane.CLOSED_OPTION);
                btnLanzarDado.setEnabled(true);
                break;
            case 4:
                JOptionPane.showConfirmDialog(null,
                        "EN ESTA RONDA NO SUMAS PUNTOS, DA CLIC EN LANZAR DADOS PARA VOLVER A JUGAR",
                        "INFORMACIÓN",JOptionPane.CLOSED_OPTION);
                btnLanzarDado.setEnabled(true);
                break;
            case 5:
                JOptionPane.showConfirmDialog(null,
                        "EN ESTA RONDA NO SUMAS PUNTOS, DA CLIC EN LANZAR DADOS PARA VOLVER A JUGAR",
                        "INFORMACIÓN",JOptionPane.CLOSED_OPTION);
                btnLanzarDado.setEnabled(true);
                break;
            case 6:
                JOptionPane.showConfirmDialog(null,
                        "ES TU ULTIMA OPORTUNIDAD",
                        "INFORMACIÓN",JOptionPane.CLOSED_OPTION);
                btnLanzarDado.setEnabled(true);
                break;
            default:
                System.out.println("FALLO");
                break;
        }



    }





    public static void main(String[] arg) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

                GUI vista = new GUI();


            }
        });
    }


    public class Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            ImagenDado imagenDado = new ImagenDado();

            if (e.getSource() == btnLanzarDado) {
                String texto2 = "Ronda#" + conteo;
                ControlRonda controlRonda = new ControlRonda();
                controlRonda.rondas(conteo);
                imagenDado.actualizar();

                System.out.println("Entro en la primera ronda" + conteo);

                if (controlRonda.rondas(conteo) == 1) {
                    Dado dado = new Dado();
                    ControlDado controlDado = new ControlDado(dado, dados);
                    controlDado.LanzarDado();
                    opciones.setBorder(titulo.gettitulo(texto2));
                    dados.mostrarBotones();
                    System.out.println("Entro a la ronda " + conteo);
                    btnLanzarDado.setEnabled(false);
                }
                if (controlRonda.rondas(conteo) == 2) {


                    reiniciar();
                    Dado dado = new Dado();
                    ControlDado controlDado = new ControlDado(dado, dados);
                    controlDado.LanzarDado();
                    opciones.setBorder(titulo.gettitulo(texto2));
                    dados.mostrarBotones();
                    System.out.println("Entro a la ronda " + conteo);
                    btnLanzarDado.setEnabled(false);
                }
                if (controlRonda.rondas(conteo) == 3) {
                    opciones.removeAll();
                    reiniciar();
                    Dado dado = new Dado();
                    ControlDado controlDado = new ControlDado(dado, dados);
                    controlDado.LanzarDado();
                    opciones.setBorder(titulo.gettitulo(texto2));
                    dados.mostrarBotones();
                    System.out.println("Entro a la ronda " + conteo);
                    btnLanzarDado.setEnabled(false);
                }
                if (controlRonda.rondas(conteo) == 4) {
                    opciones.removeAll();
                    reiniciar();
                    Dado dado = new Dado();
                    ControlDado controlDado = new ControlDado(dado, dados);
                    controlDado.LanzarDado();
                    opciones.setBorder(titulo.gettitulo(texto2));
                    dados.mostrarBotones();
                    System.out.println("Entro a la ronda " + conteo);
                    btnLanzarDado.setEnabled(false);
                }
                if (controlRonda.rondas(conteo) == 5) {
                    opciones.removeAll();
                    reiniciar();
                    Dado dado = new Dado();
                    ControlDado controlDado = new ControlDado(dado, dados);
                    controlDado.LanzarDado();
                    opciones.setBorder(titulo.gettitulo(texto2));
                    dados.mostrarBotones();
                    System.out.println("Entro a la ronda " + conteo);
                    btnLanzarDado.setEnabled(false);
                }
                frame.revalidate();
                frame.repaint();
                conteo++;

            }


        }


    }

}









