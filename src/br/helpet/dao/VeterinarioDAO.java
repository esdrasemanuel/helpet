package br.helpet.dao;

import br.helpet.connection.ConnectionBD;
import br.view.Usuario.TelaPrincipalUsu;
import helpet.pojo.Clinicas;
import helpet.pojo.MarcarAtendimento;
import helpet.pojo.Usuario;
import helpet.pojo.Veterinario;
import helpet.pojo.WikiPosts;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class VeterinarioDAO {
    ConnectionBD conecta = new ConnectionBD();
    public void listarPost(){
        try {
        TelaPrincipalUsu t = new TelaPrincipalUsu();
        PreparedStatement ps = conecta.con.prepareStatement("Select * from usuarios");
        ps.executeUpdate();
        ps.close();
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "erro"+e);
    }
     conecta.desconectar();
 }

    
    public void postarWiki(WikiPosts novoups){
                conecta.conectar();
		try {
                        PreparedStatement ps = conecta.con.prepareStatement("insert into wiki_posts (titulo,descricao, crmv) values (?, ?, ?)");
			ps.setString(1, novoups.getTitulo());
                        ps.setString(2, novoups.getDescricao());
                        ps.setLong(3, novoups.getCrmv());
			ps.execute();
                        System.out.println("Post adicionado com sucesso!");
                        JOptionPane.showMessageDialog(null, "Post adicionado com sucesso!");
		} catch (SQLException e) {
                    System.out.println("Erro durante execução!"+e);
		}conecta.desconectar();
               
                
	} 
    
    public List<WikiPosts> read(){
        conecta.conectar();
        List<WikiPosts> pro = new ArrayList<>();
        try{
            
           PreparedStatement ps = conecta.con.prepareStatement("Select * from wiki_posts");
           ps.executeQuery();
           
           while(conecta.rts.next()){
               WikiPosts wp = new WikiPosts();
               wp.setTitulo(conecta.rts.getString("titulo"));
               wp.setDescricao(conecta.rts.getString("descricao"));
               pro.add(wp);
               
           }
        }catch(Exception e){
            
        }conecta.desconectar();
        return pro;
    }
    
    public ArrayList<WikiPosts> listarP(){
         ArrayList<WikiPosts> lista = new ArrayList<>(); 
                
                try {
                    conecta.conectar();
                    String sql = "select crmv, titulo, descricao from wiki_posts";
                    PreparedStatement ps = conecta.con.prepareStatement(sql);
                    ResultSet rs = ps.executeQuery();
                    while(rs.next()){
                        
                        WikiPosts f1 = new WikiPosts();
                        f1.setCrmv(rs.getLong("crmv"));
                        f1.setTitulo(rs.getString("titulo"));
                        f1.setDescricao(rs.getString("descricao"));
                        lista.add(f1);
                    }
                }catch (SQLException e) {
                        System.out.println("Erro durante execução!" + e);  
                }conecta.desconectar(); 
                return lista; 
   }
   public ArrayList<Clinicas> listarClinicas(int crmv){
         ArrayList<Clinicas> lista = new ArrayList<>(); 
                
                try {
                    conecta.conectar();
                    String sql = "SELECT cv.nome, cv.descricao from clinicas_vet as cv where crmv_cv in (select crmv from usuarios where crmv = ?)";
                    PreparedStatement ps = conecta.con.prepareStatement(sql);
                    Veterinario v = new Veterinario();
                    v.setCRMV(crmv);
                    ps.setInt(1, v.getCRMV());
                    ps.executeQuery();
                    ResultSet rs = ps.executeQuery();
                    
                    while(rs.next()){
                        
                        Clinicas f1 = new Clinicas();
                        f1.setNome(rs.getString("nome"));
                        f1.setDescricao(rs.getString("descricao"));
                        lista.add(f1);
                    }
                }catch (SQLException e) {
                        System.out.println("Erro durante execução!" + e);  
                }conecta.desconectar();
                return lista; 
   }
   public void addClinicas(Clinicas novacli){
                conecta.conectar();
		try {
                        PreparedStatement ps = conecta.con.prepareStatement("insert into clinicas_vet (nome,descricao,cidade,estado,rua,numero,crmv_cv,bairro) values (?,?, ?, ?,?,?,?,?)");
			ps.setString(1, novacli.getNome());
                        ps.setString(2, novacli.getDescricao());
                        ps.setString(3, novacli.getCidade());
                        ps.setString(4, novacli.getEstado());
                        ps.setString(5, novacli.getRua());
                        ps.setString(6, novacli.getNumero());
                        ps.setLong(7, novacli.getCrmv_cv());
                        ps.setString(8, novacli.getBairro());
			ps.execute();
                        JOptionPane.showMessageDialog(null, "Clínica adicionado com sucesso!");
		} catch (SQLException e) {
                    System.out.println("Erro durante execução!"+e);
		}conecta.desconectar();         
    }
   public ArrayList<MarcarAtendimento> listarSoliAtendimento(int id_cli){
         ArrayList<MarcarAtendimento> lista = new ArrayList<>(); 
                
                try {
                    conecta.conectar();
                    String sql = "SELECT id_usu_s, id_clinica FROM solicitar_atendimento where id_clinica = ? and id_usu_s not in (select id_usu_atd from marcar_atendimento_vet)";
                    PreparedStatement ps = conecta.con.prepareStatement(sql);
                    Clinicas u = new Clinicas();
                    u.setId_clinica(id_cli);
                    ps.setLong(1, u.getId_clinica());
                    
                    ResultSet rs = ps.executeQuery();
                    while(rs.next()){
                        MarcarAtendimento f1 = new MarcarAtendimento();
                        f1.setId_usu_atd(rs.getInt("id_usu_s"));
                        f1.setId_clinica_atd(rs.getInt("id_clinica"));
                        
                        lista.add(f1);
                    }
                }catch (SQLException e) {
                        System.out.println("Erro durante execução!" + e);  
                } conecta.desconectar();
                return lista; 
   }
   public ArrayList<Clinicas> listarTodasClinicas(){
        ArrayList<Clinicas> lista = new ArrayList<>(); 
                
                try {
                    conecta.conectar();
                    String sql = "select id_clinica, nome, descricao,rua,estado,cidade,bairro,numero from clinicas_vet;";
                    PreparedStatement ps = conecta.con.prepareStatement(sql);
                    ps.executeQuery();
                    ResultSet rs = ps.executeQuery();
                    
                    while(rs.next()){
                        
                        Clinicas f1 = new Clinicas();
                        f1.setId_clinica(rs.getInt("id_clinica"));
                        f1.setNome(rs.getString("nome"));
                        f1.setDescricao(rs.getString("descricao"));
                        f1.setRua(rs.getString("rua"));
                        f1.setCidade(rs.getString("cidade"));
                        f1.setBairro(rs.getString("bairro"));
                        f1.setEstado(rs.getString("estado"));
                        f1.setNumero(rs.getString("numero"));
                        
                        lista.add(f1);
                        
                    }
                }catch (SQLException e) {
                        System.out.println("Erro durante execução!" + e);  
                } conecta.desconectar();
                return lista; 
      }
   
   public void marcaAtend(MarcarAtendimento novacli){
                conecta.conectar();
		try {
                        PreparedStatement ps = conecta.con.prepareStatement("insert into marcar_atendimento_vet (data_atd,id_clinica_atd,id_usu_atd,hora,confimacao) values (?,?,?,?,?)");
			ps.setDate(1, novacli.getData_atd());
                        ps.setInt(2, novacli.getId_clinica_atd());
                        ps.setInt(3, novacli.getId_usu_atd());
                        ps.setDouble(4, novacli.getHora());
                        ps.setBoolean(5, true);
			ps.execute();
                        JOptionPane.showMessageDialog(null, "Atendimento marcado com sucesso!");
		} catch (SQLException e) {
                    System.out.println("Erro durante execução!"+e);
		}conecta.desconectar();         
    }
   public long buscarClinicasID(int crmv){
        conecta.conectar();
        
        int Id_clinica = 0;
        try {
            PreparedStatement ps  = conecta.con.prepareStatement("SELECT crmv, id_clinica FROM usuarios u, clinicas_vet cv WHERE crmv=? and  cv.crmv_cv=u.crmv");
            ps.setInt(1, crmv);
            
            ResultSet rs;
            rs = ps.executeQuery();
            if (rs.next()) {
                String user = rs.getString("crmv");
                int id_cnpj = rs.getInt("id_clinica");
                Id_clinica = id_cnpj;
 
                System.out.println(Id_clinica);
            } else {
                ps.close();
                return Id_clinica;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        conecta.desconectar();
        return Id_clinica;
    }
   
   public void SolicitarAtend(MarcarAtendimento novacli){
                conecta.conectar();
		try {
                        PreparedStatement ps = conecta.con.prepareStatement("insert into solicitar_atendimento (id_clinica,id_usu_s) values (?,?)");
                        ps.setInt(1, novacli.getId_clinica_atd());
                        ps.setInt(2, novacli.getId_usu_atd());
			ps.execute();
                        JOptionPane.showMessageDialog(null, "Atendimento Solicitado com sucesso!");
		} catch (SQLException e) {
                    System.out.println("Erro durante execução!"+e);
		}conecta.desconectar();         
    }
   
      public ArrayList<MarcarAtendimento> listarAtendimentosMarcados(int id){
        ArrayList<MarcarAtendimento> lista = new ArrayList<>(); 
                
                try {
                    conecta.conectar();
                    String sql = "select data_atd,hora,nome from marcar_atendimento_vet, clinicas_vet where id_usu_atd= ? and id_clinica_atd = id_clinica;";
                    PreparedStatement ps = conecta.con.prepareStatement(sql); 
                    Usuario u = new Usuario();
                    u.setId_usuT(id);
                    ps.setLong(1, u.getId_usuT());
                    ps.execute();
                    System.out.println(id);
                    ResultSet rs = ps.executeQuery();
                    
                    while(rs.next()){

                        MarcarAtendimento f1 = new MarcarAtendimento();
                        f1.setData_atd(rs.getString("data_atd"));
                        f1.setHora(rs.getDouble("hora"));
                        f1.setNome_cli(rs.getString("nome"));
                        lista.add(f1);
                        
                    }
                }catch (SQLException e) {
                        System.out.println("Erro durante execução!" + e);  
                } conecta.desconectar();
                return lista; 
      }
}
    
  

