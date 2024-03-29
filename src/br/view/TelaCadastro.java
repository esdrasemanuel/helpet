
package br.view;

import br.view.Ongs.TelaPrincipalOng;
import br.view.Veterinario.TelaPrincipalVet;
import br.view.Usuario.TelaPrincipalUsu;
import br.helpet.connection.ConnectionBD;
import br.helpet.dao.UsuariosDAO;
import helpet.pojo.Ongs;
import helpet.pojo.PetsUsu;
import helpet.pojo.Usuario;
import helpet.pojo.Veterinario;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author Helpet
 */
public class TelaCadastro extends javax.swing.JFrame {
ConnectionBD conecta = new ConnectionBD();
Veterinario vet = new Veterinario();
UsuariosDAO Udao = new UsuariosDAO();
Usuario usu = new Usuario();
Ongs ong = new Ongs();
 
    public TelaCadastro() {
        initComponents();
        conecta.conectar();
        
            jTextFieldCRMV.setVisible(false);
            jLabelCRMV.setVisible(false);
            jTextFieldEspecialidade.setVisible(false);
            jLabelespeciali.setVisible(false);
            jTextFieldcnpj.setVisible(false);
            jTextFielddesc.setVisible(false);
            jLabelcnpj.setVisible(false);
            jLabeldesc.setVisible(false);
        
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
        jLabelHelpet = new javax.swing.JLabel();
        jLabelLoginEmail = new javax.swing.JLabel();
        jLabelLoginSenha = new javax.swing.JLabel();
        jButtonEntar = new javax.swing.JButton();
        jPasswordFieldLoginSenha = new javax.swing.JPasswordField();
        jTextFieldLoginEmail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jComboBoxTipoLogin = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jButtonCadastrar = new javax.swing.JButton();
        jTextFieldCcidade = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jComboBoxEstado = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldCendereco = new javax.swing.JTextField();
        jTextFieldCnumero = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPasswordFieldCsenha1 = new javax.swing.JPasswordField();
        jPasswordFieldCsenha2 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCemail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCnome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabelTipo = new javax.swing.JLabel();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldCRMV = new javax.swing.JTextField();
        jLabelCRMV = new javax.swing.JLabel();
        jButtonLimparCad = new javax.swing.JButton();
        jTextFieldEspecialidade = new javax.swing.JTextField();
        jLabelespeciali = new javax.swing.JLabel();
        jLabelcnpj = new javax.swing.JLabel();
        jTextFieldcnpj = new javax.swing.JTextField();
        jLabeldesc = new javax.swing.JLabel();
        jTextFielddesc = new javax.swing.JTextField();
        jFormattedTextFieldDate2 = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 23, 95));
        jPanel1.setLayout(null);

        jLabelHelpet.setFont(new java.awt.Font("URW Chancery L", 0, 100)); // NOI18N
        jLabelHelpet.setForeground(new java.awt.Color(0, 255, 255));
        jLabelHelpet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/testelogo4.png"))); // NOI18N
        jPanel1.add(jLabelHelpet);
        jLabelHelpet.setBounds(-10, 20, 490, 191);

        jLabelLoginEmail.setFont(new java.awt.Font("Waree", 3, 15)); // NOI18N
        jLabelLoginEmail.setForeground(new java.awt.Color(254, 192, 144));
        jLabelLoginEmail.setText("Email:");
        jPanel1.add(jLabelLoginEmail);
        jLabelLoginEmail.setBounds(100, 230, 90, 20);

        jLabelLoginSenha.setFont(new java.awt.Font("Waree", 3, 15)); // NOI18N
        jLabelLoginSenha.setForeground(new java.awt.Color(254, 192, 144));
        jLabelLoginSenha.setText("Senha:");
        jPanel1.add(jLabelLoginSenha);
        jLabelLoginSenha.setBounds(100, 280, 80, 20);

        jButtonEntar.setFont(new java.awt.Font("Waree", 3, 15)); // NOI18N
        jButtonEntar.setText("Entrar");
        jButtonEntar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEntar);
        jButtonEntar.setBounds(280, 350, 84, 30);
        jPanel1.add(jPasswordFieldLoginSenha);
        jPasswordFieldLoginSenha.setBounds(100, 300, 260, 27);
        jPanel1.add(jTextFieldLoginEmail);
        jTextFieldLoginEmail.setBounds(100, 250, 260, 27);

        jLabel11.setFont(new java.awt.Font("Waree", 3, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(254, 192, 144));
        jLabel11.setText("Tipo:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(100, 330, 60, 20);

        jComboBoxTipoLogin.setFont(new java.awt.Font("Waree", 3, 15)); // NOI18N
        jComboBoxTipoLogin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuário", "Veterinário", "Ong" }));
        jPanel1.add(jComboBoxTipoLogin);
        jComboBoxTipoLogin.setBounds(100, 350, 160, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 470, 690);

        jPanel2.setBackground(new java.awt.Color(26, 202, 254));

        jButtonCadastrar.setFont(new java.awt.Font("Waree", 3, 15)); // NOI18N
        jButtonCadastrar.setText("Cadastrar");

        jLabel9.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabel9.setText("Cidade: ");

        jComboBoxEstado.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Escolha o estado", "Acre (AC)", "Alagoas (AL)", "Amapá (AP)", "Amazonas (AM)", "Bahia (BA)", "Ceará (CE)", "Distrito Federal (DF)", "Espírito Santo (ES)", "Goiás (GO)", "Maranhão (MA)", "Mato Grosso (MT)", "Mato Grosso do Sul (MS)", "Minas Gerais (MG)", "Pará (PA) ", "Paraíba (PB)", "Paraná (PR)", "Pernambuco (PE)", "Piauí (PI)", "Rio de Janeiro (RJ)", "Rio Grande do Norte (RN)", "Rio Grande do Sul (RS)", "Rondônia (RO)", "Roraima (RR)", "Santa Catarina (SC)", "São Paulo (SP)", "Sergipe (SE)", "Tocantins (TO)" }));

        jLabel8.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabel8.setText("Estado:");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabel6.setText("Endereço:");

        jLabel7.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabel7.setText("Numero:");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabel5.setText("Data de nascimento:");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabel4.setText("Repita a senha:");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabel3.setText("Senha:");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabel2.setText("E-mail:");

        jLabel1.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabel1.setText("Nome:");

        jLabelTipo.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabelTipo.setText("Tipo:");

        jComboBoxTipo.setFont(new java.awt.Font("Waree", 3, 15)); // NOI18N
        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuário", "Veterinário", "Ong" }));

        jLabel10.setFont(new java.awt.Font("Waree", 3, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(5, 1, 103));
        jLabel10.setText("Cadastro");

        jLabelCRMV.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabelCRMV.setText("CRMV:");

        jButtonLimparCad.setFont(new java.awt.Font("Waree", 3, 15)); // NOI18N
        jButtonLimparCad.setText("Limpar");

        jLabelespeciali.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabelespeciali.setText("Especialidade:");

        jLabelcnpj.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabelcnpj.setText("CNPJ:");

        jLabeldesc.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabeldesc.setText("Descrição:");

        try {
            jFormattedTextFieldDate2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jPasswordFieldCsenha1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(30, 30, 30)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jPasswordFieldCsenha2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel10)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabelTipo)
                            .addGap(12, 12, 12)
                            .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabelespeciali)
                            .addGap(180, 180, 180)
                            .addComponent(jLabelCRMV))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jTextFieldEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(49, 49, 49)
                            .addComponent(jTextFieldCRMV, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel1)
                        .addComponent(jTextFieldCnome, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jTextFieldCemail, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelcnpj)
                                .addComponent(jTextFieldcnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(29, 29, 29)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFielddesc, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabeldesc)))
                        .addComponent(jLabel5)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jTextFieldCendereco, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jTextFieldCnumero))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jTextFieldCcidade, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(jButtonLimparCad, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCadastrar))
                    .addComponent(jFormattedTextFieldDate2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTipo)
                    .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelespeciali)
                    .addComponent(jLabelCRMV))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCRMV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabeldesc, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFielddesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelcnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jTextFieldcnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(jTextFieldCnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addComponent(jTextFieldCemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordFieldCsenha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordFieldCsenha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jLabel5)
                .addGap(6, 6, 6)
                .addComponent(jFormattedTextFieldDate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldCendereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCcidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLimparCad, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(470, 0, 520, 690);

        setSize(new java.awt.Dimension(1000, 721));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCenderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCenderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCenderecoActionPerformed

    private void jButtonEntarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntarActionPerformed
        UsuariosDAO u = new UsuariosDAO();
        PetsUsu pet = new PetsUsu();
        char[] chars = jPasswordFieldLoginSenha.getPassword();  
        String password = String.valueOf(chars);
        
        if (u.consultar(jTextFieldLoginEmail.getText(), password) == true && jComboBoxTipoLogin.getSelectedItem().equals("Usuário") && u.buscaTipo(jTextFieldLoginEmail.getText(), password).equals("Usuário")){  
            
            TelaPrincipalUsu tela1 = new TelaPrincipalUsu(u.buscaidU(jTextFieldLoginEmail.getText(), password), u.buscarNomeU(jTextFieldLoginEmail.getText(), password));
            tela1.setVisible(true);
            dispose();
            
        }else if (u.consultar(jTextFieldLoginEmail.getText(), password) == true && jComboBoxTipoLogin.getSelectedItem().equals("Veterinário") && u.buscaTipo(jTextFieldLoginEmail.getText(), password).equals("Veterinário")){  
            
            TelaPrincipalVet tela2 = new TelaPrincipalVet(u.buscaidU(jTextFieldLoginEmail.getText(), password), u.buscaicrmv(jTextFieldLoginEmail.getText(), password));
            tela2.setVisible(true);
            dispose();
            
        }else if (u.consultar(jTextFieldLoginEmail.getText(), password) == true && jComboBoxTipoLogin.getSelectedItem().equals("Ong")&& u.buscaTipo(jTextFieldLoginEmail.getText(), password).equals("Ong")){  
            
            TelaPrincipalOng tela3 = new TelaPrincipalOng(u.buscaiCnpj(jTextFieldLoginEmail.getText(), password));
            tela3.setVisible(true);
            dispose();
        
        }else {JOptionPane.showMessageDialog(null, "Senha ou login ou tipo escolhido não coincidem!");}
        
    }//GEN-LAST:event_jButtonEntarActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        
      try{
        char[] chars = jPasswordFieldCsenha1.getPassword();  
        String password = String.valueOf(chars);
        char[] chars2 = jPasswordFieldCsenha2.getPassword();  
        String password2 = String.valueOf(chars2);
        usu.setTipo((String) jComboBoxTipo.getSelectedItem());
        if (jComboBoxTipo.getSelectedItem().equals("Veterinário") && password2.equals(password)){
            vet.setNome(jTextFieldCnome.getText());
            vet.setEmail(jTextFieldCemail.getText());
            vet.getSenha1(password);
            vet.setDat_nas(jFormattedTextFieldDate2.getText());
            vet.setRua(jTextFieldCendereco.getText());
            vet.setNumero(jTextFieldCnumero.getText());
            vet.setEstado((String) jComboBoxEstado.getSelectedItem());
            vet.setCidade(jTextFieldCcidade.getText());
            vet.setTipo((String) jComboBoxTipo.getSelectedItem());
            vet.setCRMV(Integer.parseInt(jTextFieldCRMV.getText()));
            vet.setEspecialidades(jTextFieldEspecialidade.getText());
      
            Udao.adicionarVet(vet);
            JOptionPane.showMessageDialog(null,"Veterinário Cadastrado com sucesso!");
             jTextFieldCnome.setText(null);
             jTextFieldCemail.setText(null);
             jFormattedTextFieldDate2.setValue(null);
             jTextFieldCendereco.setText(null);
             jTextFieldCnumero.setText(null);
             jComboBoxEstado.setSelectedItem(null);
             jTextFieldCcidade.setText(null);
             jTextFieldCRMV.setText(null);
             jTextFieldEspecialidade.setText(null);
             jPasswordFieldCsenha1.setText(null);
             jPasswordFieldCsenha2.setText(null);
            
         

            }else if(jComboBoxTipo.getSelectedItem().equals("Usuário") && password2.equals(password)){
                usu.setNome(jTextFieldCnome.getText());
                usu.setEmail(jTextFieldCemail.getText());
                usu.getSenha1(password);
                usu.setDat_nas(jFormattedTextFieldDate2.getText());
                usu.setRua(jTextFieldCendereco.getText());
                usu.setNumero(jTextFieldCnumero.getText());
                usu.setEstado((String) jComboBoxEstado.getSelectedItem());
                usu.setCidade(jTextFieldCcidade.getText());
                usu.setTipo((String) jComboBoxTipo.getSelectedItem());

                Udao.adicionarU(usu);
                JOptionPane.showMessageDialog(null,"Usuário Cadastrado com sucesso!");
                jTextFieldCnome.setText(null);
                jTextFieldCemail.setText(null);
                jFormattedTextFieldDate2.setValue(null);
                jTextFieldCendereco.setText(null);
                jTextFieldCnumero.setText(null);
                jComboBoxEstado.setSelectedItem(null);
                jTextFieldCcidade.setText(null);
                jTextFieldCRMV.setText(null);
                jTextFieldEspecialidade.setText(null);
                jPasswordFieldCsenha1.setText(null);
                jPasswordFieldCsenha2.setText(null);
            }
            else if(jComboBoxTipo.getSelectedItem().equals("Ongs") && password2.equals(password)){
                ong.setNome(jTextFieldCnome.getText());
                ong.setEmail(jTextFieldCemail.getText());
                ong.getSenha1(password);
                ong.setDat_nas(jFormattedTextFieldDate2.getText());
                ong.setRua(jTextFieldCendereco.getText());
                ong.setNumero(jTextFieldCnumero.getText());
                ong.setEstado((String) jComboBoxEstado.getSelectedItem());
                ong.setCidade(jTextFieldCcidade.getText());
                ong.setTipo((String) jComboBoxTipo.getSelectedItem());
                ong.setCnpj(Long.parseLong( jTextFieldcnpj.getText()));
                ong.setDescricao(jTextFielddesc.getText());

                Udao.adicionarU(ong);
                JOptionPane.showMessageDialog(null,"Ong Cadastrada com sucesso!");
                
                jTextFieldCnome.setText(null);
                jTextFieldCemail.setText(null);
                jFormattedTextFieldDate2.setValue(null);
                jTextFieldCendereco.setText(null);
                jTextFieldCnumero.setText(null);
                jComboBoxEstado.setSelectedItem(null);
                jTextFieldCcidade.setText(null);
                jTextFieldCRMV.setText(null);
                jTextFieldEspecialidade.setText(null);
                jPasswordFieldCsenha1.setText(null);
                jPasswordFieldCsenha2.setText(null);
                

            }else {JOptionPane.showMessageDialog(null, "senhas distintas!");}
      }catch(NumberFormatException | HeadlessException ex){
          JOptionPane.showMessageDialog(null, "Error" +ex);
          
      }
            
        
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jComboBoxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoActionPerformed

         if (jComboBoxTipo.getSelectedItem().equals("Veterinário")){
          jTextFieldCRMV.setVisible(true);
          jLabelCRMV.setVisible(true);
          jTextFieldEspecialidade.setVisible(true);
          jLabelespeciali.setVisible(true);
          jTextFieldcnpj.setVisible(false);
          jTextFielddesc.setVisible(false);
          jLabelcnpj.setVisible(false);
          jLabeldesc.setVisible(false);
          
        }  else if (jComboBoxTipo.getSelectedItem().equals("Ong")){
          jTextFieldcnpj.setVisible(true);
          jTextFielddesc.setVisible(true);
          jLabelcnpj.setVisible(true);
          jLabeldesc.setVisible(true);
          jTextFieldCRMV.setVisible(false);
          jLabelCRMV.setVisible(false);
          jTextFieldEspecialidade.setVisible(false);
          jLabelespeciali.setVisible(false);
          
        }
         else {
            jTextFieldCRMV.setVisible(false);
            jLabelCRMV.setVisible(false);
            jTextFieldEspecialidade.setVisible(false);
            jLabelespeciali.setVisible(false);
            jTextFieldcnpj.setVisible(false);
            jTextFielddesc.setVisible(false);
            jLabelcnpj.setVisible(false);
            jLabeldesc.setVisible(false);
            
        }
    }//GEN-LAST:event_jComboBoxTipoActionPerformed

    private void jPasswordFieldLoginSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldLoginSenhaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jPasswordFieldLoginSenhaActionPerformed

    private void jPasswordFieldCsenha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldCsenha1ActionPerformed
             char[] chars = jPasswordFieldCsenha1.getPassword();  
             String password = String.valueOf(chars);
             
       
    }//GEN-LAST:event_jPasswordFieldCsenha1ActionPerformed

    private void jButtonLimparCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparCadActionPerformed
          //Aqui limpa a tela de cadastro na gambiarra!
          jTextFieldCnome.setText(null);
          jTextFieldCemail.setText(null);
          jFormattedTextFieldDate2.setValue(null);
          jTextFieldCendereco.setText(null);
          jTextFieldCnumero.setText(null);
          jComboBoxEstado.setSelectedItem(null);
          jTextFieldCcidade.setText(null);
          jTextFieldCRMV.setText(null);
          jTextFieldEspecialidade.setText(null);
          jPasswordFieldCsenha1.setText(null);
          jPasswordFieldCsenha2.setText(null);
         
          
              
    }//GEN-LAST:event_jButtonLimparCadActionPerformed

    private void jTextFieldCnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCnomeActionPerformed

    private void jTextFieldEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEspecialidadeActionPerformed

    private void jComboBoxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxEstadoActionPerformed

    private void jTextFielddescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielddescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFielddescActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonEntar;
    private javax.swing.JButton jButtonLimparCad;
    private javax.swing.JComboBox<String> jComboBoxEstado;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JComboBox<String> jComboBoxTipoLogin;
    private javax.swing.JFormattedTextField jFormattedTextFieldDate2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCRMV;
    private javax.swing.JLabel jLabelHelpet;
    private javax.swing.JLabel jLabelLoginEmail;
    private javax.swing.JLabel jLabelLoginSenha;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JLabel jLabelcnpj;
    private javax.swing.JLabel jLabeldesc;
    private javax.swing.JLabel jLabelespeciali;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordFieldCsenha1;
    private javax.swing.JPasswordField jPasswordFieldCsenha2;
    private javax.swing.JPasswordField jPasswordFieldLoginSenha;
    private javax.swing.JTextField jTextFieldCRMV;
    private javax.swing.JTextField jTextFieldCcidade;
    private javax.swing.JTextField jTextFieldCemail;
    private javax.swing.JTextField jTextFieldCendereco;
    private javax.swing.JTextField jTextFieldCnome;
    private javax.swing.JTextField jTextFieldCnumero;
    private javax.swing.JTextField jTextFieldEspecialidade;
    private javax.swing.JTextField jTextFieldLoginEmail;
    private javax.swing.JTextField jTextFieldcnpj;
    private javax.swing.JTextField jTextFielddesc;
    // End of variables declaration//GEN-END:variables

    
}
