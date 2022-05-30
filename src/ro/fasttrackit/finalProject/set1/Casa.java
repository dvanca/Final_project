package ro.fasttrackit.finalProject.set1;

import ro.fasttrackit.finalProject.Dotari;

import java.util.Set;

public class Casa extends Imobil {

    private int suprafataCurte;
    private int numarNiveluri;


    public Casa(int suprafata, int pretMetruPatrat, int numarCamere, Set<Dotari> listaDotari) {
        super(suprafata, pretMetruPatrat, numarCamere, listaDotari);
    }
}
