// Developing a Simple College Management System in Java Create a Java program for managing colleges and students. The provided classes model the relationship between colleges and students. The College class represents a college with attributes collegeName and collegeLoc. The Student class represents a student with attributes studentId, studentName, and a reference to a College object. Enhance the Student class by adding a constructor that assigns a student ID, name, and college information. Additionally, add a method named displayStudentInfo() that prints the student's ID, name, and the college information in which they are enrolled.In the Main class, instantiate at least two College objects and at least two Student objects. Enroll each student in one of the colleges. Then, display the information of all colleges and all  students using the appropriate methods. 
class College{
  String collegeName;
  String collegeLoc;
}
class student{
  private int studentId;
  private String studentName;
  private College college;
  public student(int studentId, String studentName, College college){
    this.studentId = studentId;
    this.studentName = studentName;
    this.college = college;
  }
  public void displayStudentInfo(){
    System.out.println("Student ID : "+this.studentId+"\nStudent Name : "+this.studentName+",\nCollege Name : "+this.college.collegeName +"\nCollege Locatin : "+this.college.collegeLoc+"\n");
  }
}
public class Q5{
  public static void main(String[] args){
    College C1 = new College();
    College C2 = new College();
    C1.collegeName = "ITER";
    C1.collegeLoc = "Bhubaneswar";
    C2.collegeName = "KIIT";
    C2.collegeLoc = "Bhubaneswar";
    student S1 = new student(1,"Aditya",C1);
    student S2 = new student(2,"Suprit",C2);
    S1.displayStudentInfo();
    S2.displayStudentInfo();
  }
}