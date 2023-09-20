import java.util.*;

import Enum.*;

/** MISSION questa classe serve a tenere conto di quali studenti sono iscritti ad un certo appello di un corso
 *
 */
public class Appello {
    private Corso corso;
    private ArrayList<String> studentiIscrittiAppello;
    private TipologiaAppello tipologiaAppello;
    private TipologiaEsame tipoEsame;
    private String dataAppello;

    public Appello(Corso corso, TipologiaAppello tipologiaAppello, TipologiaEsame tipoEsame, String dataAppello, ArrayList<String> studentiIscrittiAppello){
        this.corso=corso;
        this.studentiIscrittiAppello=studentiIscrittiAppello;
        this.tipologiaAppello=tipologiaAppello;
        this.tipoEsame=tipoEsame;
        this.dataAppello=dataAppello;
    }

    public Corso getCorso() {
        return corso;
    }

    public void setCorso(Corso corso) {
        this.corso = corso;
    }

    public ArrayList<String> getStudentiIscrittiAppello(){
        return studentiIscrittiAppello;
    }
    public void iscriviPersona(String matricola){
        this.studentiIscrittiAppello.add(matricola);
    }
}
