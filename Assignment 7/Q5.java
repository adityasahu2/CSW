// Q5 Construct a binary search tree (BST) from the given array of elements: {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}. Include a method called 'CreateTree' to construct the binary search tree from a sorted array. This method takes an array of integers as input and constructs the tree recursively using a binary search algorithm.  
class BST{
  int info;
  BST left, right;
  BST(int info){
    this.info = info;
    this.left = null;
    this.right = null;
  }
  void CreateTree(int info){
    if(info < this.info)
      if(this.left == null) this.left = new BST(info);
      else this.left.CreateTree(info);
    else
      if(this.right == null) this.right = new BST(info);
      else this.right.CreateTree(info);
  }
  void preOrder(){
    System.out.print(this.info + " ");
    if(this.left != null) this.left.preOrder();
    if(this.right != null) this.right.preOrder();
  }
}
public class Q5{
  public static void main(String[] args){
    int [] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    BST root = new BST(arr[0]);
    for(int i = 1; i < arr.length; i++) root.CreateTree(arr[i]);
    root.preOrder();
  }
}