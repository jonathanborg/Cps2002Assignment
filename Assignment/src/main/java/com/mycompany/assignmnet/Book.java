/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignmnet;

import java.util.*;
/**
 *
 * @author jonathan
 */
public class Book {
    private String title;
    private String author;
    private int edition;
    
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getEdition() {
        return edition;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }
    
    public static void main(String[] args){
        System.out.print("Test");
    }
}
