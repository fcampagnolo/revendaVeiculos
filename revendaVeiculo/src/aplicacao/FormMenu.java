package aplicacao;

import entidades.Vendedor;
import javax.swing.JFrame;
import relatorios.RelMinhasVendas;
import relatorios.RelVendasPorVendedor;
import util.FramePosition;

public class FormMenu extends javax.swing.JFrame {

    static public Vendedor v;

    public FormMenu(Vendedor v) {
        this.v = v;
        initComponents();
        mVendedor.setEnabled(v.getAdm());
        mVendasVendedor.setEnabled(v.getAdm());
        FramePosition.setPosicao(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        mSair = new javax.swing.JMenuItem();
        menuCadastro = new javax.swing.JMenu();
        mCliente = new javax.swing.JMenuItem();
        mVeiculo = new javax.swing.JMenuItem();
        mVendedor = new javax.swing.JMenuItem();
        menuCompra = new javax.swing.JMenu();
        menuRelatorio = new javax.swing.JMenu();
        mMinhasVendas = new javax.swing.JMenuItem();
        mVendasVendedor = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("jMenu1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        menuFile.setText("File");

        mSair.setText("Sair");
        mSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSairActionPerformed(evt);
            }
        });
        menuFile.add(mSair);

        jMenuBar1.add(menuFile);

        menuCadastro.setText("Cadastro");

        mCliente.setText("Cliente");
        mCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mClienteActionPerformed(evt);
            }
        });
        menuCadastro.add(mCliente);

        mVeiculo.setText("Veículo");
        mVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mVeiculoActionPerformed(evt);
            }
        });
        menuCadastro.add(mVeiculo);

        mVendedor.setText("Vendedor");
        mVendedor.setEnabled(false);
        mVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mVendedorActionPerformed(evt);
            }
        });
        menuCadastro.add(mVendedor);

        jMenuBar1.add(menuCadastro);

        menuCompra.setText("Compra");
        menuCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuCompraMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuCompra);

        menuRelatorio.setText("Relatórios");

        mMinhasVendas.setText("Minhas Vendas");
        mMinhasVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mMinhasVendasActionPerformed(evt);
            }
        });
        menuRelatorio.add(mMinhasVendas);

        mVendasVendedor.setText("Vendas por Vendedor");
        mVendasVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mVendasVendedorActionPerformed(evt);
            }
        });
        menuRelatorio.add(mVendasVendedor);

        jMenuBar1.add(menuRelatorio);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mSairActionPerformed

    private void mClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mClienteActionPerformed
        JFrame janela = new FormCliente();
        janela.setVisible(true);
    }//GEN-LAST:event_mClienteActionPerformed

    private void mVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mVendedorActionPerformed
        JFrame janela = new FormVendedor();
        janela.setVisible(true);
    }//GEN-LAST:event_mVendedorActionPerformed

    private void mVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mVeiculoActionPerformed
        JFrame janela = new FormVeiculo();
        janela.setVisible(true);
    }//GEN-LAST:event_mVeiculoActionPerformed

    private void menuCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCompraMouseClicked
        JFrame janela = new FormCompra();
        janela.setVisible(true);
    }//GEN-LAST:event_menuCompraMouseClicked

    private void mMinhasVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mMinhasVendasActionPerformed
        JFrame janela = new RelMinhasVendas();
        janela.setVisible(true);
    }//GEN-LAST:event_mMinhasVendasActionPerformed

    private void mVendasVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mVendasVendedorActionPerformed
        JFrame janela = new RelVendasPorVendedor();
        janela.setVisible(true);
    }//GEN-LAST:event_mVendasVendedorActionPerformed

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
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new FormMenu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem mCliente;
    private javax.swing.JMenuItem mMinhasVendas;
    private javax.swing.JMenuItem mSair;
    private javax.swing.JMenuItem mVeiculo;
    private javax.swing.JMenuItem mVendasVendedor;
    private javax.swing.JMenuItem mVendedor;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenu menuCompra;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuRelatorio;
    // End of variables declaration//GEN-END:variables
}