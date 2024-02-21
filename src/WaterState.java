import java.util.Scanner;

public class WaterState {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Would you like to enter the temperature of water in Fahrenheit? (yes/no): ");
            String response = scanner.nextLine().toLowerCase();

            if (response.equals("yes")) {
                System.out.print("Enter the temperature of water in Fahrenheit: ");
                double temperature = scanner.nextDouble();

                if (temperature <= 32) System.out.println("At " + temperature + " degrees Fahrenheit, water is a solid");
                else if (temperature >= 212) System.out.println("At " + temperature + " degrees Fahrenheit, water is a gas");
                else System.out.println("At " + temperature + " degrees Fahrenheit, water is in liquid state.");
            } else {
                System.out.println("Goodbye!");
            }
        }
        catch (Exception e){
            System.out.println("bro");
        }
    }
}
