// Create a Class Book that has id, name, author and quantity for each bookissued. The Book class should define a parameterised constructor. Design a class Library that create a HashMap of books which contains an entryof key as Integer and value as Book object. Instantiate atleast two Bookobjects and display the collection of books in the HashMap. Use proper method of HashMap class to return the following things(a.)Check if a particular book name is present in the map(b.) remove the value associated with a particular key value which will remove the book entry.
import java.util.HashMap;
class Book{
  int id, quantity;
  String name, author;
  Book(int id,String name,String author,int quantity){
    this.id=id;
    this.name=name;
    this.author=author;
    this.quantity=quantity;
  }
  public String toString(){return "Book id: "+id+"\nBook name: "+name+"\nAuthor: "+author+"\nQuantity: "+quantity;}
}
class Library{
  HashMap<Integer,Book> map = new HashMap<>();
  void addBook(Book b){map.put(b.id,b);}
  void display(){System.out.println(map);}
  void check(String name){
    for(int i:map.keySet())
      if(map.get(i).name.equals(name)){
        System.out.println("Book found");
        return;
      }
  }
  void remove(int id){map.remove(id);}
}
public class Q5{
  public static void main(String[] args){
    Book b1=new Book(1,"Harry Potter","J.K.Rowling",10);
    Book b2=new Book(2,"Harry Potter 2","J.K.Rowling",10);
    Library l=new Library();
    l.addBook(b1);
    l.addBook(b2);
    l.display();
    l.check("Harry Potter 2");
    l.remove(2);
    l.display();
  }
}