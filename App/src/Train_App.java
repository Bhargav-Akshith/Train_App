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

        Map<String, Integer> bogieCapacity = new HashMap<>();

        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 56);
        bogieCapacity.put("First Class", 24);

        System.out.println("Bogie capacities mapped successfully.\n");

        System.out.println("Bogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println("Bogie Type: " + entry.getKey() + " | Capacity: " + entry.getValue() + " seats");
        }

        String searchBogie = "Sleeper";
        if (bogieCapacity.containsKey(searchBogie)) {
            System.out.println("\nRetrieving capacity for " + searchBogie + ": " + bogieCapacity.get(searchBogie) + " seats");
        }

        System.out.println("\nTotal bogie types tracked: " + bogieCapacity.size());
    }
}