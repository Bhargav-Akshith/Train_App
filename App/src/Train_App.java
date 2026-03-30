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

        List<String> consist = new ArrayList<>();

        consist.add("Sleeper");
        consist.add("AC Chair");
        consist.add("First Class");

        System.out.println("Train consist initialized");
        System.out.println("Current Bogies: " + consist);
        System.out.println("Total bogie count: " + consist.size());

        consist.remove("AC Chair");
        System.out.println("\nAfter removing AC Chair:");
        System.out.println("Updated Bogies: " + consist);

        boolean hasSleeper = consist.contains("Sleeper");
        System.out.println("\nIs Sleeper bogie present? " + hasSleeper);

        System.out.println("Final bogie count: " + consist.size());
    }
}