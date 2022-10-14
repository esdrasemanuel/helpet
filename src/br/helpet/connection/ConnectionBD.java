/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.helpet.connection;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author esdras
 */
public class ConnectionBD {
   public Statement stm;
   public ResultSet rts;
   private String driver = "org.postgresql.Driver;";
   private String caminho = "jdbc:postgresql://localhost:5432/Helpet";
   private String usuario = "postgres";
   private String senha = "postgres";
   public Connection con;
   
   public void conectar(){
       
       try {
           System.setProperty("jdbc.Drivers", driver);
           con=DriverManager.getConnection(caminho, usuario, senha);
           System.out.println("CONECTADO");
       } catch (SQLException ex) {
         JOptionPane.showMessageDialog(null, "Não conectado!\n"+ ex);
      }
   }
   
   public void desconectar(){
       try {
           con.close();
           System.out.println("BANCO desconectado com sucesso!");
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "erro ao fechar conexão com bd!\n"+ ex);
       }
   }     
}
