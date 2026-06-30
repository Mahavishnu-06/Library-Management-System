package com.example.LibraryManagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Book {
    @Id
    private int id;
    private String title;
    private String author;
    private String category;
    private float price;
    private int availablecopies;
    private int publishedYear;
}
