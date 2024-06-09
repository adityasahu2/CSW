/*
Write a Java code snippet that comprises of a Car class and a CarApp class. The Car class should define private fields for ModalNo(int), name(string) and stock(int). Define a parameterised constructor and override the compareTo method as public int compareTo(Car car) to sort the car on basis of the total number of stock. Create an ArrayList of Car objects and print the updated the sorted list. For example the list of sorted Car Objects
2013 creta 10
2020 MG 13
2018 Kia 20
2017 Audi 45
2015 BMW 55
  */
import java.util.ArrayList;
class Car implements Comparable <Car>{
    private int modelNo;
    private String name;
    private int stock;
    public Car(int modelNo, String name, int stock){
        this.modelNo = modelNo;
        this.name = name;
        this.stock = stock;
    }
    public static void sort(ArrayList<Car> carList){
        for(int i = 0; i < carList.size() - 1; i++){
            for(int j = 0; j < carList.size() - i - 1; j++){
                if(carList.get(j).compareTo(carList.get(j+1)) > 0){
                    Car temp = carList.get(j);
                    carList.set(j, carList.get(j+1));
                    carList.set(j+1, temp);
                }
            }
        }
    }
    public int compareTo(Car car){return this.stock - car.stock;}
    public String toString(){return modelNo + " " + name + " " + stock;}
}
//public class CarApp
public class Q3{
    public static void main(String[] args){
        ArrayList<Car> carlist = new ArrayList<Car>();
        carlist.add(new Car(2013, "creta",10));
        carlist.add(new Car(2017, "Audi", 45));
        carlist.add(new Car(2020, "MG", 13));
        carlist.add(new Car(2015, "BMW", 55));
        carlist.add(new Car(2018, "Kia", 20));
        Car.sort(carlist);
        System.out.println("Sorted list of Car Objects:");
        for (Car car : carlist) System.out.println(car);
    }
}