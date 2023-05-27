package com.example.library_beer.service;

import com.example.library_beer.model.Book;
import org.springframework.data.domain.Page;

import java.util.List;

public interface  BookService {
    List<Book> getAllBooks();
    void saveBook(Book book);
    Book getBookById(long id);
    void deleteBookById(long id);
    Page<Book> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}