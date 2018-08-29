package com.company;

import java.time.LocalDate;

public class Film {
    private String titel;
    private String acteur;
    private String genre;
    private String regisseur;
    private LocalDate release;
    private int duur;

    public Film(String titel, String acteur, String genre, String regisseur, LocalDate release, int duur) {
        this.titel = titel;
        this.acteur = acteur;
        this.genre = genre;
        this.regisseur = regisseur;
        this.release = release;
        this.duur = duur;
    }
}
