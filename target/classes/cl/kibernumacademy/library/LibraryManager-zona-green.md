```java
package cl.kibernumacademy.library;

public class LibraryManager {
  
  public Book addBook(String title, String author, int year) {
    return new Book(title, author, year);
  }

}

```