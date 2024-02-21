import java.util.Scanner;

public class IntOrDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String input = scanner.nextLine();

        try {
            int intValue = Integer.parseInt(input);
            System.out.println("You entered an integer.");
        } catch (NumberFormatException e1) {
            try {
                double doubleValue = Double.parseDouble(input);
                System.out.println("You entered a double.");
            } catch (NumberFormatException e2) {
                System.out.println("Invalid input. Please enter either an integer or a double.");
            }
        }
    }
}
