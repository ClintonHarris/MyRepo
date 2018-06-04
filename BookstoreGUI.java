
package bookstoregui;

/*
* File: BookstoreGUI.java
* Author: Clinton Harris
* Date: 5 October 2017
* Purpose: This program defines a GUI for a Book Store. It populates fields for
* entering a title, author, publication year, and original cover price of a 
* book. It then has buttons for adding a book, removing a book, getting a book's
* current price, and displaying the current inventory. 
*  
 */

//imports
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

//BookstoreGUI class
public class BookstoreGUI extends JFrame {

    /**
     * Creates new form BookstoreGUI
     */
    public BookstoreGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     *
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code from GUI Builder">                          
    private void initComponents() {
        //initializing fields for the GUI
        titleText = new JTextField();
        authorText = new JTextField();
        publicationYearText = new JTextField();
        originalPriceText = new JTextField();
        titleLabel = new JLabel();
        authorLabel = new JLabel();
        pubilcationYearLabel = new JLabel();
        originalPriceLabel = new JLabel();
        mintRadio = new JRadioButton();
        nearMintRadio = new JRadioButton();
        acceptableRadio = new JRadioButton();
        poorRadio = new JRadioButton();
        header1 = new JLabel();
        header2 = new JLabel();
        jPanel1 = new JPanel();
        addBookButton = new JButton();
        removeBookButton = new JButton();
        getCurrentPriceButton = new JButton();
        displayInventoryButton = new JButton();
        clearText = new JButton();
        
        //creating ButtonGroup and adding radios to it
        radios = new ButtonGroup();
        radios.add(mintRadio);
        radios.add(nearMintRadio);
        radios.add(acceptableRadio);
        radios.add(poorRadio);
        
        //adding ActionListeners to buttons
        addBookButton.addActionListener(new AddBookButtonListener());
        removeBookButton.addActionListener(new RemoveBookButtonListener());
        getCurrentPriceButton.addActionListener(new GetCurrentPriceButtonListener());
        displayInventoryButton.addActionListener(new DisplayInventoryButtonListener());
        clearText.addActionListener(new ClearTextButtonListener());
        
        //set to exit program on window close
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

//        titleText.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                titleTextActionPerformed(evt);
//            }
//        });

        //setting the text of the fields
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Title");

        authorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        authorLabel.setText("Author");

        pubilcationYearLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pubilcationYearLabel.setText("Publication Year");

        originalPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        originalPriceLabel.setText("Original Cover Price");

        mintRadio.setText("MINT");

        nearMintRadio.setText("NEAR MINT");

        acceptableRadio.setText("ACCEPTABLE");

        poorRadio.setText("POOR");

        header1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        header1.setText("Please enter the book's information. Then select the condition ");

        header2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        header2.setText("of the book and select what action you would like to take. ");

        addBookButton.setText("Add Book");

        removeBookButton.setText("Remove Book");

        getCurrentPriceButton.setText("Get Current Price");

        displayInventoryButton.setText("Display Inventory");

        clearText.setText("Clear Text");
        
        
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(addBookButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(getCurrentPriceButton, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(removeBookButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(displayInventoryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(clearText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(addBookButton, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                        .addComponent(removeBookButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(getCurrentPriceButton, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                        .addComponent(displayInventoryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(clearText)
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(titleText, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(originalPriceText)
                                        .addComponent(publicationYearText, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(authorText)
                                        .addComponent(header1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                                        .addComponent(header2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(titleLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(authorLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pubilcationYearLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(originalPriceLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(mintRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nearMintRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(acceptableRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(poorRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(header1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(header2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(titleLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(titleText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(authorLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(authorText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pubilcationYearLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(publicationYearText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(originalPriceLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(originalPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(mintRadio)
                                        .addComponent(nearMintRadio)
                                        .addComponent(acceptableRadio)
                                        .addComponent(poorRadio))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
        this.setLocationRelativeTo(null);
    }// </editor-fold>                        
    
    //method for clearing the Price text field
    private void clearPriceField() {
        originalPriceText.setText("");
    }
    
    //method for clearing the Author text field
    private void clearAuthorField() {
        authorText.setText("");
    }

    //method for clearing the Year text field
    private void clearYearField() {
        publicationYearText.setText("");
    }

    //method for clearing the Title text field
    private void clearTitleField() {
        titleText.setText("");
    }

    //class for the AddBookButton actionlistener
    class AddBookButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == addBookButton) {
                try {
                    //checks for if the book is already in the inventory
                    if (bookstore.searchForBook(getTitleEntry())) {
                        throw new InvalidEntry(6);
                    } else if (getPriceEntry() >= 0){
                        //create book from entry
                        Book book = new Book(getTitleEntry(), getAuthorEntry(),
                                getYearEntry(), getPriceEntry(), getConditionRadio());
                        //add book to inventory
                        bookstore.addBook(book);
                    } else {
                        throw new InvalidEntry(1);
                    }
                } catch (InvalidEntry ex) {

                }

            }
        }

    }

    //class for the DisplayInventoryButton actionlistener
    class DisplayInventoryButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent g) {
            getInventory();
            String output = "";
            
            //loops through each book and displays each component 
            for (int i = 0; i < al.size(); i++) {
                output += "\"" + al.get(i).getTitle() + "\", " 
                + al.get(i).getAuthor() + ", " 
                + al.get(i).getPublicationYear() + ", " 
                + df.format(al.get(i).getOriginalPrice()) + ", "
                + al.get(i).getCondition()+"\n";
            }

            JOptionPane.showMessageDialog(frame, output, "Current Inventory",
                    JOptionPane.INFORMATION_MESSAGE);
        }

    }

    //class for the GetCurrentPriceButton actionlistener
    class GetCurrentPriceButtonListener implements ActionListener {

        @Override
        //retrieves the current price given the original price, year, and condition
        public void actionPerformed(ActionEvent h) {
            Book book;
            String output;
            getInventory();
            try {
                book = bookstore.getBook(getTitleEntry());
                output = "The current price for \"" + book.getTitle()
                        + "\" is: \n" + df.format(bookstore.getCurrentPrice((2017 - book.getPublicationYear()), book.getOriginalPrice(),
                                book.getCondition())) ;

                JOptionPane.showMessageDialog(frame, output, "Current Price",
                        JOptionPane.INFORMATION_MESSAGE);
            } catch (InvalidEntry ex) {
            }

        }

    }

    //class for the RemoveBookButton actionlistener
    class RemoveBookButtonListener implements ActionListener {

        @Override
        //removes a book from the inventory
        public void actionPerformed(ActionEvent i) {
            Book book;
            String output;
            getInventory();

            try {
                bookstore.removeBook(getTitleEntry().toLowerCase());
                output = "The following book was successfully removed from"
                        + " the inventory: \n" + titleText.getText();
            } catch (InvalidEntry ex) {
            }
        }

    }

    //class for the ClearTextButton actionlistener
    class ClearTextButtonListener implements ActionListener {

        @Override
        //clears the text of all text fields
        public void actionPerformed(ActionEvent f) {
            if (f.getSource() == clearText) {
                clearPriceField();
                clearAuthorField();
                clearYearField();
                clearTitleField();
            }

        }
    }

    //takes the entry from the Price text field and checks for a positive number
    //and no text
    private double getPriceEntry() {
        try {
            if (Double.parseDouble(originalPriceText.getText()) >= 0) {
                return Double.parseDouble(originalPriceText.getText());
            } else {
                JOptionPane.showMessageDialog(frame, "Invalid Entry! \n"
                        + "Please enter a number greater than or \n"
                        + "equal to zero.", "Warning!",
                        JOptionPane.WARNING_MESSAGE);
                clearPriceField();
                return -1;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Invalid Entry! \n"
                    + "Please enter numbers only.", "Warning!",
                    JOptionPane.WARNING_MESSAGE);
            clearPriceField();
            return -1;
        }
    }

    //takes input from Author text field and makes sure there is input
    private String getAuthorEntry() throws InvalidEntry {
        if (authorText.getText().equals("")) {
            clearAuthorField();
            throw new InvalidEntry(3);
        } else {
            return authorText.getText();
        }
    }

    //takes input from Title text field and makes sure there is input
    private String getTitleEntry() throws InvalidEntry {
        if (titleText.getText().equals("")) {
            throw new InvalidEntry(3);
        } else {
            return titleText.getText();
        }
    }

    //take input from Year text field and makes sure the date is not in the
    //future and the entry is numerical
    private int getYearEntry() throws InvalidEntry {
        try {
            if (Integer.parseInt(publicationYearText.getText()) > 2017) {
                clearYearField();
                throw new InvalidEntry(2);
            } else {
                return Integer.parseInt(publicationYearText.getText());
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Invalid Entry! \n"
                    + "Please enter numbers only.", "Warning!",
                    JOptionPane.WARNING_MESSAGE);
            clearYearField();
            return -1;
        }
    }
    
    //gets the selection for the radios and makes sure one is selected
    private String getConditionRadio() throws InvalidEntry {
        if (mintRadio.isSelected()) {
            return "mint condition";
        } else if (nearMintRadio.isSelected()) {
            return "near mint condition";
        } else if (acceptableRadio.isSelected()) {
            return "acceptable condition";
        } else if (poorRadio.isSelected()) {
            return "poor condition";
        } else {
            throw new InvalidEntry(4);
        }
    }

    //populates an ArrayList with the current inventory
    private void getInventory() {
        al = bookstore.getInventory();

    }
//    private void titleTextActionPerformed(java.awt.event.ActionEvent evt) {                                          
//        // TODO add your handling code here:
//    }                                         

    //Main method. 
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookstoreGUI().setVisible(true);
            }
        });
    }

    // Variables declaration                    
    private JButton addBookButton;
    private JLabel authorLabel;
    private JTextField authorText;
    private JButton clearText;
    private JButton displayInventoryButton;
    private JButton getCurrentPriceButton;
    private JLabel header1;
    private JLabel header2;
    private JPanel jPanel1;
    private JRadioButton mintRadio;
    private JRadioButton nearMintRadio;
    private JRadioButton acceptableRadio;
    private JRadioButton poorRadio;
    private JLabel originalPriceLabel;
    private JTextField originalPriceText;
    private JLabel pubilcationYearLabel;
    private JTextField publicationYearText;
    private JButton removeBookButton;
    private JLabel titleLabel;
    private JTextField titleText;
    private ButtonGroup radios;
    JOptionPane frame = new JOptionPane();
    String mint = "Mint Condition";
    String nearMint = "Near Mint Condition";
    String acceptable = "Acceptable Condition";
    String poor = "Poor Condition";
    ArrayList<Book> al = new ArrayList<>();
    Bookstore bookstore = new Bookstore(al);
    // End of variables declaration  

    //decimal format for prices
    private static final DecimalFormat df = new DecimalFormat("$0.00");
}
