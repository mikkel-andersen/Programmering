import java.time.Clock;
import java.time.LocalTime;

public class Opgave2_StopWatch {
    public LocalTime startTime;
    public LocalTime endTime;
    public LocalTime elapsedTime;
    public static void main(String[] args) {

    }

    public void start() {
        startTime = LocalTime.now();
    }

    public void end() {
        endTime = LocalTime.now();
    }

    public void elapsedTime() {

    }
}
