/*
 * Lab 5 - Exercise 1: Movie Ticket Adventure
 * Purpose: Determine a customer's ticket price category based on age,
 *          student ID status, and whether it is Wednesday.
 *          Demonstrates the use of nested if statements.
 */
import java.util.Scanner;

public class Lab5MovieTicket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for the customer's age
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if (age < 12) {
            // Children under 12 always get the child discount
            System.out.println("Child Discount");
        } else {
            if (age <= 18) {
                // Ages 12 through 18: check for a student ID
                System.out.print("Do you have a student ID? (yes/no): ");
                String hasStudentId = input.next();

                if (hasStudentId.equalsIgnoreCase("yes")) {
                    System.out.println("Student Discount");
                } else {
                    System.out.println("Full Price");
                }
            } else {
                // Over 18: check whether today is Wednesday
                System.out.print("Is today Wednesday? (yes/no): ");
                String isWednesday = input.next();

                if (isWednesday.equalsIgnoreCase("yes")) {
                    System.out.println("Mid-Week Discount");
                } else {
                    System.out.println("Full Price");
                }
            }
        }

        input.close();
    }
}
