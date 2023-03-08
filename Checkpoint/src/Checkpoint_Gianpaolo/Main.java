package Checkpoint_Gianpaolo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        Student studente1 = new Student(742007, "Giovanni", "Mauro");
        Student studente2 = new Student(328913, "Gennaro", "Di Costanzo", " ");
        Student studente3 = new Student(37218, "Maurizio", "Costanzo show");


        Corso corsoA = new Corso("Ingegneria", 21);
        Corso corsoB = new Corso("Economia", 2);

        corsoA.aggiungiStudenti(studente1);
        corsoA.aggiungiStudenti(studente2);

        corsoB.aggiungiStudenti(studente2);
        corsoB.aggiungiStudenti(studente3);

        corsoA.stampaListaStudenti();
        corsoB.stampaListaStudenti();

        Corso corsoC = new Corso("Matematica", 40);

        List<Corso> listaCorsi = new ArrayList<>();

        listaCorsi.add(corsoA);
        listaCorsi.add(corsoB);
        listaCorsi.add(corsoC);

        Corso.creditiTotali(listaCorsi);

        System.out.println(corsoA.ControllaIscrizioneStudente(studente1));

        System.out.println(corsoB.ricercaStudente("Costanzo"));

    }
}