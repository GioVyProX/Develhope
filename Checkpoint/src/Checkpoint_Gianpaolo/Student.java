package Checkpoint_Gianpaolo;

public class Student {
    private int numMatricola;
    private String nome;
    private String cognome;

    private String indirizzoResidenza;


    public Student(Integer numMatricola, String nome, String cognome){

        this.nome = nome;
        this.numMatricola = numMatricola;
        this.cognome = cognome;

    }
    public Student(Integer numMatricola, String nome, String cognome, String indirizzoResidenza){

        this.nome = nome;
        this.numMatricola = numMatricola;
        this.cognome = cognome;
        this.indirizzoResidenza = indirizzoResidenza;
    }


    @Override
    public String toString() {
        return "Student{" +
                "numMatricola = " + numMatricola +
                ", nome = ' " + nome + '\'' +
                ", cognome = ' " + cognome + '\'' +
                '}';
    }

    public int getNumMatricola() {
        return numMatricola;
    }

    public void setNumMatricola(int numMatricola) {
        numMatricola = numMatricola;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getIndirizzoResidenza() {
        return indirizzoResidenza;
    }

    public void setIndirizzoResidenza(String indirizzoResidenza) {
        this.indirizzoResidenza = indirizzoResidenza;
    }
}
