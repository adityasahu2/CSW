// Write a Java code snippet that comprises of a User class and an ArrayListUser class. The User class should define private fields for name and age, along with a parameterized constructor and getter/setter methods for these attributes. Create an ArrayListUser class of User objects. After addition of objects, the ArrayListUser class should retrieve and print the name and age of users. Then, it should sort the user according to age using getter methods and print the updated array list of users.
import java.util.*;
class User{
  private String name;
  private int age;
  public User(String name, int age){
    this.name = name;
    this.age = age;
  }
  public void setName(String name){this.name = name;}
  public void setAge(int age){this.age = age;}
  public String getName(){return name;}
  public int getAge(){return age;}
}
class ArrayListUser{
  private ArrayList<User> userList;
  public ArrayListUser(){userList = new ArrayList<User>();}
  public void addUser(User user){userList.add(user);}
  public void printUser(){for(User user: userList) System.out.println(user.getName() + " - " + user.getAge());}
  public void sortUser(){
    ListIterator li = userList.listIterator();
    while(li.hasNext()){
        User user = (User)li.next();
        ListIterator temp = userList.listIterator(li.nextIndex());
        while (temp.hasNext()){
            User nextUser = (User)temp.next();
            if(user.getAge() > nextUser.getAge()){
                temp.set(user);
                li.set(nextUser);
                user = nextUser;
            }
        }
    }
  }
}
public class Q2{
  public static void main(String[] args){
    ArrayListUser userList = new ArrayListUser();
    userList.addUser(new User("A", 10));
    userList.addUser(new User("C", 30));
    userList.addUser(new User("B", 20));
    userList.addUser(new User("E", 50));
    userList.addUser(new User("D", 40));
    userList.printUser();
    userList.sortUser();
    userList.printUser();
  }
}

// class User {
//     private String name;
//     private int age;

//     public User(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public int getAge() {
//         return age;
//     }

//     public void setAge(int age) {
//         this.age = age;
//     }
// }

// class ArrayListUser {
//     private User [] users;
//     private int size;

//     public ArrayListUser(int capacity) {
//         users = new User[capacity];
//         size = 0;
//     }

//     public void addUser(User user) {
//         if (size < users.length) {
//             users[size++] = user;
//         } else {
//             System.out.println("ArrayListUser is full, cannot add more users.");
//         }
//     }

//     public void printUsers() {
//         System.out.println("Users:");
//         for (int i = 0; i < size; i++) {
//             System.out.println("Name: " + users[i].getName() + ", Age: " + users[i].getAge());
//         }
//     }

//     public void sortUsersByAge() {
//         for (int i = 0; i < size - 1; i++) {
//             for (int j = 0; j < size - i - 1; j++) {
//                 if (users[j].getAge() > users[j + 1].getAge()) {
//                     User temp = users[j];
//                     users[j] = users[j + 1];
//                     users[j + 1] = temp;
//                 }
//             }
//         }
//     }
// }

// public class Q2 {
//     public static void main(String[] args) {
//         ArrayListUser arrayListUser = new ArrayListUser(5);

//         arrayListUser.addUser(new User("Suprit", 25));
//         arrayListUser.addUser(new User("Aditya", 30));
//         arrayListUser.addUser(new User("Ronit", 20));

//         arrayListUser.printUsers();

//         arrayListUser.sortUsersByAge();

//         System.out.println("\nSorted Users by Age:");
//         arrayListUser.printUsers();
//     }
// }