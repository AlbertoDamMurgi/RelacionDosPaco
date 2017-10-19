/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RelacionDos;

import java.awt.Color;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author usuario
 */
public class Cuentaatras implements Runnable {
    
    private JLabel pantalla;
    private JButton inicio;
    private ClaseCompartir local;
    private ClaseSuperior superior;
    
    public Cuentaatras(JLabel pantalla, JButton inicio, ClaseCompartir local, ClaseSuperior superior) {
        this.pantalla = pantalla;
        this.inicio = inicio;
        this.local = local;
        this.superior = superior;
    }
    
    @Override
    public void run() {
        
        inicio.setEnabled(false);
        for (int i = 20; i > 0; i--) {
            
            while (local.isParada()||superior.isParadasuperior()) {
                pantalla.setForeground(Color.blue);
                esperar(500);
                pantalla.setForeground(Color.yellow);
                esperar(500);
            }
            
            pantalla.setText(String.valueOf(i));
            
            esperar(1000);
            
        }
        pantalla.setText("- -");
        inicio.setEnabled(true);
        
    }
    
    public void esperar(long tiempo) {
        
        try {
            sleep(tiempo);
        } catch (InterruptedException ex) {
            Logger.getLogger(Cuentaatras.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
