/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RelacionDos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author usuario
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private PanelPantallas panelpantalla;
    private PanelCentralBotones panelcentral;
    private PanelInferior panelinferior;
    private JButton btn_inicio1;
    private JButton btn_inicio2;
    private JButton btn_inicio3;
    private JButton btn_parar1;
    private JButton btn_parar2;
    private JButton btn_parar3;
    private JButton btn_parartodos;
    private JButton btn_salir;
    private JLabel pantalla1;
    private JLabel pantalla2;
    private JLabel pantalla3;
    private ClaseCompartir parada1;
    private ClaseCompartir parada2;
    private ClaseCompartir parada3;
    private ClaseSuperior paradasuperior;

    Container panel = this.getContentPane();

    public VentanaPrincipal(PanelPantallas panelpantalla, PanelCentralBotones panelcentral, PanelInferior panelinferior) {
        this.panelpantalla = panelpantalla;
        this.panelcentral = panelcentral;
        this.panelinferior = panelinferior;
        this.btn_inicio1 = panelcentral.getBtn_inicio1();
        this.btn_inicio2 = panelcentral.getBtn_inicio2();
        this.btn_inicio3 = panelcentral.getBtn_inicio3();
        this.btn_parar1 = panelcentral.getBtn_parar1();
        this.btn_parar2 = panelcentral.getBtn_parar2();
        this.btn_parar3 = panelcentral.getBtn_parar3();
        this.btn_parartodos = panelinferior.getBtn_parartodos();
        this.pantalla1 = panelpantalla.getPantalla1();
        this.pantalla2 = panelpantalla.getPantalla2();
        this.pantalla3 = panelpantalla.getPantalla3();
        this.btn_salir = panelinferior.getBtn_salir();
        parada1 = new ClaseCompartir(false);
        parada2 = new ClaseCompartir(false);
        parada3 = new ClaseCompartir(false);
        paradasuperior = new ClaseSuperior(false);
        iniciarComponentes();

    }

    public void iniciarComponentes() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel.setBackground(Color.DARK_GRAY);
        panel.add(panelpantalla, BorderLayout.NORTH);
        panel.add(panelcentral, BorderLayout.CENTER);
        panel.add(panelinferior, BorderLayout.SOUTH);
        pack();

        this.btn_inicio1.addActionListener((e) -> {

            iniciarHilo(pantalla1, btn_inicio1, parada1, paradasuperior);

        });
        this.btn_inicio2.addActionListener((e) -> {

            iniciarHilo(pantalla2, btn_inicio2, parada2, paradasuperior);

        });
        this.btn_inicio3.addActionListener((e) -> {

            iniciarHilo(pantalla3, btn_inicio3, parada3, paradasuperior);
            
        });

        this.btn_parar1.addActionListener((e) -> {

            pararHilo(parada1,btn_parar1," 1");

        });
        this.btn_parar2.addActionListener((e) -> {

            pararHilo(parada2,btn_parar2," 2");

        });
        this.btn_parar3.addActionListener((e) -> {
            
            pararHilo(parada3,btn_parar3," 3");
        });

        this.btn_parartodos.addActionListener((e) -> {
            
           pararTodos();

        });

        this.btn_salir.addActionListener((e) -> {
            System.exit(0);
        });

    }

    public void iniciarHilo(JLabel pantalla, JButton inicio, ClaseCompartir local, ClaseSuperior superior) {

        Thread hilo = new Thread(new Cuentaatras(pantalla, inicio, local, superior));
        hilo.start();

    }

    public void pararHilo(ClaseCompartir parada,JButton boton,String num) {

        if (parada.isParada()) {
            parada.setParada(false);
            boton.setText("STOP"+num);
        } else {
            boton.setText("REANUDAR");

            parada.setParada(true);
        }
    }
    
    public void pararTodos(){
        
        if (paradasuperior.isParadasuperior()) {
            paradasuperior.setParadasuperior(false);
            btn_parartodos.setText("STOP (TODOS)");
        } else {
            btn_parartodos.setText("REANUDAR");

            paradasuperior.setParadasuperior(true);
        }
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
