// Q6 Determine if a given binary tree is a binary search tree. You will use an 'isBST()' method, which takes the maximum and minimum range of the values of the nodes.
public class Q6{
  public static void main(String[] args){
    BSTNode root = new BSTNode(10);
    root.left = new BSTNode(5);
    root.right = new BSTNode(15);
    root.left.left = new BSTNode(3);
    root.left.right = new BSTNode(7);
    root.right.left = new BSTNode(13);
    root.right.right = new BSTNode(17);
    System.out.println(isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
  }
  public static boolean isBST(BSTNode root, int min, int max){
    if(root == null) return true;
    if(root.info < min || root.info > max) return false;
    return isBST(root.left, min, root.info - 1) && isBST(root.right, root.info + 1, max);
  }
}