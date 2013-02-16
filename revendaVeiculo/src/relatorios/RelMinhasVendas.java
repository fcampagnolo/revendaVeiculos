package relatorios;

import DAOGenerico.DAOGenerico;
import aplicacao.FormMenu;
import entidades.Cliente;
import entidades.Compra;
import entidades.Veiculo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Session;
import util.FramePosition;
import util.HibernateUtil;

public class RelMinhasVendas extends javax.swing.JFrame {

    public RelMinhasVendas() {
        initComponents();
        FramePosition.setPosicao(this);

        jLabel1.setText(jLabel1.getText() + " " + FormMenu.v.getNome());

        try {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(5);
            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            modelo.setNumRows(0);

            /* retorna uma sessão para referência */
            Session s = HibernateUtil.getSessionFactory().getCurrentSession();
            /* abre a sessão para incluir, recuperar, deletar os objetos na base de dados */
            s.beginTransaction();

            List<Compra> lcompras = new ArrayList<>();
            List<Cliente> lcliente = new ArrayList<>();
            List<Veiculo> lveiculo = new ArrayList<>();

            lcompras = s.createQuery("from Compra where idVendedor = " + FormMenu.v.getIdVendedor()).list();
            lcliente = s.createQuery("from Cliente").list();
            lveiculo = s.createQuery("from Veiculo").list();

            /* fecha a sessão e encerra transações */
            s.getTransaction().commit();

            //DAOGenerico dao = new DAOGenerico(null);

            //List<Compra> lcompras = new ArrayList<>();
            //lcompras = dao.listar("from Compra where idVendedor = " + FormMenu.v.getIdVendedor());

            for (Compra c : lcompras) {
                modelo.addRow(new Object[]{c.getIdCompra(), c.getCliente().getNome(), c.getVeiculo().getModelo() + "/" + c.getVeiculo().getMarca() + "/" + c.getVeiculo().getPlaca(), c.getData(), c.getTotal()});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro insersão: " + e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome Cliente", "Modelo/Marca/Placa", "Data", "Preço"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Minhas Vendas -");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(RelMinhasVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelMinhasVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelMinhasVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelMinhasVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelMinhasVendas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}