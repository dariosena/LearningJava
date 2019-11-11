package howtoprogram;

import javax.swing.JOptionPane;

// Fig. 3.13: NameDialog.java
// Obtaining user input from a dialog.

public class NameDialog {
    public static void main(String[] args) {
        // prompt user to enter a name
        String name = JOptionPane.showInputDialog("What is your name?");

        // create the message
        String message = String.format("Welcome, %s, to Java Programing!", name);

        // display the message to welcome the user by name
        JOptionPane.showMessageDialog(null, message);
    }
} // end class NameDialog
