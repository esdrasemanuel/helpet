/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.helpet.dao;

import br.helpet.connection.ConnectionBD;
import br.view.TelaCadastro;
import helpet.pojo.ContaOngs;
import helpet.pojo.Doacao;
import helpet.pojo.Ongs;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author esdras
 */
public class OngsDAO {
     ConnectionBD conecta = new ConnectionBD();
    public void adicionarConta( ContaOngs cong){
                conecta.conectar();
		try {
                        TelaCadastro usu = new TelaCadastro();
                        PreparedStatement ps = conecta.con.prepareStatement("insert into Conta_Ong (agencia,conta,cnpj_ong, titular) values (?, ?, ?,?)");
			ps.setInt(1, cong.getAgencia());
			ps.setInt(2, cong.getConta());
                        ps.setLong(3, cong.getCnpj_ong());
                        ps.setString(4, cong.getNome());
			ps.execute();
                        System.out.println("Conta Ong adicionada com sucesso!");
                        JOptionPane.showMessageDialog(null, "Conta Ong adicionada com sucesso!");
		} catch (SQLException e) {
                    System.out.println("Erro durante execução!" +e);
		}conecta.desconectar();
	}
    
    public void doaFinan( Doacao doa){
                conecta.conectar();
		try {
                        PreparedStatement ps = conecta.con.prepareStatement("insert into doa_finan (id_usu_doa,valor,cnpj_doa,data ) values (?, ?, ?,?)");
			ps.setInt(1, doa.getId_usu_doa());
			ps.setDouble(2, doa.getValor());
                        ps.setLong(3, doa.getCnpj_doa());
                        ps.setString(4, doa.getData_atdString());
			ps.execute();
                        System.out.println("Conta Ong adicionada com sucesso!");
                        JOptionPane.showMessageDialog(null, "Conta Ong adicionada com sucesso!");
		} catch (SQLException e) {
                    System.out.println("Erro durante execução!" +e);
		}conecta.desconectar();
	}
    
    public ArrayList<Ongs> verOngs(){
         ArrayList<Ongs> lista = new ArrayList<>();
            try {
                conecta.conectar();
                String sql = "SELECT cnpj,nome,descricao,cidade,rua,estado FROM usuarios where tipo like 'Ong";
                PreparedStatement ps = conecta.con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    Ongs p1 = new Ongs();
                    p1.setCnpj(rs.getInt("cnpj"));
                    p1.setNome(rs.getString("nome"));
                    p1.setDescricao(rs.getString("descricao"));
                    p1.setCidade(rs.getString("cidade"));
                    p1.setRua(rs.getString("rua"));
                    p1.setEstado(rs.getString("estado"));
                    lista.add(p1);
                }
            }catch (SQLException e) {
                System.out.println("Erro durante execução!" + e);  
            } 
            conecta.desconectar();
            return lista; 
    }
 }
    

