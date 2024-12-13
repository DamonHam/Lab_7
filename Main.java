import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Enter a monetary amount (e.g., 47.63) or type 'quit' to exit:");

        while (true) {
            System.out.print("Enter amount: ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("quit")) {
                System.out.println("Thank you for using ChangeR'Us for all of your money counting needs!!");
                break;
            }

            try {
                double amount = Double.parseDouble(input);

                if (amount < 0) {
                    System.out.println("Please enter a positive monetary amount.");
                } else {
                    String result = Calculator.calculateChange(amount);
                    System.out.println("The fewest number of each bill and coin:");
                    System.out.println(result);
                }
            } catch (NumberFormatException e) {
                System.out.println("EXCEPTION: Invalid input");
            }
        }

        scanner.close();
    }
}
