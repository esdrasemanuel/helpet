package br.view.Usuario;

import br.helpet.connection.ConnectionBD;
import br.helpet.dao.PetDAO;
import helpet.pojo.AchadosPerdidos;

/**
 * @author Helpet
 */
public class TelaCadAchaPer extends javax.swing.JFrame {

    ConnectionBD conecta = new ConnectionBD();
    int id_usuAP;
    
    public TelaCadAchaPer(int id_usuAP) {
        this.id_usuAP = id_usuAP;
        initComponents();
    }
    public TelaCadAchaPer(){
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jComboBoxSexo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDesAP = new javax.swing.JTextArea();
        jLabelEstado = new javax.swing.JLabel();
        jComboBoxEstadoAP = new javax.swing.JComboBox<>();
        jLabelCidade = new javax.swing.JLabel();
        jTextFieldCidadeAP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldRuaAP = new javax.swing.JTextField();
        jButtonCadAP = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Waree", 3, 15)); // NOI18N
        jLabel2.setText("Situação:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 100, -1));

        jLabel1.setFont(new java.awt.Font("Waree", 3, 18)); // NOI18N
        jLabel1.setText("Cadastre seu Pet Perdido ou Achado:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 23, 380, 40));

        jComboBoxTipo.setFont(new java.awt.Font("Waree", 3, 15)); // NOI18N
        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Escolha a situação", "Achado", "Perdido" }));
        jPanel1.add(jComboBoxTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 220, 30));

        jComboBoxSexo.setFont(new java.awt.Font("Waree", 3, 15)); // NOI18N
        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Escolha o sexo", "M", "F" }));
        jPanel1.add(jComboBoxSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, -1, 30));

        jLabel5.setFont(new java.awt.Font("Waree", 3, 15)); // NOI18N
        jLabel5.setText("Sexo:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 70, 20));

        jLabel6.setFont(new java.awt.Font("Waree", 3, 15)); // NOI18N
        jLabel6.setText("Descrição:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 144, 100, -1));

        jTextAreaDesAP.setColumns(20);
        jTextAreaDesAP.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDesAP);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 420, 80));

        jLabelEstado.setFont(new java.awt.Font("Waree", 3, 15)); // NOI18N
        jLabelEstado.setText("Estado:");
        jPanel1.add(jLabelEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 247, 80, 40));

        jComboBoxEstadoAP.setFont(new java.awt.Font("Waree", 3, 15)); // NOI18N
        jComboBoxEstadoAP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Escolha o estado", "Acre (AC)", "Alagoas (AL)", "Amapá (AP)", "Amazonas (AM)", "Bahia (BA)", "Ceará (CE)", "Distrito Federal (DF)", "Espírito Santo (ES)", "Goiás (GO)", "Maranhão (MA)", "Mato Grosso (MT)", "Mato Grosso do Sul (MS)", "Minas Gerais (MG)", "Pará (PA) ", "Paraíba (PB)", "Paraná (PR)", "Pernambuco (PE)", "Piauí (PI)", "Rio de Janeiro (RJ)", "Rio Grande do Norte (RN)", "Rio Grande do Sul (RS)", "Rondônia (RO)", "Roraima (RR)", "Santa Catarina (SC)", "São Paulo (SP)", "Sergipe (SE)", "Tocantins (TO)" }));
        jPanel1.add(jComboBoxEstadoAP, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 220, 30));

        jLabelCidade.setFont(new java.awt.Font("Waree", 3, 15)); // NOI18N
        jLabelCidade.setText("Cidade:");
        jPanel1.add(jLabelCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 247, 80, 40));

        jTextFieldCidadeAP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCidadeAPActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldCidadeAP, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 180, -1));

        jLabel3.setFont(new java.awt.Font("Waree", 3, 15)); // NOI18N
        jLabel3.setText("Rua:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 60, 20));
        jPanel1.add(jTextFieldRuaAP, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 420, -1));

        jButtonCadAP.setFont(new java.awt.Font("Waree", 3, 15)); // NOI18N
        jButtonCadAP.setText("Cadastrar");
        jButtonCadAP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadAPActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCadAP, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 100, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/background_2.jpg"))); // NOI18N
        jLabel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 480, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(525, 532));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadAPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadAPActionPerformed
        AchadosPerdidos petAP = new  AchadosPerdidos();
        PetDAO cadPet = new  PetDAO();
        petAP.setTipo((String) jComboBoxTipo.getSelectedItem());
        petAP.setSexo((String)jComboBoxSexo.getSelectedItem());
        petAP.setDescricao(jTextAreaDesAP.getText());
        petAP.setEstado((String)jComboBoxEstadoAP.getSelectedItem());
        petAP.setRua(jTextFieldRuaAP.getText());
        petAP.setCidade(jTextFieldCidadeAP.getText());
        petAP.setId_usuAP(id_usuAP);

        cadPet.adicionarPetAP(petAP);
        initComponents();
    }//GEN-LAST:event_jButtonCadAPActionPerformed

    private void jTextFieldCidadeAPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCidadeAPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCidadeAPActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadAchaPer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadAchaPer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadAchaPer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadAchaPer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadAchaPer().setVisible(true);
            } 
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadAP;
    private javax.swing.JComboBox<String> jComboBoxEstadoAP;
    private javax.swing.JComboBox<String> jComboBoxSexo;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDesAP;
    private javax.swing.JTextField jTextFieldCidadeAP;
    private javax.swing.JTextField jTextFieldRuaAP;
    // End of variables declaration//GEN-END:variables
}