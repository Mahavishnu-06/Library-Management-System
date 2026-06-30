package com.example.LibraryManagement.repository;

import com.example.LibraryManagement.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepo extends JpaRepository<Book,Integer> {

    List<Book> findByCategory(String category);

    List<Book> findByPriceLessThan(float price);

    List<Book> findByPublishedYearGreaterThan(int year);

    List<Book> findByAuthor(String name);

    List<Book> findByCategoryAndPriceLessThan(String cate, float price);
}
