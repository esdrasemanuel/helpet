/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpet.pojo;

import java.sql.Date;

/**
 *
 * @author esdras
 */
public class AdotarPets {
    private int id_usu;
    private int id_petDoa;
    private Date data;

    public int getId_usu() {
        return id_usu;
    }

    public void setId_usu(int id_usu) {
        this.id_usu = id_usu;
    }

    public int getId_petDoa() {
        return id_petDoa;
    }

    public void setId_petDoa(int id_petDoa) {
        this.id_petDoa = id_petDoa;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    
    
}
