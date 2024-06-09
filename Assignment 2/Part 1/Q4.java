//Write a program to create a Student class with members name, rn, and totalMark. Create an array of student objects and search a student object using linear search from the array. Note: Overload compareTo method of Comparable interface. 

class Student implements Comparable<Student>{
  String name;
  int rn;
  int totalMark;
  public Student(String name,int rn,int totalMark){
    this.name=name;
    this.rn=rn;
    this.totalMark=totalMark;
  }
  public String toString(){return "Name : "+name+"\nRoll Number : "+rn+"\nTotal Marks : "+totalMark;}
  public int compareTo(Student s){return this.rn-s.rn;}
}
public class Q4{
  public static void main(String [] args){
    Student [] s={
      new Student("A",1,100),
      new Student("B",2,200),
      new Student("C",3,300),
      new Student("D",4,400),
      new Student("E",5,500),
      new Student("F",6,600),
      new Student("G",7,700),
      new Student("H",8,800),
      new Student("I",9,900),
      new Student("J",10,1000)
    };
    int rn=6;
    int index=linearSearch(s,rn);
    if(index==-1)System.out.println("Not Found");
    else System.out.println(s[index]);
  }
  public static int linearSearch(Student [] s,int rn){
    Student temp = new Student(null,rn,0);
    for(int i=0;i<s.length;i++) if(s[i].compareTo(temp)==0) return i;
    return -1;
  }
}


// import java.util.Scanner;

// class Student4 implements Comparable <Student4> {
//     String name;
//     int rn;
//     int totalMark;

//     public Student4(String name, int rn, int totalMark) {
//         this.name = name;
//         this.rn = rn;
//         this.totalMark = totalMark;
//     }

//     @Override
//     public int compareTo(Student4 other) {
//         return Integer.compare(this.rn, other.rn);
//     }

//     public static Student4 searchStudent(Student4 [] students, int rn) {
//         for (Student4 student : students) {
//             if (student.rn == rn) {
//                 return student;
//             }
//         }
//         return null;
//     }
// }

// public class Q4 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         Student4 [] students = new Student4[5];
//         students[0] = new Student4("Suprit", 43, 85);
//         students[1] = new Student4("Aditya", 53, 78);
//         students[2] = new Student4("Ratikanta", 9, 90);
//         students[3] = new Student4("Mohibur", 56, 88);
//         students[4] = new Student4("Ronit", 105, 95);

//         System.out.print("Enter the roll number to search: ");
//         int searchRN = scanner.nextInt();

//         Student4 foundStudent = Student4.searchStudent(students, searchRN);
//         if (foundStudent != null) {
//             System.out.println("Student found:");
//             System.out.println("Name: " + foundStudent.name);
//             System.out.println("Roll Number: " + foundStudent.rn);
//             System.out.println("Total Marks: " + foundStudent.totalMark);
//         } else {
//             System.out.println("Student with roll number " + searchRN + " not found.");
//         }
//     }
// }