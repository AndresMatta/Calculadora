/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author Andrés Gerado Matta Morales
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Instancia de la ventana
    Ventana v1 = new Ventana();
    //Hace visible la ventana
    v1.setVisible(true);
    //Ubica la ventana en el centro de la pantalla
    v1.setLocationRelativeTo(null);
    //Evitar cambiar el largo o ancho de la ventana.
    v1.setResizable(false);
    }
    
}
