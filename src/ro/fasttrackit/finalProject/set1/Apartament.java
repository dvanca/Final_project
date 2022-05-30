package ro.fasttrackit.finalProject.set1;

import ro.fasttrackit.finalProject.Dotari;

import java.util.Set;

public class Apartament extends Imobil {

    private int etaj;
    private boolean balcon;


    public Apartament(int suprafata, int pretMetruPatrat, int numarCamere, Set<Dotari> lista) {
        super(suprafata,pretMetruPatrat,numarCamere,lista);

    }
}
