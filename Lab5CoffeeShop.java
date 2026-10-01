/*
 * Lab 5 - Exercise 2: Coffee Shop Menu
 * Purpose: Display a coffee menu, read the customer's choice, and
 *          show the selected drink. Demonstrates the switch statement.
 */
import java.util.Scanner;

public class Lab5CoffeeShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Display the menu
        System.out.println("Coffee Shop Menu");
        System.out.println("1 - Espresso");
        System.out.println("2 - Latte");
        System.out.println("3 - Cappuccino");
        System.out.println("4 - Mocha");

        // Read the customer's choice
        System.out.print("Enter your choice: ");
        int menuChoice = input.nextInt();

        // Determine the drink with a switch statement
        switch (menuChoice) {
            case 1:
                System.out.println("Espresso");
                break;
            case 2:
                System.out.println("Latte");
                break;
            case 3:
                System.out.println("Cappuccino");
                break;
            case 4:
                System.out.println("Mocha");
                break;
            default:
                System.out.println("Invalid choice");
        }

        input.close();
    }
}
