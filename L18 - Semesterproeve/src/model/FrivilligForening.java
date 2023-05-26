package model;

import java.util.ArrayList;

public class FrivilligForening extends Frivillig {
    private String foreningsNavn;
    private int antalPersoner;



    public FrivilligForening(String foreningsNavn, int antalPersoner, String navn, String mobil, int antalTimer) {
        super(navn, mobil, antalTimer);
        this.foreningsNavn = foreningsNavn;
        this.antalPersoner = antalPersoner;
    }

    public String getForeningsNavn() {
        return foreningsNavn;
    }

    public int getAntalPersoner() {
        return antalPersoner;
    }
}
