// Design a Java class called Rectangle with private attributes length and width. Include a  constructor to initialize these attributes, as well as setter and getter methods for each attribute.  Additionally, implement methods to calculate the area and perimeter of the rectangle. Write a  main method to create an object of the Rectangle class, set values for its attributes, and display  the area and perimeter. 
class Rectangle{
  private int length, width;
  Rectangle(int length,int width){
    this.length = length;
    this.width = width;
  }
  public int getLength(){return this.length;}
  public int getWidth(){return this.width;}
  public void setLength(int length){this.length = length;}
  public void setWidth(int width){this.width = width;}
  public int area(){return this.length*this.width;}
  public int perimeter(){return 2*(this.length+this.width);}
}
public class Q2{
  public static void main(String[] args){
    Rectangle R = new Rectangle(10,20);
    System.out.println("Area: "+R.area());
    System.out.println("Perimeter: "+R.perimeter());
  }
}