package Checkpoint_Gianpaolo;

import java.util.ArrayList;
import java.util.List;

public class Corso {

    private String nomeCorso;
    private int creditiFormativi;
    private List<Student> studenti;

    public Corso (String nomeCorso, int creditiFormativi){

        this.studenti = new ArrayList<>();
        this.nomeCorso = nomeCorso;
        this.creditiFormativi = creditiFormativi;

    }

    public static int creditiTotali (List<Corso> ListaCorsi){

        int sommaCreditiFormativi = 0;

        for (Corso corso: ListaCorsi) {
            sommaCreditiFormativi = sommaCreditiFormativi + corso.creditiFormativi;
        }

        return sommaCreditiFormativi;
    }

    public List<Student> ricercaStudente (String keySearch){

        List<Student> studentiCercati = new ArrayList<>();


        for (Student studente : studenti) {

            if (studente.getNome().contains(keySearch) || studente.getCognome().contains(keySearch)){

                studentiCercati.add(studente);
            }
        }
        return studentiCercati;
    }




    public boolean ControllaIscrizioneStudente (Student studente){

        for (Student studenteLista: studenti) {

            if (studente.getNumMatricola() == studenteLista.getNumMatricola()){
                return true;
            }
        }

        return false;
    }

    public void aggiungiStudenti (Student student){

        studenti.add(student);

    }

    public void stampaListaStudenti (){

        for (Student student : this.studenti) {
            System.out.println(student);

        }

    }


    public String getNomeCorso() {
        return nomeCorso;
    }

    public void setNomeCorso(String nomeCorso) {
        this.nomeCorso = nomeCorso;
    }

    public int getCreditiFormativi() {
        return creditiFormativi;
    }

    public void setCreditiFormativi(int creditiFormativi) {
        this.creditiFormativi = creditiFormativi;
    }

    public List<Student> getStudenti() {
        return studenti;
    }

    public void setStudenti(List<Student> studenti) {
        this.studenti = studenti;
    }
}
