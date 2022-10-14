
package br.view.Ongs;

import br.helpet.dao.OngsDAO;
import helpet.pojo.ContaOngs;

/**
 * @author helpet
 */
public class TelaCadContaOng extends javax.swing.JFrame {

    long cnpj = 0;
    
    public TelaCadContaOng() {
        initComponents();
    }
    public TelaCadContaOng(long cnpj) {
        this.cnpj = cnpj;
        initComponents();
        
    }

    TelaCadContaOng(int id_usuT) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextFieldONome = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldConta = new javax.swing.JTextField();
        jTextFieldAgencia = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(null);

        jTextFieldONome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldONomeActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldONome);
        jTextFieldONome.setBounds(50, 250, 330, 27);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/telaCadOng_1.png"))); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(30, 10, 450, 160);

        jButton1.setText("Cadastar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(280, 350, 100, 50);

        jLabel7.setText("Dados Bancarios:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(50, 200, 119, 17);

        jLabel8.setText("Conta:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(50, 290, 46, 17);
        jPanel1.add(jTextFieldConta);
        jTextFieldConta.setBounds(50, 310, 130, 27);
        jPanel1.add(jTextFieldAgencia);
        jTextFieldAgencia.setBounds(250, 310, 130, 27);

        jLabel9.setText("Agencia:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(250, 290, 59, 17);

        jLabel10.setText("Titular: ");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(50, 230, 52, 17);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Best-Paw-Print-Background-Wallpaper-These-are-High-Quality-and-High-Definition-HD-Wallpapers-For-PC-Mobile-and-Tablet-quality-sofas.jpg"))); // NOI18N
        jPanel1.add(jLabel12);
        jLabel12.setBounds(-3, -3, 490, 580);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(495, 601));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldONomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldONomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldONomeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ContaOngs conta = new  ContaOngs();
        OngsDAO cadConta = new  OngsDAO();

        conta.setAgencia(Integer.parseInt(jTextFieldAgencia.getText()));
        conta.setConta(Integer.parseInt(jTextFieldConta.getText()));
        conta.setNome(jTextFieldONome.getText());
        conta.setCnpj_ong(cnpj);


        cadConta.adicionarConta(conta);
        jTextFieldAgencia.setText(null);
        jTextFieldConta.setText(null);
        jTextFieldONome.setText(null);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadContaOng.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadContaOng.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadContaOng.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadContaOng.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadContaOng().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldAgencia;
    private javax.swing.JTextField jTextFieldConta;
    private javax.swing.JTextField jTextFieldONome;
    // End of variables declaration//GEN-END:variables
}
