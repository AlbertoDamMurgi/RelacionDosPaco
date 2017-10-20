/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RelacionDosBasica;

/**
 *
 * @author usuario
 */
public class RelacionDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PanelPantallas pantalla = new PanelPantallas();
        PanelCentralBotones botones = new PanelCentralBotones();
        PanelInferior inferior= new PanelInferior();
        VentanaPrincipal principal = new VentanaPrincipal(pantalla, botones, inferior);
        
        principal.setVisible(true);
        
    }
    
}
