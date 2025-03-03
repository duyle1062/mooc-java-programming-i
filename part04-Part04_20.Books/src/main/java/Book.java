/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class Book {
    private String title;
    private int pages;
    private int publicationYear;
    
    public Book(String initialTitle, int initialPages, int initialPublicationYear) {
        this.title = initialTitle;
        this.pages = initialPages;
        this.publicationYear = initialPublicationYear;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public int getPages() {
        return this.pages;
    }
    
    public int getPublicationYear() {
        return this.publicationYear;
    }
    
    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.publicationYear;
    }
}
