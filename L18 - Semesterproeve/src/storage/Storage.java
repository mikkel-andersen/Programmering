package storage;

import model.Festival;
import model.Frivillig;

import java.util.ArrayList;

public class Storage {
    private static ArrayList<Frivillig> frivillige = new ArrayList<>();
    private static ArrayList<Festival> festivaler = new ArrayList<>();


    public static void addFrivillig (Frivillig frivillig) {
        frivillige.add(frivillig);
    }

    public static void addFestival(Festival festival) {
        festivaler.add(festival);
    }

    public static ArrayList<Frivillig> getKunder() {
        return new ArrayList<>(frivillige);
    }

    public static ArrayList<Festival> getForestillinger() {
        return new ArrayList<>(festivaler);
    }

}

