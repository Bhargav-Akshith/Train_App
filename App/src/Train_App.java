import java.util.ArrayList;
import java.util.List;

/**
 * ============================================================
 * MAIN CLASS – UseCase1TrainConsistMgmt
 * ============================================================
 *
 * Use Case 1: Initialize Train and Display Consist Summary
 *
 * Description:
 * This class represents the entry point of the Train Consist
 * Management Application.
 *
 * At this stage, the application:
 * - Creates an empty train consist
 * - Uses a dynamic list to store bogies
 * - Displays initial bogie count
 * - Prints the current state of the train
 *
 * This use case introduces collection initialization and
 * basic program startup flow.
 *
 * @author Developer
 * @version 1.0
 */
import java.util.*;

class Bogie {
    String type;
    int capacity;

    Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}

public class UseCase10TotalSeats {
    public static void main(String[] args) {
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("Sleeper", 80));
        bogies.add(new Bogie("AC Chair", 55));

        int totalSeats = bogies.stream()
                .map(b -> b.getCapacity())
                .reduce(0, Integer::sum);

        System.out.println("Total Seating Capacity: " + totalSeats);
    }