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

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return type + " - Capacity: " + capacity;
    }
}

public class UseCase9GroupBogies {
    public static void main(String[] args) {
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("Sleeper", 80));
        bogies.add(new Bogie("AC Chair", 55));

        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(Bogie::getType));

        groupedBogies.forEach((type, list) -> {
            System.out.println(type + ":");
            list.forEach(System.out::println);
        });
    }
}