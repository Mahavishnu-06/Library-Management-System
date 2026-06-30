package com.example.LibraryManagement.controller;

import com.example.LibraryManagement.model.Book;
import com.example.LibraryManagement.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    BookService bookService;
    @GetMapping
    public List<Book> getAllBooks(){
        return bookService.getallBooks();
    }

    @GetMapping("/{id}")
    public Object getbookbyId(@PathVariable("id") int id){
        return bookService.getBookByID(id);
    }

    @PostMapping
    public ResponseEntity<String> addBook(@RequestBody Book book){
        bookService.addBook(book);
        return new ResponseEntity<>("Book added Successfully", HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public void updateBook(@PathVariable int id, @RequestBody Book book) {
        book.setId(id);
        bookService.updateBook(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable int id){
        bookService.deleteByID(id);
    }
    @GetMapping("/category")
    public List<Book> getBookByCategory(@RequestParam("category") String category){
        return bookService.getBookByCategory(category);
    }

    @GetMapping("/price")
    public List<Book> getCheaperBook(@RequestParam("max") float price){
        return bookService.getCheaperBook(price);
    }
    @GetMapping("/year")
    public List<Book> getBookByPublishYearGreaterthan(@RequestParam("year") int year){
        return bookService.getByYear(year);
    }
    @GetMapping("/author/{authorname}")
    public List<Book> getBookByAuthorName(@PathVariable String authorname){
        return  bookService.getByAuthor(authorname);
    }

    @GetMapping("/filter")
    public  List<Book> getByCategoryAndPrice(@RequestParam("category") String cate,@RequestParam("price") float price){
        return bookService.getByCategoryAndPrice(cate,price);
    }

}
