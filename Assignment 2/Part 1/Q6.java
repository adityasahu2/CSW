// Write a program to create an Animal class with member variables name, color, types (pet/wild). Override the hashCode method to print the unique id for the object. Create the objects of the Animal class and print its hashcode.

class Animal {
    String name;
    String color;
    String type;
    public Animal(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }
    @Override
    public int hashCode() {
        int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        return result;
    }
}
public class Q6 {
    public static void main(String[] args) {
        Animal dog = new Animal("Dog", "Brown", "Pet");
        Animal cat = new Animal("Cat", "White", "Pet");
        Animal lion = new Animal("Lion", "Yellow", "Wild");
        System.out.println("Hash code for dog: " + dog.hashCode());
        System.out.println("Hash code for cat: " + cat.hashCode());
        System.out.println("Hash code for lion: " + lion.hashCode());
    }
}
