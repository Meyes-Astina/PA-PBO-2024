package lonanzoo;

import java.io.BufferedReader;
import java.io.IOException;

public class Utilitas {
    // Clear screen
    public static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // Pause program
    public static void pause(BufferedReader input) {
        System.out.print("Press Anything To Back Menu...");
        try {
            input.readLine(); // Wait for user to press something
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int validateNumber(BufferedReader input, String prompt) throws IOException {
        int fillInt = -1; // Initialize with an invalid value

        while (true) {
            try {
                System.out.print(prompt);
                String inputString = input.readLine();

                // Check if input is a number
                if (inputString.matches("\\d+")) {
                    fillInt = Integer.parseInt(inputString);

                    // Ensure the entered number is not 0
                    if (fillInt != 0) {
                        break;
                    } else {
                        System.out.println("Input cannot be 0"); // Display message
                    }
                } else {
                    System.out.println("Input must be a number: "); // Display message
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number.");
            }
        }

        return fillInt;
    }

    public static String notEmpty(String input) throws IOException {
        if (input == null || input.trim().isEmpty()) {
            throw new IOException("Input cannot be empty.");
        }
        return input;
    }

    // Method to validate category
    public static String validateCategory(BufferedReader input) {
        String[] validCategories = {"Mamalia", "Reptil", "Unggas"};
        String fillString = "";

        while (true) {
            try {
                System.out.print("Enter category (Mamalia, Reptil, Unggas): ");
                String inputString = input.readLine();
                boolean isValid = false;

                for (String category : validCategories) {
                    if (category.equalsIgnoreCase(inputString)) {
                        isValid = true;
                        fillString = inputString;
                        break;
                    }
                }

                if (isValid) {
                    break;
                } else {
                    System.out.println("Invalid category! Please enter one of the following: Mamalia, Reptil, Unggas.");
                }
            } catch (IOException e) {
                System.out.println("An error occurred while reading input. Please try again.");
            }
        }

        return fillString;
    }

    public static int validateNumber(String text) {
        if (text == null || text.trim().isEmpty()) {
            throw new NumberFormatException("Input cannot be empty.");
        }

        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Invalid input! Please enter a valid number.");
        }
    }
}
