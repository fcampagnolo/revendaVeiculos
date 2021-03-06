package aplicacao;

import DAOGenerico.DAOGenerico;
import entidades.Cliente;
import entidades.Compra;
import entidades.Veiculo;
import entidades.Vendedor;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import util.FramePosition;

public class FormCompra extends javax.swing.JFrame {

    String listarCliente = "from Cliente";
    String listarVeiculo = "from Veiculo";

    public FormCompra() {
        initComponents();
        FramePosition.setPosicao(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        tfPesquisaCliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVeiculo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfPesquisaVeiculos = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCliente = new javax.swing.JTable();
        btCompra = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Pesquisa:");

        tfPesquisaCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfPesquisaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPesquisaClienteActionPerformed(evt);
            }
        });

        jTableVeiculo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTableVeiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Placa", "Modelo", "Marca", "Cor", "Combustível", "Valor", "Status", "Km", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableVeiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableVeiculoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableVeiculo);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Selecionar Cliente");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Selecionar Veículo");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Pesquisa:");

        tfPesquisaVeiculos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfPesquisaVeiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPesquisaVeiculosActionPerformed(evt);
            }
        });

        jTableCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Telefone", "E-mail", "Endereço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableCliente);

        btCompra.setText("Registrar compra");
        btCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCompraActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Compras");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfPesquisaVeiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(btCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfPesquisaVeiculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btCompra)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void preencherJTableCliente() {
        jTableCliente.getColumnModel().getColumn(0).setPreferredWidth(5);
        DefaultTableModel modelo = (DefaultTableModel) jTableCliente.getModel();
        modelo.setNumRows(0);
        try {
            DAOGenerico dao = new DAOGenerico(new Cliente());
            List<Cliente> c = new ArrayList<Cliente>();
            c = dao.listar(listarCliente);
            for (Cliente cl : c) {
                modelo.addRow(new Object[]{cl.getIdCliente(), cl.getNome(),
                              cl.getTelefone(), cl.getEmail(), cl.getEndereco()});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro Lista JTABLE: " + e);
        }
    }

    public void preencherJTableVeiculo() {
        jTableVeiculo.getColumnModel().getColumn(0).setPreferredWidth(5);
        DefaultTableModel modelo = (DefaultTableModel) jTableVeiculo.getModel();
        modelo.setNumRows(0);
        try {
            DAOGenerico dao = new DAOGenerico(new Veiculo());
            List<Veiculo> lv = new ArrayList<Veiculo>();
            lv = dao.listar(listarVeiculo);
            for (Veiculo v : lv) {
                modelo.addRow(new Object[]{v.getIdVeiculo(), v.getPlaca(),
                              v.getModelo(), v.getMarca(), v.getCor(), v.getCombustivel(),
                              v.getValor(), v.getStatus(), v.getKm(), v.getTipo()});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro Lista JTABLE: " + e);
        }
    }
    
    private void tfPesquisaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPesquisaClienteActionPerformed
        listarCliente = "from Cliente where upper(nome) like '" + tfPesquisaCliente.getText().toUpperCase() + "%'";
        preencherJTableCliente();
    }//GEN-LAST:event_tfPesquisaClienteActionPerformed

    private void jTableVeiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableVeiculoMouseClicked
        int linha = jTableVeiculo.getSelectedRow();

        Veiculo v = new Veiculo();
        v.setIdVeiculo(Integer.parseInt(jTableVeiculo.getValueAt(linha, 0).toString()));
        v.setPlaca(jTableVeiculo.getValueAt(linha, 1).toString());
        v.setModelo(jTableVeiculo.getValueAt(linha, 2).toString());
        v.setMarca(jTableVeiculo.getValueAt(linha, 3).toString());
        v.setCor(jTableVeiculo.getValueAt(linha, 4).toString());
        v.setCombustivel(jTableVeiculo.getValueAt(linha, 5).toString());
        v.setValor(Double.parseDouble(jTableVeiculo.getValueAt(linha, 6).toString()));
        v.setStatus(jTableVeiculo.getValueAt(linha, 7).toString());
        v.setKm(Integer.parseInt(jTableVeiculo.getValueAt(linha, 8).toString()));
        v.setTipo(jTableVeiculo.getValueAt(linha, 9).toString());
    }//GEN-LAST:event_jTableVeiculoMouseClicked

    private void tfPesquisaVeiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPesquisaVeiculosActionPerformed
        listarVeiculo = "from Veiculo where upper(modelo) like '" + tfPesquisaVeiculos.getText().toUpperCase() + "%' and status like 'Dis%'";
        preencherJTableVeiculo();
    }//GEN-LAST:event_tfPesquisaVeiculosActionPerformed

    private void jTableClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClienteMouseClicked
        int linha = jTableCliente.getSelectedRow();

        Cliente c = new Cliente();
        c.setIdCliente(Integer.parseInt(jTableCliente.getValueAt(linha, 0).toString()));
        c.setNome(jTableCliente.getValueAt(linha, 1).toString());
        c.setTelefone(jTableCliente.getValueAt(linha, 2).toString());
        c.setEmail(jTableCliente.getValueAt(linha, 3).toString());
        c.setEndereco(jTableCliente.getValueAt(linha, 4).toString());
    }//GEN-LAST:event_jTableClienteMouseClicked

    private void btCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCompraActionPerformed
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        int linhaCliente = jTableCliente.getSelectedRow();
        Cliente c = new Cliente();
        c.setIdCliente(Integer.parseInt(jTableCliente.getValueAt(linhaCliente, 0).toString()));

        int linhaVeiculo = jTableVeiculo.getSelectedRow();
        Veiculo v = new Veiculo();
        v.setIdVeiculo(Integer.parseInt(jTableVeiculo.getValueAt(linhaVeiculo, 0).toString()));
        v.setPlaca(jTableVeiculo.getValueAt(linhaVeiculo, 1).toString());
        v.setModelo(jTableVeiculo.getValueAt(linhaVeiculo, 2).toString());
        v.setMarca(jTableVeiculo.getValueAt(linhaVeiculo, 3).toString());
        v.setCor(jTableVeiculo.getValueAt(linhaVeiculo, 4).toString());
        v.setCombustivel(jTableVeiculo.getValueAt(linhaVeiculo, 5).toString());
        v.setValor(Double.parseDouble(jTableVeiculo.getValueAt(linhaVeiculo, 6).toString()));
        v.setStatus("Vendido");
        v.setKm(Integer.parseInt(jTableVeiculo.getValueAt(linhaVeiculo, 8).toString()));
        v.setTipo(jTableVeiculo.getValueAt(linhaVeiculo, 9).toString());

        Vendedor ven = new Vendedor();
        ven.setIdVendedor(FormMenu.v.getIdVendedor());

        Compra com = new Compra();
        com.setCliente(c);
        com.setVeiculo(v);
        com.setVendedor(ven);
        com.setData(new Date());
        com.setTotal(v.getValor());

        if (JOptionPane.showConfirmDialog(null, "Deseja realmente efetuar essa compra?\nValor= " + com.getTotal(), "Compra", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try {
                DAOGenerico dao = new DAOGenerico(v);
                dao.atualiza();
                dao = new DAOGenerico(com);
                dao.insere();
                preencherJTableVeiculo();
                JOptionPane.showMessageDialog(null, "Compra efetuada com sucesso!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Compra: " + e);
            }
        }
    }//GEN-LAST:event_btCompraActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCompra().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCompra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCliente;
    private javax.swing.JTable jTableVeiculo;
    private javax.swing.JTextField tfPesquisaCliente;
    private javax.swing.JTextField tfPesquisaVeiculos;
    // End of variables declaration//GEN-END:variables
}