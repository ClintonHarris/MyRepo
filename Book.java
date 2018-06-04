/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstoregui;

/*
* File: Book.java
* Author: Clinton Harris
* Date: 5 October 2017
* Purpose: This program helps build a Book for the BookStoreGUI and Bookstore. 
* It takes and stores the title, author, publication year, original price, and 
* condition. 
 */
public class Book {
    //data fields to hold info for each book
        private String title;
        private String author;
        private int publicationYear;
        private double originalPrice;
        private String condition;
        
        //constructor for building a book
        public Book (String title, String author, int publicationYear, 
                double originalPrice, String condition) {
            this.title = title;
            this.author = author;
            this.publicationYear = publicationYear;
            this.originalPrice = originalPrice;
            this.condition = condition;
        }
        
        //default constructor
        public Book(){
        }
        
        //setter methods
        public void setTitle (String title) {
            this.title = title;
        }
        
        public void setAuthor (String author) {
            this.author = author;
        }
        
        public void setPublicationYear (int publicationYear) {
            this.publicationYear = publicationYear;
        }
        
        public void setOriginalPrice (double originalPrice) {
            this.originalPrice = originalPrice;
        }
        
        public void setCondition (String condition) {
            this.condition = condition;
        }
        
        //getter methods
        public String getTitle() {
            return title;
        }
        
        public String getAuthor() {
            return author;
        }
        
        public int getPublicationYear() {
            return publicationYear;
        }
        
        public double getOriginalPrice() {
            return originalPrice;
        }
        
        public String getCondition() {
            return condition;
        }
        
}
