package howtoprogram;

// Fig. 4.4: Student.java
// Student class that stores a student name and average

public class Student {

    private String name;
    private double average;

    public Student(String name, double average) {
        this.name = name;

        // validate that average is > 0.0 and <= 100.0; otherwise,
        // keep instance variable average's default value (0.0)
        if (average > 0.0) {
            if (average <= 100.0) {
                this.average = average;
            }
        }
    }

    // sets the Student's name
    public void setName(String name) {
        this.name = name;
    }

    // retrieves the Student's name
    public String getName() {
        return name;
    }

    public void setAverage(double average) {
        // validate that average is > 0.0 and <= 100.0; otherwise,
        // keep instance variable average's default value (0.0)
        if (average > 0.0) {
            if (average <= 100.0) {
                this.average = average;
            }
        }
    }

    public double getAverage() {
        return average;
    }

    // determines and returns the Student's letter grade
    public String getLetterGrade() {

        String letterGrade = "";

        if (average >= 90.0)
            letterGrade = "A";
        else if (average >= 80.0)
            letterGrade = "B";
        else if (average >= 70.0)
            letterGrade = "C";
        else if (average >= 60.0)
            letterGrade = "D";
        else
            letterGrade = "F";

        return letterGrade;
    }
} // end class Student
