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

        Set<String> consist = new LinkedHashSet<>();

        consist.add("Engine");
        consist.add("Sleeper");
        consist.add("Cargo");
        consist.add("Guard");

        System.out.println("Initial Train Formation: " + consist);

        System.out.println("\nAttempting to re-attach duplicate: Sleeper...");
        boolean isAdded = consist.add("Sleeper");

        if (!isAdded) {
            System.out.println("Duplicate bogie 'Sleeper' rejected by system!");
        }

        System.out.println("\nFinal Ordered Train Consist (Unique):");
        System.out.println(consist);
        System.out.println("Total unique bogies attached: " + consist.size());
    }
}