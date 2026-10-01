/*
 * Lab 5 - Exercise 3: School Report Card
 * Purpose: Evaluate a student's average grade (if/else-if) and identify
 *          the subject from a code (switch) in one program.
 */
import java.util.Scanner;

public class Lab5ReportCard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Part 1 input: the student's average grade
        System.out.print("Enter student's average grade: ");
        double averageGrade = input.nextDouble();

        // Part 2 input: the subject code
        System.out.print("Enter subject code (1-Math, 2-Science, 3-English): ");
        int subjectCode = input.nextInt();

        // Part 1 - Evaluate the grade with an if/else-if structure
        String gradeRating;
        if (averageGrade > 90) {
            gradeRating = "Excellent";
        } else if (averageGrade >= 75) {
            gradeRating = "Good";
        } else {
            gradeRating = "Needs Improvement";
        }
        System.out.println("Grade: " + gradeRating);

        // Part 2 - Identify the subject with a switch statement
        switch (subjectCode) {
            case 1:
                System.out.println("Subject: Math");
                break;
            case 2:
                System.out.println("Subject: Science");
                break;
            case 3:
                System.out.println("Subject: English");
                break;
            default:
                System.out.println("Invalid subject code");
        }

        input.close();
    }
}
