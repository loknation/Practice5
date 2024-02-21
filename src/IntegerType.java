import java.util.Scanner;

public class IntegerType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int number = getValidInteger(scanner);

            String type = (number > 0) ? "positive" : (number < 0) ? "negative" : "zero";
            System.out.println("The number is " + type + ".");
        }
        catch (Exception e){
            System.out.println("Bro");
        }
    }

    private static int getValidInteger(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next();
            }
        }
    }
}
