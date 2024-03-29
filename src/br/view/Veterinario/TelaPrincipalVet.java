package br.view.Veterinario;

import br.helpet.dao.VeterinarioDAO;
import br.view.TelaCadastro;
import helpet.pojo.Clinicas;
import helpet.pojo.MarcarAtendimento;
import helpet.pojo.WikiPosts;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
/**
 * @author Helpet
 */
public class TelaPrincipalVet extends javax.swing.JFrame {
    /**
     * Creates new form TelaPrincipal
     */
    int id_usuT;
    int id_crmv;
   
      
    public TelaPrincipalVet(int id_usuT, int crmv) {
        initComponents();
        this.id_usuT = id_usuT;
        this.id_crmv = crmv;
        
        
        DefaultTableModel modelo1 = (DefaultTableModel) jTableAtend.getModel();															
        jTableAtend.setRowSorter(new TableRowSorter(modelo1));
        
        DefaultTableModel modelo2 = (DefaultTableModel) jTableClinicas.getModel();															
        jTableClinicas.setRowSorter(new TableRowSorter(modelo2));	
        
        DefaultTableModel modelo3 = (DefaultTableModel) jTablePosts.getModel();															
        jTablePosts.setRowSorter(new TableRowSorter(modelo3));	
        
        readJtable1();
        readJtable();
        readJtable2();
        
    }
    
    public TelaPrincipalVet() {
        initComponents();
        }

public void readJtable(){																								
        DefaultTableModel modelo3 = (DefaultTableModel) jTablePosts.getModel();														
        modelo3.setNumRows(0);																								
        VeterinarioDAO petdao = new VeterinarioDAO();
        
        																												
        for(WikiPosts f: petdao.listarP()){																						
           modelo3.addRow(new Object[]{																																													
           f.getTitulo(),
           f.getDescricao()
           });																												
        }																												
    }
public void readJtable2(){																								
        DefaultTableModel modelo2 = (DefaultTableModel) jTableClinicas.getModel();														
        modelo2.setNumRows(0);																								
        VeterinarioDAO petdao = new VeterinarioDAO();																					
        																												
        for(Clinicas f: petdao.listarClinicas(id_crmv)){																						
           modelo2.addRow(new Object[]{																																													
           f.getNome(),
           f.getDescricao()
           });																												
        }																												
    }
public void readJtable1(){																								
        DefaultTableModel modelo1 = (DefaultTableModel) jTableAtend.getModel();														
        modelo1.setNumRows(0);																								
        VeterinarioDAO daov = new VeterinarioDAO();																					
        int id_clie = (int) daov.buscarClinicasID(id_crmv);
        System.out.println(id_clie);
        
        for(MarcarAtendimento f: daov.listarSoliAtendimento(id_clie)){																						
           modelo1.addRow(new Object[]{																																													
           f.getId_usu_atd(),
           f.getId_clinica_atd()
           });	
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

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldTituloPost = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaDesPost = new javax.swing.JTextArea();
        jButtonPostar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePosts = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableClinicas = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableAtend = new javax.swing.JTable();
        jTextFieldidU = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jFormattedTextFieldHoraA = new javax.swing.JFormattedTextField();
        jFormattedTextFieldDataA = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastros = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel5.setFont(new java.awt.Font("URW Chancery L", 3, 18)); // NOI18N
        jLabel5.setText("Titulo:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 10, 80, 20);
        jPanel1.add(jTextFieldTituloPost);
        jTextFieldTituloPost.setBounds(10, 30, 730, 27);

        jLabel6.setFont(new java.awt.Font("URW Chancery L", 3, 18)); // NOI18N
        jLabel6.setText("Descrição:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 60, 100, 20);

        jTextAreaDesPost.setColumns(20);
        jTextAreaDesPost.setRows(5);
        jScrollPane3.setViewportView(jTextAreaDesPost);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(10, 80, 730, 110);

        jButtonPostar.setText("Postar");
        jButtonPostar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPostarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonPostar);
        jButtonPostar.setBounds(660, 190, 80, 29);

        jTablePosts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Titulo", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablePosts.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTablePostsAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jTablePosts);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 230, 730, 340);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/background_2.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 760, 590);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(450, 70, 760, 590);

        jPanel2.setLayout(null);

        jTableClinicas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTableClinicas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Nome", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableClinicas);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(20, 40, 380, 90);

        jTableAtend.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código:", "Nome:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTableAtend);

        jPanel2.add(jScrollPane4);
        jScrollPane4.setBounds(20, 180, 380, 140);
        jPanel2.add(jTextFieldidU);
        jTextFieldidU.setBounds(20, 380, 120, 27);

        jButton1.setText("Confirmar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(240, 420, 110, 30);

        try {
            jFormattedTextFieldHoraA.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldHoraA.setText("");
        jPanel2.add(jFormattedTextFieldHoraA);
        jFormattedTextFieldHoraA.setBounds(280, 380, 70, 27);

        try {
            jFormattedTextFieldDataA.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(jFormattedTextFieldDataA);
        jFormattedTextFieldDataA.setBounds(170, 380, 80, 27);

        jLabel13.setText("Confirmar Atendimento:");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(20, 330, 190, 17);

        jLabel12.setText("Hora:");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(280, 360, 38, 17);

        jLabel11.setText("Data:");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(170, 360, 57, 17);

        jLabel10.setText("Código Paciente:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(20, 360, 130, 17);

        jLabel9.setFont(new java.awt.Font("URW Chancery L", 3, 24)); // NOI18N
        jLabel9.setText("Solicitações de Atendimento");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(20, 150, 300, 26);

        jLabel4.setFont(new java.awt.Font("URW Chancery L", 3, 24)); // NOI18N
        jLabel4.setText("Minhas clinicas!");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 10, 190, 26);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/background_2.jpg"))); // NOI18N
        jLabel8.setText("jLabel2");
        jLabel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(jLabel8);
        jLabel8.setBounds(0, 0, 420, 590);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 70, 420, 590);

        jLabel7.setFont(new java.awt.Font("URW Chancery L", 3, 24)); // NOI18N
        jLabel7.setText("Dicas veterinária");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(450, 40, 180, 26);

        jLabel3.setFont(new java.awt.Font("URW Bookman L", 3, 18)); // NOI18N
        jLabel3.setText("Bem-Vindo!");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 40, 130, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Alien_Ink_2560X1600_Abstract_Background_1.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1300, 710);

        jMenuBar1.setBackground(new java.awt.Color(8, 0, 104));
        jMenuBar1.setForeground(new java.awt.Color(1, 12, 53));

        jMenuCadastros.setBackground(new java.awt.Color(60, 59, 55));
        jMenuCadastros.setForeground(new java.awt.Color(1, 1, 1));
        jMenuCadastros.setText("Cadastrar ");

        jMenuItem10.setText("Clinicas");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItem10);

        jMenuBar1.add(jMenuCadastros);

        jMenu6.setForeground(new java.awt.Color(1, 1, 1));
        jMenu6.setText("Sair");

        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem1);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1308, 755));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if (JOptionPane.showConfirmDialog(null,"Deseja sair?")==JOptionPane.OK_OPTION){
             dispose(); 
             TelaCadastro tc = new TelaCadastro();
             tc.setVisible(true);
         }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jTablePostsAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTablePostsAncestorAdded
        // TODO add your handling code here:
    
    }//GEN-LAST:event_jTablePostsAncestorAdded

    private void jButtonPostarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPostarActionPerformed
        WikiPosts wp = new WikiPosts();
        VeterinarioDAO u = new VeterinarioDAO();

        wp.setTitulo(jTextFieldTituloPost.getText());
        wp.setDescricao(jTextAreaDesPost.getText());
        wp.setCrmv(id_crmv);
      
        u.postarWiki(wp);
        readJtable();
        
        jTextFieldTituloPost.setText(null);
        jTextAreaDesPost.setText(null);
        
    }//GEN-LAST:event_jButtonPostarActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        TelaCadClinica c = new TelaCadClinica(id_crmv);
        c.setVisible(true);
        readJtable2();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MarcarAtendimento ma = new MarcarAtendimento();
        VeterinarioDAO vd = new VeterinarioDAO();
        int id_cliA = (int) vd.buscarClinicasID(id_crmv);
        ma.setData_atd(jFormattedTextFieldDataA.getText());
        ma.setHora(Double.parseDouble(jFormattedTextFieldHoraA.getText()));
        ma.setId_usu_atd(Integer.parseInt(jTextFieldidU.getText()));
        ma.setId_clinica_atd(id_cliA);
        vd.marcaAtend(ma);
        readJtable1();
        
        jFormattedTextFieldDataA.setText(null);
        jFormattedTextFieldHoraA.setText(null);
        jTextFieldidU.setText(null);
        
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
            java.util.logging.Logger.getLogger(TelaPrincipalVet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalVet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalVet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalVet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipalVet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonPostar;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataA;
    private javax.swing.JFormattedTextField jFormattedTextFieldHoraA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastros;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTableAtend;
    private javax.swing.JTable jTableClinicas;
    private javax.swing.JTable jTablePosts;
    private javax.swing.JTextArea jTextAreaDesPost;
    private javax.swing.JTextField jTextFieldTituloPost;
    private javax.swing.JTextField jTextFieldidU;
    // End of variables declaration//GEN-END:variables
}
