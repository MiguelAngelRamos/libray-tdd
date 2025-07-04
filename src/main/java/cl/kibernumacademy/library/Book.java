package cl.kibernumacademy.library;

public class Book {

  private final int id;
  private String title, author;
  private int year;

  public Book(int id, String title, String author, int year) {
    this.id = id;
    this.title = title;
    this.author = author;
    this.year = year;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public int getYear() {
    return year;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public void setYear(int year) {
    this.year = year;
  }


}
