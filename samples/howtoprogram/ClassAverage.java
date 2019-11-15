package howtoprogram;

// Fig. 4.8: ClassAverage.java
// Solving the class-average problem using counter-controlled repetition.

import java.util.Scanner;

public class ClassAverage {

    public static void main(String[] args) {
        // create Scanner to obtain input from command window
        Scanner scanner = new Scanner(System.in);

        int total = 0; // initialize sum of grades entered by the user
        int gradeCounter = 1; // initialize # of grade to be entered next

        while (gradeCounter <= 10) {
            System.out.print("Enter grade: ");

            int grade = scanner.nextInt();
            total = total + grade;
            gradeCounter = gradeCounter + 1;
        }

        int average = total / 10;

        System.out.printf("%nTotal of all 10 grades is %d%n", total);
        System.out.printf("Class average is %d%n", average);

        scanner.close();
    }
} // end class ClassAverage
