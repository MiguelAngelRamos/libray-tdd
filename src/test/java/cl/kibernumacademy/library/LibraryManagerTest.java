package cl.kibernumacademy.library;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LibraryManagerTest {

  LibraryManager libraryManager;

  @BeforeEach
  void setUp() {
    libraryManager = new LibraryManager();
  }

  // Crud, crear, read, update, delete (libros) debemos crear un modelo
  @Test
  void testAddBook() {
    // Arrange
    String bookTitle = "1984";
    String bookAuthor = "George Orwell";
    int year = 1949;

    // Act
    Book book = libraryManager.addBook(bookTitle, bookAuthor, year);
    
    // Assert 
    assertNotNull(book, "Book should not be null");
    assertEquals(bookTitle, book.getTitle());

  }



}
