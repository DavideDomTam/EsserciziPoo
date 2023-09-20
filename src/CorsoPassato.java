import Enum.*;

import java.util.ArrayList;

public class CorsoPassato extends Corso{
    private int voto;
    private String giudizio;

    public CorsoPassato(int voto, String giudizio, String nomeCorso, int CFU, String nomeProfessore){
        super( nomeCorso, nomeProfessore, CFU,null, null);
        this.giudizio=giudizio;
        this.voto=voto;
    }


    public int getVoto() {
        return voto;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }

    public String getGiudizio() {
        return giudizio;
    }

    public void setGiudizio(String giudizio) {
        this.giudizio = giudizio;
    }
}
