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
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Bogie: " + name + " | Capacity: " + capacity + " seats";
    }
}

public class Train_App {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        List<Bogie> passengerBogies = new ArrayList<>();

        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 56));
        passengerBogies.add(new Bogie("First Class", 24));

        System.out.println("Initial Bogie List (Unsorted):");
        passengerBogies.forEach(System.out::println);

        passengerBogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\nSorted Bogies by Capacity (Ascending):");
        for (Bogie b : passengerBogies) {
            System.out.println(b);
        }

        passengerBogies.sort((b1, b2) -> b2.capacity - b1.capacity);

        System.out.println("\nSorted Bogies by Capacity (Descending):");
        passengerBogies.forEach(System.out::println);
    }
}
