// Q1. Create a class BSTNode that contains a member 'info' to store a number, with 'left' referring to the left child and 'right' referring to the right child. Provide the necessary constructor. Additionally, create a method to insert a node into a binary search tree. 
class BSTNode{
  int info;
  BSTNode left, right;
  BSTNode(int info){
    this.info = info;
    this.left = null;
    this.right = null;
  }
  void insert(int info){
    if(info < this.info)
      if(this.left == null) this.left = new BSTNode(info);
      else this.left.insert(info);
    else
      if(this.right == null) this.right = new BSTNode(info);
      else this.right.insert(info);
  }
}

public class Q1 {
  public static void main(String[] args) {
    BSTNode root = new BSTNode(10);
    root.insert(20);
    root.insert(30);
    root.insert(40);
    root.insert(50);
    root.insert(60);
    root.insert(70);
  }
}