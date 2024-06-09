/*
Library System Assignment: 
Task: Develop a Java program for a library system incorporating encapsulation, abstraction,  and inheritance. 
i. LibraryResource Class: 
 - Abstract class with private attributes for title and author. 
 - Constructor, getters, setters, and an abstract method displayDetails(). 
ii. Book Class: 
 - Subclass of LibraryResource with additional attribute pageCount. 
 - Constructor, getters, setters, and displayDetails() method override. 
iii. Magazine Class: 
 - Subclass of LibraryResource with additional attribute issueDate. 
 - Constructor, getters, setters, and displayDetails() method override. 
iv. DVD Class: 
 - Subclass of LibraryResource with additional attribute duration. 
 - Constructor, getters, setters, and displayDetails() method override. 
v. LibrarySystem Class (Main): 
 - Instantiate various library resources (e.g., Book, Magazine, DVD). 
 - Call displayDetails() for each instance to show resource information. 
*/
abstract class LibraryResource{
  private String title, author;
  public LibraryResource(String title, String author){
    this.title = title;
    this.author = author;
  }
  public String getTitle(){return this.title;}
  public String getAuthor(){return this.author;}
  public void setTitle(String title){this.title = title;}
  public void setAuthor(String author){this.author = author;}
  public abstract void displayDetails();
}
class Book extends LibraryResource{
  private int pageCount;
  public Book(String title, String author, int pageCount){
    super(title, author);
    this.pageCount = pageCount;
  }
  public int getPageCount(){return this.pageCount;}
  public void setPageCount(int pageCount){this.pageCount = pageCount;}
  public void displayDetails(){
    System.out.println("Title : "+this.getTitle()+"\nAuthor : "+this.getAuthor()+"\nPage Count : "+this.getPageCount()+"\n");
  }
}
class Magazine extends LibraryResource{
  private String issueDate;
  public Magazine(String title, String author, String issueDate){
    super(title, author);
    this.issueDate = issueDate;
  }
  public String getIssueDate(){return this.issueDate;}
  public void setIssueDate(String issueDate){this.issueDate = issueDate;}
  public void displayDetails(){
    System.out.println("Title : "+this.getTitle()+"\nAuthor : "+this.getAuthor()+"\nIssue Date : "+this.getIssueDate()+"\n");
  }
}
class DVD extends LibraryResource{
  private int duration;
  public DVD(String title, String author, int duration){
    super(title, author);
    this.duration = duration;
  }
  public int getDuration(){return this.duration;}
  public void setDuration(int duration){this.duration = duration;}
  public void displayDetails(){
    System.out.println("Title : "+this.getTitle()+"\nAuthor : "+this.getAuthor()+"\nDuration : "+this.getDuration()+"\n");
  }
}
//public class LibrarySystem
public class Q6{
  public static void main(String[] args){
    Book B = new Book("The Alchemist", "Paulo Coelho", 352);
    Magazine M = new Magazine("The New York Times", "New York Times", "January 1, 2023");
    DVD D = new DVD("The Shawshank Redemption", "Frank Darabont", 180);
    B.displayDetails();
    M.displayDetails();
    D.displayDetails();
  }
}