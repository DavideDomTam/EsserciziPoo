import java.util.ArrayList;

public class Corso {
    private String nomeCorso;
    private String nomeProfessore;
    private int CFU;
    private Integer annoCorso;
    private ArrayList<String> corsiBloccanti;

    public Corso(String nomeCorso, String nomeProfessore, int CFU, Integer annoCorso, ArrayList<String> corsiBloccanti) {
        this.nomeProfessore = nomeProfessore;
        this.CFU = CFU;
        this.nomeCorso = nomeCorso;
        this.annoCorso=annoCorso;
        this.corsiBloccanti=corsiBloccanti;
    }

    public String getNomeCorso() {
        return nomeCorso;
    }

    public void setNomeCorso(String nomeCorso) {
        this.nomeCorso = nomeCorso;
    }

    public String getNomeProfessore() {
        return nomeProfessore;
    }

    public void setNomeProfessore(String nomeProfessore) {
        this.nomeProfessore = nomeProfessore;
    }

    public int getCFU() {
        return CFU;
    }

    public void setCFU(int CFU) {
        this.CFU = CFU;
    }

    public Integer getAnnoCorso() {
        return annoCorso;
    }

    public void setAnnoCorso(int annoCorso) {
        this.annoCorso = annoCorso;
    }

    public ArrayList<String> getCorsiBloccanti() {
        return corsiBloccanti;
    }

    public void setCorsiBloccanti(ArrayList<String> corsiBloccanti) {
        this.corsiBloccanti = corsiBloccanti;
    }
}
