package br.helpet.dao;
import br.helpet.connection.ConnectionBD;
import br.view.Usuario.TelaCadPetshops;
import helpet.pojo.AchadosPerdidos;
import helpet.pojo.AdotarPets;
import helpet.pojo.Denuncias;
import helpet.pojo.Ongs;
import helpet.pojo.Petshops;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import helpet.pojo.Usuario;
import helpet.pojo.Veterinario;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 * @author Helpet
 */
public class UsuariosDAO {
    ConnectionBD conecta = new ConnectionBD();
  
     public void adicionarVet(Veterinario novousuario){
                conecta.conectar();
		try { 
                  String sql = "insert into usuarios (nome,email,senha,data_nas,rua,numero,estado,cidade,tipo,crmv,especialidades) values ( ?,?,?, ?, ?, ?, ?, ?, ?,?,?)";
                    try (PreparedStatement ps = conecta.con.prepareStatement(sql)) {
                        ps.setString(1, novousuario.getNome());
                        ps.setString(2, novousuario.getEmail());
                        ps.setString(3, novousuario.getSenha1());
                        ps.setString(4, novousuario.getDat_nas());
                        ps.setString(5, novousuario.getRua());
                        ps.setString(6, novousuario.getNumero());
                        ps.setString(7, novousuario.getEstado());
                        ps.setString(8, novousuario.getCidade());
                        ps.setString(9, novousuario.getTipo());
                        ps.setLong(10, novousuario.getCRMV());
                        ps.setString(11, novousuario.getEspecialidades());
                        ps.execute();
                        ps.close();
                    }
                        System.out.println("Adicionado com sucesso!");
                    } catch (SQLException e) {
                        System.out.println("Erro durante execução!" + e);             
                    }
	}
    public void adicionarU(Usuario novousuario){
               conecta.conectar();
		try {
			String sql = "insert into usuarios (nome,email, senha, data_nas,rua,numero,estado,cidade,tipo) values ( ?, ?, ?, ?, ?, ?, ?,?,?)";
                   try (PreparedStatement ps = conecta.con.prepareStatement(sql)) {
                       ps.setString(1, novousuario.getNome());
                       ps.setString(2, novousuario.getEmail());
                       ps.setString(3, novousuario.getSenha1());
                       ps.setString(4, novousuario.getDat_nas());
                       ps.setString(5, novousuario.getRua());
                       ps.setString(6, novousuario.getNumero());
                       ps.setString(7, novousuario.getEstado());
                       ps.setString(8, novousuario.getCidade());
                       ps.setString(9, novousuario.getTipo());
                       ps.execute();
                       ps.close();
                   }
                        System.out.println("Adicionado com sucesso!");
                    } catch (SQLException e) {
                        System.out.println("Erro durante execução!"+ e);               
		}
	}  
    
     public void adicionarOng(Ongs novousuario){
               conecta.conectar();
		try {
			String sql = "insert into usuarios (nome,email, senha, data_nas,rua,numero,estado,cidade,tipo,cnpj,descricao) values ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                   try (PreparedStatement ps = conecta.con.prepareStatement(sql)) {
                       ps.setString(1, novousuario.getNome());
                       ps.setString(2, novousuario.getEmail());
                       ps.setString(3, novousuario.getSenha1());
                       ps.setString(4, novousuario.getDat_nas());
                       ps.setString(5, novousuario.getRua());
                       ps.setString(6, novousuario.getNumero());
                       ps.setString(7, novousuario.getEstado());
                       ps.setString(8, novousuario.getCidade());
                       ps.setString(9, novousuario.getTipo());
                       ps.setLong(10, novousuario.getCnpj());
                       ps.setString(11, novousuario.getDescricao());
                       ps.execute();
                       ps.close();
                   }
                        System.out.println(" Ong adicionada com sucesso!");
                    } catch (SQLException e) {
                        System.out.println("Erro durante execução!"+ e);   
		}
	} 
    
       
    public boolean consultar(String login, String senha) {
        conecta.conectar();
        boolean autenticado = false;
        try {
            PreparedStatement ps  = conecta.con.prepareStatement(
            "SELECT email, senha FROM usuarios WHERE email=? and senha=?");
            ps.setString(1, login);
            ps.setString(2, senha);
            ResultSet rs;
            rs = ps.executeQuery();
            
            if (rs.next()) {
                String user = rs.getString("email");
                String pass = rs.getString("senha");
                autenticado = true;
            
            }else{
                ps.close();
                return autenticado;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }conecta.desconectar();
        return autenticado;  
    }
    public int buscaidU(String login, String senha){
        conecta.conectar();
        
        int id_usuario;
        id_usuario = 0;
        try {
            PreparedStatement ps  = conecta.con.prepareStatement("SELECT email, senha, id_usu,crmv FROM usuarios WHERE email=? and senha=?");
            ps.setString(1, login);
            ps.setString(2, senha);
            ResultSet rs;
            rs = ps.executeQuery();
            if (rs.next()) {
                String user = rs.getString("email");
                String pass = rs.getString("senha");
                int id_usu = rs.getInt("id_usu");
                id_usuario = id_usu;
            } else {
                ps.close();
                return id_usuario;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        conecta.desconectar();
        return id_usuario;
       
    }
    
    public void adicionarPetshops(Petshops novoups){
                conecta.conectar();
		try {
                        TelaCadPetshops usu = new TelaCadPetshops ();
                        PreparedStatement ps = conecta.con.prepareStatement("insert into petshops (nome,descricao,cidade,cep,rua,estado,numero,bairro,telefone,id_usu_ps) values (?, ?, ?, ?, ?, ?, ?, ?)");
			ps.setString(1, novoups.getNome());
			ps.setString(2, novoups.getDescricao());
			ps.setString(3, novoups.getCidade());
                        ps.setObject(4, novoups.getCep());
                        ps.setObject(5, novoups.getEndereco());
                        ps.setObject(6, novoups.getEstado());
                        ps.setObject(7, novoups.getNumero());
                        ps.setObject(8, novoups.getBairro());
                        ps.setObject(9, novoups.getTelefone());
                        ps.setObject(10, novoups.getId_usu_ps());
			ps.execute();
                        System.out.println("PETSHOP adicionado com sucesso!");
                        JOptionPane.showMessageDialog(null, "Petshop adicionado com sucesso!");
		} catch (SQLException e) {
                    System.out.println("Erro durante execução!"+e);
		}conecta.desconectar();
	}  
    public int buscaicrmv(String login, String senha){
        conecta.conectar();
        
        int crmv;
        crmv = 0;
        try {
            PreparedStatement ps  = conecta.con.prepareStatement("SELECT email,senha,crmv FROM usuarios WHERE email=? and senha=?");
            ps.setString(1, login);
            ps.setString(2, senha);

            ResultSet rs;
            rs = ps.executeQuery();
            if (rs.next()) {
                String user = rs.getString("email");
                String pass = rs.getString("senha");
                int id_crmv = rs.getInt("CRMV");
                crmv = id_crmv;
 
                System.out.println(crmv);
                
            } else {
                ps.close();
                return crmv;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        conecta.desconectar();
        return crmv;
       
    }
    
    public String buscaTipo(String login, String senha){
        conecta.conectar();
        
        String id_usuario = " ";
        try {
            PreparedStatement ps  = conecta.con.prepareStatement("SELECT email, senha, id_usu, tipo FROM usuarios WHERE email=? and senha=?");
            ps.setString(1, login);
            ps.setString(2, senha);

            ResultSet rs;
            rs = ps.executeQuery();
            if (rs.next()) {
                String user = rs.getString("email");
                String pass = rs.getString("senha");
                String id_usu = rs.getString("tipo");
                id_usuario = id_usu;
                
                
            } else {
                ps.close();
                return id_usuario;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        conecta.desconectar();
        return id_usuario;
       
    }
    
    public long buscaiCnpj(String login, String senha){
        conecta.conectar();
        
        long cnpj = 0;
        try {
            PreparedStatement ps  = conecta.con.prepareStatement("SELECT email,senha,cnpj FROM usuarios WHERE email=? and senha=?");
            ps.setString(1, login);
            ps.setString(2, senha);

            ResultSet rs;
            rs = ps.executeQuery();
            if (rs.next()) {
                String user = rs.getString("email");
                String pass = rs.getString("senha");
                long id_cnpj = rs.getLong("cnpj");
                cnpj = id_cnpj;
                
                System.out.println(cnpj);
            } else {
                ps.close();
                return cnpj;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        conecta.desconectar();
        return cnpj;
       
    }
     
    public ArrayList<Petshops> listarPetshops(){
         ArrayList<Petshops> lista = new ArrayList<>();
            try {
                conecta.conectar();
                String sql = "SELECT nome, descricao, cidade, telefone, estado FROM petshops";
                PreparedStatement ps = conecta.con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    Petshops p1 = new Petshops();
                    p1.setNome(rs.getString("nome"));
                    p1.setDescricao(rs.getString("descricao"));
                    p1.setCidade(rs.getString("cidade"));
                    p1.setTelefone(rs.getString("telefone"));
                    p1.setEstado(rs.getString("estado"));
                    lista.add(p1);
                    
                }
            }catch (SQLException e) {
                System.out.println("Erro durante execução!" + e);  
            } 
            conecta.desconectar();
            return lista; 
    }
    
   public void AdotarPet(AdotarPets petAdoc){
        conecta.conectar();
		try {

                        PreparedStatement ps = conecta.con.prepareStatement("insert into adotar_pets (id_petdoacao_adt, id_usu_adt) values (?,?)");
			ps.setInt(1, petAdoc.getId_petDoa());
			ps.setInt(2, petAdoc.getId_usu());
			ps.execute();
                        System.out.println("Parabéns, você adotou um Pet com sucesso!");
                        JOptionPane.showMessageDialog(null, "PET Solicitado para Adoção, vá ate a ong e retire!");
                              
		} catch (SQLException e) {
                    System.out.println("Erro durante execução!"+e);
		}conecta.desconectar();
	} 

    public void adicionarDenuncias(Denuncias novoups){
                conecta.conectar();
		try {
                        TelaCadPetshops usu = new TelaCadPetshops ();
                        PreparedStatement ps = conecta.con.prepareStatement("insert Denuncias (descricao,cidade,estado,id_usu_d,estado,titulo) values (?, ?, ?, ?, ?, ?)");
			ps.setString(1, novoups.getDescricao());
			ps.setString(2, novoups.getCidade());
                        ps.setString(3, novoups.getEstado());
                        ps.setInt(4, novoups.getId_usuD());
                        ps.setString(5, novoups.getEstado());
                        ps.setString(6, novoups.getTitulo());
			ps.execute();
                        System.out.println("Denúncia adicionada com sucesso!");
                        JOptionPane.showMessageDialog(null, "Denúncia adicionada com sucesso!");
                        conecta.desconectar();
		} catch (SQLException e) {
                    System.out.println("Erro durante execução!"+e);
		}conecta.desconectar();
	}  
    
    public String buscarNomeU(String login, String senha){
        conecta.conectar();
        
        String nome_usuario = "";
        
        try {
            PreparedStatement ps  = conecta.con.prepareStatement("SELECT email, senha, nome FROM usuarios WHERE email=? and senha=?");
            ps.setString(1, login);
            ps.setString(2, senha);
            ResultSet rs;
            rs = ps.executeQuery();
            if (rs.next()) {
                String user = rs.getString("email");
                String pass = rs.getString("senha");
                String nome_usu = rs.getString("nome");
                nome_usuario = nome_usu;
            } else {
                ps.close();
                return nome_usuario;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        conecta.desconectar();
        return nome_usuario; 
    }
    
    public ArrayList<Denuncias> verDenuncias(){
         ArrayList<Denuncias> lista = new ArrayList<>();
            try {
                conecta.conectar();
                String sql = "SELECT titulo,descricao,cidade,rua,estado FROM denuncias";
                PreparedStatement ps = conecta.con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    Denuncias p1 = new Denuncias();
                    p1.setTitulo(rs.getString("titulo"));
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
    public ArrayList<AchadosPerdidos> verPerdidos(){
         ArrayList<AchadosPerdidos> lista = new ArrayList<>();
            try {
                conecta.conectar();
                String sql = "SELECT tipo,sexo,descricao,cidade,rua,estado FROM achados_perdidos where tipo like 'Perdido'";
                PreparedStatement ps = conecta.con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    AchadosPerdidos p1 = new AchadosPerdidos();
                    p1.setSexo(rs.getString("sexo"));
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
    
    public ArrayList<AchadosPerdidos> verAchados(){
         ArrayList<AchadosPerdidos> lista = new ArrayList<>();
            try {
                conecta.conectar();
                String sql = "SELECT tipo,sexo,descricao,cidade,rua,estado FROM achados_perdidos where tipo like 'Achado'";
                PreparedStatement ps = conecta.con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    AchadosPerdidos p1 = new AchadosPerdidos();
                    p1.setSexo(rs.getString("sexo"));
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
        

