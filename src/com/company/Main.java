package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap <Integer, Film> filmLijst = new HashMap <> ();
        ArrayList <Acteur> acteursLijst = new ArrayList<>();

        System.out.println("Ingeven Films ");
        System.out.println("Geef de titel van de film in : ");
        String titel = scanner.nextLine();
        System.out.println("Geef de regisseur in : ");
        String regisseur = scanner.nextLine();
        System.out.println("Geef het genre van de film in : ");
        String genre  = scanner.nextLine();
        System.out.println("Geef de schrijver van het script in : ");
        String schrijver = scanner.nextLine();
        System.out.println("Geef de release datum in :");
        LocalDate release = LocalDate.parse(scanner.nextLine());
        System.out.println("Geef de duur van de film in (MIN) : ");
        int duur = Integer.parseInt(scanner.nextLine());
        new Film()



        System.out.println("Geef de beoordeling van de film in : ");
        int rating = Integer.parseInt(scanner.nextLine());

        System.out.println("Geef één van de acteurs in : ");
        String acteur  = scanner.nextLine();

        System.out.println("Geef het geslacht van die acteur in : ");
        String geslachtAct = scanner.nextLine();

    }
}
