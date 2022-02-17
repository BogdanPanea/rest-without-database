package ro.bogdanpanea.restWithoutDatabase.service;

import ro.bogdanpanea.restWithoutDatabase.pojo.Book;

import java.util.HashSet;

public interface BookService {
    HashSet<Book> findAllBook();

    Book findBookByID(long id);

    void addBook(Book b);

    void deleteAllData();
}
