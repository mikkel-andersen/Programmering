package model;


public class Vagt {
    private int timer;



    private Frivillig frivillig;

    public Vagt(int timer) {
        this.timer = timer;

    }

    public void setFrivillig(Frivillig frivillig) {
        this.frivillig = frivillig;
    }

    public Frivillig getFrivillig() {
        return frivillig;
    }

    public int getTimer() {
        return timer;
    }
}
