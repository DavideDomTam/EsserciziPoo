import java.util.*;
import Enum.*;


public class Main {
    public static void main(String[] args) {

        //creo corsi bloccanti per il corso di progrmmazione
        ArrayList<String> corsiBloccanti=new ArrayList<>();
        corsiBloccanti.add("Sciao");
        corsiBloccanti.add("Miao");
        Corso programmazione = new Corso("Progrmmazione","Gigi", 9,2, corsiBloccanti);

        //creo un esame che è stato passato
        CorsoPassato sciao = new CorsoPassato(25,"Potevi fare di più", "Sciao", 6,"Cavolo");
        ArrayList<CorsoPassato> sciao157795 = new ArrayList<>();
        sciao157795.add(sciao);

        ArrayList<String> corsiSecondoAnno=new ArrayList<>();
        corsiSecondoAnno.add("Progrmmazione");
        Studente studente= new Studente("157795",true,2, corsiSecondoAnno, sciao157795);
        CorsoPassato miao = new CorsoPassato(25,"Potevi fare di più", "Miao", 6,"Cavolo");
        sciao157795.add(miao);
        Studente studente1= new Studente("157794",true,2, corsiSecondoAnno, sciao157795);
        ArrayList<String> studentiIscritti = new ArrayList<>();
        Appello appello = new Appello(programmazione, TipologiaAppello.ORALE,TipologiaEsame.Presenza, "11/07/2023",studentiIscritti);
//        studente.iscrizioneAppello(appello);
        studente.calcolaVotoMedio();

        studente1.iscrizioneAppello(appello);
        }
    }
