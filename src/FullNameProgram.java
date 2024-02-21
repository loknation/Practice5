import java.util.Scanner;

public class FullNameProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Enter your first name: ");
            String firstName = scanner.nextLine();

            while (firstName.trim().isEmpty()) {
                System.out.println("First name cannot be empty. Please enter again.");
                System.out.print("Enter your first name: ");
                firstName = scanner.nextLine();
            }


            System.out.print("Enter your last name: ");
            String lastName = scanner.nextLine();


            while (lastName.trim().isEmpty()) {
                System.out.println("Last name cannot be empty. Please enter again.");
                System.out.print("Enter your last name: ");
                lastName = scanner.nextLine();
            }

            System.out.println("Your full name is: " + firstName + " " + lastName);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
