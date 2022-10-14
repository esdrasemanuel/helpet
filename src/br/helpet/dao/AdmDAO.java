
package br.helpet.dao;

import br.adm.PojoR3Qtd_Pet;
import br.adm.PojoR4Mes;
import br.adm.PojoR5Qtd;
import br.adm.pojoR2Qtd_Cad;
import br.adm.pojoRDoacao;
import br.helpet.connection.ConnectionBD;
import helpet.pojo.Clinicas;
import helpet.pojo.MarcarAtendimento;
import helpet.pojo.PetsUsu;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Helpet
 */
public class AdmDAO {
    ConnectionBD conecta = new ConnectionBD();
     public ArrayList<MarcarAtendimento> exibirUsuariosMarcoAtendimento(String nome){
         ArrayList<MarcarAtendimento> lista = new ArrayList<>(); 
                
                try {
                    conecta.conectar();
                    String sql = "select u.nome from solicitar_atendimento s, usuarios u, clinicas_vet c where id_usu_s = u.id_usu and s.id_clinica=c.id_clinica and c.nome = ?;";
                    PreparedStatement ps = conecta.con.prepareStatement(sql);
                    Clinicas u = new Clinicas();
                    u.setNome(nome);
                    ps.setString(1, u.getNome());
                    
                    ResultSet rs = ps.executeQuery();
                    while(rs.next()){
                        
                        MarcarAtendimento f1 = new MarcarAtendimento();
                        f1.setNome(rs.getString("nome"));
                        lista.add(f1);
                    }
                }catch (SQLException e) {
                        System.out.println("Erro durante execução!" + e); 
                        conecta.desconectar();
                } 
                conecta.desconectar();
                return lista; 
   }
     
     public ArrayList<MarcarAtendimento> Relatorio1Atendimento(String nome){
         ArrayList<MarcarAtendimento> lista = new ArrayList<>(); 
                
                try {
                    conecta.conectar();
                    String sql = "select u.nome,  from marcar_atendimento s, usuarios u, clinicas_vet c "
                            + "where id_usu_s = u.id_usu and s.id_clinica=c.id_clinica and c.nome = ?;";
                    PreparedStatement ps = conecta.con.prepareStatement(sql);
                    Clinicas u = new Clinicas();
                    u.setNome(nome);
                    ps.setString(1, u.getNome());
                    
                    ResultSet rs = ps.executeQuery();
                    while(rs.next()){
                        
                        MarcarAtendimento f1 = new MarcarAtendimento();
                        f1.setNome(rs.getString("nome"));
                     
                        lista.add(f1);
                    }
                    conecta.desconectar();
                }catch (SQLException e) {
                        System.out.println("Erro durante execução!" + e); 
                        conecta.desconectar();
                } 
                conecta.desconectar();
                return lista; 
                
   }
     public ArrayList<pojoRDoacao> Relatorio1MediaDoa(){
         ArrayList<pojoRDoacao> lista = new ArrayList<>(); 
                try {
                    conecta.conectar();
                    String sql = "select a.estado, a.ano_2016, b.ano_2016 as ano_2017 from media_2016 a join media_2017 b on a.estado=b.estado";
                    PreparedStatement ps = conecta.con.prepareStatement(sql);
                    ResultSet rs = ps.executeQuery();
                    while(rs.next()){
                        
                        pojoRDoacao r = new pojoRDoacao();
                        r.setValor(rs.getDouble("ano_2016"));
                        r.setMaximo(rs.getDouble("ano_2017"));
                        r.setEstado(rs.getString("estado"));
                        lista.add(r);
                    }
                }catch (SQLException e) {
                        System.out.println("Erro durante execução!" + e);  
                } return lista; 
   }
    public ArrayList<pojoR2Qtd_Cad> Relatorio2QtdCad(){
         ArrayList<pojoR2Qtd_Cad> lista = new ArrayList<>(); 
                try {
                    conecta.conectar();
                    String sql = "select A.estado, A.qtd_usu,B.qtd_vet,C.qtd_ong,(A.qtd_usu/B.qtd_vet) as qtd_usu_por_vet from  qtd_usu1 A, qtd_vet B, qtd_ong C where A.estado = B.estado and  B.estado = C.estado ";
                    PreparedStatement ps = conecta.con.prepareStatement(sql);
                    ResultSet rs = ps.executeQuery();
                    while(rs.next()){
                        
                        pojoR2Qtd_Cad r = new pojoR2Qtd_Cad();
                        r.setEstado(rs.getString("estado"));
                        r.setQtd_usu(rs.getDouble("qtd_usu"));
                        r.setQtd_vet(rs.getDouble("qtd_vet"));
                        r.setQtd_ong(rs.getDouble("qtd_ong"));
                        r.setMedia(rs.getDouble("qtd_usu_por_vet"));
                        lista.add(r);
                    }
                }catch (SQLException e) {
                        System.out.println("Erro durante execução!" + e);  
                } return lista; 
   }
   public ArrayList<PojoR3Qtd_Pet> Relatorio3QtdPet(){
         ArrayList<PojoR3Qtd_Pet> lista = new ArrayList<>(); 
                try {
                    conecta.conectar();
                    String sql = "select  u.estado, p.tipo, count(id_pet) as qtd from pets_usuario p join usuarios u on u.id_usu =p.id_usu  group by p.tipo, u.estado order by 1";
                    PreparedStatement ps = conecta.con.prepareStatement(sql);
                    ResultSet rs = ps.executeQuery();
                    while(rs.next()){
                        
                        PojoR3Qtd_Pet r = new PojoR3Qtd_Pet();
                        r.setEstado(rs.getString("estado"));
                        r.setTipo(rs.getString("tipo"));
                        r.setQtd_pet(rs.getDouble("qtd"));
                        lista.add(r);
                    }
                }catch (SQLException e) {
                        System.out.println("Erro durante execução!" + e);  
                } return lista; 
   }
   public ArrayList<PojoR4Mes> Relatorio4QtdMes(){
         ArrayList<PojoR4Mes> lista = new ArrayList<>(); 
                try {
                    conecta.conectar();
                    String sql = "select * from atd_mes";
                    PreparedStatement ps = conecta.con.prepareStatement(sql);
                    ResultSet rs = ps.executeQuery();
                    while(rs.next()){
                        
                        PojoR4Mes r = new PojoR4Mes();
                        r.setEstado(rs.getString("nome"));
                        r.setJan(rs.getInt("jan"));
                        r.setFev(rs.getInt("fev"));
                        r.setMar(rs.getInt("mar"));
                        r.setAbr(rs.getInt("abr"));
                        r.setMaio(rs.getInt("mai"));
                        r.setJun(rs.getInt("jun"));
                        r.setJul(rs.getInt("jul"));
                        r.setAgo(rs.getInt("ago"));
                        r.setOut(rs.getInt("outu"));
                        r.setSet(rs.getInt("sete"));
                        r.setNov(rs.getInt("nov"));
                        r.setDez(rs.getInt("dez"));
                        lista.add(r);
                    }
                }catch (SQLException e) {
                        System.out.println("Erro durante execução!" + e);  
                } return lista; 
   }
   public ArrayList<PojoR5Qtd> Relatorio5DisAdo(){
         ArrayList<PojoR5Qtd> lista = new ArrayList<>(); 
                try {
                    conecta.conectar();
                    String sql = "select a.estado, a,b from adotado a, dispo b where a.estado=b.estado";
                    PreparedStatement ps = conecta.con.prepareStatement(sql);
                    ResultSet rs = ps.executeQuery();
                    while(rs.next()){
                        
                        PojoR5Qtd r = new PojoR5Qtd();
                        r.setEstado(rs.getString("estado"));
                        r.setAdotado(rs.getInt("a"));
                        r.setDispo(rs.getInt("b"));
                       
                        lista.add(r);
                    }
                }catch (SQLException e) {
                        System.out.println("Erro durante execução!" + e);  
                } return lista; 
   }
   
   public ArrayList<PetsUsu> CountPetsCad(){
         ArrayList<PetsUsu> lista = new ArrayList<>(); 
            try {
                conecta.conectar();
                String sql = "select count(id_usu) from usuarios where id_usu in "
                        + "(select id_usu from pets_usuario)";
                PreparedStatement ps = conecta.con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){  
                    PetsUsu r = new PetsUsu();
                    r.setQtd(rs.getDouble("count"));
                    lista.add(r);
                }
            }catch (SQLException e) {
                    System.out.println("Erro durante execução!" + e);  
            } return lista; 
   }
   
}
     
