package ro.fasttrackit.finalProject.set1;

import ro.fasttrackit.finalProject.Dotari;

import java.util.Set;

public class Apartament extends Imobil {

    private int etaj;
    private boolean balcon;


    public Apartament(int suprafata, int pretMetruPatrat, int numarCamere, Set<Dotari> lista, int pretTotal) {
        super(suprafata,pretMetruPatrat,numarCamere,lista, pretTotal);

    }

    @Override
    public String toString() {
        return "Apartament{" +
                "etaj=" + etaj +
                ", balcon=" + balcon +
                ", suprafata=" + suprafata +
                ", pretMetruPatrat=" + pretMetruPatrat +
                ", numarCamere=" + numarCamere +
                ", listaDotari=" + listaDotari +
                ", pretTotal=" + pretTotal +
                '}';
    }
}
