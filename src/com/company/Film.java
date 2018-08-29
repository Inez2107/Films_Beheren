package com.company;

import java.time.LocalDate;

public class Film {
    private String titel;
    private String genre;
    private String regisseur;
    private String schrijver;
    private String release;
    private int duur;

    public Film(String titel, String genre, String regisseur,String schrijver, String release, int duur) {
        this.titel = titel;
        this.genre = genre;
        this.regisseur = regisseur;
        this.release = release;
        this.duur = duur;
    }

}
