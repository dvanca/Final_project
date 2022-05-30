package ro.fasttrackit.finalProject;

import ro.fasttrackit.finalProject.pers.Persoana;
import ro.fasttrackit.finalProject.set1.Imobil;

import java.util.List;

public class Contract {
    private TipContract tip;
    private Perioada perioada;
    private double comision;
    private List<Imobil> imobile;
    private  int pretTotal;
    private Persoana cumparator;
    private Persoana vanzator;

    public Contract(TipContract tip, Perioada perioada, double comision,
                    List<Imobil> imobile, int pretTotal, Persoana cumparator, Persoana vanzator) {
        this.tip = tip;
        this.perioada = perioada;
        this.comision = comision;
        this.imobile = imobile;
        this.pretTotal = pretTotal;
        this.cumparator = cumparator;
        this.vanzator = vanzator;
    }
}
