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

public class Train_App {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        LinkedList<String> consist = new LinkedList<>();

        consist.add("Engine");
        consist.add("Sleeper");
        consist.add("AC");
        consist.add("Cargo");
        consist.add("Guard");

        System.out.println("Initial Train Consist: " + consist);

        consist.add(2, "Pantry Car");
        System.out.println("After adding Pantry Car at position 2: " + consist);

        String removedFirst = consist.removeFirst();
        String removedLast = consist.removeLast();

        System.out.println("Detached: " + removedFirst + " and " + removedLast);

        System.out.println("\nFinal Ordered Train Consist:");
        System.out.println(consist);
        System.out.println("Current bogie count: " + consist.size());
    }
}
