import java.util.Scanner;

public class MultiplyNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = getValidNumber(scanner, "Enter the first number: ");
        double num2 = getValidNumber(scanner, "Enter the second number: ");

        double result = num1 * num2;
        System.out.println("The result of multiplying " + num1 + " and " + num2 + " is: " + result);
    }

    private static double getValidNumber(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                System.exit(1);
            }
        }
    }
}
