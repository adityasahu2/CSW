// Q2 Write a program to add methods to the binary search tree created in Q1 for traversing the tree in pre-order, in-order, and post-order. Invoke the above methods for execution.  
class BSTNode{
  //dont write from this
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
  // to this
  void preOrder(){
    System.out.print(this.info + " ");
    if(this.left != null) this.left.preOrder();
    if(this.right != null) this.right.preOrder();
  }
  void inOrder(){
    if(this.left != null) this.left.inOrder();
    System.out.print(this.info + " ");
    if(this.right != null) this.right.inOrder();
  }
  void postOrder(){
    if(this.left != null) this.left.postOrder();
    if(this.right != null) this.right.postOrder();
    System.out.print(this.info + " ");
  }
}