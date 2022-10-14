
package br.helpet.dao;


import br.helpet.connection.ConnectionBD;
import br.view.TelaCadastro;
import helpet.pojo.AchadosPerdidos;
import helpet.pojo.AdotarPets;
import helpet.pojo.Exemplo;
import helpet.pojo.Ongs;
import helpet.pojo.PetsUsu;
import helpet.pojo.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Helpet
 */
public class PetDAO {
    ConnectionBD conecta = new ConnectionBD();
    public void adicionarPet(PetsUsu novoupet){
                conecta.conectar();
		try {
                        TelaCadastro usu = new TelaCadastro();
                        PreparedStatement ps = conecta.con.prepareStatement("insert into pets_usuario (nome,tipo,raca,id_usu) values (?, ?, ?, ?)");
			ps.setString(1, novoupet.getNome());
			ps.setString(2, novoupet.getTipo());
			ps.setString(3, novoupet.getDescricao());
                        ps.setObject(4, novoupet.getId_usu());
			ps.execute();
                        System.out.println("PET adicionado com sucesso!");
                        JOptionPane.showMessageDialog(null, "PET adicionado com sucesso!");
		} catch (SQLException e) {
                    System.out.println("Erro durante execução!"+e);
		
		}conecta.desconectar();
	}
    public void adicionarPetAP(AchadosPerdidos novopetAP){
                conecta.conectar();
		try {
                        TelaCadastro usu = new TelaCadastro();
                        PreparedStatement ps = conecta.con.prepareStatement("insert into achados_perdidos (tipo,descricao,sexo,estado,cidade,rua,id_usu_ap) values (?,?,?,?, ?, ?, ?)");
			ps.setString(1, novopetAP.getTipo());
			ps.setString(2, novopetAP.getDescricao());
			ps.setString(3, novopetAP.getSexo());
                        ps.setString(4, novopetAP.getEstado());
                        ps.setString(5, novopetAP.getCidade());
                        ps.setString(6, novopetAP.getRua());
                        ps.setObject(7,novopetAP.getId_usuAP());
			ps.execute();
                        System.out.println("PET adicionado com sucesso!");
                        JOptionPane.showMessageDialog(null, "PET adicionado com sucesso!");
		} catch (SQLException e) {
                    System.out.println("Erro durante execução!"+e);
		}
       
                conecta.desconectar();
	}
    

public ArrayList<PetsUsu> listarPets(int id){
         ArrayList<PetsUsu> lista = new ArrayList<>(); 
                
                try {
                    conecta.conectar();
                    String sql = "SELECT nome, tipo, raca from pets_usuario WHERE id_usu = ?";
                    PreparedStatement ps = conecta.con.prepareStatement(sql);
                    Usuario u = new Usuario();
                    u.setId_usuT(id);
                    ps.setInt(1, u.getId_usuT());
                    ResultSet rs = ps.executeQuery();
                    while(rs.next()){
                        
                        PetsUsu f1 = new PetsUsu();
                        f1.setNome(rs.getString("nome"));
                        f1.setTipo(rs.getString("tipo"));
                        f1.setDescricao(rs.getString("raca"));
                        lista.add(f1);
                    }
                }catch (SQLException e) {
                        System.out.println("Erro durante execução!" + e);  
                } 
                conecta.desconectar();
                return lista; 
   }

    public ArrayList<Exemplo> listarPetsAdocao(){
         ArrayList<Exemplo> lista = new ArrayList<>(); 
                
                try {
                    conecta.conectar();
                    String sql = "SELECT id_petdoacao, apelido_pet, p.descricao, cidade, rua, numero from pets_para_adocao as p, usuarios where situacao = true and tipo like 'Ong' and cnpj=cnpj_ong";
                    PreparedStatement ps = conecta.con.prepareStatement(sql);
                    ResultSet rs = ps.executeQuery();
                    while(rs.next()){
                        
                        Exemplo f1 = new Exemplo();
                      
                        f1.setId(rs.getInt("id_petdoacao"));
                        f1.setApelido(rs.getString("apelido_pet"));
                        f1.setDescricao(rs.getString("descricao"));
                        f1.setCidade(rs.getString("cidade"));
                        f1.setRua(rs.getString("rua"));
                        f1.setNumero(rs.getString("numero"));
                        lista.add(f1);
                    }
                }catch (SQLException e) {
                        System.out.println("Erro durante execução!" + e);  
                } 
                conecta.desconectar();
                return lista; 
   }
    
   public ArrayList<AdotarPets> listarPetsSolicitados(long cnpj){
         ArrayList<AdotarPets> lista = new ArrayList<>(); 
                
                try {
                    conecta.conectar();
                    String sql = "SELECT A.id_petdoacao_adt, A.id_usu_adt, PD.id_petdoacao FROM adotar_pets A, pets_para_adocao PD WHERE A.id_petdoacao_adt= PD.id_petdoacao and cnpj_ong=? ;";
                    PreparedStatement ps = conecta.con.prepareStatement(sql);
                    Ongs u = new Ongs();
                    u.setCnpj(cnpj);
                    ps.setLong(1, u.getCnpj());
                    ResultSet rs = ps.executeQuery();
                    while(rs.next()){                    
                        AdotarPets f1 = new AdotarPets();
                        f1.setId_petDoa(rs.getInt("id_petdoacao"));
                        f1.setId_usu(rs.getInt("id_usu_adt"));
                        lista.add(f1);
                    }
                }catch (SQLException e) {
                        System.out.println("Erro durante execução!" + e);  
                } 
                conecta.desconectar();
                return lista;
             
   }
  

    public void updatePetsAdocao(Usuario u) throws SQLException{
                try {
                    conecta.conectar();
                    String sql = "update pets_para_adocao set situacao = false, id_u_a = ? where id_petdoacao= ?";
                    PreparedStatement ps = conecta.con.prepareStatement(sql);
                    ps.setInt(1, u.getId_usuT());
                    ps.setInt(2, u.getId_pet_adotado());
                    ps.execute();
                    JOptionPane.showMessageDialog(null, "Pet solicitado para adoção");

                }catch (SQLException e) {
                        System.out.println("Erro durante execução!" + e);  
                        
                }conecta.desconectar();
    }
    public void removerTabelaDeSolicitacao(AdotarPets u) throws SQLException{
                try {
                    conecta.conectar();
                    String sql = "DELETE from adotar_pets where id_petdoacao_adt =?;";
                    PreparedStatement ps = conecta.con.prepareStatement(sql);
                    ps.setInt(1, u.getId_petDoa());
                    ps.execute();

                }catch (SQLException e) {
                        System.out.println("Erro durante execução!" + e);  
                        
                }conecta.desconectar();
    }
    
    public ArrayList<Exemplo> listarPetsAdocaoLogado(long cnpj){
         ArrayList<Exemplo> lista = new ArrayList<>(); 
                
                try {
                    conecta.conectar();
                    String sql = "SELECT apelido_pet, descricao from pets_para_adocao where situacao = true and cnpj_ong=?";
                    PreparedStatement ps = conecta.con.prepareStatement(sql);

                    ps.setLong(1, cnpj);
                    ps.execute();
                    ResultSet rs = ps.executeQuery();
                    while(rs.next()){
                        Exemplo f1 = new Exemplo();
                        f1.setApelido(rs.getString("apelido_pet"));
                        f1.setDescricao(rs.getString("descricao"));
                        lista.add(f1);
                    }
                }catch (SQLException e) {
                        System.out.println("Erro durante execução!" + e);  
                } 
                conecta.desconectar();
                return lista; 
   }
}

