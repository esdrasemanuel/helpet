/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpet.pojo;

import java.sql.Time;

/**
 *
 * @author esdras
 */
public class AchadosPerdidos {
    private String tipo;
    private String descricao;
    private String sexo;
    private String estado;
    private String cidade;
    private String rua;
    private int id_usuAP;
    Time tempo;

    public int getId_usuAP() {
        return id_usuAP;
    }

    public void setId_usuAP(int id_usuAP) {
        this.id_usuAP = id_usuAP;
    }
    

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    
    
}
