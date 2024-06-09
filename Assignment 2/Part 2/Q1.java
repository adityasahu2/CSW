//Create a generic class Pair<K,V> with private variables key and value. The class Pair should define a parameterised constructor and getter and setter methods for these attributes. After addition of objects, the main class should retrieve and print the pair of key and value.
class Pair <K,V> {
  private K key;
  private V value;
  public Pair(K key, V value) {
    this.key = key;
    this.value = value;
  }
  public void setKey(K key) {this.key = key;}
  public void setValue(V value) {this.value = value;}
  public K getKey() {return key;}
  public V getValue() {return value;}
}
public class Q1{
  public static void main(String[] args){
    Pair<String, Integer> p1 = new Pair<String, Integer>("Hello", 5);
    Pair<String, Integer> p2 = new Pair<String, Integer>("World", 6);
    System.out.println(p1.getKey() + " - " + p1.getValue());
    System.out.println(p2.getKey() + " - " + p2.getValue());
  }
}