package br.helpet.dao;

import br.helpet.connection.ConnectionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import helpet.pojo.Exemplo;

/**
 *
 * @author Helpet
 */
public class IMDAO{
        ConnectionBD conecta = new ConnectionBD();
    public Boolean inserir(Exemplo exemplo) throws SQLException{
        conecta.conectar();
        Boolean retorno = false;
        try
        {
        PreparedStatement ps = conecta.con.prepareStatement("INSERT INTO pets_para_adocao (fotos,descricao,apelido_pet,cnpj_ong,sexo) values (?,?,?,?,?)");
            ps.setBytes(1, exemplo.getImagem());
            ps.setString(2, exemplo.getDescricao());
            ps.setString(3, exemplo.getApelido());
            ps.setLong(4, exemplo.getCnpj());
            ps.setString(5, exemplo.getSexo());
            ps.executeUpdate();
            retorno = true;
            conecta.desconectar();
        }
        catch(Exception ex)
        {
            System.out.println(ex);
            
        }
        conecta.desconectar();
        return retorno;
    
    }
    
    public Exemplo buscar(Integer id)
    {
        conecta.conectar();
        Exemplo retorno = null;
        try {
        PreparedStatement ps = conecta.con.prepareStatement("SELECT id_petdoacao, fotos from pets_para_adocao where id_petdoacao=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                retorno = new Exemplo();
                retorno.setId(rs.getInt("id_petdoacao"));
                retorno.setImagem(rs.getBytes("fotos"));
                
                
            }conecta.desconectar();
            
        } catch (Exception e) {
            e.printStackTrace();
            retorno = null;
        }
        conecta.desconectar();
        return retorno;
    
    }
    
}

