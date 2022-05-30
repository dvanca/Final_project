package ro.fasttrackit.finalProject;

import ro.fasttrackit.finalProject.set1.Agentie;
import ro.fasttrackit.finalProject.set1.Apartament;
import ro.fasttrackit.finalProject.set1.Imobil;

import java.util.Collections;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Agentie eu = new Agentie(2000000, "Agentia mea");
        String meniu = "1. Cumpara \n" +
                "2.Exit\n" +
                "3. Submeniu\n" +
                "Balance: "+eu.getBalance();
        boolean exit = false;
        while(exit){
            System.out.println(meniu);
            Scanner scan = new Scanner(System.in);
            String tasta = scan.nextLine();
            switch (tasta) {
                case "2":
                    exit = true;
                    break;
                case "3":
                    boolean exitSubmeniu = false;
                    while(!exitSubmeniu){

                    }
                default:
                    System.out.println("\nInvalid command");
            }
        }

        Imobil casa1 = new Apartament(44, 230, 3,
                Set.of(Dotari.AER_CONDITIONAT, Dotari.PARCARE), 300000);

        System.out.println(casa1);
    }
}
