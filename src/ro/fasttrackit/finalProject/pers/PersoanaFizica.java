package ro.fasttrackit.finalProject.pers;

import ro.fasttrackit.finalProject.pers.Persoana;

public class PersoanaFizica implements Persoana {
    private String nume;
    private String prenume;

    public PersoanaFizica(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }
}
