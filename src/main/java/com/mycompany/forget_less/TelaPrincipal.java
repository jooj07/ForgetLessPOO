/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.forget_less;

/**
 *
 * @author joaov
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPanelDaPrincipal = new javax.swing.JDesktopPane();
        painelLateral = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        adiconarEvento = new javax.swing.JButton();
        proximosEventos = new javax.swing.JButton();
        EventosAnteriores = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(107, 107, 107));
        setResizable(false);

        desktopPanelDaPrincipal.setBackground(new java.awt.Color(107, 107, 107));
        desktopPanelDaPrincipal.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N

        javax.swing.GroupLayout desktopPanelDaPrincipalLayout = new javax.swing.GroupLayout(desktopPanelDaPrincipal);
        desktopPanelDaPrincipal.setLayout(desktopPanelDaPrincipalLayout);
        desktopPanelDaPrincipalLayout.setHorizontalGroup(
            desktopPanelDaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 847, Short.MAX_VALUE)
        );
        desktopPanelDaPrincipalLayout.setVerticalGroup(
            desktopPanelDaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 547, Short.MAX_VALUE)
        );

        painelLateral.setBackground(new java.awt.Color(107, 107, 255));

        jLabel1.setBackground(new java.awt.Color(252, 252, 252));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(252, 252, 252));
        jLabel1.setText("Forget Less");

        jSeparator1.setForeground(new java.awt.Color(252, 252, 252));

        adiconarEvento.setBackground(new java.awt.Color(107, 107, 255));
        adiconarEvento.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        adiconarEvento.setText("Adiconar evento");
        adiconarEvento.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        adiconarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adiconarEventoActionPerformed(evt);
            }
        });

        proximosEventos.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        proximosEventos.setText("Próximos eventos");
        proximosEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proximosEventosActionPerformed(evt);
            }
        });

        EventosAnteriores.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        EventosAnteriores.setText("Eventos concluídos");
        EventosAnteriores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventosAnterioresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelLateralLayout = new javax.swing.GroupLayout(painelLateral);
        painelLateral.setLayout(painelLateralLayout);
        painelLateralLayout.setHorizontalGroup(
            painelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLateralLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(painelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EventosAnteriores)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adiconarEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(proximosEventos, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        painelLateralLayout.setVerticalGroup(
            painelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLateralLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(adiconarEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(proximosEventos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(EventosAnteriores, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(painelLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(desktopPanelDaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(desktopPanelDaPrincipal)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void adiconarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adiconarEventoActionPerformed
        // TODO add your handling code here:
        NovoEvento novoEvento = new NovoEvento();
        desktopPanelDaPrincipal.removeAll();
        desktopPanelDaPrincipal.repaint();
        desktopPanelDaPrincipal.add(novoEvento);
        novoEvento.setVisible(true);
    }//GEN-LAST:event_adiconarEventoActionPerformed

    private void proximosEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proximosEventosActionPerformed
        // TODO add your handling code here:
        EventosProximos ProximosEventos = new EventosProximos();
        desktopPanelDaPrincipal.removeAll();
         desktopPanelDaPrincipal.repaint();
        desktopPanelDaPrincipal.add(ProximosEventos);
        ProximosEventos.setVisible(true);
    }//GEN-LAST:event_proximosEventosActionPerformed

    private void EventosAnterioresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventosAnterioresActionPerformed
        // TODO add your handling code here:
        EventosAnteriores EventosPassados = new EventosAnteriores();
        desktopPanelDaPrincipal.removeAll();
         desktopPanelDaPrincipal.repaint();
        desktopPanelDaPrincipal.add(EventosPassados);
        EventosPassados.setVisible(true);
    }//GEN-LAST:event_EventosAnterioresActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EventosAnteriores;
    private javax.swing.JButton adiconarEvento;
    private javax.swing.JDesktopPane desktopPanelDaPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel painelLateral;
    private javax.swing.JButton proximosEventos;
    // End of variables declaration//GEN-END:variables
}
