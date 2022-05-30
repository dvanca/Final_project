package ro.fasttrackit.finalProject.set1;

import ro.fasttrackit.finalProject.Dotari;

import java.util.Set;

public abstract class Imobil {

        public int suprafata;
        public int pretMetruPatrat;
        public int numarCamere;
        public Set<Dotari> listaDotari;
        public int pretTotal;

    public Imobil(int suprafata, int pretMetruPatrat, int numarCamere, Set<Dotari> listaDotari, int pretTotal) {
        this.suprafata = suprafata;
        this.pretMetruPatrat = pretMetruPatrat;
        this.numarCamere = numarCamere;
        this.listaDotari = listaDotari;
        this.pretTotal = pretTotal;
    }
}
