package com.example.LibraryManagement.service;

import com.example.LibraryManagement.model.Book;
import com.example.LibraryManagement.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    BookRepo bookRepo;

    public List<Book> getallBooks() {
        return bookRepo.findAll();
    }

    public Object getBookByID(int id) {
        return bookRepo.findById(id);
    }

    public void addBook(Book book) {
        bookRepo.save(book);
    }

    public void updateBook(Book book) {
        bookRepo.save(book);
    }

    public void deleteByID(int id) {
        bookRepo.deleteById(id);
    }

    public List<Book> getBookByCategory(String category) {
        return bookRepo.findByCategory(category);
    }

    public List<Book> getCheaperBook(float price) {
        return bookRepo.findByPriceLessThan(price);
    }

    public List<Book> getByYear(int year) {
        return bookRepo.findByPublishedYearGreaterThan(year);
    }

    public List<Book> getByAuthor(String name) {
        return bookRepo.findByAuthor(name);
    }

    public List<Book> getByCategoryAndPrice(String cate, float price) {
        return bookRepo.findByCategoryAndPriceLessThan(cate,price);
    }
}
