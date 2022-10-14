package br.view.Usuario;

import br.helpet.connection.ConnectionBD;
import br.helpet.dao.PetDAO;
import br.helpet.dao.UsuariosDAO;
import br.helpet.dao.VeterinarioDAO;
import br.view.TelaCadastro;
import helpet.pojo.PetsUsu;
import helpet.pojo.Petshops;
import helpet.pojo.WikiPosts;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 * @author Helpet
 */
public class TelaPrincipalUsu extends javax.swing.JFrame {
    int id_usuT;
    String nome;
    
public TelaPrincipalUsu(int id_usuT, String nome) {
        initComponents();
        this.id_usuT = id_usuT;
        this.nome = nome;

        System.out.println(id_usuT);
        System.out.println(nome);
        jLabelNome.setText(nome);
        
        DefaultTableModel modelo = (DefaultTableModel) jTableMeusPets.getModel();															
        jTableMeusPets.setRowSorter(new TableRowSorter(modelo));																		
     	
        
        DefaultTableModel modelo2 = (DefaultTableModel) jTablePosts.getModel();															
        jTablePosts.setRowSorter(new TableRowSorter(modelo2));
        
        DefaultTableModel modelo3 = (DefaultTableModel) jTablePetshops.getModel();															
        jTablePetshops.setRowSorter(new TableRowSorter(modelo3));	
        
        readJtable();
        readJtable2();
        readJtable3();
        }
public TelaPrincipalUsu() {}


public void readJtable(){																								
        DefaultTableModel modelo = (DefaultTableModel) jTableMeusPets.getModel();														
        modelo.setNumRows(0);																								
        PetDAO petdao = new PetDAO();																					
        																												
        for(PetsUsu f: petdao.listarPets(id_usuT)){																						
           modelo.addRow(new Object[]{																						
           f.getNome(),																										
           f.getTipo(),
           f.getDescricao()
           });																												
        }																												
    }
public void readJtable2(){																								
        DefaultTableModel modelo2 = (DefaultTableModel) jTablePosts.getModel();														
        modelo2.setNumRows(0);																								
        VeterinarioDAO petdao = new VeterinarioDAO();																					
        																												
        for(WikiPosts f: petdao.listarP()){																						
           modelo2.addRow(new Object[]{																						
           f.getCrmv(),																										
           f.getTitulo(),
           f.getDescricao()
           });																												
        }																												
    }

public void readJtable3(){																								
        DefaultTableModel modelo3 = (DefaultTableModel) jTablePetshops.getModel();														
        modelo3.setNumRows(0);																								
        UsuariosDAO petdao = new UsuariosDAO();																					
        																												
        for(Petshops f: petdao.listarPetshops()){																						
           modelo3.addRow(new Object[]{																						
           f.getNome(),																									
           f.getDescricao(),
           f.getCidade(),
           f.getTelefone(),
           f.getEstado()
           });																												
        }																												
    }
   	
   
    ConnectionBD conecta = new ConnectionBD();
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldPesquisarWiki = new javax.swing.JTextField();
        jButtonbuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableMeusPets = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablePetshops = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePosts = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabelNome = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastros = new javax.swing.JMenu();
        jMenuItemCadPets = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel10.setFont(new java.awt.Font("Waree", 3, 24)); // NOI18N
        jLabel10.setText("HELPet");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(180, 210, 130, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/telaCadOng_1.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(130, 70, 200, 150);
        getContentPane().add(jTextFieldPesquisarWiki);
        jTextFieldPesquisarWiki.setBounds(710, 70, 440, 27);

        jButtonbuscar.setText("buscar");
        jButtonbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonbuscar);
        jButtonbuscar.setBounds(1160, 70, 80, 29);

        jLabel3.setFont(new java.awt.Font("URW Bookman L", 3, 24)); // NOI18N
        jLabel3.setText("Bem-Vindo");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(170, 40, 140, 30);

        jTableMeusPets.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "nome", "tipo", "descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableMeusPets);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 280, 420, 160);

        jTablePetshops.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nome", "Descrição", "Telefone", "Cidade", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTablePetshops);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(510, 410, 730, 160);

        jTablePosts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Veterinário", "Titulo", "Descrição"
            }
        ));
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

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(510, 100, 730, 270);

        jButton1.setText("Atualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(350, 440, 90, 20);

        jLabelNome.setFont(new java.awt.Font("Waree", 3, 15)); // NOI18N
        jLabelNome.setText(this.nome);
        getContentPane().add(jLabelNome);
        jLabelNome.setBounds(120, 10, 250, 20);

        jLabel2.setText("Pesquisa:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(640, 70, 80, 20);

        jLabel8.setFont(new java.awt.Font("Waree", 3, 18)); // NOI18N
        jLabel8.setText("Dicas");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(510, 70, 180, 33);

        jLabel6.setFont(new java.awt.Font("Waree", 3, 18)); // NOI18N
        jLabel6.setText("Petshops:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(510, 380, 140, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/background_2.jpg"))); // NOI18N
        jLabel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel9);
        jLabel9.setBounds(490, 60, 770, 530);

        jLabel4.setFont(new java.awt.Font("Waree", 3, 18)); // NOI18N
        jLabel4.setText("Meus Pets");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 250, 120, 33);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/background_2.jpg"))); // NOI18N
        jLabel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel7.setRequestFocusEnabled(false);
        jLabel7.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 250, 440, 210);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Alien_Ink_2560X1600_Abstract_Background_1.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1310, 730);

        jMenuBar1.setBackground(new java.awt.Color(8, 0, 104));
        jMenuBar1.setForeground(new java.awt.Color(1, 12, 53));

        jMenuCadastros.setBackground(new java.awt.Color(60, 59, 55));
        jMenuCadastros.setForeground(new java.awt.Color(1, 1, 1));
        jMenuCadastros.setText("Cadastrar ");

        jMenuItemCadPets.setText("Pets");
        jMenuItemCadPets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadPetsActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCadPets);

        jMenuItem10.setText("Achados / perdidos");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItem10);

        jMenuItem4.setText("Petshops");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItem4);

        jMenuBar1.add(jMenuCadastros);

        jMenu1.setForeground(new java.awt.Color(1, 1, 1));
        jMenu1.setText("Procurar");

        jMenuItem5.setText("Achados  e perdidos");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem11.setText("Clínicas Veterinária");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem11);

        jMenuBar1.add(jMenu1);

        jMenu4.setForeground(new java.awt.Color(1, 1, 1));
        jMenu4.setText("Ongs");

        jMenuItem2.setText("Adotar Pet");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuItem3.setText("Fazer Doação");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuItem9.setText("Ver Ongs");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem9);

        jMenuBar1.add(jMenu4);

        jMenu7.setForeground(new java.awt.Color(1, 1, 1));
        jMenu7.setText("Denuncias");

        jMenuItem7.setText("Fezer Denuncia");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem7);

        jMenuItem8.setText("Ver Denuncias");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem8);

        jMenuBar1.add(jMenu7);

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

        setSize(new java.awt.Dimension(1312, 785));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCadPetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadPetsActionPerformed
        TelaCadPet cadP = new TelaCadPet(id_usuT);
        cadP.setVisible(true);     
    }//GEN-LAST:event_jMenuItemCadPetsActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if (JOptionPane.showConfirmDialog(null,"Deseja sair?")==JOptionPane.OK_OPTION){
             dispose(); 
             TelaCadastro tc = new TelaCadastro();
             tc.setVisible(true);
         }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
      TelaAdotarPetsFoto adota = new TelaAdotarPetsFoto(id_usuT);
      adota.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jTablePostsAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTablePostsAncestorAdded

    }//GEN-LAST:event_jTablePostsAncestorAdded

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        TelaCadDenuncia cd = new TelaCadDenuncia(id_usuT);
        cd.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        VerDenuncias vd = new VerDenuncias();
        vd.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jButtonbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonbuscarActionPerformed

    }//GEN-LAST:event_jButtonbuscarActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        TelaCadAchaPer cadAP = new TelaCadAchaPer(id_usuT);
        cadAP.setVisible(true);   
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        TelaProcuraAP pAP = new TelaProcuraAP();
        pAP.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        TelaDeDoacao doa = new TelaDeDoacao(id_usuT);
        doa.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        TelaProcurarClinicas pc = new TelaProcurarClinicas(id_usuT);
        pc.setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        TelaCadPetshops ps = new TelaCadPetshops();
        ps.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        readJtable();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipalUsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalUsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalUsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalUsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipalUsu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonbuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JLabel jLabelNome;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastros;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenuItemCadPets;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableMeusPets;
    private javax.swing.JTable jTablePetshops;
    private javax.swing.JTable jTablePosts;
    private javax.swing.JTextField jTextFieldPesquisarWiki;
    // End of variables declaration//GEN-END:variables
}
