/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.forget_less;

import com.mycompany.forget_less.bean.Eventos;
import com.mycompany.forget_less.dao.EventosDAO;
import java.awt.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joaov
 */
public class EventosProximos extends javax.swing.JInternalFrame {

    /**
     * Creates new form EventosProximos
     */
    
    public EventosProximos() {
        initComponents();

        EventosDAO pdao = new EventosDAO();
        java.util.List<Eventos> lista = pdao.getListaEvento();

        DefaultTableModel tabelaModel = (DefaultTableModel) TabelaProximosEventos.getModel();
        tabelaModel.setRowCount(0);

        for (Eventos eve : lista) {
                 Object[] linha = new Object[]{
                     eve.getData(), eve.getNomeEvento(), eve.getDescricaoEvento()
                 };
                 tabelaModel.addRow(linha);
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

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        concluirProximos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaProximosEventos = new javax.swing.JTable();
        excluirEventoBotao = new javax.swing.JButton();

        setBackground(new java.awt.Color(107, 107, 107));
        setPreferredSize(new java.awt.Dimension(847, 547));

        jLabel1.setBackground(new java.awt.Color(252, 252, 252));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(252, 252, 252));
        jLabel1.setText("Próximos eventos");

        concluirProximos.setText("Concluir");

        TabelaProximosEventos.setBackground(new java.awt.Color(107, 107, 107));
        TabelaProximosEventos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "Título", "Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TabelaProximosEventos);
        if (TabelaProximosEventos.getColumnModel().getColumnCount() > 0) {
            TabelaProximosEventos.getColumnModel().getColumn(0).setResizable(false);
            TabelaProximosEventos.getColumnModel().getColumn(1).setResizable(false);
        }

        excluirEventoBotao.setText("Excluir evento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(excluirEventoBotao)
                        .addGap(18, 18, 18)
                        .addComponent(concluirProximos, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 489, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(concluirProximos)
                    .addComponent(excluirEventoBotao))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaProximosEventos;
    private javax.swing.JButton concluirProximos;
    private javax.swing.JButton excluirEventoBotao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
