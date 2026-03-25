import java.util.*;

public class UC1 {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        List<String> consist = new ArrayList<>();

        System.out.println("Train initialized successfully.");
        System.out.println("Initial bogie count: " + consist.size());

        System.out.println("\n--- Adding Passenger Bogies ---");

        consist.add("Sleeper");
        consist.add("AC Chair");
        consist.add("First Class");

        System.out.println("Bogies after addition: " + consist);

        System.out.println("\n--- Removing a Bogie ---");

        consist.remove("AC Chair");
        System.out.println("Bogies after removal: " + consist);

        System.out.println("\n--- Checking Bogie Existence ---");

        if (consist.contains("Sleeper")) {
            System.out.println("Sleeper bogie exists in the train.");
        } else {
            System.out.println("Sleeper bogie not found.");
        }

        System.out.println("\nFinal Consist: " + consist);

        System.out.println("\nProgram is ready.");
    }
}