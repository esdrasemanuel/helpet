package helpet.pojo;

import java.sql.Array;
import javax.swing.JTextField;

/**
 * @author helpet
 */
public class Veterinario extends Usuario {
    private int CRMV;
    private String especialidades;
    private String pesquisa;
    
     public Veterinario() {
    }

    public String getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(String especialidades) {
        this.especialidades = especialidades;
    }
  
    public int getCRMV() {
        return CRMV;
    }

    public void setCRMV(int CRMV) {
        this.CRMV = CRMV;
    }

    /**
     * @return the pesquisa
     */
    public String getPesquisa() {
        return pesquisa;
    }

    /**
     * @param pesquisa the pesquisa to set
     */
    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }
      
}
