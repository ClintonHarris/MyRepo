/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstoregui;

/*
* File: Bookstore.java
* Author: Clinton Harris
* Date: 5 October 2017
* Purpose: This program stores the inventory of books and provides methods for
* getting a book, adding a book, removing a book, and getting the current price
* of a book.
*  
 */
import java.util.*;

public class Bookstore {

    //ArrayList for storing all of the books
    ArrayList<Book> inventory = new ArrayList<>();

    //constructor for creating a "bookstore" (inventory)
    public Bookstore(ArrayList<Book> al) {
        this.inventory = al;
    }

    //method for adding a book to the inventory
    public void addBook(Book b) {
        inventory.add(b);
        
    }

    //method for getting a book from the inventory
    public Book getBook(String title) {
        for (Book n : inventory) {
            if (title.equalsIgnoreCase(n.getTitle())) {
                return n;
            }
        }
        return null;
    }
    
    //method for checking to see if a book is in the inventory
    public Boolean searchForBook(String title) {
        for (Book n : inventory) {
            if (title.equalsIgnoreCase(n.getTitle())) {
                return true;
            }
        }
        return false;
    }
    
    //method for getting the inventory
    public ArrayList<Book> getInventory() {
        return inventory;
    }

    //method for removing a book from the inventory
    public void removeBook(String title) throws InvalidEntry {
        for (Book n : inventory) {
            if (title.equalsIgnoreCase(n.getTitle())) {
                inventory.remove(n);
            } else {
                throw new InvalidEntry(5);
            }
        }
    }

    //gets the current price based on the year, original price, and condition
    public double getCurrentPrice(int year, double originalPrice, String condition) throws InvalidEntry {
        if (year >= 0 && year < 10) {
            if (condition.equalsIgnoreCase("mint condition")) {
                return originalPrice;
            } else if (condition.equalsIgnoreCase("near mint condition")) {
                return originalPrice * 0.9;
            } else if (condition.equalsIgnoreCase("acceptable condition")) {
                return originalPrice * 0.75;
            } else if (condition.equalsIgnoreCase("poor condition")) {
                return originalPrice * 0.5;
            } else {
                throw new InvalidEntry(4);
            }
        } else if (year >= 10) {
            if (condition.equalsIgnoreCase("mint condition")) {
                return originalPrice * 2;
            } else if (condition.equalsIgnoreCase("near mint condition")) {
                return originalPrice * 1.5;
            } else if (condition.equalsIgnoreCase("acceptable condition")) {
                return originalPrice * 1.25;
            } else if (condition.equalsIgnoreCase("poor condition")) {
                return originalPrice;
            } else {
                throw new InvalidEntry(4);
            }

        } else {
            throw new InvalidEntry(2);
        }

    }
}
