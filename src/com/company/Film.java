package com.company;

import java.time.LocalDate;

public class Film {
    private String titel;
    private String genre;
    private String regisseur;
    private String schrijver;
    private String release;
    private int duur;

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setRegisseur(String regisseur) {
        this.regisseur = regisseur;
    }

    public void setSchrijver(String schrijver) {
        this.schrijver = schrijver;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public void setDuur(int duur) {
        this.duur = duur;
    }

    public Film(String titel, String genre, String regisseur, String schrijver, String release, int duur) {
        this.titel = titel;
        this.genre = genre;
        this.regisseur = regisseur;
        this.schrijver = schrijver;

        this.release = release;
        this.duur = duur;
    }

    public String getTitel() {
        return titel;
    }

    public String getGenre() {
        return genre;
    }

    public String getRegisseur() {
        return regisseur;
    }

    public String getSchrijver() {
        return schrijver;
    }

    public String getRelease() {
        return release;
    }

    public int getDuur() {
        return duur;
    }
}
