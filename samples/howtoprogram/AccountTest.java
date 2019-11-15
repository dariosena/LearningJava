package howtoprogram;

// Fig. 3.2: AccountTest.java
// Creating and manipulating an Account object

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        // create a Scanner object to obtain input from the command window
        Scanner input = new Scanner(System.in);

        // create an Account object and assign it to myAccount
        Account myAccount = new Account("Default Name", 1.0);

        // display initial value of name (null)
        System.out.printf("Initial name is: %s%n%n", myAccount.getName());

        // prompt for and read a name
        System.out.println("Please enter a name: ");

        String theName = input.nextLine();
        myAccount.setName(theName);
        System.out.println();

        System.out.printf("Name in object myAccount is: %s%n%n", myAccount.getName());

        input.close();
    }
} // end class AccountTest
