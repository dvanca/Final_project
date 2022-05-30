package ro.fasttrackit.finalProject.set1;

import ro.fasttrackit.finalProject.Contract;
import ro.fasttrackit.finalProject.pers.PersoanaJuridica;

import java.util.ArrayList;
import java.util.List;

public class Agentie extends PersoanaJuridica {
    private List<Imobil> imobile;
    private int balance;
    private List<Contract> contracte;

    public Agentie(int balance, String denumire) {
        super(denumire);
        this.balance = balance;
        this.imobile = new ArrayList<>();
        this.contracte = new ArrayList<>();


    }

    public List<Imobil> getImobile() {
        return imobile;
    }

    public int getBalance() {
        return balance;
    }

    public List<Contract> getContracte() {
        return contracte;
    }
}