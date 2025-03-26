package Paquete;

import javax.swing.JFrame;

public class Clase1 {
    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        FrmVista vista = new FrmVista();
        Controlador controlador = new Controlador(vista, modelo);
        vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vista.setVisible(true);
    }
}   