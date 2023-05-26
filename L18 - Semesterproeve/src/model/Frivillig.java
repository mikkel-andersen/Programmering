package model;

import java.util.ArrayList;

public class Frivillig {
    private String navn;
    private String mobil;
    private int maksAntalTimer;
    private ArrayList<Vagt> vagter;


    public Frivillig(String navn, String mobil, int maksAntalTimer) {
        this.navn = navn;
        this.mobil = mobil;
        this.maksAntalTimer = maksAntalTimer;
        vagter = new ArrayList<>();
    }

    public void addVagt(Vagt vagt) {
        vagter.add(vagt);
        vagt.setFrivillig(this);
    }

    public String getNavn() {
        return navn;
    }

    public String getMobil() {
        return mobil;
    }


    public ArrayList<Vagt> getVagt() {
        return vagter;
    }

    public int getMaksAntalTimer() {
        return maksAntalTimer;
    }

    public int ledigeTimer() {
        int ledigeTimer = maksAntalTimer;
        for (Vagt v : vagter) {
            ledigeTimer -= v.getTimer();
        }
        return ledigeTimer;
    }

}
