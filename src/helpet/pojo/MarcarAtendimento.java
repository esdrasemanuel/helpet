/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpet.pojo;

import java.sql.Date;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author esdras
*/

public class MarcarAtendimento {
  private int id_atd;
  private int id_usu_atd;
  private int id_clinica_atd;
  private String nome_cli;
  private Date data_atd;
  private double hora;
  private boolean confimacao;
  private String nome;

    public double getHora() {
        return hora;
    }

    public void setHora(double hora) {
        this.hora = hora;
    }
  

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
  

    public int getId_atd() {
        return id_atd;
    }

    public void setId_atd(int id_atd) {
        this.id_atd = id_atd;
    }

    public int getId_usu_atd() {
        return id_usu_atd;
    }

    public void setId_usu_atd(int id_usu_atd) {
        this.id_usu_atd = id_usu_atd;
    }

    public int getId_clinica_atd() {
        return id_clinica_atd;
    }

    public void setId_clinica_atd(int id_clinica_atd) {
        this.id_clinica_atd = id_clinica_atd;
    }

    public String getNome_cli() {
        return nome_cli;
    }

    public void setNome_cli(String descricao) {
        this.nome_cli = descricao;
    }

    public Date getData_atd() {
        return data_atd;
    }


    public boolean isConfimacao() {
        return confimacao;
    }

    public void setConfimacao(boolean confimacao) {
        this.confimacao = confimacao;
    }
  
    public DateFormat getFormato() {
        return formato;
    }

    public void setFormato(DateFormat formato) {
        this.formato = formato;
    }
    
    DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    
    public void setData_atd(String dataNasc){
        try{
            this.data_atd = new Date(formato.parse(dataNasc).getTime());
        }catch (ParseException ex){
            JOptionPane.showMessageDialog(null, "Data invalida");
        }
    }
    
    public String getData_atdString(){
        return formato.format(this.data_atd);
    }
    
    ////hora
  
  
}
