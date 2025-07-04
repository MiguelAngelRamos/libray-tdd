package cl.kibernumacademy.library;

import java.util.HashMap;
import java.util.Map;

public class LibraryManager {
  
  private final Map<Integer, Book> booksMap = new HashMap<>();
  private int nextId = 1;
  
  public Book addBook(String title, String author, int year) {
    Book book = new Book(nextId++, title, author, year);
    booksMap.put(book.getId(), book);
    return book;
  }

}
