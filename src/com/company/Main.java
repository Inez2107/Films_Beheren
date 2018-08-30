package com.company;

import java.time.LocalDate;
import java.util.*;

public class Main {

    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        ArrayList<Film> filmLijst = new ArrayList<>();
        ArrayList<Acteur> acteursLijst = new ArrayList<>();
        ArrayList<Rating> ratingLijst = new ArrayList<>();
        int id = 10;

        boolean isGestopt = false;
        while (!isGestopt) {
            System.out.println("Wat wil je doen? Kies het bijhorende cijfer.");
            System.out.printf(" 0. Stoppen %n 1. Invoeren Films %n 2. Opvragen Films %n ");
            int keuze = Integer.parseInt(scanner.nextLine());
            switch (keuze) {
                case 0:
                    isGestopt = true;
                    break;
                case 1:
                    vraagFilms(scanner, filmLijst);
                    break;
                case 2:
                    System.out.println("Opvragen Films");
                    toonFilms(filmLijst);
                    break;
            }
        }
    }

    private static void vraagFilms(Scanner scanner, ArrayList<Film> filmLijst) {
        System.out.println("Ingeven Films ");
        System.out.println("Geef STOP in om te stoppen! ");
        System.out.println("Geef de titel van de film in : ");
        String titel = scanner.nextLine();

        while (!"STOP".equalsIgnoreCase(titel)) {
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
            filmLijst.add(film1);

            System.out.println("Ingeven Films ");
            System.out.println("Geef STOP in om te stoppen! ");
            System.out.println("Geef de titel van de film in : ");
            titel = scanner.nextLine();
//                System.out.println("Geef de beoordeling van de film in : ");
//                int rating = Integer.parseInt(scanner.nextLine());
//                ratingLijst.add(new Rating(rating));
//                for (int i = 0; i < ratingLijst.size(); i++) {
//                    System.out.println("Rating: " + ratingLijst.get(i));
//
//                }
//
//                System.out.println("Geefvan één van de acteurs zijn voornaam : ");
//                String naam = scanner.nextLine();
//                System.out.println("Geef de achternaam van dezelfde acteur in : ");
//                String achternaam = scanner.nextLine();
//                acteursLijst.add(new Acteur(naam, achternaam));
//                for (int i = 0; i < acteursLijst.size(); i++) {
//                    System.out.println("Naam acteur: " + acteursLijst.get(i));
//                }
        }
    }

    private static void toonFilms(ArrayList<Film> filmLijst) {
        boolean isGestopt = false;
        for (Film f : filmLijst) {
            System.out.printf(" %n Titel: %s%n Genre: %s%n Regisseur: %s, Schrijver: %s%n release: %s, Duur: %d min. %n ",
                    f.getTitel(), f.getGenre(), f.getRegisseur(), f.getSchrijver(), f.getRelease(), f.getDuur());
        }
        while (!isGestopt) {
            System.out.printf(" %n Wat wil je doen? Kies het bijhorende cijfer.");
            System.out.printf(" 0. Stoppen %n 1. Wijzigen Films %n 2. Verwijderen Films %n ");
            int keuze = Integer.parseInt(scanner.nextLine());
            switch (keuze) {
                case 0:
                    isGestopt = true;
                    break;
                case 1:
                    wijzigFilms(filmLijst);
                    break;
                case 2:
                    verwijderFilms(filmLijst);
                    break;
            }
       }
            }

    private static void wijzigFilms(ArrayList<Film> filmLijst) {
        boolean isGestopt;
        System.out.println("Wijzig Films");
        System.out.println("Geef de titel van de film in : ");
        String titel = scanner.nextLine();
        Iterator<Film> iter = filmLijst.iterator();
        while (iter.hasNext()) {
            Film f = iter.next();
            if (titel.equals(f.getTitel())){
                System.out.println("Geef het element dat je wil veranderen: ");
                String input = scanner.nextLine();
                switch (input){
                    case "stop":
                        isGestopt = true;
                        break;
                    case "titel" :
//                        do {
//                            (Film f : filmLijst){
//                                if (f.getTitel().equals(input)){
//                                    filmLijst.add(f);
//                                }
//                            }
                        } while (input.equals(titel)){
                            iter.remove();
                            filmLijst.add(f);

                        }
                }
                }
    }


    private static void verwijderFilms(ArrayList<Film> filmLijst) {
        System.out.println("Verwijder Films ");
        System.out.println("Geef de titel van de film in : ");
        String titel = scanner.nextLine();
        Iterator<Film> iter = filmLijst.iterator();
        while (iter.hasNext()) {
            Film f = iter.next();
            if (titel.equals(f.getTitel())){
                iter.remove();
                System.out.println("Film is verwijderdt!");
            }
        }
    }
}
