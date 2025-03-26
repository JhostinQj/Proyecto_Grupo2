package Paquete;

import Vistas.FrmAcerca;
import Vistas.FrmInstructivo;
import Vistas.Frm3;
import Vistas.Frm4;
import Vistas.Frm5;
import Vistas.Frm6;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class Controlador {
    private FrmVista vista;
    private Modelo modelo;
    private Frm3 vista1;
    
    public Controlador(FrmVista vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;

        configurarListeners();
    }
    
    private void configurarListeners() {
        this.vista.btnAcercade.addActionListener(e -> mostrarAcercaDe());
        this.vista.btnInstructivo.addActionListener(e -> mostrarInstructivo());
        this.vista.CrearVec.addActionListener(e -> mostrarFrm3());
        this.vista.IgresarDatos.addActionListener(e -> mostrarFrm4());
        this.vista.Listado.addActionListener(e -> mostrarFrm5());
        this.vista.MostrarMayor.addActionListener(e -> mostrarFrm6());
        
        //botones del crear vector
        this.vista1.btnDimension.addActionListener(e -> crearVector());
    }
     
    private void mostrarAcercaDe() {
        FrmAcerca acercaDe = new FrmAcerca((JFrame)vista, true);
        acercaDe.setLocationRelativeTo(vista);
        acercaDe.setVisible(true);
    }
    
    private void mostrarInstructivo() {
        FrmInstructivo instructivo = new FrmInstructivo((JFrame)vista, true);
        instructivo.setLocationRelativeTo(vista);
        instructivo.setVisible(true);
    }
    
    private void mostrarFrm3() {
        Frm3 frm3 = new Frm3((JFrame)vista, true);
        frm3.setLocationRelativeTo(vista);
        frm3.setVisible(true);
    }
    
    private void mostrarFrm4() {
        Frm4 frm4 = new Frm4((JFrame)vista, true);
        frm4.setLocationRelativeTo(vista);
        frm4.setVisible(true);
    }
    
    private void mostrarFrm5() {
        Frm5 frm5 = new Frm5((JFrame)vista, true);
        frm5.setLocationRelativeTo(vista);
       frm5.setVisible(true);
    }
    
    private void mostrarFrm6() {
        Frm6 frm6 = new Frm6((JFrame)vista, true);
        frm6.setLocationRelativeTo(vista);
        frm6.setVisible(true);
<<<<<<< Updated upstream
<<<<<<< Updated upstream
    }
    private void crearVector(){
        this.modelo.setFila(Integer.parseInt(this.vista1.lbvector.getText()));
        this.modelo.crearvector();
    }
}
=======
=======
>>>>>>> Stashed changes
    }//Fin Ventanas
    
    
    
}
<<<<<<< Updated upstream
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
