package howtoprogram;

// Fig. 4.5: StudentTest.java
// Create and test Student objects.

public class StudentTest {

    public static void main(String[] args) {

        Student student1 = new Student("Emanuel", 90.0);
        Student student2 = new Student("Dario", 80.0);

        System.out.printf("%s's letter grade is: %s%n", student1.getName(), student1.getLetterGrade());

        System.out.printf("%s's letter grade is: %s%n", student2.getName(), student2.getLetterGrade());
    }
} // end class StudentTest
