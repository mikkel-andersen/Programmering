package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Job {
    private String kode;
    private String beskrivelse;
    private LocalDate dato;
    private int timeHonorar;
    private int antalTimer;
    private ArrayList<Vagt> vagter;
    private Festival festival;

    public Job(String kode, String beskrivelse, LocalDate dato, int timeHonorar, int antalTimer) {
        this.kode = kode;
        this.beskrivelse = beskrivelse;
        this.dato = dato;
        this.timeHonorar = timeHonorar;
        this.antalTimer = antalTimer;
        vagter = new ArrayList<>();
    }

    public void addVagter(Vagt v) {
        vagter.add(v);
    }

    public void setFestival(Festival festival) {
        this.festival = festival;
    }

    public int getTimeHonorar() {
        return timeHonorar;
    }

    public int getAntalTimer() {
        return antalTimer;
    }

    public String getKode() {
        return kode;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public LocalDate getDato() {
        return dato;
    }

    public Festival getFestival() {
        return festival;
    }

    public ArrayList<Vagt> getVagter() {
        return vagter;
    }

    public int ikkeBesatteTimer() {
        int ikkeBesatteTimer = antalTimer;
        for (Vagt v : vagter) {
            ikkeBesatteTimer -= v.getTimer();
        }
        return ikkeBesatteTimer;
    }
}
