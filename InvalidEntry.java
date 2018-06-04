/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstoregui;

import javax.swing.*;

//class for returning messages from invalid entries
public class InvalidEntry extends Exception {
    JOptionPane frame = new JOptionPane();
    public InvalidEntry(int errorType) {
        switch (errorType) {
            case 1:
                JOptionPane.showMessageDialog(frame, "Invalid Entry! \n"
                        + "Please enter only text or numbers in the"
                        + "appropriate fields", "Warning!",
                        JOptionPane.WARNING_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(frame, "Invalid Entry! \n"
                        + "The entered publication year is in the future. \n"
                        + "Unfortunately, we do not have this technology "
                        + "yet. \n"
                        + "Please enter the correct year.", "Warning!",
                        JOptionPane.WARNING_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(frame, "Invalid Entry! \n"
                + "Some of the required text fields were left blank. \n"
                        + "Please fill out all required information.",
                        "Warning!", 
                JOptionPane.WARNING_MESSAGE);
                break;
            case 4:
                JOptionPane.showMessageDialog(frame, "Invalid Entry! \n"
                + "Please select a condition for the book.", "Warning!", 
                JOptionPane.WARNING_MESSAGE);
                break;
            case 5:
                JOptionPane.showMessageDialog(frame, "Invalid Entry! \n"
                + "A book with the given title was not found. \n"
                        + "Please verify the title.", "Warning!", 
                JOptionPane.WARNING_MESSAGE);
                break;
            case 6:
                JOptionPane.showMessageDialog(frame, "Invalid Entry! \n"
                + "A book with the given title is already in the inventory. \n"
                        + "Please verify the title.", "Warning!", 
                JOptionPane.WARNING_MESSAGE);
                break;
            default:
                break;
        }
    }

}
