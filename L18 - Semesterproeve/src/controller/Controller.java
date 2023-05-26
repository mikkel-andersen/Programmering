package controller;

import model.Festival;
import model.Frivillig;
import model.FrivilligForening;
import model.Job;
import storage.Storage;

import java.time.LocalDate;

public class Controller {

    public static void main(String[] args) {
        initStorage();
    }

    public static Frivillig createFrivillig(String navn, String mobil, int maksAntalTimer) {
        Frivillig frivillig = new Frivillig(navn, mobil, maksAntalTimer);
        Storage.addFrivillig(frivillig);
        return frivillig;
    }

    public static Festival createFestival(String navn, LocalDate fraDato, LocalDate tilDato) {
        Festival festival = new Festival(navn, fraDato, tilDato);
        Storage.addFestival(festival);
        return festival;
    }

    public static FrivilligForening createFrivilligForening(String foreningsNavn, int antalPersoner, String navn, String mobil, int antalTimer) {
        FrivilligForening frivilligForening = new FrivilligForening(foreningsNavn, antalPersoner, navn, mobil, antalTimer);
        return frivilligForening;
    }


    public static void initStorage() {
        createFestival("Northside", LocalDate.of(2020,06,04), LocalDate.of(2020,06,06));
        createFrivillig("Jane Jensen", "12345677", 20);
        createFrivillig("Lone Hansen", "78787878", 25);
        createFrivillig("Anders Mikkelsen", "55555555", 10);
        createFrivilligForening("Erhvervsakademi Aarhus", 40, "Christian Madsen", "23232323", 100);

        Job j1 = new Job("T1", "Rengøring af toilet", LocalDate.of(2020,6,4), 100, 5);
        Job j2 = new Job("T2", "Rengøring af toilet", LocalDate.of(2020,6,4), 100, 5);
        Job j3 = new Job("T3", "Rengøring af toilet", LocalDate.of(2020,6,4), 100, 5);

        Job j4 = new Job("T4", "Rengøring af toilet", LocalDate.of(2020,06,05), 100, 5);
        Job j5 = new Job("T5", "Rengøring af toilet", LocalDate.of(2020,06,05), 100, 5);
        Job j6 = new Job("T6", "Rengøring af toilet", LocalDate.of(2020,06,05), 100, 5);

        Job j7 = new Job("T7", "Rengøring af toilet", LocalDate.of(2020,06,06), 100, 5);
        Job j8 = new Job("T8", "Rengøring af toilet", LocalDate.of(2020,06,06), 100, 5);
        Job j9 = new Job("T9", "Rengøring af toilet", LocalDate.of(2020,06,06), 100, 5);

    }
}
