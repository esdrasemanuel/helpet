/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpet.pojo;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author esdras
 */
public class Doacao {
  private int id_doacao;
  private int id_usu_doa;
  private double valor;
  private long cnpj_doa;
  private Date data;
  
  

    public int getId_doacao() {
        return id_doacao;
    }

    public void setId_doacao(int id_doacao) {
        this.id_doacao = id_doacao;
    }

    public int getId_usu_doa() {
        return id_usu_doa;
    }

    public void setId_usu_doa(int id_usu_doa) {
        this.id_usu_doa = id_usu_doa;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public long getCnpj_doa() {
        return cnpj_doa;
    }

    public void setCnpj_doa(long cnpj_doa) {
        this.cnpj_doa = cnpj_doa;
    }
    
    public DateFormat getFormato() {
        return formato;
    }

    public void setFormato(DateFormat formato) {
        this.formato = formato;
    }
    
    DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    
    public void setData_doa(String datadoa){
        try{
            this.data = new Date(formato.parse(datadoa).getTime());
        }catch (ParseException ex){
            JOptionPane.showMessageDialog(null, "Data invalida");
        }
    }
    
    public String getData_atdString(){
        return formato.format(this.data);
    }
  
  
}
