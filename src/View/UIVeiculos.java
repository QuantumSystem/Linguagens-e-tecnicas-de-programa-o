/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ControllerVeiculos;
import Model.Veiculos;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;

/**
 *
 * @author tiago
 */
public class UIVeiculos extends javax.swing.JInternalFrame implements Observer {
    private static UIVeiculos uiveiculos;
    private ControllerVeiculos controller;
    private Veiculos veiculos = null;

    /**
     * Creates new form UIVeiculos
     */
    public static UIVeiculos getInstancia() {
        if (uiveiculos == null) {
            uiveiculos = new UIVeiculos();
            ControllerVeiculos ctrlVeiculos = new ControllerVeiculos();
            uiveiculos.setController(ctrlVeiculos);
            ctrlVeiculos.addObserver(uiveiculos);
            uiveiculos.refreshTable();
        }
        return uiveiculos;
    }
    
    public UIVeiculos() {
        initComponents();
    }

    public void setController(ControllerVeiculos _controller) {
        this.controller = _controller;
    }

    public void refreshTable() {
        this.tblList.setModel(this.controller.getAllTable());
    }

    public void preenche() {
        txtNome.setText(tblList.getValueAt(tblList.getSelectedRow(), 1).toString());
        txtPlaca.setText(tblList.getValueAt(tblList.getSelectedRow(), 2).toString());
        txtCor.setText(tblList.getValueAt(tblList.getSelectedRow(), 3).toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblList = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        txtCor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        tblList.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tblList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                clica(evt);
            }
        });
        jScrollPane1.setViewportView(tblList);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Veículos"));

        jLabel1.setText("Nome do Veículo: ");

        jLabel2.setText("Placa:");

        jLabel3.setText("Cor:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(217, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnCancelar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListMouseClicked
        preenche();
    }//GEN-LAST:event_tblListMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (this.veiculos == null) {
            controller.insertPessoas(txtNome.getText(), txtPlaca.getText(), txtCor.getText());
            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!!");
        } else {
            this.veiculos.setNome(txtNome.getText());
            this.veiculos.setPlaca(txtPlaca.getText());
            this.veiculos.setCor(txtCor.getText());

            controller.updateVeiculos(this.veiculos);
            //JOptionPane.showMessageDialog(null, "2");
        }
        refreshTable();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        int selected = this.tblList.getSelectedRow();
        if (selected < 0) {
            JOptionPane.showMessageDialog(this, "Selecione um registro");
        } else {
            int id = (int) this.tblList.getValueAt(selected, 0);
            this.veiculos = new Veiculos();
            this.veiculos.setId(id);
            this.veiculos.setNome(txtNome.getText());
            this.veiculos.setPlaca(txtPlaca.getText());
            this.veiculos.setCor(txtCor.getText());

            controller.updateVeiculos(this.veiculos);
            //JOptionPane.showMessageDialog(null, "2");

            refreshTable();
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int selected = this.tblList.getSelectedRow();
        if (selected < 0) {
            JOptionPane.showMessageDialog(this, "Selecione um registro");
            return;
        }
        int id = (int) this.tblList.getValueAt(selected, 0);
        String nome = (String) this.tblList.getValueAt(selected, 1);
        int x = JOptionPane.showConfirmDialog(
                this, "Deseja deletar " + nome + " ?", "Atenção",
                JOptionPane.OK_CANCEL_OPTION);
        if (x == 0) {
            this.controller.deletaVeiculos(id);
            this.refreshTable();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void clica(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clica
        this.tblList.editingCanceled(null);
    }//GEN-LAST:event_clica


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblList;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        this.refreshTable();
    }
}
