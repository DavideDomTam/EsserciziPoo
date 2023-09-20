import java.util.*;
import Enum.*;


/** MISSION:
 * Questa classe rappresenta uno studente e gestisce i corsi da seguire e gli esami passati
 * calcolaVotoMedio() : riporta la media aritmetica degli esami dati e anche la somma dei CFU
 * iscrizioneAppello(): iscrive una studente ad un appello
 *
 */

public class Studente {
    private ArrayList<CorsoPassato> esamiPassati;
    private ArrayList<String> corsiIscritto;
    private String matricola;
    private int anno;
    private boolean inRegolaTasse;

    /**
     * Costruttore
     * @param matricola String
     * @param inRegolaTasse boolean
     * @param anno int
     * @param corsiIscritto ArrayList di stringhe
     * @param esamiPassati ArrayList di CorsoPassato
     */

    public Studente(String matricola,boolean inRegolaTasse, int anno, ArrayList<String> corsiIscritto, ArrayList<CorsoPassato> esamiPassati){
        this.esamiPassati=esamiPassati;
        this.corsiIscritto=corsiIscritto;
        this.matricola=matricola;
        this.inRegolaTasse=inRegolaTasse;
        this.anno=anno;
    }
    public boolean controlloEsameFatti(Appello appello){
        Corso checkCorso = appello.getCorso();
        Iterator<CorsoPassato> esamipassati = esamiPassati.iterator();
        while (esamipassati.hasNext()){
            CorsoPassato esame= esamipassati.next();
            if(esame.getNomeCorso()==checkCorso.getNomeCorso()){
                return false;
            }


        }
        return true;
    }
    public boolean isInRegolaTasse(){
        return inRegolaTasse;
    }
    public void setInRegolaTasse(boolean inRegolaTasse){
        this.inRegolaTasse=inRegolaTasse;
    }

    public ArrayList<CorsoPassato> getEsamiPassati() {
        return esamiPassati;
    }

    public void setEsamiPassati(ArrayList<CorsoPassato> esamiPassati) {
        this.esamiPassati = esamiPassati;
    }


    public boolean controlloCorsoBloccante(Appello appello){
        Corso corso=appello.getCorso();
        ArrayList<String> corsiBloccanti = corso.getCorsiBloccanti();

        boolean trovatoCorsoPassato=false;
        for(int i=0;i<corsiBloccanti.size();i++){
            for(int j=0;j<esamiPassati.size();j++){
                if(corsiBloccanti.get(i)==esamiPassati.get(j).getNomeCorso()){
                    trovatoCorsoPassato=true;
                    break;
                }

            }
            if(!trovatoCorsoPassato){
                return false;
            }

        }
       return true;
    }

    public void calcolaVotoMedio(){
        int CFUottenuti=0;
        double votoMedia=0;
        ArrayList<CorsoPassato> corsiPassati=getEsamiPassati();
        for(CorsoPassato corso:corsiPassati){
            CFUottenuti=CFUottenuti+corso.getCFU();
            votoMedia=votoMedia+corso.getVoto();
        }
        votoMedia=votoMedia/corsiPassati.size();
        System.out.println("Voto media "+votoMedia +"\n");
        System.out.println("CFU fatti "+CFUottenuti);
    }


    /**
     * Questa funzione premette allo studente iscritto al corso di partecipare all'appello
     * @param appello
     *
     *throw IllegalArgumentException se lo studente ha già dato l'esame
     *throw IllegalArgumentException se lo studente non è in regola con le tasse
     *throw IllegalArgumentException se lo studente non ha gli esami necessari per iscriversi a questo appello
     */
    public void iscrizioneAppello(Appello appello) throws IllegalArgumentException{
        if(!controlloEsameFatti(appello)){
            throw new IllegalArgumentException("Lo studente ha già dato l'esame");
        }
        if(!isInRegolaTasse()){
            throw new IllegalArgumentException("Lo studente non è in regola con le tasse");
        }
        if(!controlloCorsoBloccante(appello)){
            throw new IllegalArgumentException("Lo studente non ha dato gli esami necessari per iscriversi a questo appello");
        }
        appello.iscriviPersona(matricola);
    }
}
