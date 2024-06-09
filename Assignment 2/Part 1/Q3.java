// Q3) Write a program to create a Car class with member variables model, color, and speed. Add the respective method and constructor to it. Create a driver class in that class and create two car objects. Compare the car objects according to their speed and print the details of the car that has a greater speed. Note: Overload compareTo method of Comparable interface. 

class Car implements Comparable<Car>{
  String model;
  String color;
  int speed;
  public Car(String model,String color,int speed){
    this.model=model;
    this.color=color;
    this.speed=speed;
  }
  public String toString(){return "Model : "+model+"\nColor : "+color+"\nSpeed : "+speed;}
  public int compareTo(Car c){return this.speed-c.speed;}
}
public class Q3{
  public static void main(String [] args){
    Car c1=new Car("Swift","Red",100);
    Car c2=new Car("Swift","Red",200);
    if(c1.compareTo(c2)>0)System.out.println(c1);
    else if(c1.compareTo(c2)<0)System.out.println(c2);
    else{
       System.out.println(c1);
       System.out.println(c2);
    }
  }
}