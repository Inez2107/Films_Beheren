package com.company;

public class Acteur {
    private String achternaam;
    private String naam;

    public Acteur(String geslachtAct, String naam) {
        this.achternaam = geslachtAct;
        this.naam = naam;
    }

    @Override
    public String toString() {
        return naam+ " " +achternaam +"";
    }
}
