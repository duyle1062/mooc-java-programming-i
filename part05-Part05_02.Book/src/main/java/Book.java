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
    private String name;
    private String author;
    private int pages;
    
    public Book(String author, String name, int pages) {
        this.name = name;
        this.author = author;
        this.pages = pages;
    }
    
    public String getAuthor() {
        return this.author;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getPages() {
        return this.pages;
    }
    
    public String toString() {
        return this.author + ", " + this.name + ", " + this.pages + " pages";
    }
}
