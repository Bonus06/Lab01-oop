package com.library.lab01;

import java.time.LocalDate;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private double price;
    private String status;
    private LocalDate returnDate;

    public Book(String title, String author, String isbn, double price, String status){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public void displayDetails(){
        System.out.println(" - Title : " +title);
        System.out.println(" - author : " +author);
        System.out.println(" - isbn : " +isbn);
        System.out.println(" - status : " +status);
        System.out.println(" - return Due Date : " +returnDate);
    }
    public void checkout() {
        if("Borrowed".equalsIgnoreCase(this.status)){
            System.out.println("Book '" + title + " has been checked out successfully.");
            return;
        }
        System.out.println("Book '" + title + " has been checked out successfully.");
        this.status = "Borrowed";
        this.returnDate = LocalDate.now().plusDays(14);
        System.out.println(" Return Due Date: "+this.returnDate);
    }
    public void returnBook(){
        System.out.println("Book '" + title + " has been checked out successfully.");
    }
}


