/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciondosbasica;

import javax.swing.JLabel;

/**
 *
 * @author Alberto
 */
public class PanelPantallas extends javax.swing.JPanel {

    /**
     * Creates new form PanelPantallas
     */
    public PanelPantallas() {
        initComponents();
    }

    public JLabel getPantalla1() {
        return pantalla1;
    }

    public void setPantalla1(JLabel pantalla1) {
        this.pantalla1 = pantalla1;
    }

    public JLabel getPantalla2() {
        return pantalla2;
    }

    public void setPantalla2(JLabel pantalla2) {
        this.pantalla2 = pantalla2;
    }

    public JLabel getPantalla3() {
        return pantalla3;
    }

    public void setPantalla3(JLabel pantalla3) {
        this.pantalla3 = pantalla3;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pantalla2 = new javax.swing.JLabel();
        pantalla1 = new javax.swing.JLabel();
        pantalla3 = new javax.swing.JLabel();

        pantalla2.setBackground(new java.awt.Color(0, 0, 0));
        pantalla2.setFont(new java.awt.Font("FreeMono", 1, 36)); // NOI18N
        pantalla2.setForeground(java.awt.Color.green);
        pantalla2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pantalla2.setText("- -");
        pantalla2.setOpaque(true);

        pantalla1.setBackground(new java.awt.Color(0, 0, 0));
        pantalla1.setFont(new java.awt.Font("FreeMono", 1, 36)); // NOI18N
        pantalla1.setForeground(java.awt.Color.green);
        pantalla1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pantalla1.setText("- -");
        pantalla1.setOpaque(true);

        pantalla3.setBackground(new java.awt.Color(0, 0, 0));
        pantalla3.setFont(new java.awt.Font("FreeMono", 1, 36)); // NOI18N
        pantalla3.setForeground(java.awt.Color.green);
        pantalla3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pantalla3.setText("- -");
        pantalla3.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(pantalla1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(pantalla2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(pantalla3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pantalla2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pantalla1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pantalla3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel pantalla1;
    private javax.swing.JLabel pantalla2;
    private javax.swing.JLabel pantalla3;
    // End of variables declaration//GEN-END:variables
}
