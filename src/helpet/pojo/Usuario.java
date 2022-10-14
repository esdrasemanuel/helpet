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
public class Usuario{

    public int getId_usuT() {
        return id_usuT;
    }

    public void setId_usuT(int id_usuT) {
        this.id_usuT = id_usuT;
    }
    
    private int id_usuT;
    private String tipo;
    private String nome;
    private String email;
    private String senha1;
    private String dat_nas;
    private String rua;
    private String numero;
    private String estado;
    private String cidade;
    private int id_pet_adotado;

    public int getId_pet_adotado() {
        return id_pet_adotado;
    }

    public void setId_pet_adotado(int id_pet_adotado) {
        this.id_pet_adotado = id_pet_adotado;
    }

    
    //private String descricao;

    public Usuario() {
        
    }

    public String getSenha1() {
         return senha1;
        }
    
    public void setSenha1(String senha1) {
            this.senha1 = senha1;
        }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getNome() {
        return nome;
    }

  
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getEmail() {
        return email;
    }

   
    public void setEmail(String email) {
        this.email = email;
    }

   
    public String getDat_nas() {
        return dat_nas;
    }

   
    public void setDat_nas(String dat_nas) {
        this.dat_nas = dat_nas;
    }

   
    public String getRua() {
        return rua;
    }

    
    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }


    public void setNumero(String numero) {
        this.numero = numero;
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

  
    public void getSenha1(String string) {
        String password = String.valueOf(string);
        this.senha1 = password;  
    }
    
}


       



    
   

