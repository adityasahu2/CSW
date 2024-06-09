// Write a Java program that defines a 'Point' class with attributes 'X' and 'Y', and includes a  parameterized constructor to initialize these attributes. Implement a copy constructor to  create a new point object with the same attribute values. Ensure that modifications made to one  object do not affect the other. Utilize getter and setter methods to retrieve and update the  attribute values. 
class Point{
  private int X,Y;
  Point(int X,int Y){
    this.X = X;
    this.Y = Y;
  }
  Point(Point P){this(P.getX(),P.getY());}
  public int getX(){return this.X;}
  public int getY(){return this.Y;}
  public void setX(int x){this.X = x;}
  public void setY(int y){this.Y = y;}
}
public class Q3{
  public static void main(String[] args){
    Point P1 = new Point(10,20);
    Point P2 = new Point(P1);
    System.out.println("P1.X: "+P1.getX()+", P1.Y: "+P1.getY());
    System.out.println("P2.X: "+P2.getX()+", P2.Y: "+P2.getY());
    P1.setX(30);
    P1.setY(40);
    System.out.println("P1.X: "+P1.getX()+", P1.Y: "+P1.getY());
  }
}