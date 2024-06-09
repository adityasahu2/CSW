// Write a program to create a Student class with members name, rn, and total mark. Create an array of student objects and sort it using Bubble sort according to its rn. Note: Overload compareTo method of Comparable interface.

class Student implements Comparable<Student> {
    String name;
    int rn;
    int totalMark;
    public Student(String name, int rn, int totalMark) {
        this.name = name;
        this.rn = rn;
        this.totalMark = totalMark;
    }
    @Override
    public int compareTo(Student o) {return this.rn-o.rn;}
    public String toString(){return "Name : "+name+"\nRoll Number : "+rn+"\nTotal Marks : "+totalMark;}
}
public class Q5 {
    public static void main(String[] args) {
        Student [] students = {
            new Student("Suprit", 1, 85),
            new Student("Aditya", 5, 78),
            new Student("Ratikanta", 3, 90),
            new Student("Mohibur", 4, 88),
            new Student("Ronit", 2, 95)
        };
        bubbleSort(students);
        System.out.println("Sorted Students:");
        for (Student student : students) System.out.println(student);
    }
    public static void bubbleSort(Student [] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    Student temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
