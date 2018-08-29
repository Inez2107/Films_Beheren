package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, Film> filmLijst = new HashMap<>();
        ArrayList<Acteur> acteursLijst = new ArrayList<>();
        ArrayList<Rating> ratingLijst = new ArrayList<>();
        int id = 10;

        System.out.println("Ingeven Films ");
        System.out.println("Geef STOP in om te stoppen! ");
        System.out.println("Geef de titel van de film in : ");
        String titel = scanner.nextLine();

        System.out.println("Geef het genre van de film in : ");
        String genre = scanner.nextLine();
        System.out.println("Geef de regisseur in : ");
        String regisseur = scanner.nextLine();
        System.out.println("Geef de schrijver van het script in : ");
        String schrijver = scanner.nextLine();
        System.out.println("Geef de release datum in :");
        String release = scanner.nextLine();
        System.out.println("Geef de duur van de film in (MIN) : ");
        int duur = Integer.parseInt(scanner.nextLine());
        Film film1 = new Film(titel, genre, regisseur, schrijver, release, duur);
        filmLijst.put(id, film1);
        for (Film f : filmLijst.values()){
            System.out.printf(" %s%n %s%n %s%n %s%n %s%n %d%n ", titel,genre,regisseur, schrijver,release,duur);
        }

        System.out.println("Geef de beoordeling van de film in : ");
        int rating = Integer.parseInt(scanner.nextLine());
        Rating rating1 = new Rating(rating);
        ratingLijst.add(new Rating(rating));
        for (int i = 0; i < ratingLijst.size() ; i++) {
            System.out.println(ratingLijst.get(rating));
        }

        System.out.println("Geef één van de acteurs in : ");
        String naam = scanner.nextLine();
        System.out.println("Geef het geslacht van die acteur in : ");
        String geslachtAct = scanner.nextLine();
        acteursLijst.add(new Acteur(geslachtAct,naam));



    }
}
