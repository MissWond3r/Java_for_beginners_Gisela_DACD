import java.util.ArrayList;

public class AverageCalculator {
    public static double getAverageOf(ArrayList<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0.0; // Return 0 if the ArrayList is empty or null to avoid division by zero.
        }

        int sum = 0;

        // Calculate the sum of all integers in the ArrayList
        for (int number : numbers) {
            sum += number;
        }

        // Calculate the average as a double with decimal digits
        double average = (double) sum / numbers.size();

        return average;
    }
}

