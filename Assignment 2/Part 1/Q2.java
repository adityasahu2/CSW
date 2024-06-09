//Write a program to create a Book class with member variables bookId, bookName, and price. Add the respective method and constructor to it. Create a driver class in that class and create two book objects. Compare the book objects according to their price. Print the details of the book objects. Note: Overload toString and equals method. 

class Book{
  int bookId;
  String bookName;
  double price;
  public Book(int bookId,String bookName,double price){
    this.bookId=bookId;
    this.bookName=bookName;
    this.price=price;
  }
  public String toString(){return "Book Id : "+bookId+"\nBook Name : "+bookName+"\nPrice : "+price;}
  public boolean equals(Object obj){
    Book b=(Book)obj;
    return this.price == b.price;
  }
}                                    
public class Q2{
  public static void main(String [] args){
    Book b1=new Book(1,"Java",1000);
    Book b2=new Book(1,"Java",1000);
    System.out.println(b1);
    System.out.println(b2);
    if(b1.equals(b2))System.out.println("Price are equal");
    else System.out.println("Price are not equal");
  }
}



// class Book {
//     private int bookId;
//     private String bookName;
//     private double price;

//     public Book(int bookId, String bookName, double price) {
//         this.bookId = bookId;
//         this.bookName = bookName;
//         this.price = price;
//     }

//     public int getBookId() {
//         return bookId;
//     }

//     public void setBookId(int bookId) {
//         this.bookId = bookId;
//     }

//     public String getBookName() {
//         return bookName;
//     }

//     public void setBookName(String bookName) {
//         this.bookName = bookName;
//     }

//     public double getPrice() {
//         return price;
//     }

//     public void setPrice(double price) {
//         this.price = price;
//     }

//     @Override
//     public String toString() {
//         return "Book ID: " + bookId + ", Book Name: " + bookName + ", Price: $" + price;
//     }

//     @Override
//     public boolean equals(Object obj) {
//         if (this == obj)
//             return true;
//         if (obj == null || getClass() != obj.getClass())
//             return false;
//         Book book = (Book) obj;
//         return bookId == book.bookId && Double.compare(book.price, price) == 0 &&
//                (bookName != null ? bookName.equals(book.bookName) : book.bookName == null);
//     }
// }

// public class Q2 {
//     public static void main(String[] args) {
//         Book book1 = new Book(1, "Book A", 20.5);
//         Book book2 = new Book(2, "Book B", 15.75);

//         if (book1.getPrice() > book2.getPrice()) {
//             System.out.println("Book 1 is more expensive than Book 2");
//         } else if (book1.getPrice() < book2.getPrice()) {
//             System.out.println("Book 2 is more expensive than Book 1");
//         } else {
//             System.out.println("Both books have the same price");
//         }

//         System.out.println("Book 1 Details: " + book1);
//         System.out.println("Book 2 Details: " + book2);
//     }
// }
