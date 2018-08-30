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
                default:
                    System.out.printf("Geen geldig nummer. Geef één van de volgende opties in: %n");
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
            int duur = 0;
            boolean inputOkay = false;
            do {
                System.out.println("Geef de duur van de film in MINUTEN : ");
                try {
                    duur = Integer.parseInt(scanner.nextLine());
                    inputOkay = true;
                } catch (NumberFormatException fout) {
                    System.out.printf("Verkeerde input. Gebruik enkel cijfers %n");
                }
            } while (!inputOkay);


            Film film1 = new Film(titel, genre, regisseur, schrijver, release, duur);
            filmLijst.add(film1);

            System.out.println("Ingeven Films ");
            System.out.println("Geef STOP in om te stoppen! ");
            System.out.println("Geef de titel van de film in : ");
            titel = scanner.nextLine();
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
            System.out.printf(" %n 0. Teruggaan %n 1. Wijzigen Films %n 2. Verwijderen Films %n 3. Bekijk films %n 4. Sorteer op onderdeel %n");
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
                case 3:
                    for (Film f : filmLijst) {
                        System.out.printf(" %n Titel: %s%n Genre: %s%n Regisseur: %s, Schrijver: %s%n release: %s, Duur: %d min. %n ",
                                f.getTitel(), f.getGenre(), f.getRegisseur(), f.getSchrijver(), f.getRelease(), f.getDuur());
                    }
                    break;
                case 4:
                    sorteer(filmLijst);
                    break;
                default:
                    System.out.printf("Geen geldig nummer. Geef één van de volgende opties in: %n");
            }
        }
    }

    private static void sorteer(ArrayList<Film> filmLijst) {
        boolean isGestopt;
        System.out.printf("%n Van welk onderdeel wil je de inhoud zien? : ");
        System.out.printf("%n Mogelijkheden: titel, genre, regisseur, schrijver, release, duur. %n");
        String keuze = scanner.nextLine();
        for (Film f : filmLijst) {
            switch (keuze) {
                case "stop":
                    isGestopt = true;
                    break;
                case "titel":
                    f.getTitel();
                    System.out.println(f.getTitel());
                    break;
                case "genre":
                    f.getGenre();
                    System.out.println(f.getGenre());
                    break;
                case "regisseur":
                    f.getRegisseur();
                    System.out.println(f.getRegisseur());
                    break;
                case "schrijver":
                    f.getSchrijver();
                    System.out.println(f.getSchrijver());
                    break;
                case "release":
                    f.getRelease();
                    System.out.println(f.getRelease());
                    break;
                case "duur":
                    f.getDuur();
                    System.out.println(f.getDuur());
                    break;
                default:
                    System.out.printf("Geen geldig nummer. Geef één van de volgende opties in: %n");
            }
        }
    }

    private static void wijzigFilms(ArrayList<Film> filmLijst) {
        boolean isGestopt;
        boolean inputOkay = false;
        System.out.println("Wijzig Films");
        System.out.println("Geef de titel van de film in : ");
        String titel = scanner.nextLine();
        Iterator<Film> iter = filmLijst.iterator();
        while (iter.hasNext()) {
            Film f = iter.next();
            if (titel.equals(f.getTitel())) {
                System.out.println("Geef het element dat je wil veranderen: ");
                String input = scanner.nextLine();

                switch (input) {
                    case "stop":
                        isGestopt = true;
                        break;
                    case "titel":
                        System.out.println("Geef de nieuwe input : ");
                        String nieuweInput = scanner.nextLine();
                        f.setTitel(nieuweInput);
                        break;
                    case "genre":
                        System.out.println("Geef de nieuwe input : ");
                        nieuweInput = scanner.nextLine();
                        f.setGenre(nieuweInput);
                        break;
                    case "regisseur":
                        System.out.println("Geef de nieuwe input : ");
                        nieuweInput = scanner.nextLine();
                        f.setRegisseur(nieuweInput);
                        break;
                    case "schrijver":
                        System.out.println("Geef de nieuwe input : ");
                        nieuweInput = scanner.nextLine();
                        f.setSchrijver(nieuweInput);
                        break;
                    case "release":
                        System.out.println("Geef de nieuwe input : ");
                        nieuweInput = scanner.nextLine();
                        f.setRelease(nieuweInput);
                        break;
                    case "duur":
                        System.out.println("Geef de nieuwe input : ");
                        int intNieuweInput = Integer.parseInt(scanner.nextLine());
                        f.setDuur(intNieuweInput);
                        break;
                    default:
                        System.out.printf("Geen geldig input. Geef één van de volgende opties in: %n");
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
            if (titel.equals(f.getTitel())) {
                iter.remove();
                System.out.println("Film is verwijderdt!");
            }
        }
    }
}
