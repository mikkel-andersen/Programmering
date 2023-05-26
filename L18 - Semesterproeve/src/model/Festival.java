package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Festival {
    private String navn;
    private LocalDate fraDato;
    private LocalDate tilDato;
    private ArrayList<Job> jobs;

    public Festival(String navn, LocalDate fraDato, LocalDate tilDato) {
        this.navn = navn;
        this.fraDato = fraDato;
        this.tilDato = tilDato;
        jobs = new ArrayList<>();
    }

    public void addJob(Job j) {
        jobs.add(j);
        j.setFestival(this);
    }

    public int budgetteretJobUdgift() {
        int budget = 0;
        for (Job j : jobs) {
            budget += j.getAntalTimer() * j.getTimeHonorar();
        }
        return budget;
    }

    public String getNavn() {
        return navn;
    }

    public LocalDate getFraDato() {
        return fraDato;
    }

    public LocalDate getTilDato() {
        return tilDato;
    }

    public ArrayList<Job> getJobs() {
        return jobs;
    }

    public int realiseretJobUdgift() {
        int budget = 0;
        for (Job j : jobs) {
            if (j.getVagter() != null){
                for (Vagt v : j.getVagter()) {
                    budget += v.getTimer() * j.getTimeHonorar();
                }
            }
        }
        return budget;
    }
}
