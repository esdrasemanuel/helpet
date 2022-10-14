/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpet.pojo;

/**
 *
 * @author esdras
 */
public class ContaOngs {
    private String nome;
    private long cnpj_ong;
    private int agencia;
    private int conta;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCnpj_ong() {
        return cnpj_ong;
    }

    public void setCnpj_ong(long cnpj_ong) {
        this.cnpj_ong = cnpj_ong;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }
    
}
